<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Booking Success</title>

<style>
    body {
        margin: 0;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        background: linear-gradient(135deg, #1c1c1c, #3a3a3a);
        font-family: Arial, sans-serif;
        color: white;
    }

    .success-box {
        background: #111;
        padding: 40px 55px;
        border-radius: 14px;
        text-align: center;
        box-shadow: 0 10px 25px rgba(0,0,0,0.6);
    }

    .success-box h2 {
        margin-bottom: 15px;
        color: #1db954;
    }

    .success-box p {
        font-size: 16px;
        margin-bottom: 10px;
    }

    .code {
        font-size: 28px;
        font-weight: bold;
        letter-spacing: 4px;
        background: #1db954;
        color: #000;
        padding: 10px 20px;
        border-radius: 8px;
        display: inline-block;
        margin-top: 10px;
    }
</style>
</head>

<body>
    <div class="success-box">
        <h2>Booking Confirmed 🎉</h2>
        <p>Successfully Booked and Rider assigned immediately.</p>
        <p>Code :</p>
        <div class="code">${transbookingcode}</div>
    </div>
</body>
</html>
