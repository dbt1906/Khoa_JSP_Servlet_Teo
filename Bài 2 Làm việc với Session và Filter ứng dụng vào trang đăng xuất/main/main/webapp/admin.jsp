<%@ page import="java.util.List"
%>

<%--
<
  Created by IntelliJ IDEA.
  Classes.User: Admin
  Date: 11/8/2023
  Time: 8:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<head>
    <title>Title</title>
</head>
<%
    String username = session.getAttribute("username")==null?"":session.getAttribute("username")+"";

%>
<body>
<div class="container">
    <h1>Admin</h1>
    <h2>Your username: <%=  username%></h2>
    <div class="d-flex">
        <a href="index.jsp">Index</a>
        <a href="Logout">Logout</a>
    </div>
</div>
</body>
</html>
