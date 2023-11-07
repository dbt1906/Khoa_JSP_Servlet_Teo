<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/6/2023
  Time: 10:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<body>
<%
    String username = request.getParameter("username")==null?"":request.getParameter("username")+"";
    String password = request.getParameter("password")==null?"":request.getParameter("password")+"";
    String error;
    if(request.getAttribute("error")==null){
        error="";
    }
    else{
        error = String.valueOf(request.getAttribute("error"));
    }
%>
<form class="container mx-auto" action="login" method="POST">
    <h1 class="text-center text-primary">Login</h1>
    <div class="form-group">
        <label for="exampleInputEmail1">User name</label>
        <input type="text" class="form-control" name="username" value="<%=username%>" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter username">
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">Password</label>
        <input type="password" class="form-control" id="exampleInputPassword1" value="<%=password%>" name="password"  placeholder="Password">
    </div>
    <div class="form-check">
        <input type="checkbox" class="form-check-input" id="exampleCheck1">
        <label class="form-check-label" for="exampleCheck1">Check me out</label>
    </div>
    <p class="text-danger"><%= error%></p>
    <button type="submit" class="btn btn-primary">Login</button>
</form>
</body>
</html>
