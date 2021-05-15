/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejadorArchivosUser;

import java.io.Serializable;

/**
 *
 * @author Mariano
 */
public class Tarjeta implements Serializable{
    /**
     * Constructor de tarjeta, serializable para que pueda modificarse
     * establecemos atributos de una tarjeta
     */
    private String pasaporte;
    private String numeroTarjeta;
    private int dineroActual;
    private String codigoCVC;
    //hacemos el constructor para tarjeta y le ponemos sus parametros
    public Tarjeta(String pasaporte,String numeroTarjeta,int dineroActual,String codigoCVC){
        this.pasaporte=pasaporte;
        this.numeroTarjeta=numeroTarjeta;
        this.dineroActual=dineroActual;
        this.codigoCVC=codigoCVC;
    }
    //realizamos get y set para poder llamar los atributos desde otros lados
    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getDineroActual() {
        return dineroActual;
    }

    public void setDineroActual(int dineroActual) {
        this.dineroActual = dineroActual;
    }

    public String getCodigoCVC() {
        return codigoCVC;
    }

    public void setCodigoCVC(String codigoCVC) {
        this.codigoCVC = codigoCVC;
    }
    
}
