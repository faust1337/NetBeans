package com.mycompany.ej1;

import com.mycompany.ej1.Entidades.Perro;
import com.mycompany.ej1.Entidades.Persona;

public class Ej1 {

    public static void main(String[] args) {
        Perro perro1 = new Perro("Didi", "Tajungalpu", "Chiquita", 21);
        Perro perro2 = new Perro("Tito","Salchi","Mediano",2);
        Persona p1 = new Persona("Fausto","Raimundo",25,40307376,perro1);
        Persona p2 = new Persona("Julio","Raimundo",74,4698164,perro2);
        p1.mostrarDatos();
        System.out.println("");
        p2.mostrarDatos();
    }
}
