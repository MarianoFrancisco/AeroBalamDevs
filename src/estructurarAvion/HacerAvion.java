/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurarAvion;

import static instancias.FramePasajeros.c;
import instancias.FrameVentaAsientos;
import static instancias.FrameVentaAsientos.compraAsientos;
import static instancias.FrameVentaAsientos.s;
import static instancias.FrameVisualizarDistribucionAsientos.frameVisualizarDistribucionAsientos;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import static proyectofinal.ProyectoFinal.c1;

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
    public static JButton[][] asiento;
    public static JButton[][] pasillo;
    public static JButton[][] asiento1;
    public static JButton[][] pasillo1;
    int filas=c.getTomarColumnas();
    int columnas=c.getTomarFilas();
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
    public static DistribucionAvion asientos[][]= new DistribucionAvion[1000][1000];
    public static DistribucionAvion pasillos[][]= new DistribucionAvion[1000][1000];
    public void crearAsiento(){
        int x=s.getGuardarValorX();
        int y=s.getGuardarValorY();
        asiento= new JButton[filas][columnas];
        asiento1= new JButton[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                asiento[i][j] = new JButton();
                asiento1[i][j] = new JButton();
                asiento[i][j].setBounds(y, x, 90, 50);
                asiento1[i][j].setBounds(y, x, 90, 50);
                FrameVentaAsientos.jPanel2.add(asiento[i][j]);
                frameVisualizarDistribucionAsientos.jPanel2.add(asiento1[i][j]);
                asiento[i][j].setBackground(Color.ORANGE);
                asiento1[i][j].setBackground(Color.ORANGE);
                asiento[i][j].setText("Asiento");
                asiento1[i][j].setText("Asiento");
                x+=50;
                asiento[i][j].setVisible(true);
                asiento1[i][j].setVisible(true);
                asientos[i][j]=new Asiento(0,1);
            }
            y+=90;
            x=0;
        }
        s.setGuardarValorX(x);
        s.setGuardarValorY(y);
    }
    public void crearPasillo(){
        int x=s.getGuardarValorX();
        int y=s.getGuardarValorY();
        pasillo= new JButton[c.getTomarFilas()][1];
        pasillo1= new JButton[c.getTomarFilas()][1];
        for (int i = 0; i < c.getTomarFilas(); i++) {
            for (int j = 0; j < 1; j++) {
                pasillo[i][j] = new JButton();
                pasillo1[i][j] = new JButton();
                pasillo[i][j].setBounds(y, x, 90, 50);
                pasillo1[i][j].setBounds(y, x, 90, 50);
                FrameVentaAsientos.jPanel2.add(pasillo[i][j]);
                frameVisualizarDistribucionAsientos.jPanel2.add(pasillo1[i][j]);
                pasillo[i][j].setBackground(Color.cyan);
                pasillo1[i][j].setBackground(Color.cyan);
                x+=50;
                pasillo[i][j].setVisible(true);
                pasillo1[i][j].setVisible(true);
                pasillos[i][j]=new Pasillo(1,0);
                pasillo[i][j].setText("Pasillo");
                pasillo1[i][j].setText("Pasillo");
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
                            if(asientos[k][l].getOcupado()== 0){
                                if(c.getCapacidadComprar()>0){
                                    JOptionPane.showMessageDialog(null,"compraste asiento, que grande");
                                    asiento[k][l].setBackground(Color.red);
                                    asientos[k][l].setOcupado(1);
                                    asiento1[k][l].setBackground(Color.red);
                                    c1.setDineroGanado(c1.getDineroGanado()+300);
                                    c.setCapacidadComprar(c.getCapacidadComprar()-1);
                                }else{
                                    JOptionPane.showMessageDialog(null,"lo siento no puedes comprar mas boletos ya que solo indicaste compra de "+c.getVerCantidadPasajeros()+" :(");
                                }                           
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"asiento ya comprado");
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
