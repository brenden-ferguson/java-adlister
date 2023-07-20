<%--
  Created by IntelliJ IDEA.
  User: brenden
  Date: 7/20/23
  Time: 8:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>
<h1>Choose A Color</h1>
<br>
<form method="POST">
    <label for="color-picker">
        <select name="colors" id="color-picker">
            <option id="red" value="red">Red</option>
            <option id="blue" value="blue">Blue</option>
            <option id="green" value="green">Green</option>
        </select>
    </label>
    <input type="submit">
</form>
</body>
</html>
