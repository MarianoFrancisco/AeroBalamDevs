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
import manejadorArchivosAeropuerto.Distancia;

/**
 *
 * @author Mariano
 */
public class GuardarDistanciaBinario {
    //Estructuramos el lugar para guardado de archivos binarios de Distancia
    public static final File archivosDistancia = new File("C:/Users/Maria/OneDrive/Documentos/NetBeansProjects/ProyectoFinal/datos/distancias");
    //guardamos distancia como binario, siempre con las excepsiones necesarias, array list para un arreglo
    public void guardarDistancia(ArrayList<Distancia> distancias) throws IOException,FileNotFoundException{
        FileOutputStream archivoSalida;//saca los datos para guardarlos
        ObjectOutputStream objetoSalida;//para escribir objetos en un fichero y luego necesitamos usar write object
        for (Distancia distancia : distancias) {//indicamos que recorreremos un Distancia, el tipo de archivo que definimos
            archivoSalida = new FileOutputStream(archivosDistancia+"/"+distancia.getCantidadMillas()+".bin");//nombre de archivo
            objetoSalida = new ObjectOutputStream(archivoSalida);//indicamos en que archivo ira
            objetoSalida.writeObject(distancia);//lector del objeto
            objetoSalida.close();//cerramos el objeto de salida
        }
    }
}
