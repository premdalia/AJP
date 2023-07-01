<%-- 
    Document   : index
    Created on : 15-Jun-2023, 11:30:38 pm
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ABC</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <form action="newservlet" method="post">
            Name: <input type="text" name="name"><!-- comment --><br>
            Email:<input type="text" name="email">
            <input type="submit" value="Submit">
        </form>
    </body>
</html>
