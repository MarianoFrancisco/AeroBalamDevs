package proyectofinal;

import instancias.FrameVentaAsientos;
import instancias.FrameVisualizarDistribucionAsientos;
import instancias.LlamarInstancias;

/**
 *
 * @author Mariano
 */
public class ProyectoFinal {
    /**
     * Nuestra clase principal para iniciar proceso
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LlamarInstancias.inicioProyecto();//Hacemos el llamado al frame Inicio através de una clase llamarInstancias
        FrameVisualizarDistribucionAsientos.iniciarDistribucion();
        FrameVentaAsientos.cargarVenta();
    }
}
