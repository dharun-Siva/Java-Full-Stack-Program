<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
label {
    padding: 10px;
}
</style>

</head>
<body>
<form action="SubmitServlet" method="post">
<input type="hidden" name="updates" value="put">


        Id: <input type="number" name="id" required><br><br>
        Name: <input type="text" name="name" required><br><br>
        Salary: <input type="number" name="salary" required><br><br>
        Experience: <input type="number" name="exp" required>
        <br>
        <input type="submit" value="Update User">
    </form>


</body>
</html>