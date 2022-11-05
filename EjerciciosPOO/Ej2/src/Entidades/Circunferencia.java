package Entidades;

import static java.lang.Math.PI;

public class Circunferencia {
    private double radio;
    public Circunferencia(){
    }
    public Circunferencia(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double area(){
        return PI*radio*radio;
    }
    
    public double perimetro(){
        return PI*radio*2;
    }
}