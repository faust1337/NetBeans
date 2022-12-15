package com.mycompany.ej1.Entidades;
public class Animal {
    protected String nombre, alimento, raza;
    protected int edad;

    public Animal(String nombre, String alimento, String raza, int edad) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raza;
        this.edad = edad;
    }
    
    public void alimentarse(){
        System.out.println(nombre + " se alimenta de " + alimento);
    }
}
