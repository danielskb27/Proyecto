/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author diego
 */
public class AdminDAO {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public Admin Validar(String clave, String identificacion){
        Admin ad=new Admin();
        String sql="select * from admin where Identificacion=? and Clave=?";
    try{
    con=cn.Conexion();
    ps=con.prepareStatement(sql);
    ps.setString(1, identificacion);
    ps.setString(2, clave);
    rs=ps.executeQuery();
    while(rs.next()){
        ad.setIdentificacion(rs.getString("Identificacion"));
        ad.setClave(rs.getString("Clave"));
    }
    }catch(Exception e){}
 return ad;
    }
}
