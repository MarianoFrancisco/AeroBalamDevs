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
import manejadorArchivosUser.Pasaporte;

/**
 *
 * @author Mariano
 */
public class CargarPasaporteBinario {
    public ArrayList<Pasaporte> cargarPasaporteBinario() throws FileNotFoundException,IOException,ClassNotFoundException{
        ArrayList<Pasaporte> pasaportes = new ArrayList<>();//indicamos un array list de pasaporte para leer los archivos
        String[]  archivos=GuardarPasaporteBinario.archivosPasaporte.list();//lista de los pasaportes
        ObjectInputStream leerArchivo;//leemos el archivo
        for (int i = 0; i < archivos.length; i++) {//recorremos un for para ir recorriendo hasta la capacidad de binarios que haya
            String archivo = archivos[i];//pasamos una variable para que cuando vaya pasando un archivo aumente contador
            leerArchivo = new ObjectInputStream(new FileInputStream(GuardarPasaporteBinario.archivosPasaporte+"/"+archivo));
            Pasaporte passport =(Pasaporte)leerArchivo.readObject();//leemos el objeto y lo casteamos a pasaporte
            pasaportes.add(passport);//añadimos un pasaporte
            leerArchivo.close();//cerramos el lector
        }
        return pasaportes;
    }
}
