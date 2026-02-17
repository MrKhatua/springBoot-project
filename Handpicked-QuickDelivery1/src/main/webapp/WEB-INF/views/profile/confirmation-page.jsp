<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HandPicked | Success</title>

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
        display: flex;
        justify-content: center;
        align-items: center;
        height: calc(100vh - 120px);
    }

    /* Success Card */
    .success-card {
        background: white;
        width: 420px;
        padding: 35px 40px;
        border-radius: 12px;
        box-shadow: 0 6px 15px rgba(0, 0, 0, 0.1);
        text-align: center;
    }

    .success-icon {
        font-size: 50px;
        color: #4CAF50;
        margin-bottom: 15px;
    }

    .success-card h1 {
        color: #111827;
        margin-bottom: 10px;
    }

    .success-card p {
        color: #555;
        font-size: 15px;
        margin-bottom: 25px;
    }

    .btn-group a {
        display: inline-block;
        text-decoration: none;
        padding: 10px 18px;
        border-radius: 6px;
        font-size: 14px;
        margin: 0 8px;
    }

    .btn-home {
        background-color: #4CAF50;
        color: white;
    }

    .btn-home:hover {
        background-color: #45a049;
    }

    .btn-users {
        background-color: #2563eb;
        color: white;
    }

    .btn-users:hover {
        background-color: #1e40af;
    }

    /* Footer */
    .footer {
        text-align: center;
        padding: 15px;
        background-color: #e5e7eb;
        font-size: 13px;
        color: #555;
    }
</style>

</head>
<body>

<!-- Header -->
<div class="header">
    HandPicked – Registration Status
</div>

<!-- Success Message -->
<div class="container">
    <div class="success-card">
        <div class="success-icon">✓</div>
        <h1>Registration Successful</h1>
        <p>The user has been registered successfully in the HandPicked system.</p>

        <div class="btn-group">
            <a href="index.jsp" class="btn-home">Go to Dashboard</a>
            <a href="allUser" class="btn-users">View Users</a>
        </div>
    </div>
</div>

<!-- Footer -->
<div class="footer">
    © 2026 HandPicked App. All rights reserved.
</div>

</body>
</html>
