<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Location Form</title>

<style>
    body {
        margin: 0;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        background: linear-gradient(135deg, #1c1c1c, #3a3a3a);
        font-family: Arial, sans-serif;
    }

    .form-box {
        background: #111;
        padding: 35px 45px;
        border-radius: 12px;
        box-shadow: 0 10px 25px rgba(0,0,0,0.6);
        color: white;
        width: 320px;
    }

    h2 {
        text-align: center;
        margin-bottom: 25px;
        letter-spacing: 1px;
    }

    label {
        font-size: 14px;
        font-weight: bold;
    }

    input[type="text"] {
        width: 100%;
        padding: 10px;
        margin-top: 6px;
        margin-bottom: 15px;
        border-radius: 6px;
        border: none;
        outline: none;
    }

    input[type="submit"] {
        width: 100%;
        padding: 12px;
        background: #1db954;
        border: none;
        border-radius: 6px;
        color: white;
        font-size: 15px;
        font-weight: bold;
        cursor: pointer;
        transition: 0.3s;
    }

    input[type="submit"]:hover {
        background: #17a44b;
    }
</style>
</head>

<body>
    <div class="form-box">
        <h2>Book Your Ride</h2>
        <form action="successpage" method="post">
            <label>From</label>
            <input type="text" name="from">

            <label>Destination</label>
            <input type="text" name="destination">

            <label>Type</label>
            <input type="text" name="type">

            <input type="submit" value="Confirm Booking">
        </form>
    </div>
</body>
</html>
