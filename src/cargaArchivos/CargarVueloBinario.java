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
import manejadorArchivosAeropuerto.Vuelo;

/**
 *
 * @author Mariano
 */
public class CargarVueloBinario {
    public ArrayList<Vuelo> cargarVueloBinario() throws FileNotFoundException,IOException,ClassNotFoundException{
        ArrayList<Vuelo> vuelos = new ArrayList<>();//indicamos un array list de Vuelos para leer los archivos
        String[]  archivos=GuardarVueloBinario.archivosVuelo.list();//lista de los Vuelos
        ObjectInputStream leerArchivo;//leemos el archivo
        for (int i = 0; i < archivos.length; i++) {//recorremos un for para ir recorriendo hasta la capacidad de binarios que haya
            String archivo = archivos[i];//pasamos una variable para que cuando vaya pasando un archivo aumente contador
            leerArchivo = new ObjectInputStream(new FileInputStream(GuardarVueloBinario.archivosVuelo+"/"+archivo));
            Vuelo fly =(Vuelo)leerArchivo.readObject();//leemos el objeto y lo casteamos a vuelos
            vuelos.add(fly);//añadimos un vuelo
            leerArchivo.close();//cerramos el lector
        }
        return vuelos;
    }
}
