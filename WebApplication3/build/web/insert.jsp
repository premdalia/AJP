<%-- 
    Document   : insert.jsp
    Created on : 30-Jun-2023, 6:16:52 pm
    Author     : divyu
--%>


<%@page import="java.sql.*"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.io.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>insert</title>
    </head>
    <body>
       <% 
             String name=request.getParameter("name"); 
              String email=request.getParameter("email");
              int row;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root","mysql");
                PreparedStatement pre=con.prepareStatement("insert into operation value(?,?)");
                pre.setString(1,name);
                pre.setString(2,email);
                 row=pre.executeUpdate();
                 if(row>0){
                 out.println("Data ADDED Successfully");
            }
            else{
           out.println("Data is not added successfullu");
           }
               
                
           }
            catch(Exception e){
            System.out.println(e);
           }
           
          
       %>
       
       
    </body>
</html>
