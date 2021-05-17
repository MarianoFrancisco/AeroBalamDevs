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
public class CrearRenovacion {
    public static Renovacion crearRenovacion(String[] espacio){
        Renovacion renovaciones=null;
        //creamos aviones con datos y convertimos string a int        
        renovaciones= new Renovacion(espacio[0],convertirFecha(espacio[1]));
        return renovaciones;
    }
}
