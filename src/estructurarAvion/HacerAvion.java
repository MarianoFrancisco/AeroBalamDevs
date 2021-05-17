/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurarAvion;

import instancias.FrameVentaAsientos;
import static instancias.FrameVentaAsientos.compraAsientos;
import static instancias.FrameVentaAsientos.s;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Mariano
 */
public class HacerAvion implements Serializable{  
    private int guardarValorX;
    private int guardarValorY;
    private int guardarFilasAsientos;
    private int guardarColumnasAsientos;
    private int guardarFilasPasillo;
    private int guardarColumnasPasillo;
    private int totalAsientos;
    private int totalPasillos;
    JButton[][] asiento;
    JButton[][] pasillo;
    int filas=3;
    int columnas=3;
    int condicionM=filas;
    int condicionN=columnas;
    
    public HacerAvion(int guardarValorX, int guardarValorY,int guardarFilasAsientos,int guardarColumnasAsientos,int guardarFilasPasillo,int guardarColumnasPasillo,int totalAsientos,int totalPasillos){
        this.guardarValorX=guardarValorX;
        this.guardarValorY=guardarValorY;
        this.guardarFilasAsientos=guardarFilasAsientos;
        this.guardarColumnasAsientos=guardarColumnasAsientos;
        this.guardarFilasPasillo=guardarFilasPasillo;
        this.guardarColumnasPasillo=guardarColumnasPasillo;
        this.totalAsientos=totalAsientos;
        this.totalPasillos=totalPasillos;
    }
    public void cambioDatos(){
        s.setGuardarFilasAsientos(s.getGuardarFilasAsientos());
    }
    DistribucionAvion asientos[][]= new DistribucionAvion[100][100];
    DistribucionAvion pasillos[][]= new DistribucionAvion[100][100];
    public void crearAsiento(){
        int x=s.getGuardarValorX();
        int y=s.getGuardarValorY();
        asiento= new JButton[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                asiento[i][j] = new JButton();
                asiento[i][j].setBounds(y, x, 70, 50);
                FrameVentaAsientos.jPanel2.add(asiento[i][j]);
                asiento[i][j].setBackground(Color.ORANGE);
                x+=50;
                asiento[i][j].setVisible(true);
                asientos[i][j]=new Asiento(0,1);
            }
            y+=70;
            x=0;
        }
        s.setGuardarValorX(x);
        s.setGuardarValorY(y);
    }
    public void crearPasillo(){
        int x=s.getGuardarValorX();
        int y=s.getGuardarValorY();
        pasillo= new JButton[filas][1];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < 1; j++) {
                pasillo[i][j] = new JButton();
                pasillo[i][j].setBounds(y, x, 70, 50);
                FrameVentaAsientos.jPanel2.add(pasillo[i][j]);
                pasillo[i][j].setBackground(Color.cyan);
                x+=50;
                pasillo[i][j].setVisible(true);
                pasillos[i][j]=new Pasillo(1,0);
            }       
        }
        s.setGuardarValorX(x);
        s.setGuardarValorY(y);
    }
    public void inicializarAcciones(){
        for (int m = 0; m < condicionM; m++) {
            for (int n = 0; n < condicionN; n++) {
                int k=m;
                int l=n;
                asiento[m][n].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) { 
                        if (compraAsientos.isSelected()) {
                            if(asientos[k][l].getEsAsiento()== 1){
                                JOptionPane.showMessageDialog(null,"compraste asiento, que grande");
                                asiento[k][l].setBackground(Color.red);
                            }
                        }        
                    }                 
                });            
            }            
        }        
    }   
    public int getGuardarValorX() {
        return guardarValorX;
    }

    public void setGuardarValorX(int guardarValorX) {
        this.guardarValorX = guardarValorX;
    }

    public int getGuardarValorY() {
        return guardarValorY;
    }

    public void setGuardarValorY(int guardarValorY) {
        this.guardarValorY = guardarValorY;
    }

    public int getGuardarFilasAsientos() {
        return guardarFilasAsientos;
    }

    public void setGuardarFilasAsientos(int guardarFilasAsientos) {
        this.guardarFilasAsientos = guardarFilasAsientos;
    }

    public int getGuardarColumnasAsientos() {
        return guardarColumnasAsientos;
    }

    public void setGuardarColumnasAsientos(int guardarColumnasAsientos) {
        this.guardarColumnasAsientos = guardarColumnasAsientos;
    }

    public int getGuardarFilasPasillo() {
        return guardarFilasPasillo;
    }

    public void setGuardarFilasPasillo(int guardarFilasPasillo) {
        this.guardarFilasPasillo = guardarFilasPasillo;
    }

    public int getGuardarColumnasPasillo() {
        return guardarColumnasPasillo;
    }

    public void setGuardarColumnasPasillo(int guardarColumnasPasillo) {
        this.guardarColumnasPasillo = guardarColumnasPasillo;
    }

    public int getTotalAsientos() {
        return totalAsientos;
    }

    public void setTotalAsientos(int totalAsientos) {
        this.totalAsientos = totalAsientos;
    }

    public int getTotalPasillos() {
        return totalPasillos;
    }

    public void setTotalPasillos(int totalPasillos) {
        this.totalPasillos = totalPasillos;
    }
    
                                    
}
