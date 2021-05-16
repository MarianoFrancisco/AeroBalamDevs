/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargaTablas;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import manejadorArchivosAeropuerto.Vuelo;

/**
 *
 * @author Mariano
 */
public class TablaVuelo {
    //utilizamos un array list para vuelo
    public static void completarTabla(ArrayList<Vuelo> vuelos, JTable tabla) {
        //creamos una tabla
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tabla.setModel(modeloTabla);//definimos tabla
        //añadimos columnas
        modeloTabla.addColumn("Codigo vuelo");
        modeloTabla.addColumn("Codigo avion");
        modeloTabla.addColumn("Nombre aeropuerto origen");
        modeloTabla.addColumn("Nombre aeropuerto destino");
        modeloTabla.addColumn("Precio boleto");
        modeloTabla.addColumn("Fecha salida");
        //llenamos filas
        for (Vuelo vuelo : vuelos) {
            modeloTabla.addRow(new Object[]{vuelo.getCodigoVuelo(),vuelo.getCodigoAvion(),vuelo.getNombreAeropuertoOrigen(),vuelo.getNombreAeropuertoDestino(),vuelo.getPrecioBoleto(),vuelo.getFechaSalida()});
        }
    }
}
