/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargaTablas;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import manejadorArchivosUser.Pasaporte;

/**
 *
 * @author Mariano
 */
public class TablaPasaporte {
    //utilizamos un array list para pasaporte
    public static void completarTabla(ArrayList<Pasaporte> pasaportes, JTable tabla) {
        //creamos una tabla
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tabla.setModel(modeloTabla);//definimos tabla
        //añadimos columnas
        modeloTabla.addColumn("Pasaporte");
        modeloTabla.addColumn("Contraseña");
        modeloTabla.addColumn("Fecha nacimiento");
        modeloTabla.addColumn("Nacionalidad");
        modeloTabla.addColumn("Estado civil");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellidos");
        modeloTabla.addColumn("Sexo");
        modeloTabla.addColumn("Fecha vencimiento");
        modeloTabla.addColumn("Fecha emision");
        modeloTabla.addColumn("Pais Actual");
        modeloTabla.addColumn("Millas recorridas");
        //llenamos filas
        for (Pasaporte pasaporte : pasaportes) {
            modeloTabla.addRow(new Object[]{pasaporte.getPasaporte(),pasaporte.getContrasenia(),pasaporte.getFechaNacimiento(),pasaporte.getNacionalidad(),pasaporte.getEstadoCivil(),pasaporte.getNombres(),pasaporte.getApellidos(),pasaporte.getSexo(),pasaporte.getFechaVencimientoPasaporte(),pasaporte.getFechaEmisionPasaporte(),pasaporte.getPaisActual(),pasaporte.getMillasRecorridas()});
        }

    }
}
