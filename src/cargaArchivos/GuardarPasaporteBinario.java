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
import manejadorArchivosUser.Pasaporte;

/**
 *
 * @author Mariano
 */
public class GuardarPasaporteBinario {
    //Estructuramos el lugar para guardado de archivos binarios de pasaporte
    public static final File archivosPasaporte = new File("C:/Users/Maria/OneDrive/Documentos/NetBeansProjects/ProyectoFinal/datos/pasaportes");
    //guardamos pasaporte como binario, siempre con las excepsiones necesarias, array list para un arreglo
    public void guardarPasaporte(ArrayList<Pasaporte> pasaportes) throws IOException,FileNotFoundException{
        FileOutputStream archivoSalida;//saca los datos para guardarlos
        ObjectOutputStream objetoSalida;//para escribir objetos en un fichero y luego necesitamos usar write object
        for (Pasaporte pasaporte : pasaportes) {//indicamos que recorreremos un pasaporte, el tipo de archivo que definimos
            archivoSalida = new FileOutputStream(archivosPasaporte+"/"+pasaporte.getPasaporte());//nombre de archivo
            objetoSalida = new ObjectOutputStream(archivoSalida);//indicamos en que archivo ira
            objetoSalida.writeObject(pasaporte);//lector del objeto
            objetoSalida.close();//cerramos el objeto de salida
        }
    }
}
