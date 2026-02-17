<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HandPicked | Dashboard</title>

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

    /* Main container */
    .container {
        padding: 40px;
    }

    .welcome {
        font-size: 20px;
        margin-bottom: 30px;
    }

    /* Dashboard cards */
    .card-container {
        display: flex;
        gap: 25px;
        flex-wrap: wrap;
    }

    .card {
        background: white;
        width: 260px;
        padding: 25px;
        border-radius: 10px;
        box-shadow: 0 6px 15px rgba(0, 0, 0, 0.08);
        transition: transform 0.2s ease, box-shadow 0.2s ease;
    }

    .card:hover {
        transform: translateY(-5px);
        box-shadow: 0 10px 25px rgba(0, 0, 0, 0.12);
    }

    .card h3 {
        margin-top: 0;
        margin-bottom: 10px;
        color: #111827;
    }

    .card p {
        font-size: 14px;
        color: #555;
        margin-bottom: 20px;
    }

    .card a {
        text-decoration: none;
        background-color: #4CAF50;
        color: white;
        padding: 10px 15px;
        border-radius: 5px;
        font-size: 14px;
        display: inline-block;
    }

    .card a:hover {
        background-color: #45a049;
    }

    /* Footer */
    .footer {
        text-align: center;
        padding: 15px;
        background-color: #e5e7eb;
        font-size: 13px;
        color: #555;
        position: fixed;
        bottom: 0;
        width: 100%;
    }
</style>

</head>
<body>

<!-- Header -->
<div class="header">
    HandPicked – User Management
</div>

<!-- Main Content -->
<div class="container">

    <div class="welcome">
        Welcome back! Choose an action to continue.
    </div>

    <div class="card-container">

        <div class="card">
            <h3>Create Account</h3>
            <p>Register a new user into the HandPicked system.</p>
            <a href="createAccount">Create User</a>
        </div>

        <div class="card">
            <h3>View Users</h3>
            <p>View and manage all registered users.</p>
            <a href="allUser">Show Users</a>
        </div>

    </div>

</div>

<!-- Footer -->
<div class="footer">
    © 2026 HandPicked App. All rights reserved.
</div>

</body>
</html>
