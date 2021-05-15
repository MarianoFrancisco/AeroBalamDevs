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
public class CrearAviones {
    public static Aviones crearAviones(String[] espacio){
        Aviones aviones=null;
        //creamos aviones con datos y convertimos string a int        
        aviones= new Aviones(espacio[0],espacio[1],Integer.parseInt(espacio[2]),Integer.parseInt(espacio[3]),Integer.parseInt(espacio[4]),Integer.parseInt(espacio[5]));
        return aviones;
    }
}
