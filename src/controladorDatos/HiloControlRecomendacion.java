/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorDatos;

import static estructurarAvion.HacerAvion.asiento;
import static estructurarAvion.HacerAvion.asientos;
import static instancias.FramePasajeros.c;
import java.awt.Color;
import javax.swing.JOptionPane;
import proyectofinal.HiloAnimacion;

/**
 *
 * @author Mariano
 */
public class HiloControlRecomendacion extends Thread implements Runnable{
    @Override
    public void run() {
        JOptionPane.showMessageDialog(null, "Asientos Recomendados en color morado siu");//mensaje amigable
        //creamos variables de modificacion
        int aleatorio = c.getVerCantidadPasajeros();
        int contador=0;
        int filas=c.getTomarColumnas();
        int columnas=c.getTomarFilas();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if(contador==0&&contador<aleatorio){

                        if(asientos[i][j].getOcupado()==0){
                            asiento[i][j].setBackground(Color.pink);
                        }
                }
                if(contador==1&&contador<aleatorio){
                        if(asientos[i][j].getOcupado()==0){
                            asiento[i][j].setBackground(Color.pink);
                        }
                }
                if(contador==2&&contador<aleatorio){

                        if(asientos[i][j].getOcupado()==0){
                            asiento[i][j].setBackground(Color.pink);
                        }
                }
                if(contador==3&&contador<aleatorio){

                        if(asientos[i][j].getOcupado()==0){
                            asiento[i][j].setBackground(Color.pink);
                        }  
                }
                if(contador==4&&contador<aleatorio){

                        if(asientos[i][j].getOcupado()==0){
                            asiento[i][j].setBackground(Color.pink);
                        }     
                }
                if(contador==5&&contador<aleatorio){
                        if(asientos[i][j].getOcupado()==0){
                            asiento[i][j].setBackground(Color.pink);}
                }       
                if (asientos[i][j].getOcupado()==0){
                    try{//try catch por si ocurre error y damos tiempo de espera de 300milisegundos
                    HiloAnimacion.sleep(500);
                    contador++;
                    }catch(InterruptedException e){
                    System.out.println("Error en el hilo animacion "+e);
                    }
                    finally{
                        asiento[i][j].setBackground(Color.orange);
                    } 
                }
                
            } 
        } 
    }
}
