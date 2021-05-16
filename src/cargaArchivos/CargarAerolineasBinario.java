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
import manejadorArchivosAeropuerto.Aerolineas;

/**
 *
 * @author Mariano
 */
public class CargarAerolineasBinario {
    public ArrayList<Aerolineas> cargarAerolineasBinario() throws FileNotFoundException,IOException,ClassNotFoundException{
        ArrayList<Aerolineas> aerolineas = new ArrayList<>();//indicamos un array list de Aerolineas para leer los archivos
        String[]  archivos=GuardarAerolineasBinario.archivosAerolineas.list();//lista de las Aerolineas
        ObjectInputStream leerArchivo;//leemos el archivo
        for (int i = 0; i < archivos.length; i++) {//recorremos un for para ir recorriendo hasta la capacidad de binarios que haya
            String archivo = archivos[i];//pasamos una variable para que cuando vaya pasando un archivo aumente contador
            leerArchivo = new ObjectInputStream(new FileInputStream(GuardarAerolineasBinario.archivosAerolineas+"/"+archivo));
            Aerolineas airline =(Aerolineas)leerArchivo.readObject();//leemos el objeto y lo casteamos aerolineas
            aerolineas.add(airline);//añadimos una aerolinea
            leerArchivo.close();//cerramos el lector
        }
        return aerolineas;
    }
}
