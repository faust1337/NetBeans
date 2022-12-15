package com.mycompany.ej2.Entidades;

import java.util.*;

public class Electrodomestico {
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected String color;
    protected char consumoEnergetico;
    protected double precio, peso;

    public Electrodomestico() {
    }
    public Electrodomestico(String color, char consumoEnergetico, double precio, double peso) {
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.precio = precio;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    protected void crearElectrodomestico(){
        System.out.print("Color del producto: ");
        color = comprobarColor(leer.next());
        System.out.print("Consumo energético A/B/C/D/E/F: ");
        consumoEnergetico = comprobarConsumoEnergetico(leer.next().charAt(0));
        System.out.print("Peso en kilogramos: ");
        peso=leer.nextInt();
        precio=1000;
    }
    public char comprobarConsumoEnergetico(char letra){
        letra = Character.toUpperCase(letra);
        switch(letra){
            case 'A': return 'A';
            case 'B': return 'B';
            case 'C': return 'C';
            case 'D': return 'D';
            case 'E': return 'E';
            default: return 'F';
        }
    }
    public String comprobarColor(String color){
        color = color.toLowerCase();
        switch(color){
            case "negro": return "negro"; case "negra": return "negro";
            case "rojo": return "rojo"; case "roja": return "rojo";
            case "azul": return "azul";
            case "gris": return "gris";
            default: return "blanco";
        }
    }
    public void precioFinal(){
        switch(consumoEnergetico){
            case 'A': precio+=1000; break;
            case 'B': precio+=800; break;
            case 'C': precio+=600; break;
            case 'D': precio+=500; break;
            case 'E': precio+=300; break;
            case 'F': precio+=100; break;
        }
        if(peso>=1 && peso<=19){
            precio+=100;
        }else if(peso>=20 && peso<=49){
            precio+=500;
        }else if(peso>=50 && peso<=79){
            precio+=800;
        }else precio+=1000;
    }
}
