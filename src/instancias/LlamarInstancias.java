/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancias;

import proyectofinal.FrameInicio;

/**
 *
 * @author Mariano
 */
public class LlamarInstancias {
     /**
     * Aca hacemos llamado para las intancias
     */
    public static void inicioProyecto(){//Realizamos llamado a frame inicio
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameInicio().setVisible(true);
            }
        });
    }
    public static void pasajeros(){//Realizamos llamado a frame pasajeros
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePasajeros().setVisible(true);
            }
        });
    }
    public static void manejoAeropuerto(){//Realizamos llamado a frame manejo aeropuerto
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameManejoAeropuerto().setVisible(true);
            }
        });
    }
    public static void loginPasajeros(){//Realizamos llamado a frame login pasajeros
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLoginPasajeros().setVisible(true);
            }
        });
    }
    public static void comprarBoletos(){//Realizamos llamado a comprar boletos
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCompraBoletos().setVisible(true);
            }
        });
    }
}
