<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HandPicked | Register User</title>

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

    /* Form Card */
    .form-card {
        background: white;
        width: 420px;
        padding: 30px 35px;
        border-radius: 10px;
        box-shadow: 0 6px 15px rgba(0, 0, 0, 0.1);
    }

    .form-card h2 {
        text-align: center;
        margin-bottom: 25px;
        color: #111827;
    }

    .form-group {
        margin-bottom: 18px;
    }

    .form-group label {
        display: block;
        margin-bottom: 6px;
        font-weight: 600;
        color: #374151;
    }

    .form-group input {
        width: 100%;
        padding: 10px;
        border-radius: 6px;
        border: 1px solid #d1d5db;
        font-size: 14px;
    }

    .form-group input:focus {
        outline: none;
        border-color: #4CAF50;
    }

    .btn-submit {
        width: 100%;
        padding: 12px;
        background-color: #4CAF50;
        color: white;
        font-size: 16px;
        border: none;
        border-radius: 6px;
        cursor: pointer;
        margin-top: 10px;
    }

    .btn-submit:hover {
        background-color: #45a049;
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
    HandPicked – User Registration
</div>

<!-- Form Section -->
<div class="container">
    <div class="form-card">
        <h2>Create Account</h2>

        <form action="register" method="post">

            <div class="form-group">
                <label>Name</label>
                <input type="text" name="name" required>
            </div>

            <div class="form-group">
                <label>Email</label>
                <input type="email" name="email" required>
            </div>

            <div class="form-group">
                <label>Mobile</label>
                <input type="text" name="mobile" required>
            </div>

            <button type="submit" class="btn-submit">Register</button>
        </form>
    </div>
</div>

<!-- Footer -->
<div class="footer">
    © 2026 HandPicked App. All rights reserved.
</div>

</body>
</html>
