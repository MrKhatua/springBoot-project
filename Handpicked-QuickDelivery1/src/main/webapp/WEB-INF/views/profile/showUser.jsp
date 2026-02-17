<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.List" %>
<%@ page import="com.handpicked.profile.entity.Profile" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HandPicked | Users</title>

<style>
    body {
        margin: 0;
        font-family: "Segoe UI", Arial, sans-serif;
        background-color: #f4f6f9;
        color: #333;
    }

    /* Header */
    .header {
        background-color: #1f2937;
        color: white;
        padding: 18px 40px;
        font-size: 22px;
        font-weight: bold;
    }

    /* Container */
    .container {
        padding: 40px;
    }

    h2 {
        margin-bottom: 20px;
        color: #111827;
    }

    /* Table Styling */
    table {
        width: 100%;
        border-collapse: collapse;
        background: white;
        border-radius: 8px;
        overflow: hidden;
        box-shadow: 0 6px 15px rgba(0, 0, 0, 0.08);
    }

    table th {
        background-color: #1f2937;
        color: white;
        padding: 12px;
        text-align: left;
        font-size: 14px;
    }

    table td {
        padding: 12px;
        border-bottom: 1px solid #e5e7eb;
        font-size: 14px;
    }

    table tr:hover {
        background-color: #f9fafb;
    }

    .no-data {
        text-align: center;
        padding: 20px;
        color: #666;
    }

    /* Footer */
    .footer {
        text-align: center;
        padding: 15px;
        background-color: #e5e7eb;
        font-size: 13px;
        color: #555;
        margin-top: 40px;
    }

    /* Top Actions */
    .actions {
        margin-bottom: 20px;
    }

    .actions a {
        text-decoration: none;
        background-color: #4CAF50;
        color: white;
        padding: 8px 14px;
        border-radius: 5px;
        font-size: 14px;
        margin-right: 10px;
    }

    .actions a:hover {
        background-color: #45a049;
    }
</style>

</head>
<body>

<!-- Header -->
<div class="header">
    HandPicked – User Management
</div>

<!-- Content -->
<div class="container">

    <h2>Registered Users</h2>

    <div class="actions">
        <a href="index.jsp">Dashboard</a>
        <a href="createAccount">Add New User</a>
    </div>

    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Mobile</th>
        </tr>

<%
    List<Profile> users = (List<Profile>) request.getAttribute("users");

    if (users != null && !users.isEmpty()) {
        for (Profile user : users) {
%>
        <tr>
            <td><%= user.getId() %></td>
            <td><%= user.getName() %></td>
            <td><%= user.getEmail() %></td>
            <td><%= user.getMobile() %></td>
            
            
            <td>
            <a href="editUser?id=<%= user.getId() %>" class="btn-edit">Edit</a>
            <a href="deleteUser?id=<%= user.getId() %>" 
               class="btn-delete"
               onclick="return confirm('Delete this user?')">
               Delete
            </a>
        </td>
        </tr>
<%
        }
    } else {
%>
        <tr>
            <td colspan="4" class="no-data">No users found</td>
        </tr>
<%
    }
%>

    </table>

</div>

<!-- Footer -->
<div class="footer">
    © 2026 HandPicked App. All rights reserved.
</div>

</body>
</html>
