/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargaTablas;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import manejadorArchivosUser.Tarjeta;

/**
 *
 * @author Mariano
 */
public class TablaTarjeta {
    //utilizamos un array list para tarjeta
    public static void completarTabla(ArrayList<Tarjeta> tarjetas, JTable tabla) {
        //creamos una tabla
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tabla.setModel(modeloTabla);//definimos tabla
        //añadimos columnas
        modeloTabla.addColumn("Numero tarjeta");
        modeloTabla.addColumn("Numero pasaporte");
        modeloTabla.addColumn("DineroActual");
        modeloTabla.addColumn("Codigo CVC");
        //llenamos filas
        for (Tarjeta tarjeta : tarjetas) {
            modeloTabla.addRow(new Object[]{tarjeta.getNumeroTarjeta(),tarjeta.getPasaporte(),tarjeta.getDineroActual(),tarjeta.getCodigoCVC()});
        }
    }
}
