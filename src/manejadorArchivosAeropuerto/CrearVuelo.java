/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadorArchivosAeropuerto;

import static manejadorArchivosUser.CrearPasaporte.convertirFecha;

/**
 *
 * @author Mariano
 */
public class CrearVuelo {
    public static Vuelo crearVuelo(String[] espacio){
        Vuelo vuelo=null;
        //creamos vuelo con datos y convertimos string a fechas y string a int        
        vuelo = new Vuelo(espacio[0],espacio[1],espacio[2],espacio[3],Integer.parseInt(espacio[4]),convertirFecha(espacio[5]));
        return vuelo;
    }
}
