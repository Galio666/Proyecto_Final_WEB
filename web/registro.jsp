<%-- 
    Document   : registro
    Created on : 23/11/2019, 11:28:13 PM
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
        <h3 >Registro Usuario</h3>
        
        
        <form action="regsitroServlet" method="POST">
          <div class="form-group">
              <br>
              <input type="text" class="form-control" placeholder="Ingresa Nobre" name="nombre">
          </div>
            <div class="form-group">
              <br>
              <input type="text" class="form-control" placeholder="Ingresa Apellido Paterno" name="apellidoP">
          </div>
             <div class="form-group">
              <br>
              <input type="text" class="form-control" placeholder="Ingresa Apellido Materno" name="apellidoM">
          </div>
             <div class="form-group">
              <br>
              <input type="text" class="form-control" placeholder="Ingresa Usuario" name="usuario">
          </div>
            
          <div class="form-group">
              <br>
              <input type="password" class="form-control" placeholder="Ingresa Contraseña" name="pass">
          </div>
         
          <button type="submit" class="btn-primary form-control">Registrarse</button>
          <a href="login.jsp">Tienes cuenta ingresa</a>
        </form>
      </div>
  </div>
  
  </div>
</body>
</html>