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
import manejadorArchivosUser.Tarjeta;

/**
 *
 * @author Mariano
 */
public class GuardarTarjetaBinario {
    //Estructuramos el lugar para guardado de archivos binarios de Tarjeta
    public static final File archivosTarjeta = new File("C:/Users/Maria/OneDrive/Documentos/NetBeansProjects/ProyectoFinal/datos/tarjetas");
    //guardamos pasaporte como binario, siempre con las excepsiones necesarias, array list para un arreglo
    public void guardarTarjeta(ArrayList<Tarjeta> tarjetas) throws IOException,FileNotFoundException{
        FileOutputStream archivoSalida;//saca los datos para guardarlos
        ObjectOutputStream objetoSalida;//para escribir objetos en un fichero y luego necesitamos usar write object
        for (Tarjeta tarjeta : tarjetas) {//indicamos que recorreremos un pasaporte, el tipo de archivo que definimos
            archivoSalida = new FileOutputStream(archivosTarjeta+"/"+tarjeta.getNumeroTarjeta()+".bin");//nombre de archivo
            objetoSalida = new ObjectOutputStream(archivoSalida);//indicamos en que archivo ira
            objetoSalida.writeObject(tarjeta);//lector del objeto
            objetoSalida.close();//cerramos el objeto de salida
        }
    }
}
