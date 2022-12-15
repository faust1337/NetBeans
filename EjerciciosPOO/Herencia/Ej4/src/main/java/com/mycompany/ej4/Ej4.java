package com.mycompany.ej4;

import com.mycompany.ej4.Entidades.*;

public class Ej4 {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(1);
        Cuadrado cuadrado = new Cuadrado(1);
        System.out.println("Área del círculo: " + circulo.area() + "cm2.\nPerímetro del círculo: " + circulo.perimetro()+"cm.");
        System.out.println("Área del cuadrado: " + cuadrado.area() + "cm2.\nPerímetro del cuadrado: " + cuadrado.perimetro()+"cm.");
    }
}
