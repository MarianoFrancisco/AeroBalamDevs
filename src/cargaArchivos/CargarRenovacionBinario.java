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
import manejadorArchivosAeropuerto.Renovacion;


/**
 *
 * @author Mariano
 */
public class CargarRenovacionBinario {
    public ArrayList<Renovacion> cargarRenovacionBinario() throws FileNotFoundException,IOException,ClassNotFoundException{
        ArrayList<Renovacion> renovaciones = new ArrayList<>();//indicamos un array list de Renovacion para leer los archivos
        String[]  archivos=GuardarRenovacionBinario.archivosRenovacion.list();//lista de las Renovacion
        ObjectInputStream leerArchivo;//leemos el archivo
        for (int i = 0; i < archivos.length; i++) {//recorremos un for para ir recorriendo hasta la capacidad de binarios que haya
            String archivo = archivos[i];//pasamos una variable para que cuando vaya pasando un archivo aumente contador
            leerArchivo = new ObjectInputStream(new FileInputStream(GuardarRenovacionBinario.archivosRenovacion+"/"+archivo));
            Renovacion renovation =(Renovacion)leerArchivo.readObject();//leemos el objeto y lo casteamos Renovacion
            renovaciones.add(renovation);//añadimos una Renovacion
            leerArchivo.close();//cerramos el lector
        }
        return renovaciones;
    }
}
