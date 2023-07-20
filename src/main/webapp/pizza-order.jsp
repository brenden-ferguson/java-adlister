<%--
  Created by IntelliJ IDEA.
  User: brenden
  Date: 7/19/23
  Time: 3:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
<form method="post">
    <label for="crust">
        <select name="crust-type" id="crust">
            <option value="thin">Thin Crust</option>
            <option value="regular">Regular Crust</option>
            <option value="thick">Thick Crust</option>
        </select>
        <br>
    </label>
    <label for="sauce">
        <select id="sauce" name="sauce-type">
            <option value="marinara">Marinara</option>
            <option value="ranch">Ranch</option>
            <option value="barbeque">BBQ</option>
        </select>
        <br>
    </label>
    <label for="size">
        <select id="size" name="pizza-size">
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
            <option value="Xtra-Large">Xtra-Large</option>
        </select>
        <br>
    </label>
    <input type="checkbox" id="pepperoni" name="toppings" value="Pepperoni">
    <label for="pepperoni"> Pepperoni</label><br>
    <input type="checkbox" id="sausage" name="toppings" value="Sausage">
    <label for="sausage">Sausage</label><br>
    <input type="checkbox" id="cheese" name="toppings" value="Cheese">
    <label for="cheese">Cheese</label><br>
    <input type="submit">
</form>
</body>
</html>
