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
public class PolizaDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public List<Poliza> listar() {
        String sql = "select * from poliza";
        List<Poliza> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            con.setAutoCommit(true);
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Poliza pol = new Poliza();
                System.out.println("Cargando polizas...");
                pol.setNumPlaca(rs.getString("NumPlaca"));
                pol.setMarcaModelo(rs.getString("MarcaModelo"));
                pol.setAnno(rs.getInt("Anno"));
                pol.setValorAsegurado(rs.getInt("ValorAsegurado"));
                pol.setPlazoPago(rs.getString("PlazoPago"));
                pol.setFechaInicio(rs.getString("FechaInicio"));
                lista.add(pol);
            }
            rs.close();
            ps.close();
            con.close();
            return lista;
        } catch (SQLException e) {
        }
        return lista;
    }

    public int agregar(Poliza p) {
        String sql = "insert into poliza(NumPlaca, MarcaModelo, Anno, ValorAsegurado, PlazoPago, FechaInicio ,Idcliente)values(?,?,?,?,?,?,?)";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNumPlaca());
            ps.setString(2, p.getMarcaModelo());
            ps.setInt(3, p.getAnno());
            ps.setInt(4, p.getValorAsegurado());
            ps.setString(5, p.getPlazoPago());
            ps.setString(6, p.getFechaInicio());
            ps.setInt(7, p.getClienId());
            ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }

    public List<Poliza> listarId(int id) {
        List<Poliza> lista = new ArrayList<>();
        String sql = "Select * from poliza where IdCliente=" + id;
        try {
            con = cn.Conexion();
            con.setAutoCommit(true);
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Poliza pol = new Poliza();
                pol.setId(rs.getInt(1));
                pol.setNumPlaca(rs.getString(2));
                pol.setMarcaModelo(rs.getString(3));
                pol.setAnno(rs.getInt(4));
                pol.setValorAsegurado(rs.getInt(5));
                pol.setPlazoPago(rs.getString(6));
                pol.setFechaInicio(rs.getString(7));
                lista.add(pol);
            }
            rs.close();
            ps.close();
            con.close();
            cn.Conexion().close();
            return lista;
        } catch (SQLException e) {
        }
        return lista;
    }

    public Poliza mostrarPol(int id) {
        String sql = "Select * from poliza where IdPoliza=" + id;
        Poliza pol = new Poliza();
        try {
            con = cn.Conexion();

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            pol.setId(rs.getInt(1));
            pol.setNumPlaca(rs.getString(2));
            pol.setMarcaModelo(rs.getString(3));
            pol.setAnno(rs.getInt(4));
            pol.setValorAsegurado(rs.getInt(5));
            pol.setPlazoPago(rs.getString(6));
            pol.setFechaInicio(rs.getString(7));
            System.out.println(pol.getNumPlaca());
            rs.close();
            ps.close();
            con.close();
            return pol;
        } catch (SQLException e) {
        }
        return pol;
    }

    public int actualizar(Poliza p) {
        String sql = "update poliza set NumPlaca=?, MarcaModelo=?, Anno=?, ValorAsegurado=?, PlazoPago=?, FechaInicio=? where IdPoliza=?";
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNumPlaca());
            ps.setString(2, p.getMarcaModelo());
            ps.setInt(3, p.getAnno());
            ps.setInt(4, p.getValorAsegurado());
            ps.setString(5, p.getPlazoPago());
            ps.setString(6, p.getFechaInicio());
            ps.setInt(6, p.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
        }
        return r;
    }

    public void delete(int id) {
        String sql = "delete from poliza where IdPoliza=" + id;
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
    }
}
