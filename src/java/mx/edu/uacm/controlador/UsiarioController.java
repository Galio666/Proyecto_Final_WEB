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
import mx.edu.uacm.modelo.Usuario;

/**
 *
 * @author tomas
 */
public class UsiarioController {
    
     Db_Conection coneccion;
    private Connection connection;

    public UsiarioController() {
        coneccion = new Db_Conection();
    }
    
    
    
    
    public boolean validarUsuario(Usuario usuario) throws SQLException{
        
        boolean encontrado=false;
        String sql = "SELECT USUARIO,CONTRASENA FROM USUARIO WHERE  USUARIO =? AND CONTRASENA=MD5(?)";
        coneccion.conectar();
        connection = coneccion.getConexion();
        try{
        
        PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, usuario.getUsuario());
            statement.setString(2, usuario.getContraseña());
            ResultSet rs = statement.executeQuery();
             encontrado=rs.next();
             
        }catch (SQLException e) {
            // process sql exception
            System.out.println(e);
        }
        return encontrado;
        
            
        
    }
    
     public boolean insertarUuario(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO USUARIO(ID,NOMBRE,APELLIDOP,APELLIDOM,EMAIL,USUARIO,CONTRASENA) VALUES (?,?,?,?,?,?,MD5(?))";
        coneccion.conectar();
        connection = coneccion.getConexion();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, null);
        statement.setString(2, usuario.getNombre());
        statement.setString(3, usuario.getApellidoPaterno());
        statement.setString(4, usuario.getApellidoMaterno());
        statement.setString(5, usuario.getCorreoElectronico());
        statement.setString(6, usuario.getUsuario());
        statement.setString(7, usuario.getContraseña());
        boolean rowInserted = statement.executeUpdate() > 0;
        statement.close();
        coneccion.closeConexion();
        return rowInserted;
    }
     
     
      public boolean actualizarUsuario(Usuario usuario) throws SQLException {
        String sql = "UPDATE USUARIO SET NOMBRE=?,APELLIDOP=?,APELLIDOM=?,EMAIL=?,USUARIO=?,CONTRASENA=MD5(?) WHERE ID=?";
        coneccion.conectar();
        connection = coneccion.getConexion();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, usuario.getNombre());
        statement.setString(2, usuario.getApellidoPaterno());
        statement.setString(3, usuario.getApellidoMaterno());
        statement.setString(4, usuario.getCorreoElectronico());
        statement.setString(5, usuario.getUsuario());
        statement.setString(6, usuario.getContraseña());
        statement.setInt(7, usuario.getId());

        boolean registroBorrado = statement.executeUpdate() > 0;
        statement.close();
        coneccion.closeConexion();
        return registroBorrado;
    }
    
}
