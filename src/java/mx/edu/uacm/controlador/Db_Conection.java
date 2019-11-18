package mx.edu.uacm.controlador;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomas
 */
public class Db_Conection {
    
     String url;
    static String user = "root";
    static String pass = "";

    static Connection conn = null;

    public Db_Conection() {
        this(user, pass);
    }

    public Db_Conection(String user, String pass) {

        url = "jdbc:mysql://localhost/ASISTENCIA";
        Db_Conection.user = user;
        Db_Conection.pass = pass;
    }
 public void conectar(){
        if (conn == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
             
                
                conn = DriverManager.getConnection(url, user, pass);
                System.out.println("Conexion exitosa:");
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println("ERROR: " + e.getMessage());
            }

        } else {
            try {

                conn.close();
               
                conn = DriverManager.getConnection(url, user, pass);
            } catch (SQLException e) {
                System.out.println("ERROR: " + e.getMessage());
            }

        }

    }

    public Statement getStatement() {
        try {
            if (!conn.isClosed()) {
                return conn.createStatement();
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return null;
    }

    static String getUser() {
        return user;
    }

    static String getURL() {
        return user;
    }

    public Connection getConexion() {
        return conn;
    }

    public void closeConexion() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
    
}
