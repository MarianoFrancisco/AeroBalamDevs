/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorDatos;

import static instancias.FrameAnimacionVuelo.frameAnimacionVuelo;
import instancias.LlamarInstancias;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import proyectofinal.HiloAnimacion;

/**
 *
 * @author Mariano
 */
public class HiloControlRecomendacion extends Thread implements Runnable{
    @Override
    public void run() {
        //creamos variables de modificacion
        int i=0;
        int k=0;
        int l=300;
        //creamos boton
        JButton p= new JButton();
        frameAnimacionVuelo.jPanel2.add(p);//anadimos el boton a panel animacion vuelo
        JOptionPane.showMessageDialog(null, "Empezamos vuelo");//mensaje amigable
        for ( i = 0; i < 7; i++) {     
            p.setVisible(true);//hacemos visible boton
            //asignamos imagen al boton
            p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AvionAnimacion.PNG")));
            p.setBounds(k, l, 300, 156);//indicamos medidas de boton
            //modificamos valores de "x" y "y"
            k=k+70;
            l=l-50;
            try{//try catch por si ocurre error y damos tiempo de espera de 300milisegundos
                HiloAnimacion.sleep(300);
            }catch(InterruptedException e){
                System.out.println("Error en el hilo animacion "+e);
            }
            finally{
                p.setVisible(false);
            }
            if(i==5){
                for (int j = 0; j < 7; j++) {
                    p.setVisible(true);//hacemos visible boton
                    //asignamos imagen al boton
                    p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AvionAnimacion.PNG")));
                    p.setBounds(k, l, 300, 156);//indicamos medidas de boton
                    //modificamos valores de "x" y "y"
                    k=k+70;
                    l=l+50;
                    try{//try catch por si ocurre error y damos tiempo de espera de 300milisegundos
                    HiloAnimacion.sleep(300);
                    }catch(InterruptedException e){
                    System.out.println("Error en el hilo animacion "+e);
                    }
                    finally{
                        p.setVisible(false);//hacemos invisible el boton
                    }
                }
                
            }
        }
        JOptionPane.showMessageDialog(null, "Vuelo finalizado");//mensaje amigable
        frameAnimacionVuelo.dispose();//cerramos frame animacion vuelo
        LlamarInstancias.operadorVuelos();//regresamos a frame operador vuelos
    }
}
