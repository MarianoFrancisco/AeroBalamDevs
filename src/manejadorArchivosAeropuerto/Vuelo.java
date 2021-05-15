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
public class Vuelo implements Serializable{
    //atributos de un vuelo
    private String codigoVuelo;
    private String codigoAvion;
    private String nombreAeropuertoOrigen;
    private String nombreAeropuertoDestino;
    private int precioBoleto;
    private LocalDate fechaSalida;
    //constructor de vuelo, añadimos sus parametros
    public Vuelo(String codigoVuelo,String codigoAvion,String nombreAeropuertoOrigen,String nombreAeropuertoDestino,int precioBoleto,LocalDate fechaSalida){
        this.codigoVuelo=codigoVuelo;
        this.codigoAvion=codigoAvion;
        this.nombreAeropuertoDestino=nombreAeropuertoDestino;
        this.nombreAeropuertoOrigen=nombreAeropuertoOrigen;
        this.precioBoleto=precioBoleto;
        this.fechaSalida=fechaSalida;
    }
    //Creamos gets y sets
    public String getCodigoVuelo() {
        return this.codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public String getCodigoAvion() {
        return this.codigoAvion;
    }

    public void setCodigoAvion(String codigoAvion) {
        this.codigoAvion = codigoAvion;
    }

    public String getNombreAeropuertoOrigen() {
        return this.nombreAeropuertoOrigen;
    }

    public void setNombreAeropuertoOrigen(String nombreAeropuertoOrigen) {
        this.nombreAeropuertoOrigen = nombreAeropuertoOrigen;
    }

    public String getNombreAeropuertoDestino() {
        return this.nombreAeropuertoDestino;
    }

    public void setNombreAeropuertoDestino(String nombreAeropuertoDestino) {
        this.nombreAeropuertoDestino = nombreAeropuertoDestino;
    }

    public int getPrecioBoleto() {
        return this.precioBoleto;
    }

    public void setPrecioBoleto(int precioBoleto) {
        this.precioBoleto = precioBoleto;
    }

    public LocalDate getFechaSalida() {
        return this.fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
    
}
