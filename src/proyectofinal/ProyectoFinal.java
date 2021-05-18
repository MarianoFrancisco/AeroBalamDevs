package proyectofinal;

import controladorDatos.ManejadorReportes;
import instancias.FrameDepartamentoAdministracion;
import instancias.FrameGerenciaAerolinea;
import instancias.FrameOperadorVuelos;
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
    public static ManejadorReportes c1= new ManejadorReportes(0,0,"",0,0,0,0);
    public static void main(String[] args) {
        LlamarInstancias.inicioProyecto();//Hacemos el llamado al frame Inicio através de una clase llamarInstancias
        FrameVisualizarDistribucionAsientos.iniciarDistribucion();
        FrameVentaAsientos.cargarVenta();
        FrameDepartamentoAdministracion.iniciarDepartamentoAdmin();
        FrameGerenciaAerolinea.iniciarGerencia();
        FrameOperadorVuelos.iniciarOperadorVuelos();
    }
}
