/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author maranda
 */
public class Automovil {
    
    int id;
    String patente;
    String marca;
    int anio;
    String detalles;
    UltimoDuenio ud;

    public Automovil() {
    }

    public Automovil(int id, String patente, String marca, int anio, String detalles, UltimoDuenio ud) {
        this.id = id;
        this.patente = patente;
        this.marca = marca;
        this.anio = anio;
        this.detalles = detalles;
        this.ud = ud;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public UltimoDuenio getUd() {
        return ud;
    }

    public void setUd(UltimoDuenio ud) {
        this.ud = ud;
    }
    
    
    
    
    
    
}
