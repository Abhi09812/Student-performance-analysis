<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Teacher Dashboard - EduAnalytics</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        .sidebar {
            position: fixed;
            top: 0;
            left: 0;
            height: 100%;
            width: 250px;
            background-color: #343a40;
            padding-top: 20px;
            color: white;
        }
        .sidebar a {
            color: white;
            padding: 10px 15px;
            text-decoration: none;
            display: block;
        }
        .sidebar a:hover {
            background-color: #4caf50;
        }
        /* Main content styling */
        .main-content {
            margin-left: 250px;
            padding: 20px;
        }
        .hero {
            background: linear-gradient(135deg, #4caf50, #81c784);
            color: white;
            text-align: center;
            padding: 100px 20px;
        }
        .hero h1 {
            font-size: 3rem;
            font-weight: bold;
        }
        .hero p {
            font-size: 1.2rem;
            margin: 20px 0;
        }
        .footer {
            background-color: #343a40;
            color: white;
            text-align: center;
            padding: 20px;
        }
    </style>
</head>
<body>
    <!-- Sidebar -->
    <div class="sidebar">
        <a href="teacherhome">Dashboard</a>
        <a href="/studentreport">Student Reports</a>
        <a href="/addstudents.jsp">Add Students</a>
        <a href="/viewstudents.jsp">View Students</a>
        <a href="/logout">Logout</a>
    </div>

    <!-- Main Content -->
    <div class="main-content">
        <div class="hero">
            <h1>Welcome, Teacher!</h1>
            <p>You're logged in to the EduAnalytics Dashboard. Use the navigation to manage student performance and generate reports.</p>
            <a href="/studentreport" class="btn btn-light btn-lg">View Student Reports</a>
        </div>

        <!-- Dashboard Section -->
        <div class="container">
            <h2 class="mt-5">Dashboard Overview</h2>
            <p>Here you can track student progress, generate detailed reports, and get insights to improve learning outcomes.</p>

            <div class="row mt-4">
                <div class="col-md-4">
                    <div class="card p-4">
                        <h5 class="card-title">Student Performance</h5>
                        <p class="card-text">Monitor student grades, attendance, and overall progress.</p>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card p-4">
                        <h5 class="card-title">Generate Reports</h5>
                        <p class="card-text">Create custom reports based on student performance data.</p>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card p-4">
                        <h5 class="card-title">Improvement Tracker</h5>
                        <p class="card-text">Identify students who need extra support and track improvements.</p>
                    </div>
                </div>
            </div>
        </div>

        <!-- Footer -->
        <footer class="footer">
            <p>&copy; 2024 EduAnalytics. All Rights Reserved.</p>
        </footer>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
