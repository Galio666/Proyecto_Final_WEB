/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uacm.controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import mx.edu.uacm.modelo.Cuestionario;
import mx.edu.uacm.modelo.Usuario;

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
    
    
    
}
