/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargaArchivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import manejadorArchivosAeropuerto.Reservacion;

/**
 *
 * @author Mariano
 */
public class CargarReservacionBinario {
    public ArrayList<Reservacion> cargarReservacionBinario() throws FileNotFoundException,IOException,ClassNotFoundException{
        ArrayList<Reservacion> reservaciones = new ArrayList<>();//indicamos un array list de Reservacion para leer los archivos
        String[]  archivos=GuardarReservacionBinario.archivosReservacion.list();//lista de los Reservacion
        ObjectInputStream leerArchivo;//leemos el archivo
        for (int i = 0; i < archivos.length; i++) {//recorremos un for para ir recorriendo hasta la capacidad de binarios que haya
            String archivo = archivos[i];//pasamos una variable para que cuando vaya pasando un archivo aumente contador
            leerArchivo = new ObjectInputStream(new FileInputStream(GuardarReservacionBinario.archivosReservacion+"/"+archivo));
            Reservacion reservacion =(Reservacion)leerArchivo.readObject();//leemos el objeto y lo casteamos a Reservacion
            reservaciones.add(reservacion);//añadimos un Reservacion
            leerArchivo.close();//cerramos el lector
        }
        return reservaciones;
    }
}
