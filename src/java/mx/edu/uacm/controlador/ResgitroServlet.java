/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uacm.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.edu.uacm.modelo.Usuario;

/**
 *
 * @author tomas
 */
@WebServlet(name = "ResgitroServlet", urlPatterns = {"/ResgitroServlet"})
public class ResgitroServlet extends HttpServlet {

    Usuario usuario;
    UsiarioController usuarioDb;
    
     public void init() {
       usuarioDb=new UsiarioController();
    }
   

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre=request.getParameter("nombre");
        String apellidoP=request.getParameter("apellidoP");
        String apellidoM=request.getParameter("apellidoM");
        String email=request.getParameter("email");
        String nomUsuario=request.getParameter("usuario");
        String pass=request.getParameter("pass");
        
        usuario=new Usuario();
        usuario.setNombre(nombre);
        usuario.setApellidoPaterno(apellidoP);
        usuario.setApellidoMaterno(apellidoM);
        usuario.setCorreoElectronico(email);
        usuario.setUsuario(nomUsuario);
        usuario.setContraseña(pass);
        try {
            usuarioDb.insertarUuario(usuario);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ResgitroServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
       
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
