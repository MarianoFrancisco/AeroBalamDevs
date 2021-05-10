package personas;
import java.time.LocalDate;
/**
 *
 * @author Mariano
 */
public class CrearPasaporteTarjeta {
    /**
     * Creamos las personas que sean necesarias para el funcionamiento del aeropuerto
     * @param espacio
     * @return 
    */
    public static PasaporteTarjeta crearPasaporteTarjeta(String[] espacio){
        PasaporteTarjeta pasaporteTarjeta=null;
        //creamos pasajero con datos y convertimos string a fechas y string a int        
        pasaporteTarjeta = new PasaporteTarjeta(espacio[0],espacio[1],convertirFecha(espacio[2]),espacio[3],espacio[4],espacio[5],espacio[6],espacio[7],convertirFecha(espacio[8]),convertirFecha(espacio[9]),espacio[10],Integer.parseInt(espacio[11]),espacio[12],Integer.parseInt(espacio[13]),espacio[14]);
        return pasaporteTarjeta;
    }
    public static LocalDate convertirFecha(String separadorFecha){
        //determinamos un local date con un valor tipo estring que castearemos para tener formato de importacion
        String[] valorFecha=separadorFecha.split("/");//establecemos que separe con / y pueda tener un string valor fecha
        //Integer nos servira para convertir en tipo string los enteros ingresados
        int valorDia = Integer.valueOf(valorFecha[0]);//posicion cero es el dia, primera posicion
        int valorMes = Integer.valueOf(valorFecha[1]);//posicion uno es el mes, segunda posicion
        int valorAnio = Integer.valueOf(valorFecha[2]);//posicion dos es el anio, tercera posicion
        return LocalDate.of(valorAnio, valorMes, valorDia);//convertimos los valores de string a local date
    }
}
