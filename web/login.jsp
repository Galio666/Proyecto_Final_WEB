<%-- 
    Document   : Login
    Created on : 17/11/2019, 09:35:35 PM
    Author     : tomas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" type="text/css">
    <meta charset="utf-8">
    <title>Login</title>
    
<style>
    .col-centered{
    float: none;
    margin: 0 auto;
}

body {
  /* Location of the image */
  background-image: url(https://www.somoselmedio.com/wp-content/uploads/2018/07/uacm-3.jpg);
  
  /* Background image is centered vertically and horizontally at all times */
  background-position: center center;
  
  /* Background image doesn't tile */
  background-repeat: no-repeat;
  
  /* Background image is fixed in the viewport so that it doesn't move when 
     the content's height is greater than the image's height */
  background-attachment: fixed;
  
  /* This is what makes the background image rescale based
     on the container's size */
  background-size: cover;
  
  /* Set a background color that will be displayed
     while the background image is loading */
  background-color: #464646;
}
</style>
  </head>
<body>
  
    
  <div class="container">
  <div class="col-xs-12 col-sm-8 col-md-4 col-lg-4 col-centered">
  <div class="jumbotron">
      <h4>Sistema de Cuestionarios</h4>
        <h3 >Iniciar sesión</h3>
        
         <img alt="UACM" itemprop="logo" itemscope="itemscope" class="c-image" src="https://fotos.subefotos.com/4c97caa58705c6c9e6f90976383bcaeeo.png" role="presentation" aria-hidden="true" />
                        <span role="presentation" aria-hidden="true"></span>
                        <br>
                        <form action="loginServlet" method="POST">
          <div class="form-group">
              <br>
              <input type="text" class="form-control" placeholder="Ingresa Usuario" name="usuario">
          </div>
          <div class="form-group">
              <input type="password" class="form-control" placeholder="Ingresa Contraseña" name="pass">
          </div>
          <div class="custom-checkbox">
             </div>
          <button type="submit" class="btn-primary form-control">Acceder</button>
          <a href="registro.jsp">No tienes cuenta registrate</a>
        </form>
      </div>
  </div>
  
  </div>
</body>
</html>