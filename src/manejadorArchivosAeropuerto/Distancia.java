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
public class Distancia implements Serializable{
    //atributos para distancia
    private String nombreAeropuertoOrigen;
    private String nombreAeropuertoDestino;
    private int cantidadMillas;
    //creamos constructor de distancia con sus parametros
    public Distancia(String nombreAeropuertoOrigen,String nombreAeropuertoDestino,int cantidadMillas){
        this.nombreAeropuertoOrigen=nombreAeropuertoOrigen;
        this.nombreAeropuertoDestino=nombreAeropuertoDestino;
        this.cantidadMillas=cantidadMillas;
    }
    //gets y sets para llamar y hacer cambios en las variables
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

    public int getCantidadMillas() {
        return this.cantidadMillas;
    }

    public void setCantidadMillas(int cantidadMillas) {
        this.cantidadMillas = cantidadMillas;
    }
    
}
