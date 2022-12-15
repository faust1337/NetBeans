package com.mycompany.ej4.Entidades;

import com.mycompany.ej4.Interfaces.AccionForma;

public class Cuadrado implements AccionForma{
    private float lado;

    public Cuadrado() {
    }

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
    
    @Override
    public double area() {
        return lado*lado;
    }

    @Override
    public double perimetro() {
        return lado*4;
    }
}