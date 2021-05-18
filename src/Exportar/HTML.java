/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exportar;

import static instancias.FrameDepartamentoAdministracion.cargaReportes;
import java.awt.Component;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 * @author Mariano
 */
public class HTML {
    //Practicando para posibilidad de utilizar html
    private void exportarParaExel() {
        try {
            JFileChooser archivo = new JFileChooser(System.getProperty("C:/Users/Maria/OneDrive/Documentos/NetBeansProjects/ProyectoFinal/reportes"));
            archivo.showSaveDialog(null);
            if (archivo.getSelectedFile() != null) {
                try (FileWriter guardado = new FileWriter(archivo.getSelectedFile())) {
                guardado.write(cargaReportes.getText());
                JOptionPane.showMessageDialog(null, "El archivo fue guardado con éxito en la ruta establecida");
                }
        }
        } catch (IOException ex) {
        System.out.println("ex"+ex);
        }
        
    }
}
