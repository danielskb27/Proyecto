/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author diego
 */
public class Poliza {
    private int id;
    private String NumPlaca;
    private String MarcaModelo;
    private int Anno;
    private int ValorAsegurado;
    private String PlazoPago;
    private String FechaInicio;
    private int clienId;

    public Poliza(int id, String NumPlaca, String MarcaModelo, int Anno, int ValorAsegurado, String PlazoPago, String FechaInicio,int clienId) {
        this.id = id;
        this.NumPlaca = NumPlaca;
        this.MarcaModelo = MarcaModelo;
        this.Anno = Anno;
        this.ValorAsegurado = ValorAsegurado;
        this.PlazoPago = PlazoPago;
        this.FechaInicio = FechaInicio;
        this.clienId=clienId;
    }

    public int getClienId() {
        return clienId;
    }

    public void setClienId(int clienId) {
        this.clienId = clienId;
    }

    public Poliza() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumPlaca() {
        return NumPlaca;
    }

    public void setNumPlaca(String NumPlaca) {
        this.NumPlaca = NumPlaca;
    }

    public String getMarcaModelo() {
        return MarcaModelo;
    }

    public void setMarcaModelo(String MarcaModelo) {
        this.MarcaModelo = MarcaModelo;
    }

    public int getAnno() {
        return Anno;
    }

    public void setAnno(int Anno) {
        this.Anno = Anno;
    }

    public int getValorAsegurado() {
        return ValorAsegurado;
    }

    public void setValorAsegurado(int ValorAsegurado) {
        this.ValorAsegurado = ValorAsegurado;
    }

    
    public String getPlazoPago() {
        return PlazoPago;
    }

    public void setPlazoPago(String PlazoPago) {
        this.PlazoPago = PlazoPago;
    }

    public String getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(String FechaInicio) {
        this.FechaInicio = FechaInicio;
    }
    
}
