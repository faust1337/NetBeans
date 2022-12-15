package com.mycompany.ej3.Entidades;

public class Lavadora extends Electrodomestico {
    private int carga;
    
    public Lavadora() {
        crearLavadora();
    }
    public Lavadora(String color, char consumoEnergetico, double precio, double peso, int carga) {
        super(color, consumoEnergetico, precio, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public final void crearLavadora(){
        crearElectrodomestico();
        System.out.print("Carga máxima en kg: ");
        carga=leer.nextInt();
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        if(carga>30) precio+=500;
    }
    @Override
    public String toString(){
        return("Lavadora color " + color + " con una carga máxima de " + carga + "kg.: $" + precio);
    }
}