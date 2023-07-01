<%-- 
    Document   : index
    Created on : 30-Jun-2023, 7:24:58 pm
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="insert.jsp" method="post">
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="text" name="email" id="email"></td>
            </tr>
            
                
            
        </table>
        <input type="submit" value="submit">
    </form>
    </body>
</html>
