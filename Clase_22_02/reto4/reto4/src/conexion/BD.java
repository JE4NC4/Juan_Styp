/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Nestor Andres
 */
public class BD {
    String strConexionDB="jdbc:sqlite:C:/Users/Ambiente/Desktop/Juan_Styp/Clase_4/reto4/bd/sistema_de_notas.s3db";
    Connection conn=null;
    
    public BD(){
        try {
            Class.forName("org.sqlite.JDBC");
            conn=DriverManager.getConnection(strConexionDB);
            System.out.println("conexion establecida");
        } catch (Exception e) {
            System.out.println("erros de conexion"+e);
        }
    }
    
    public int EjecutarsentenciaSQL(String strSentenciaSQL){
        try {
            PreparedStatement pstm=conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }
    
    public ResultSet ConsultarRegistros(String strSentenciaSQL){
        try {
            PreparedStatement pstm=conn.prepareStatement(strSentenciaSQL);
            ResultSet respuesta=pstm.executeQuery();
            return respuesta;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
    public void ActualizarRegistros(String strSentenciaSQL){
        try {
            PreparedStatement pstm=conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
        } catch (Exception e) {
            System.out.println(e.getCause().getMessage());
        }
    }
}
