<%-- 
    Document   : principal
    Created on : 24/11/2019, 12:05:38 AM
    Author     : tomas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
   response.setHeader("Cache-Control","no-cach,no-store,must-revalidate");
    
    
    if(session.getAttribute("nomUsuario")==null){
        response.sendRedirect("login.jsp");
        return;
    }
%>

        <h1>Hello World!</h1>
        
        <form action="loginServlet" method="GET">
<input type="submit" value="Logout">

</form>
    </body>
</html>
