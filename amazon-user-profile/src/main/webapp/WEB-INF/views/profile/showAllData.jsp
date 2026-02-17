<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.List" %>
<%@ page import="com.amazon.profile.entity.ProfileEntity" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Profiles</title>

<style>
table {
    border-collapse: collapse;
    width: 90%;
    margin: 20px auto;
}
th, td {
    border: 1px solid black;
    padding: 6px;
    text-align: center;
}
th {
    background-color: #f2f2f2;
}
input[type=text] {
    width: 95%;
}
button {
    padding: 5px 10px;
}
</style>
</head>

<body>

<h2 style="text-align:center;">Update Profile Details</h2>

<table>
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Email</th>
    <th>Mobile</th>
    <th>Action</th>
</tr>

<%
List<ProfileEntity> list =
    (List<ProfileEntity>) request.getAttribute("profileList");

if (list != null) {
    for (ProfileEntity p : list) {
%>

<form action="updateProfile" method="post">
<tr>
    <td>
        <%= p.getId() %>
        <input type="hidden" name="id" value="<%= p.getId() %>">
    </td>

    <td>
        <input type="text" name="name" value="<%= p.getName() %>">
    </td>

    <td>
        <input type="text" name="email" value="<%= p.getEmail() %>">
    </td>

    <td>
        <input type="text" name="mobile" value="<%= p.getMobile() %>">
    </td>

    <td>
        <button type="submit">Update</button>
    </td>
</tr>
</form>

<%
    }
}
%>

</table>

</body>
</html>
