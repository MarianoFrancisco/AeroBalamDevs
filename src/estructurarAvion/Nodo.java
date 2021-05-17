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
public class Nodo {
    private Nodo arriba=null;
    private Nodo abajo=null;
    private Nodo izquierda=null;
    private Nodo derecha=null;
    private int dato,x,y;
    private Nodo(){
        
    }
    public Nodo(int dato, int x, int y){
        this.dato=dato;
        this.x=x;
        this.y=y;
        arriba=null;
        abajo=null;
        izquierda=null;
        derecha=null;
    }
}
