package ej6.Entidades;

import java.util.Scanner;

public class Cafetera {
    private int cantidadMaxima;
    private int cantidadActual;
    
    public Cafetera(){
        cantidadMaxima = 3000;
    }

    public Cafetera(int cantidadMaxima, int cantidadActual) {
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public double getCantidadMaxima() {
        return cantidadMaxima;
    }
    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }
    public double getCantidadActual() {
        return cantidadActual;
    }
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera(){
        cantidadActual = cantidadMaxima;
    }
    public void vaciarCafetera(){
        cantidadActual = 0;
    }
    public void servirTaza(int cantidad){
        if(cantidad>cantidadActual){
            cantidad = cantidadActual;
            System.out.println("La taza no se pudo llenar por completo. Se llenó con " + cantidad + "ml.");
            cantidadActual-=cantidad;
        }else cantidadActual-=cantidad;
    }    
    public void agregarCafe(int cantidad){
        if(cantidadActual == cantidadMaxima){
            System.out.println("No se le puede agregar más café.");
        }else if(cantidad > (cantidadMaxima-cantidadActual)){
            int poner = cantidadMaxima-cantidadActual;
            cantidadActual += poner;
            System.out.println("Sobraron " + (cantidad - poner) + "ml. de café");
        }else cantidadActual += cantidad;
    }
}