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
public class CrearAerolineas {
    public static Aerolineas crearAerolineas(String[] espacio){
        Aerolineas aerolineas=null;
        //creamos aerolineas con datos      
        aerolineas = new Aerolineas(espacio[0],espacio[1]);
        return aerolineas;
    }
}
