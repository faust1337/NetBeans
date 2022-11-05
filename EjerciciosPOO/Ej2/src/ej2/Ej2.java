package ej2;

import Entidades.Circunferencia;
import java.util.Scanner;

public class Ej2 {
    
    public static void main(String[] args) {
        Circunferencia circulo = crearCircunferencia();
        System.out.println("El area es " + circulo.area());
        System.out.println("El perimetro es " + circulo.perimetro());
    }
    
    public static Circunferencia crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        Circunferencia circulo = new Circunferencia();
        System.out.print("Radio del círculo: ");
        circulo.setRadio(leer.nextDouble());
        return circulo;
    }
}