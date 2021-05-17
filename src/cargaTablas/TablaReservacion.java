/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargaTablas;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import manejadorArchivosAeropuerto.Reservacion;

/**
 *
 * @author Mariano
 */
public class TablaReservacion {
    //utilizamos un array list para reservacion
    public static void completarTabla(ArrayList<Reservacion> reservaciones, JTable tabla) {
        //creamos una tabla
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tabla.setModel(modeloTabla);//definimos tabla
        //añadimos columnas
        modeloTabla.addColumn("Numero pasaporte");
        modeloTabla.addColumn("Codigo vuelo");
        modeloTabla.addColumn("Numero tarjeta");
        modeloTabla.addColumn("Numero asiento");
        //llenamos filas
        for (Reservacion reservacion : reservaciones) {
            modeloTabla.addRow(new Object[]{reservacion.getPasaporte(),reservacion.getCodigoVuelo(),reservacion.getNumeroTarjeta(),reservacion.getNumeroAsiento()});
        }
    }
}
