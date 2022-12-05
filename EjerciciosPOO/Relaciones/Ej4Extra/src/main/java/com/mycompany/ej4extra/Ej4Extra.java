package com.mycompany.ej4extra;
import com.mycompany.ej4extra.Entidades.*;
import java.util.*;
public class Ej4Extra {

    public static void main(String[] args) {
        Simulador s = new Simulador();
        ArrayList<String> nombres = s.generarNombres();
        ArrayList<Integer> dnis = s.generarDocumentos(nombres);
        ArrayList<Alumno> alumnos = s.generarAlumnos(nombres, dnis);
        s.votacion(alumnos);
        s.ranking(alumnos);
    }
}