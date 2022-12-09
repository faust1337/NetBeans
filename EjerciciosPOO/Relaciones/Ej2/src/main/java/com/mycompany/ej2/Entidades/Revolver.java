package com.mycompany.ej2.Entidades;
import java.util.*;
public class Revolver {
    private int posActual, posAgua;

    public Revolver() {
    }
    public Revolver(int posActual, int posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }

    public int getPosActual() {
        return posActual;
    }
    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }
    public int getPosAgua() {
        return posAgua;
    }
    public void setPosAgua(int posAgua) {
        this.posAgua = posAgua;
    }
    
    public void llenarRevolver(){
        posActual = (int) (Math.random()* 6) +1;
        posAgua = (int) (Math.random()* 6) +1;
    }
    public boolean mojar(){return posActual == posAgua;} //Solución automática. yo la hice con ==, pero como son Integer (objetos) utiliza .equals
    public void siguienteChorro(){
        if(posActual==6){
            posActual=1;
        }else {
            posActual++;
        }
    }
    @Override
    public String toString() {
        return "Posición actual: " + posActual + "/6" + "\nPosición de la bala de agua: " + posAgua + "/6";
    }
}
