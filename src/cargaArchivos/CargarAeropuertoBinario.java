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
import manejadorArchivosAeropuerto.Aeropuerto;

/**
 *
 * @author Mariano
 */
public class CargarAeropuertoBinario {
    public ArrayList<Aeropuerto> cargarAeropuertoBinario() throws FileNotFoundException,IOException,ClassNotFoundException{
        ArrayList<Aeropuerto> pasaportes = new ArrayList<>();//indicamos un array list de Aeropuerto para leer los archivos
        String[]  archivos=GuardarAeropuertoBinario.archivosAeropuerto.list();//lista de los Aeropuertos
        ObjectInputStream leerArchivo;//leemos el archivo
        for (int i = 0; i < archivos.length; i++) {//recorremos un for para ir recorriendo hasta la capacidad de binarios que haya
            String archivo = archivos[i];//pasamos una variable para que cuando vaya pasando un archivo aumente contador
            leerArchivo = new ObjectInputStream(new FileInputStream(GuardarAeropuertoBinario.archivosAeropuerto+"/"+archivo));
            Aeropuerto airport =(Aeropuerto)leerArchivo.readObject();//leemos el objeto y lo casteamos a aeropuerto
            pasaportes.add(airport);//añadimos un aeropuerto
            leerArchivo.close();//cerramos el lector
        }
        return pasaportes;
    }
}
