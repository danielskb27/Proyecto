/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    String url="jdbc:mysql://localhost:3306/bd_poliza?serverTimezone=UTC";
    String user="root";
    String pass="root";
    public Connection Conexion(){
        Connection con = null;
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection(url,user,pass);
        }catch(Exception e){
            System.out.println("No se conecto a la base de datos"); 
        }
        System.out.println("Se conecto a la base de datos"); 
    return con;
    }
}
