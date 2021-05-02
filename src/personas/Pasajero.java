package personas;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Mariano
 */
public class Pasajero implements Serializable{
    /**
     * Constructor de pasajeros, serializable para que pueda modificarse
     */
    //establecemos atributos de un pasajero, LocalDate para formato fecha
    private int pasaporte;
    private String contraseña;
    private LocalDate fechaNacimiento;
    private String estadoCivil;
    private String nombres;
    private String apellidos;
    private String sexo;
    private LocalDate fechaVencimientoPasaporte;
    private LocalDate fechaEmisionPasaporte;
    private String paisActual;
    private  int millasRecorridas;
    //hacemos el constructor para pasajero y le ponemos sus parametros
    public Pasajero(int pasaporte,String contraseña,LocalDate fechaNacimiento,String nombres,String apellidos,String sexo,LocalDate fechaVencimientoPasaporte,LocalDate fechaEmisionPasaporte,String paisActual,int millasRecorridas){
        this.pasaporte=pasaporte;
        this.contraseña=contraseña;
        this.fechaNacimiento=fechaNacimiento;
        this.estadoCivil=estadoCivil;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.sexo=sexo;
        this.fechaVencimientoPasaporte=fechaVencimientoPasaporte;
        this.fechaEmisionPasaporte=fechaEmisionPasaporte;
        this.paisActual=paisActual;
        this.millasRecorridas=millasRecorridas;
    }
    //realizamos get y set para poder llamar los atributos desde otros lados
    public int getPasaporte() {
        return this.pasaporte;
    }

    public void setPasaporte(int pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getContraseña() {
        return this.contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstadoCivil() {
        return this.estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechaVencimientoPasaporte() {
        return this.fechaVencimientoPasaporte;
    }

    public void setFechaVencimientoPasaporte(LocalDate fechaVencimientoPasaporte) {
        this.fechaVencimientoPasaporte = fechaVencimientoPasaporte;
    }

    public LocalDate getFechaEmisionPasaporte() {
        return this.fechaEmisionPasaporte;
    }

    public void setFechaEmisionPasaporte(LocalDate fechaEmisionPasaporte) {
        this.fechaEmisionPasaporte = fechaEmisionPasaporte;
    }

    public String getPaisActual() {
        return this.paisActual;
    }

    public void setPaisActual(String paisActual) {
        this.paisActual = paisActual;
    }

    public int getMillasRecorridas() {
        return this.millasRecorridas;
    }

    public void setMillasRecorridas(int millasRecorridas) {
        this.millasRecorridas = millasRecorridas;
    }
    
}
