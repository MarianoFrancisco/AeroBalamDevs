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
public class CrearDistancia {
    public static Distancia crearDistancia(String[] espacio){
        Distancia distancia=null;
        //creamos distancia con datos y convertimos string a int        
        distancia= new Distancia(espacio[0],espacio[1],Integer.parseInt(espacio[2]));
        return distancia;
    }
}
