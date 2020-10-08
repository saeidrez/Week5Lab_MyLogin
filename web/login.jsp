<%-- 
    Document   : login
    Created on : Oct 7, 2020, 1:52:45 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        
    </head>
    <body>
        <h1>Login</h1>
         
        <form action="login" method="post">
              <label for="username"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="username">
    <br>
    <label for="pass"><b>Password</b></label>
    <input type="text" placeholder="Enter Password" name="password">
    <br>
    <input type="Submit" value="Submit">
    <p>${message}</p>
        </form>
    </body>
</html>
