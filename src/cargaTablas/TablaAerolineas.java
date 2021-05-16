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

/**
 *
 * @author Mariano
 */
public class TablaAerolineas {
    //utilizamos un array list para aerolinea
    public static void completarTabla(ArrayList<Aerolineas> aerolineas, JTable tabla) {
        //creamos una tabla
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tabla.setModel(modeloTabla);//definimos tabla
        //añadimos columnas
        modeloTabla.addColumn("Nombre aeropuerto");
        modeloTabla.addColumn("Nombre aerolinea");
        //llenamos filas
        for (Aerolineas aerolinea : aerolineas) {
            modeloTabla.addRow(new Object[]{aerolinea.getNombreAeropuerto(),aerolinea.getNombreAerolinea()});
        }
    }
}
