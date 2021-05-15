/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadorArchivosUser;

/**
 *
 * @author Mariano
 */
public class CrearTarjeta {
    public static Tarjeta crearTarjeta(String[] espacio){
        Tarjeta tarjeta=null;
        //creamos tarjeta con datos y convertimos string a int        
        tarjeta = new Tarjeta(espacio[0],espacio[1],Integer.parseInt(espacio[2]),espacio[3]);
        return tarjeta;
    }
}
