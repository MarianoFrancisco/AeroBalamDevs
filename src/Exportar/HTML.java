/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exportar;

import java.awt.Component;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 * @author Mariano
 */
public class HTML {
    private void exportarParaExel() {
        JFileChooser fc = new JFileChooser();
        Component jtbProdutos = null;
        int option = fc.showSaveDialog(jtbProdutos);
        if (option == JFileChooser.APPROVE_OPTION) {
            String filename = fc.getSelectedFile().getName();
            String path = fc.getSelectedFile().getParentFile().getPath();
            int len = filename.length();
            String ext = "";
            String file;
            if (len > 4) {
                ext = filename.substring(len - 4, len);
            }
            if (ext.equals(".xls")) {
                file = path + "\\" + filename;
            } else {
                file = path + "\\" + filename + ".xls";
            }
            try {
                toExcel((JTable) jtbProdutos, new File(file));
                System.out.println("Sucesso!");
            } catch (IOException ex) {
                System.out.println("Falha!");
            }
        }
    }
    public void toExcel(JTable table, File file) throws IOException {
        TableModel modelTemp = table.getModel();
        FileWriter excel = new FileWriter(file);
        excel.write("<html> <head><meta charset=\"utf-8\"></head><style>\n"
                + "th, td {"
                + "    font-size: 12pt;"
                + "}"
                + "</style><table border=\"1\"><tr>");
        for (int i = 0; i < modelTemp.getColumnCount(); i++) {
            excel.write("<th>" + modelTemp.getColumnName(i) + "</th>");
        }
        excel.write("</tr>");
        for (int i = 0; i < modelTemp.getRowCount(); i++) {
            excel.write("<tr>");
            for (int j = 0; j < modelTemp.getColumnCount(); j++) {
                excel.write("<td>" + modelTemp.getValueAt(i, j).toString() + "</td>");
            }
            excel.write("</tr>");
        }
        excel.write("</table></html>");
        excel.close();
    }
}
