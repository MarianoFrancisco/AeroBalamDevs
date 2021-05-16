/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargaArchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JTextArea;
import manejadorArchivosAeropuerto.Aerolineas;
import manejadorArchivosAeropuerto.CrearAerolineas;


/**
 *
 * @author Mariano
 */
public class CargarAerolineasEnTexto {
    //ponemos parametros que llevará el array list de tipo Aerolineas
    public ArrayList<Aerolineas> cargarAerolineasEnTexto(File archivo,JTextArea texto) throws FileNotFoundException, IOException {
        ArrayList<Aerolineas> aerolineas = new ArrayList<>();//creamos un nuevo array list
        FileReader leerArchivo = new FileReader(archivo);//fileReader para leer archivos
        BufferedReader leerTextoArchivo = new BufferedReader(leerArchivo);//bufferedReader para leer texto de archivos
        String renglon;
        //si el renglon no es nulo seguira leyendo
        while ((renglon = leerTextoArchivo.readLine()) != null) {
            //con la linea leida, separamos los campos
            String[] espacio= separarEspacio(renglon);
            //pasamos el texto a objeto
            Aerolineas aerolinea=CrearAerolineas.crearAerolineas(espacio);//creamos una aerolinea
            if(aerolinea!=null){
                aerolineas.add(aerolinea);//agregamos una aerolinea
            }
            texto.append("\n"+renglon);
        }
        leerArchivo.close();//cerramos el fileReader 
        return aerolineas;//retornamos una aerolinea
    }

    private String[] separarEspacio(String renglon) {
        String inicioAerolinea = "AEROLÍNEA(";//indicamos el inicio que tendrá la estructura
        String renglonDeEspacios = renglon.substring(inicioAerolinea.length(), renglon.length() - 1);//-1 ya que leera menos de la capacidad para no contar parentesis
        String[] espacios = renglonDeEspacios.split(",");//split para hacer una separacion cuando haya coma
        return espacios;
    }
}
