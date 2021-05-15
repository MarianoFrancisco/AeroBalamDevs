/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadorArchivosAeropuerto;

/**
 *
 * @author Mariano
 */
public class CrearAeropuerto {
    public static Aeropuerto crearAeropuerto(String[] espacio){
        Aeropuerto aeropuerto=null;
        //creamos aeropuerto con datos      
        aeropuerto = new Aeropuerto(espacio[0],espacio[1],espacio[2]);
        return aeropuerto;
    }
}
