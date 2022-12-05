package com.mycompany.ej4extra.Entidades;

import java.util.Comparator;

public class Alumno {
    private String nombre;
    private Integer dni, votosRecibidos;
    private Voto voto;

    public Alumno() {
        voto = new Voto();
        votosRecibidos = 0;
    }

    public Alumno(String nombre, Integer dni, Integer votosRecibidos, Voto voto) {
        this.nombre = nombre;
        this.dni = dni;
        this.votosRecibidos = votosRecibidos;
        this.voto = voto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getVotosRecibidos() {
        return votosRecibidos;
    }

    public void setVotosRecibidos(Integer votosRecibidos) {
        this.votosRecibidos = votosRecibidos;
    }

    public Voto getVoto() {
        return voto;
    }

    public void setVoto(Voto voto) {
        this.voto = voto;
    }
    
    public static Comparator<Alumno> compararCantVotos = new Comparator<Alumno>(){
        @Override
        public int compare(Alumno a2, Alumno a1){//Con este cambio de parametros, lo comparo de mayor a menor para un TOP.
            return a1.getVotosRecibidos().compareTo(a2.getVotosRecibidos());
            //compara de menor a mayor.
        }
    };
}