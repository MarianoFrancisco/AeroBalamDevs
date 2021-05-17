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
public class CrearReservacion {
    public static Reservacion crearReservacion(String[] espacio){
        Reservacion reservacion=null;
        //creamos reservacion con datos y convertimos string a fechas y string a int        
        reservacion = new Reservacion(espacio[0],espacio[1],espacio[2],Integer.parseInt(espacio[3]));
        return reservacion;
    }
}
