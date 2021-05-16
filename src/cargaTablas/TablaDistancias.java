/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargaTablas;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import manejadorArchivosAeropuerto.Distancia;

/**
 *
 * @author Mariano
 */
public class TablaDistancias {
    //utilizamos un array list para distancias
    public static void completarTabla(ArrayList<Distancia> distancias, JTable tabla) {
        //creamos una tabla
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tabla.setModel(modeloTabla);//definimos tabla
        //añadimos columnas
        modeloTabla.addColumn("Nombre aeropuerto origen");
        modeloTabla.addColumn("Nombre aeropuerto destino");
        modeloTabla.addColumn("Cantidad millas");
        //llenamos filas
        for (Distancia distancia : distancias) {
            modeloTabla.addRow(new Object[]{distancia.getNombreAeropuertoOrigen(),distancia.getNombreAeropuertoOrigen(),distancia.getCantidadMillas()});
        }
    }
}
