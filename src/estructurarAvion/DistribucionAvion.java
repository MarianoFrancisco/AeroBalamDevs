/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurarAvion;

/**
 *
 * @author Mariano
 */
public class DistribucionAvion {
    protected int ocupado;
    protected int esAsiento;
    public DistribucionAvion(int ocupado,int esAsiento){
        this.ocupado=ocupado;
        this.esAsiento=esAsiento;
    }

    public int getOcupado() {
        return ocupado;
    }

    public void setOcupado(int ocupado) {
        this.ocupado = ocupado;
    }

    public int getEsAsiento() {
        return esAsiento;
    }

    public void setEsAsiento(int esAsiento) {
        this.esAsiento = esAsiento;
    }
    
}
