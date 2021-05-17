/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadorArchivosAeropuerto;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Mariano
 */
public class Renovacion implements Serializable{
    private String pasaporte;
    private LocalDate fechaNuevoVencimiento;
    public Renovacion(String pasaporte, LocalDate fechaNuevoVencimiento){
        this.pasaporte=pasaporte;
        this.fechaNuevoVencimiento=fechaNuevoVencimiento;
    }

    public String getPasaporte() {
        return this.pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public LocalDate getFechaNuevoVencimiento() {
        return this.fechaNuevoVencimiento;
    }

    public void setFechaNuevoVencimiento(LocalDate fechaNuevoVencimiento) {
        this.fechaNuevoVencimiento = fechaNuevoVencimiento;
    }
    
}
