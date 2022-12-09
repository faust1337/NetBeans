package com.mycompany.ej4extra.Entidades;

import java.util.ArrayList;

public class Voto {
    private Alumno votante;
    private ArrayList<Alumno> votosDados;

    public Voto() {
    }
    public Voto(Alumno votante, ArrayList<Alumno> votosDados) {
        this.votante = votante;
        this.votosDados = votosDados;
    }

    public Alumno getVotante() {
        return votante;
    }
    public void setVotante(Alumno votante) {
        this.votante = votante;
    }
    public ArrayList<Alumno> getVotosDados() {
        return votosDados;
    }
    public void setVotosDados(ArrayList<Alumno> votosDados) {
        this.votosDados = votosDados;
    }
}
