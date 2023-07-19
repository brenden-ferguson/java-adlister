<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<form action="/login.jsp" method="POST">
    <label for="username">Username:</label>
    USERNAME: <input type="text" id="username" name="username">
    <br>
    <label for="password">Password:</label>
    PASSWORD: <input type="password" id="password" name="password">
    <br>
    <input type="submit" value="Login">
</form>
<% if(request.getMethod().equals("POST")) {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String corrUser = "admin";
    String corrPass = "password";
    if (username != null && password != null && username.equals(corrUser) && password.equals(corrPass)) {
        response.sendRedirect("/profile.jsp");
    } else {
        response.sendRedirect("/login.jsp");
    }
}
%>
</body>
</html>
