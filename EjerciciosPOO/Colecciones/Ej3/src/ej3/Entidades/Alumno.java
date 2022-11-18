package ej3.Entidades;

import java.util.*;

public class Alumno {
    private String nombre;
    private ArrayList<Double> notas;

    public Alumno(String nombre, ArrayList<Double> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public Alumno() {
        notas = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }
    
    public Double notaFinal(){
        Double promedio=0.0;
        for(Double nota : notas){
            promedio+=nota;
        }
        return promedio/3;
    }
}
