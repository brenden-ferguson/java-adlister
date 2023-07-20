<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: davidstephens
  Date: 7/20/23
  Time: 1:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Albums Example</title>
</head>
<body>
<h1><jsp:useBean id="album" scope="request" type="Album"/>
<c:out value="${album.artist}"/> , <c:out value="${album.name}"/></h1>
</body>
</html>