<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>
    <h1>Thanks for taking our survey</h1>
    <p>Here is the information that you entered:</p>

    <label>Email:</label>
    <span>${survey.user.email}</span><br>

    <label>First Name:</label>
    <span>${survey.user.firstName}</span><br>

    <label>Last Name:</label>
    <span>${survey.user.lastName}</span><br>

    <label>Date of Birth:</label>
    <span>${survey.user.dateOfBirth}</span><br>

    <label>Heard From:</label>
    <span>${survey.heardFrom}</span><br>

    <label>Wants Updates:</label>
    <span>${survey.wantsUpdates ? "Yes, I'd like that" : "No"}</span><br>

    <label>Email OK:</label>
    <span>${survey.emailOK ? "Yes, please send me email announcements" : "No"}</span><br>

    <label>Contact By:</label>
    <span>${survey.contactBy}</span><br>

    <p>To enter another survey, click on the Back button in your browser or the Return button shown below.</p>
    <form action="survey" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return">
    </form>
</body>
</html>