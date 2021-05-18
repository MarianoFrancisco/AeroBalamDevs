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
public class ManejadorReportes {
    private int solteroViaja;
    private int casadoViaja;
    private String nacionalidadViaja;
    private int hombreViaja;
    private int mujerViaja;
    private int dineroGanado;
    private int consumoGasolina;
    private String pasajeros;
    private int boletosComprados;
    public ManejadorReportes(int solteroViaja,int casadoViaja,String nacionalidadViaja,int hombreViaja,int mujerViaja,int dineroGanado,int consumoGasolina,String pasajeros,int boletosComprados){
            this.solteroViaja=solteroViaja;
            this.casadoViaja=casadoViaja;
            this.nacionalidadViaja=nacionalidadViaja;
            this.hombreViaja=hombreViaja;
            this.mujerViaja=mujerViaja;
            this.dineroGanado=dineroGanado;
            this.consumoGasolina=consumoGasolina;
            this.pasajeros=pasajeros;
            this.boletosComprados=boletosComprados;
    }

    public int getSolteroViaja() {
        return this.solteroViaja;
    }

    public void setSolteroViaja(int solteroViaja) {
        this.solteroViaja = solteroViaja;
    }

    public int getCasadoViaja() {
        return this.casadoViaja;
    }

    public void setCasadoViaja(int casadoViaja) {
        this.casadoViaja = casadoViaja;
    }

    public String getNacionalidadViaja() {
        return this.nacionalidadViaja;
    }

    public void setNacionalidadViaja(String nacionalidadViaja) {
        this.nacionalidadViaja = nacionalidadViaja;
    }
    
    public int getHombreViaja() {
        return this.hombreViaja;
    }

    public void setHombreViaja(int hombreViaja) {
        this.hombreViaja = hombreViaja;
    }

    public int getMujerViaja() {
        return this.mujerViaja;
    }

    public void setMujerViaja(int mujerViaja) {
        this.mujerViaja = mujerViaja;
    }

    public int getDineroGanado() {
        return this.dineroGanado;
    }

    public void setDineroGanado(int dineroGanado) {
        this.dineroGanado = dineroGanado;
    }

    public int getConsumoGasolina() {
        return this.consumoGasolina;
    }

    public void setConsumoGasolina(int consumoGasolina) {
        this.consumoGasolina = consumoGasolina;
    }

    public String getPasajeros() {
        return this.pasajeros;
    }

    public void setPasajeros(String pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getBoletosComprados() {
        return this.boletosComprados;
    }

    public void setBoletosComprados(int boletosComprados) {
        this.boletosComprados = boletosComprados;
    }
    
}
