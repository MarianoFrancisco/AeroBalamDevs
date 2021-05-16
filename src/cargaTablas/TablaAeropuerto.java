/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargaTablas;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import manejadorArchivosAeropuerto.Aeropuerto;

/**
 *
 * @author Mariano
 */
public class TablaAeropuerto {
    //utilizamos un array list para aeropuerto
    public static void completarTabla(ArrayList<Aeropuerto> aeropuertos, JTable tabla) {
        //creamos una tabla
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tabla.setModel(modeloTabla);//definimos tabla
        //añadimos columnas
        modeloTabla.addColumn("Nombre aeropuerto");
        modeloTabla.addColumn("Ciudad");
        modeloTabla.addColumn("Pais");
        //llenamos filas
        for (Aeropuerto aeropuerto : aeropuertos) {
            modeloTabla.addRow(new Object[]{aeropuerto.getNombreAeropuerto(),aeropuerto.getNombreCiudad(),aeropuerto.getNombrePais()});
        }
    }
}
