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
import manejadorArchivosAeropuerto.Aerolineas;

/**
 *
 * @author Mariano
 */
public class GuardarAerolineasBinario {
    //Estructuramos el lugar para guardado de archivos binarios de aerolinea
    public static final File archivosAerolineas = new File("C:/Users/Maria/OneDrive/Documentos/NetBeansProjects/ProyectoFinal/datos/aerolineas");
    //guardamos pasaporte como binario, siempre con las excepsiones necesarias, array list para un arreglo
    public void guardarAerolineas(ArrayList<Aerolineas> aerolineas) throws IOException,FileNotFoundException{
        FileOutputStream archivoSalida;//saca los datos para guardarlos
        ObjectOutputStream objetoSalida;//para escribir objetos en un fichero y luego necesitamos usar write object
        for (Aerolineas aerolinea : aerolineas) {//indicamos que recorreremos una aerolinea, el tipo de archivo que definimos
            archivoSalida = new FileOutputStream(archivosAerolineas+"/"+aerolinea.getNombreAerolinea());//nombre de archivo
            objetoSalida = new ObjectOutputStream(archivoSalida);//indicamos en que archivo ira
            objetoSalida.writeObject(aerolinea);//lector del objeto
            objetoSalida.close();//cerramos el objeto de salida
        }
    }
}
