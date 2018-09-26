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
public class UltimoDuenio {
    
    String run;
    String nombreCompleto;
    String telefono;

    public UltimoDuenio() {
    }

    
    public UltimoDuenio(String run, String nombreCompleto, String telefono) {
        this.run = run;
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    
    
}
