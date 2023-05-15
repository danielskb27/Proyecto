/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Conexion.Conexion;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class ClienteDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public Cliente Validar(String clave, String identificacion) {
        Cliente cli = new Cliente();
        String sql = "select * from cliente where Identificacion=? and Clave=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, identificacion);
            ps.setString(2, clave);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Cargando clientes...");
                cli.setId(rs.getInt("IdCliente"));
                cli.setIdentificacion(rs.getString("Identificacion"));
                cli.setClave(rs.getString("Clave"));
                cli.setNombre(rs.getString("Nombre"));
                cli.setId(rs.getInt("IdCliente"));
                cli.setMetodoPago(rs.getString("MetodoPago"));
                cli.setCorreo(rs.getString("Correo"));
                cli.setTelefono(rs.getString("Telefono"));
            }
            rs.close();
            con.close();
            ps.close();
        } catch (Exception e) {
        }
        return cli;
    }

    public List<Cliente> listar() {
        String sql = "select * from cliente";
        List<Cliente> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            con.setAutoCommit(true);
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cli = new Cliente();
                System.out.println("Cargando clientes...");
                cli.setIdentificacion(rs.getString("IdCLiente"));
                cli.setClave(rs.getString("Clave"));
                cli.setNombre(rs.getString("Nombre"));
                cli.setTelefono(rs.getString("Telefono"));
                cli.setCorreo(rs.getString("Correo"));
                cli.setMetodoPago(rs.getString("MetodoPago"));
                lista.add(cli);
            }
            rs.close();
            ps.close();
            con.close();
            return lista;
        } catch (SQLException e) {
        }
        return lista;
    }

    public int guardarCliente(Cliente p) {

        System.out.println("Inicio guardando cliente...");

        String sql = "insert into `cliente`(Identificacion,Clave,Nombre,Telefono,Correo,MetodoPago)values(?,?,?,?,?,?)";
        try {
            System.out.println("Guardando cliente... SQL: "+ sql +" ID:"+ p.getIdentificacion());
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getIdentificacion());
            ps.setString(2, p.getClave());
            ps.setString(3, p.getNombre());
            ps.setString(4, p.getTelefono());
            ps.setString(5, p.getCorreo());
            ps.setString(6, p.getMetodoPago());
            ps.executeUpdate();
            System.out.println("Guardando cliente..."+sql);
        } catch (Exception e) {
            System.out.println("Guardando cliente fallo...");
        }
        return r;
    }
}
