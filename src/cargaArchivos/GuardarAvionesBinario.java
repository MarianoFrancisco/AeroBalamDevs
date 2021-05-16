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
import manejadorArchivosAeropuerto.Aviones;

/**
 *
 * @author Mariano
 */
public class GuardarAvionesBinario {
    //Estructuramos el lugar para guardado de archivos binarios de aviones
    public static final File archivosAviones = new File("C:/Users/Maria/OneDrive/Documentos/NetBeansProjects/ProyectoFinal/datos/aviones");
    //guardamos pasaporte como binario, siempre con las excepsiones necesarias, array list para un arreglo
    public void guardarAviones(ArrayList<Aviones> aviones) throws IOException,FileNotFoundException{
        FileOutputStream archivoSalida;//saca los datos para guardarlos
        ObjectOutputStream objetoSalida;//para escribir objetos en un fichero y luego necesitamos usar write object
        for (Aviones avion : aviones) {//indicamos que recorreremos un aviones, el tipo de archivo que definimos
            archivoSalida = new FileOutputStream(archivosAviones+"/"+avion.getCodigoAvion());//nombre de archivo
            objetoSalida = new ObjectOutputStream(archivoSalida);//indicamos en que archivo ira
            objetoSalida.writeObject(avion);//lector del objeto
            objetoSalida.close();//cerramos el objeto de salida
        }
    }
}
