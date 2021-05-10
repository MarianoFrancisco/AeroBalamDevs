/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosConCargaDatos;

/**
 *
 * @author Mariano
 */
public class Aerolineas {
    /**
     * Constructor de aerolineas, serializable para que pueda modificarse
     */
    //establecemos atributos de una aerolinea
    private String nombreAeropuerto;
    private String nombreAerolinea;
    //hacemos el constructor para pasajero y le ponemos sus parametros
    public Aerolineas(String nombreAeropuerto,String nombreAerolinea){
        this.nombreAeropuerto=nombreAeropuerto;
        this.nombreAerolinea=nombreAerolinea;
    }
    //realizamos get y set para poder llamar los atributos desde otros lados
    public String getNombreAeropuerto() {
        return this.nombreAeropuerto;
    }

    public void setNombreAeropuerto(String nombreAeropuerto) {
        this.nombreAeropuerto = nombreAeropuerto;
    }

    public String getNombreAerolinea() {
        return this.nombreAerolinea;
    }

    public void setNombreAerolinea(String nombreAerolinea) {
        this.nombreAerolinea = nombreAerolinea;
    }
    
}
