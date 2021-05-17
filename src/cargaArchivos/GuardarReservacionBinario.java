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
import manejadorArchivosAeropuerto.Reservacion;

/**
 *
 * @author Mariano
 */
public class GuardarReservacionBinario {
    //Estructuramos el lugar para guardado de archivos binarios de reservacion
    public static final File archivosReservacion = new File("C:/Users/Maria/OneDrive/Documentos/NetBeansProjects/ProyectoFinal/datos/reservacion");
    //guardamos pasaporte como binario, siempre con las excepsiones necesarias, array list para un arreglo
    public void guardarReservacion(ArrayList<Reservacion> reservaciones) throws IOException,FileNotFoundException{
        FileOutputStream archivoSalida;//saca los datos para guardarlos
        ObjectOutputStream objetoSalida;//para escribir objetos en un fichero y luego necesitamos usar write object
        for (Reservacion reservacion : reservaciones) {//indicamos que recorreremos un pasaporte, el tipo de archivo que definimos
            archivoSalida = new FileOutputStream(archivosReservacion+"/"+reservacion.getNumeroAsiento()+".bin");//nombre de archivo
            objetoSalida = new ObjectOutputStream(archivoSalida);//indicamos en que archivo ira
            objetoSalida.writeObject(reservacion);//lector del objeto
            objetoSalida.close();//cerramos el objeto de salida
        }
    }
}
