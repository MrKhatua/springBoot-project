<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Zepto User Registration</title>

<style>
    body {
        font-family: Arial, Helvetica, sans-serif;
        background: linear-gradient(135deg, #6a11cb, #2575fc);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        margin: 0;
    }

    .container {
        background: #ffffff;
        padding: 30px 40px;
        border-radius: 12px;
        width: 380px;
        box-shadow: 0 10px 25px rgba(0, 0, 0, 0.2);
    }

    .container h2 {
        text-align: center;
        margin-bottom: 25px;
        color: #333;
    }

    .form-group {
        margin-bottom: 15px;
    }

    .form-group label {
        display: block;
        font-weight: bold;
        margin-bottom: 6px;
        color: #444;
    }

    .form-group input {
        width: 100%;
        padding: 10px;
        border-radius: 6px;
        border: 1px solid #ccc;
        font-size: 14px;
        outline: none;
        transition: 0.3s;
    }

    .form-group input:focus {
        border-color: #2575fc;
        box-shadow: 0 0 5px rgba(37, 117, 252, 0.4);
    }

    .btn {
        width: 100%;
        padding: 12px;
        background: #2575fc;
        color: white;
        border: none;
        border-radius: 8px;
        font-size: 16px;
        cursor: pointer;
        margin-top: 10px;
        transition: 0.3s;
    }

    .btn:hover {
        background: #1a5edb;
    }

    .footer-text {
        text-align: center;
        margin-top: 15px;
        font-size: 13px;
        color: #666;
    }
</style>
</head>

<body>

<div class="container">
    <h2>Zepto Registration</h2>

    <form action="register" method="post">
        <div class="form-group">
            <label>First Name</label>
            <input type="text" name="firstName" placeholder="Enter first name" required>
        </div>

        <div class="form-group">
            <label>Last Name</label>
            <input type="text" name="lastName" placeholder="Enter last name" required>
        </div>

        <div class="form-group">
            <label>Email</label>
            <input type="email" name="email" placeholder="Enter email address" required>
        </div>

        <div class="form-group">
            <label>Phone Number</label>
            <input type="tel" name="phone" placeholder="Enter phone number" pattern="[0-9]{10}" required>
        </div>

        <button type="submit" class="btn">Register</button>
    </form>

    <div class="footer-text">
        © 2026 Zepto | Fast & Fresh Delivery
    </div>
</div>

</body>
</html>
