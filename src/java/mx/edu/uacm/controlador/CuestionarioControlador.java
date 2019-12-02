/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uacm.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import mx.edu.uacm.modelo.Cuestionario;
import mx.edu.uacm.modelo.Preguntas;
import mx.edu.uacm.modelo.Respuesta;

/**
 *
 * @author tomas
 */
public class CuestionarioControlador {
    
    Db_Conection coneccion;
    private Connection connection;

    public CuestionarioControlador() {
        coneccion = new Db_Conection();
    }
    
    
    public boolean insertarCuestionario(Cuestionario cuestionario) throws SQLException {
        String sql = "INSERT INTO CUESTIONARIO(ID,NOMBRE,CATEGORIA) VALUES (?,?,?)";
        coneccion.conectar();
        connection = coneccion.getConexion();
        PreparedStatement statement = connection.prepareStatement(sql);
        
        boolean rowInserted = statement.executeUpdate() > 0;
        statement.close();
        coneccion.closeConexion();
        return rowInserted;
    }
    
    
    public boolean seleccionarCuestionario(Cuestionario cuestionario){
        
         boolean encontrado=false;
        String sql = "SELECT * FROM CUESTIONARIO WHERE  ID =?";
        coneccion.conectar();
        connection = coneccion.getConexion();
        try{
        
        PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, cuestionario.getTitulo());
            statement.setString(2, cuestionario.getCategoria());
            ResultSet rs = statement.executeQuery();
             encontrado=rs.next();
             
        }catch (SQLException e) {
            // process sql exception
            System.out.println(e);
        }
        return encontrado;
        
    
    }
    
    
     public boolean seleccionarPreguntas(Preguntas preguntas){
        
         boolean encontrado=false;
        String sql = "SELECT * FROM PREGUNTAS WHERE  ID_CUESTIONARIO =?";
        coneccion.conectar();
        connection = coneccion.getConexion();
        try{
        
        PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,preguntas.getId());
            statement.setString(2, preguntas.getPregunta()); 
              
            ResultSet rs = statement.executeQuery();
             encontrado=rs.next();
             
        }catch (SQLException e) {
            // process sql exception
            System.out.println(e);
        }
        return encontrado;
        
    
    }
     
//      public boolean seleccionarRespuestas(int  id){
//        
//         boolean encontrado=false;
//        String sql = "SELECT * FROM RESPUESTA WHERE  ID_PREGUNTA =? ORDER BY INCISO";
//        coneccion.conectar();
//        connection = coneccion.getConexion();
//        try{
//        
//        PreparedStatement statement = connection.prepareStatement(sql);
//            statement.setInt(1,preguntas.getId());
//            statement.setString(2, preguntas.getPregunta()); 
//              
//            ResultSet rs = statement.executeQuery();
//             encontrado=rs.next();
//             
//        }catch (SQLException e) {
//            // process sql exception
//            System.out.println(e);
//        }
//        return encontrado;
//        
//    
//    }
    
    
}
