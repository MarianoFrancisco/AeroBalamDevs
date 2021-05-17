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
import manejadorArchivosAeropuerto.Renovacion;
import manejadorArchivosUser.Pasaporte;

/**
 *
 * @author Mariano
 */
public class GuardarRenovacionBinario {
    //Estructuramos el lugar para guardado de archivos binarios de renovacion
    public static final File archivosRenovacion = new File("C:/Users/Maria/OneDrive/Documentos/NetBeansProjects/ProyectoFinal/datos/renovacion");
    //guardamos pasaporte como binario, siempre con las excepsiones necesarias, array list para un arreglo
    public void guardarRenovacion(ArrayList<Renovacion> renovaciones) throws IOException,FileNotFoundException{
        FileOutputStream archivoSalida;//saca los datos para guardarlos
        ObjectOutputStream objetoSalida;//para escribir objetos en un fichero y luego necesitamos usar write object
        for (Renovacion renovacion : renovaciones) {//indicamos que recorreremos un pasaporte, el tipo de archivo que definimos
            archivoSalida = new FileOutputStream(archivosRenovacion+"/"+renovacion.getFechaNuevoVencimiento()+".bin");//nombre de archivo
            objetoSalida = new ObjectOutputStream(archivoSalida);//indicamos en que archivo ira
            objetoSalida.writeObject(renovacion);//lector del objeto
            objetoSalida.close();//cerramos el objeto de salida
        }
    }
}
