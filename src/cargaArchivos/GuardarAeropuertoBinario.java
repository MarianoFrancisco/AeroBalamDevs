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
import manejadorArchivosAeropuerto.Aeropuerto;

/**
 *
 * @author Mariano
 */
public class GuardarAeropuertoBinario {
    //Estructuramos el lugar para guardado de archivos binarios de aeropuerto
    public static final File archivosAeropuerto = new File("C:/Users/Maria/OneDrive/Documentos/NetBeansProjects/ProyectoFinal/datos/aeropuertos");
    //guardamos pasaporte como binario, siempre con las excepsiones necesarias, array list para un arreglo
    public void guardarAeropuerto(ArrayList<Aeropuerto> aeropuertos) throws IOException,FileNotFoundException{
        FileOutputStream archivoSalida;//saca los datos para guardarlos
        ObjectOutputStream objetoSalida;//para escribir objetos en un fichero y luego necesitamos usar write object
        for (Aeropuerto aeropuerto : aeropuertos) {//indicamos que recorreremos un aeropuerto, el tipo de archivo que definimos
            archivoSalida = new FileOutputStream(archivosAeropuerto+"/"+aeropuerto.getNombreAeropuerto()+".bin");//nombre de archivo
            objetoSalida = new ObjectOutputStream(archivoSalida);//indicamos en que archivo ira
            objetoSalida.writeObject(aeropuerto);//lector del objeto
            objetoSalida.close();//cerramos el objeto de salida
        }
    }
}
