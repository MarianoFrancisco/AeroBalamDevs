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
public class Aviones implements Serializable{
    /**
     * Constructor de aviones, serializable para que pueda modificarse
     */
    //establecemos atributos de un avion
    private String nombreAerolinea;
    private String nombreAeropuertoActual;
    private int codigoAvion;
    private int capacidadPasajeros;
    private int capacidadGasolina;
    private int consumoPorMilla;
    public Aviones(String nombreAerolinea,String nombreAeropuertoActual,int codigoAvion,int capacidadPasajeros,int capacidadGasolina,int consumoPorMilla){
        this.nombreAerolinea=nombreAerolinea;
        this.nombreAeropuertoActual=nombreAeropuertoActual;
        this.codigoAvion=codigoAvion;
        this.capacidadPasajeros=capacidadPasajeros;
        this.capacidadGasolina=capacidadGasolina;
        this.consumoPorMilla=consumoPorMilla;
    }
    //realizamos get y set para poder llamar los atributos desde otros lados

    public String getNombreAerolinea() {
        return this.nombreAerolinea;
    }

    public void setNombreAerolinea(String nombreAerolinea) {
        this.nombreAerolinea = nombreAerolinea;
    }

    public String getNombreAeropuertoActual() {
        return this.nombreAeropuertoActual;
    }

    public void setNombreAeropuertoActual(String nombreAeropuertoActual) {
        this.nombreAeropuertoActual = nombreAeropuertoActual;
    }

    public int getCodigoAvion() {
        return this.codigoAvion;
    }

    public void setCodigoAvion(int codigoAvion) {
        this.codigoAvion = codigoAvion;
    }

    public int getCapacidadPasajeros() {
        return this.capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getCapacidadGasolina() {
        return this.capacidadGasolina;
    }

    public void setCapacidadGasolina(int capacidadGasolina) {
        this.capacidadGasolina = capacidadGasolina;
    }

    public int getConsumoPorMilla() {
        return this.consumoPorMilla;
    }

    public void setConsumoPorMilla(int consumoPorMilla) {
        this.consumoPorMilla = consumoPorMilla;
    }
    
}
