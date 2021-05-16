/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargaArchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import manejadorArchivosAeropuerto.Vuelo;
/**
 *
 * @author Mariano
 */
public class GuardarVueloBinario {
    //Estructuramos el lugar para guardado de archivos binarios de Vuelo
    public static final File archivosVuelo = new File("C:/Users/Maria/OneDrive/Documentos/NetBeansProjects/ProyectoFinal/datos/vuelos");
    //guardamos Vuelo como binario, siempre con las excepsiones necesarias, array list para un arreglo
    public void guardarVuelo(ArrayList<Vuelo> vuelos) throws IOException,FileNotFoundException{
        FileOutputStream archivoSalida;//saca los datos para guardarlos
        ObjectOutputStream objetoSalida;//para escribir objetos en un fichero y luego necesitamos usar write object
        for (Vuelo vuelo : vuelos) {//indicamos que recorreremos un pasaporte, el tipo de archivo que definimos
            archivoSalida = new FileOutputStream(archivosVuelo+"/"+vuelo.getCodigoVuelo()+".bin");//nombre de archivo
            objetoSalida = new ObjectOutputStream(archivoSalida);//indicamos en que archivo ira
            objetoSalida.writeObject(vuelo);//lector del objeto
            objetoSalida.close();//cerramos el objeto de salida
        }
    }
}
