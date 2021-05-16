/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargaTablas;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import manejadorArchivosAeropuerto.Aviones;

/**
 *
 * @author Mariano
 */
public class TablaAviones {
    //utilizamos un array list para aviones
    public static void completarTabla(ArrayList<Aviones> aviones, JTable tabla) {
        //creamos una tabla
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tabla.setModel(modeloTabla);//definimos tabla
        //añadimos columnas
        modeloTabla.addColumn("Nombre aerolinea");
        modeloTabla.addColumn("Nombre aeropuerto actual");
        modeloTabla.addColumn("Codigo Avion");
        modeloTabla.addColumn("Capacidad Pasajeros");
        modeloTabla.addColumn("Capacidad Gasolina");
        modeloTabla.addColumn("Consumo por milla");
        //llenamos filas
        for (Aviones avion : aviones) {
            modeloTabla.addRow(new Object[]{avion.getNombreAerolinea(),avion.getNombreAeropuertoActual(),avion.getCodigoAvion(),avion.getCapacidadPasajeros(),avion.getCapacidadGasolina(),avion.getConsumoPorMilla()});
        }
    }
}
