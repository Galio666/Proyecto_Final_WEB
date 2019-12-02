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
import mx.edu.uacm.modelo.Cuestionario;

/**
 *
 * @author tomas
 */
@WebServlet(name = "CuestionarioServlet", urlPatterns = {"/CuestionarioServlet"})
public class CuestionarioServlet extends HttpServlet {

   
    Cuestionario cuestinario;
    CuestionarioControlador cuestionarioDb;
    
    public void init() {
       cuestionarioDb=new CuestionarioControlador();
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
        
        String categoria =request.getParameter("categoria");
        String titulo=request.getParameter("titulo");
        
        cuestinario=new Cuestionario();
        cuestinario.setCategoria(categoria);
        cuestinario.setTitulo(titulo);
        
        try {
            cuestionarioDb.insertarCuestionario(cuestinario);
        } catch (SQLException ex) {
            Logger.getLogger(CuestionarioServlet.class.getName()).log(Level.SEVERE, null, ex);
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
