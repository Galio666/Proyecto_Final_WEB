<%-- 
    Document   : principal
    Created on : 24/11/2019, 12:05:38 AM
    Author     : tomas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>





<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
        
        <style>
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

<header class="header">
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
      <a class="navbar-brand">UACM</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
    
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link" href="principal.jsp">PRINCIPAL <span class="sr-only"></span></a>
          </li>
         
           <li class="nav-item active">
            <a class="nav-link" href="verCuestionario.jsp">VER CUESTIONARIOS <span class="sr-only">(current)</span></a>
          </li>
          
        </ul>
          <form class="form-inline my-2 my-lg-0" action="loginServlet" method="GET">
          
          <button class="btn btn-outline-success my-2 my-sm-0" type="submit">CERRAR SESION</button>
        </form>
      </div>
    </nav>
  </header>

<!-------------------------------------------------------------------------
CONTENEDORES PARA MOSTRAR LOS CUESTIONARIOS DE CADA CATEGORIA
-->

<div class="album py-5 bg-light">
    <div class="container">

      <div class="row">
        <div class="col-md-4">
          <div class="card mb-4 shadow-sm">
            <svg class="bd-placeholder-img card-img-top" width="100%" height="225" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: Thumbnail"><title>Matematicas</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">Matematicas</text></svg>
            <div class="card-body">
              <p class="card-text">Cuestionario de conocimientos generales de matematicas</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                  <button type="button" class="btn btn-sm btn-outline-secondary">Ver</button>
                  
                </div>
               
              </div>
            </div>
          </div>
        </div>
        <div class="col-md-4">
          <div class="card mb-4 shadow-sm">
            <svg class="bd-placeholder-img card-img-top" width="100%" height="225" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: Thumbnail"><title>Ciencias Naturales</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">Ciencias Naturales</text></svg>
            <div class="card-body">
              <p class="card-text">Cuestionario de conocimientos generales de ciencias naturales</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                  <button type="button" class="btn btn-sm btn-outline-secondary">Ver</button>
                </div>
               
              </div>
            </div>
          </div>
        </div>
        <div class="col-md-4">
          <div class="card mb-4 shadow-sm">
            <svg class="bd-placeholder-img card-img-top" width="100%" height="225" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder: Thumbnail"><title>Historia</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">Historia</text></svg>
            <div class="card-body">
              <p class="card-text">Cuestionario de conocimientos generales de historia</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                  <button type="button" class="btn btn-sm btn-outline-secondary">Ver</button>
                  
                </div>
                
              </div>
            </div>
          </div>
        </div>

      </div>
    </div>
  </div>

    </body>
</html>
