<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Disp</title>
<style>
body {
    background-color: grey;
    text-align: center;
    color: white;
    font-size: 30px;
}
form {
    display: flex;
    align-items: center;
    justify-content: center;
    padding: 50px;
    flex-direction: column;
}
</style>
</head>
<body>

<form action="SubmitServlet" method="get">
    <input type="submit" value="Click here to view all the employee details" />
</form>
</body>
</html>