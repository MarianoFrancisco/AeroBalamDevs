/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadorArchivosAeropuerto;

import java.io.Serializable;

/**
 *
 * @author Mariano
 */
public class Reservacion implements Serializable{
    private String pasaporte;
    private String codigoVuelo;
    private String numeroTarjeta;
    private int numeroAsiento;
    
    public Reservacion(String pasaporte, String codigoVuelo, String numeroTarjeta, int numeroAsiento){
        this.pasaporte=pasaporte;
        this.codigoVuelo=codigoVuelo;
        this.numeroTarjeta=numeroTarjeta;
        this.numeroAsiento=numeroAsiento;
    }

    public String getPasaporte() {
        return this.pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getCodigoVuelo() {
        return this.codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public String getNumeroTarjeta() {
        return this.numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getNumeroAsiento() {
        return this.numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }
    
    
}
