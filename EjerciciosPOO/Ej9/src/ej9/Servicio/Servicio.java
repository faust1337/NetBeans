package ej9.Servicio;

import ej9.Entidades.Matematica;
import java.util.*;

public class Servicio {
    Matematica m = new Matematica();
    private Scanner leer = new Scanner(System.in);
    public void crearMath(){
        System.out.print("Primer número real: ");
        m.setNum1(leer.nextDouble());
        System.out.print("Segundo número real: ");
        m.setNum2(leer.nextDouble());
    }
    public void mostrarMath(){
        System.out.println("Num 1: " + m.getNum1());
        System.out.println("Num 2: " + m.getNum2());
    }
    public void devolverMayor(){
        if(Math.max(m.getNum1(), m.getNum2()) == m.getNum1()){
            System.out.println("El primer número es el mayor.");
        }else System.out.println("El segundo número es el mayor.");
    }
    public void calcularPotencia(){
        int n1 = (int) m.getNum1(), n2 = (int) m.getNum2();
        if(n1>=n2){
            System.out.println("El mayor elevado al menor da como resultado " + Math.pow(n1, n2));
        }else System.out.println("El mayor elevado al menor da como resultado " + Math.pow(n2, n1));
    }
    public void calcularRaiz(){
        if(m.getNum1()>m.getNum2()){
            m.setNum2(Math.abs(m.getNum2()));
            System.out.println("La raíz del menor número es " + Math.sqrt(m.getNum2()));
        }else {
            m.setNum1(Math.abs(m.getNum1()));
            System.out.println("La raíz del menor número es " + Math. sqrt(m.getNum1()));
        }
    }
}
