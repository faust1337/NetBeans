package ej12;

import ej12.Entidades.Persona;
import java.util.Date;
import java.util.Scanner;


public class Ej12 {
    final static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {
        Persona p = crearPersona();
        System.out.println(p.getNombre() + " tiene " + p.calcularEdad() + " años.");
        p.mostrarPersona();
        System.out.print("Edad de la otra persona: ");
        int edad = leer.nextInt();
        if(edad == p.calcularEdad()) System.out.println("Tienen la misma edad");
        else if(p.menorQue(edad)) System.out.println("La edad ingresada es mayor"); 
        else System.out.println("La edad ingresada es menor.");        
    }
    public static Persona crearPersona(){
        Persona p = new Persona();
        System.out.print("Nombre: ");
        p.setNombre(leer.next());
        System.out.println("Fecha de nacimiento.");
        System.out.print("Dia: "); int dia = leer.nextInt();
        System.out.print("Mes: "); int mes = leer.nextInt(); mes--;
        System.out.print("Año: "); int anio = leer .nextInt(); anio = anio - 1900;
        Date nacimiento = new Date(anio,mes,dia);
        p.setFechaNacimiento(nacimiento);
        return p;
    }
}
