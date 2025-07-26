<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Registration Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .form-container {
            width: 50%;
            margin: auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 10px;
            box-shadow: 2px 2px 10px rgba(0, 0, 0, 0.1);
        }
        .form-container h2 {
            text-align: center;
        }
        .form-group {
            margin-bottom: 15px;
        }
        .form-group label {
            display: block;
            font-weight: bold;
        }
        .form-group input, .form-group select {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        .form-group button {
            display: block;
            width: 100%;
            padding: 10px;
            background-color: #28a745;
            color: white;
            font-weight: bold;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        .form-group button:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>Student Registration</h2>
        <form action="insertstudent" method="post">
            <div class="form-group">
                <label for="sname">Name</label>
                <input type="text" id="sname" name="sname" required>
            </div>
            <div class="form-group">
                <label for="sgender">Gender</label>
                <select id="sgender" name="sgender" required>
                    <option value="Male">Male</option>
                    <option value="Female">Female</option>
                    <option value="Other">Other</option>
                </select>
            </div>
            <div class="form-group">
                <label for="sdob">Date Of Birth</label>
                <input type="date" id="sdob" name="sdob" required>
            </div>
            <div class="form-group">
                <label for="semail">Email</label>
                <input type="email" id="semail" name="semail" required>
            </div>
            <div class="form-group">
                <label for="spwd">Password</label>
                <input type="password" id="spwd" name="spwd" required>
            </div>
            <div class="form-group">
                <label for="scontact">Contact</label>
                <input type="tel" id="scontact" name="scontact" pattern="[0-9]{10}" title="Enter a valid 10-digit contact number" required>
            </div>
            <div class="form-group">
                <label for="sgradelevel">Grade Level</label>
                <select id="sgradelevel" name="sgradelevel" required>
                    <option value="Grade 1">Grade 1</option>
                    <option value="Grade 2">Grade 2</option>
                    <option value="Grade 3">Grade 3</option>
                    <option value="Grade 4">Grade 4</option>
                    <option value="Grade 5">Grade 5</option>
                </select>
            </div>
            <div class="form-group">
                <button type="submit">Register</button>
            </div>
        </form>
    </div>
</body>
</html>
