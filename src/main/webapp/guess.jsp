<%--
  Created by IntelliJ IDEA.
  User: brenden
  Date: 7/20/23
  Time: 10:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess</title>
</head>
<body>
<h1>Guess a Number</h1>
<form method="POST" action="${pageContext.request.contextPath}/guess">
    <label for="numbers"></label>
        <input type="text" name="numbers" id="numbers">
    <input type="submit">
</form>
</body>
</html>
