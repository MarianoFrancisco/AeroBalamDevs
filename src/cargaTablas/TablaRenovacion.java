/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargaTablas;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import manejadorArchivosAeropuerto.Aerolineas;
import manejadorArchivosAeropuerto.Renovacion;

/**
 *
 * @author Mariano
 */
public class TablaRenovacion {
    //utilizamos un array list para aerolinea
    public static void completarTabla(ArrayList<Renovacion> renovaciones, JTable tabla) {
        //creamos una tabla
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tabla.setModel(modeloTabla);//definimos tabla
        //añadimos columnas
        modeloTabla.addColumn("Numero pasaporte");
        modeloTabla.addColumn("Nuevo vencimiento");
        //llenamos filas
        for (Renovacion renovacion : renovaciones) {
            modeloTabla.addRow(new Object[]{renovacion.getPasaporte(),renovacion.getFechaNuevoVencimiento()});
        }
    }
}
