package com.mycompany.ej4.Entidades;

import com.mycompany.ej4.Interfaces.AccionForma;

public class Circulo implements AccionForma{

    private float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    @Override
    public double area() {
        return pi*(Math.pow(radio,2));
    }

    @Override
    public double perimetro() {
        return pi*radio*2;
    }
}