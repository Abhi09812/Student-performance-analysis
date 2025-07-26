<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Contact Us - EduAnalytics</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f7f9fc;
        }
        .container {
            max-width: 800px;
            margin: 50px auto;
            padding: 30px;
            background: #ffffff;
            border-radius: 8px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
        }
        h1 {
            color: #34495e;
            text-align: center;
        }
        p {
            font-size: 16px;
            line-height: 1.8;
            color: #555;
            text-align: center;
        }
        form {
            margin-top: 30px;
        }
        label {
            font-weight: bold;
            color: #2c3e50;
            display: block;
            margin-bottom: 5px;
        }
        input, textarea {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ddd;
            border-radius: 5px;
            font-size: 14px;
        }
        button {
            background-color: #2980b9;
            color: #fff;
            border: none;
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
            border-radius: 5px;
        }
        button:hover {
            background-color: #1f6ba5;
        }
        .contact-info {
            margin-top: 20px;
            color: #333;
        }
        .contact-info ul {
            list-style: none;
            padding: 0;
        }
        .contact-info li {
            margin-bottom: 10px;
            font-size: 15px;
        }
        .footer {
            margin-top: 30px;
            text-align: center;
            color: #888;
            font-size: 14px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Contact Us</h1>
        <p>If you have any questions, feedback, or need assistance, please feel free to reach out to us. We're here to help!</p>

        <form action="submitContact" method="post">
            <label for="name">Your Name</label>
            <input type="text" id="name" name="name" placeholder="Enter your name" required>

            <label for="email">Your Email</label>
            <input type="email" id="email" name="email" placeholder="Enter your email" required>

            <label for="message">Your Message</label>
            <textarea id="message" name="message" rows="5" placeholder="Write your message here..." required></textarea>

            <button type="submit">Submit</button>
        </form>

        <div class="contact-info">
            <h2>Our Contact Details</h2>
            <ul>
                <li><strong>Email:</strong> support@eduanalytics.com</li>
                <li><strong>Phone:</strong> +91-9876543210</li>
                <li><strong>Address:</strong> EduTech Hub, Innovation Street, Learning City, EduNation</li>
            </ul>
        </div>

        <div class="footer">
            &copy; 2024 EduAnalytics. Empowering Education with Insights.
        </div>
    </div>
</body>
</html>
