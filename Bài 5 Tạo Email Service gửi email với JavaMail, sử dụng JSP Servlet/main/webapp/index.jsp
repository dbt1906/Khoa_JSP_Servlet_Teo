<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<form action="MailController" method="get">
    <input type="text" name="email">
    <button type="submit">Đăng ký nhận thông báo</button>
</form>

</body>
</html>