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
 * @author danie
 */
public class MarcaModeloDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;

    public List<MarcaModelo> listar() {
        String sql = "select * from marcamodelo";
        List<MarcaModelo> lista = new ArrayList<>();
        try {
            con = cn.Conexion();
            con.setAutoCommit(true);
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                MarcaModelo mm = new MarcaModelo();
                System.out.println("Cargando marcas...");
                mm.setMarca(rs.getString("Marca"));
                mm.setModelo(rs.getString("Modelo"));
                lista.add(mm);
            }
            rs.close();
            ps.close();
            con.close();
            return lista;
        } catch (SQLException e) {
            System.out.println("Cargando marcas fallo...");
        }
        return lista;
    }
}
