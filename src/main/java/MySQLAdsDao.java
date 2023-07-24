import com.mysql.cj.jdbc.Driver;
import com.sun.org.apache.bcel.internal.generic.Select;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection = null;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Ad> all() throws SQLException {
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM ads");
            List<Ad> ads = new ArrayList<>();
            while (result.next()) {
                ads.add(new Ad(result.getLong("id"), result.getLong("userId"), result.getString("title"), result.getString("description")
                ));
            }
            return ads;
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public Long insert(Ad ad) {
        try {
            Statement statement = connection.createStatement();
            long result = statement.executeUpdate("INSERT INTO ads (userId, title, description) values ('" + ad.getUserId() + "', '" + ad.getTitle() + "', '" + ad.getDescription() +"')");
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
