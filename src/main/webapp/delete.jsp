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
  <input type="hidden" name="updates" value="delete">
Enter  the Employee id to delete:
<br><br><input type = "number" name="id" required>
<br>
<button type="submit">Delete</button> 

</form>


</body>
</html>