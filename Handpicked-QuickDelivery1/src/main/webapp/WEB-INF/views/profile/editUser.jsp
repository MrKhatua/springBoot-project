<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="com.handpicked.profile.entity.Profile" %>

<%
    Profile user = (Profile) request.getAttribute("user");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit User</title>
</head>
<body>

<h2>Edit User</h2>

<form action="updateUser" method="post">
    <input type="hidden" name="id" value="<%= user.getId() %>">

    Name: <input type="text" name="name" value="<%= user.getName() %>"><br><br>
    Email: <input type="text" name="email" value="<%= user.getEmail() %>"><br><br>
    Mobile: <input type="text" name="mobile" value="<%= user.getMobile() %>"><br><br>

    <button type="submit">Update</button>
</form>

</body>
</html>
