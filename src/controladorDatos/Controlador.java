/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorDatos;

/**
 *
 * @author Mariano
 */
public class Controlador {
    //definimos aributos
    private String validarPasaporte;
    private String validarNombre;
    private String validarApellidos;
    private String validarSexo;
    private String validarEstadoCivil;
    private String validarNacionalidad;
    private int validarMillasRecorrdas;
    private int verCantidadPasajeros;
    private String verificarCodigoAvion;
    private int capacidadComprar;
    //creamos constructor para controlar datos
    public Controlador(String validarPasaporte,String validarNombre,String validarApellidos,String validarSexo,String validarEstadoCivil,String validarNacionalidad,int validarMillasRecorridas,int verCantidadPasajeros,String verificarCodigoAvion,int capacidadComprar){
        this.validarPasaporte=validarPasaporte;
        this.validarNombre=validarNombre;
        this.validarApellidos=validarApellidos;
        this.validarSexo=validarSexo;
        this.validarEstadoCivil=validarEstadoCivil;
        this.validarNacionalidad=validarNacionalidad;
        this.validarMillasRecorrdas=validarMillasRecorridas;
        this.verCantidadPasajeros=verCantidadPasajeros;
        this.verificarCodigoAvion=verificarCodigoAvion;
        this.capacidadComprar=capacidadComprar;
    }
    //creamos gets y sets
    public String getValidarPasaporte() {
        return this.validarPasaporte;
    }

    public void setValidarPasaporte(String validarPasaporte) {
        this.validarPasaporte = validarPasaporte;
    }

    public String getValidarNombre() {
        return this.validarNombre;
    }

    public void setValidarNombre(String validarNombre) {
        this.validarNombre = validarNombre;
    }

    public String getValidarApellidos() {
        return this.validarApellidos;
    }

    public void setValidarApellidos(String validarApellidos) {
        this.validarApellidos = validarApellidos;
    }

    public String getValidarSexo() {
        return this.validarSexo;
    }

    public void setValidarSexo(String validarSexo) {
        this.validarSexo = validarSexo;
    }

    public String getValidarEstadoCivil() {
        return this.validarEstadoCivil;
    }

    public void setValidarEstadoCivil(String validarEstadoCivil) {
        this.validarEstadoCivil = validarEstadoCivil;
    }

    public String getValidarNacionalidad() {
        return this.validarNacionalidad;
    }

    public void setValidarNacionalidad(String validarNacionalidad) {
        this.validarNacionalidad = validarNacionalidad;
    }

    public int getValidarMillasRecorrdas() {
        return this.validarMillasRecorrdas;
    }

    public void setValidarMillasRecorrdas(int validarMillasRecorrdas) {
        this.validarMillasRecorrdas = validarMillasRecorrdas;
    }

    public int getVerCantidadPasajeros() {
        return this.verCantidadPasajeros;
    }

    public void setVerCantidadPasajeros(int verCantidadPasajeros) {
        this.verCantidadPasajeros = verCantidadPasajeros;
    }

    public String getVerificarCodigoAvion() {
        return this.verificarCodigoAvion;
    }

    public void setVerificarCodigoAvion(String verificarCodigoAvion) {
        this.verificarCodigoAvion = verificarCodigoAvion;
    }

    public int getCapacidadComprar() {
        return this.capacidadComprar;
    }

    public void setCapacidadComprar(int capacidadComprar) {
        this.capacidadComprar = capacidadComprar;
    }
    
    
}
