/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosConCargaDatos;

import java.io.Serializable;

/**
 *
 * @author Mariano
 */
public class Aeropuerto implements Serializable{
    /**
     * Constructor de aeropuertos, serializable para que pueda modificarse
     */
    //establecemos atributos de un aeropuerto
    private String nombreAeropuerto;
    private String nombreCiudad;
    private String nombrePais;
    //hacemos el constructor para pasajero y le ponemos sus parametros
    public Aeropuerto(String nombreAeropuerto,String nombreCiudad,String nombrePais){
        this.nombreAeropuerto=nombreAeropuerto;
        this.nombreCiudad=nombreCiudad;
        this.nombrePais=nombrePais;
    }
    //realizamos get y set para poder llamar los atributos desde otros lados
    public String getNombreAeropuerto() {
        return this.nombreAeropuerto;
    }

    public void setNombreAeropuerto(String nombreAeropuerto) {
        this.nombreAeropuerto = nombreAeropuerto;
    }

    public String getNombreCiudad() {
        return this.nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getNombrePais() {
        return this.nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
    
}
