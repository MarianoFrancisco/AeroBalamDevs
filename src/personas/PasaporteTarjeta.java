package personas;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Mariano
 */
public class PasaporteTarjeta implements Serializable{
    /**
     * Constructor de pasaporte, serializable para que pueda modificarse
     * establecemos atributos de un pasaporte y tarjeta, LocalDate para formato fecha
     */
    private String pasaporte;
    private String contrasenia;
    private LocalDate fechaNacimiento;
    private String nacionalidad;
    private String estadoCivil;
    private String nombres;
    private String apellidos;
    private String sexo;
    private LocalDate fechaVencimientoPasaporte;
    private LocalDate fechaEmisionPasaporte;
    private String paisActual;
    private int millasRecorridas;
    private String numeroTarjeta;
    private int dineroActual;
    private String codigoCVC;
    //hacemos el constructor para pasaporte y le ponemos sus parametros
    public PasaporteTarjeta(String pasaporte,String contrasenia,LocalDate fechaNacimiento,String nacionalidad,String estadoCivil,String nombres,String apellidos,String sexo,LocalDate fechaVencimientoPasaporte,LocalDate fechaEmisionPasaporte,String paisActual,int millasRecorridas,String numeroTarjeta,int dineroActual,String codigoCVC){
        this.pasaporte=pasaporte;
        this.contrasenia=contrasenia;
        this.fechaNacimiento=fechaNacimiento;
        this.nacionalidad=nacionalidad;
        this.estadoCivil=estadoCivil;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.sexo=sexo;
        this.fechaVencimientoPasaporte=fechaVencimientoPasaporte;
        this.fechaEmisionPasaporte=fechaEmisionPasaporte;
        this.paisActual=paisActual;
        this.millasRecorridas=millasRecorridas;
        this.numeroTarjeta=numeroTarjeta;
        this.dineroActual=dineroActual;
        this.codigoCVC=codigoCVC;
    }

    //realizamos get y set para poder llamar los atributos desde otros lados
    public String getPasaporte() {
        return this.pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getContrasenia() {
        return this.contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
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

    public String getNumeroTarjeta() {
        return this.numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getDineroActual() {
        return this.dineroActual;
    }

    public void setDineroActual(int dineroActual) {
        this.dineroActual = dineroActual;
    }

    public String getCodigoCVC() {
        return this.codigoCVC;
    }

    public void setCodigoCVC(String codigoCVC) {
        this.codigoCVC = codigoCVC;
    }
    
}
