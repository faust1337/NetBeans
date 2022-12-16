package com.mycompany.ej1extra;

import com.mycompany.ej1extra.Entidades.Alquiler;

public class Ej1Extra {

    public static void main(String[] args) {
        Alquiler a = new Alquiler();
        a.cargarCliente();
        System.out.println(a.getNombreCliente() + " su barco le será alquilado por " + a.diasAlquilado + " días."
                + "\nEl costo del mismo es de $" + a.calcularCosto());
        System.out.println("Barco matrícula " + a.getBarco().getMatricula() + " ubicado en el amarre Nº " + a.getPosAmarre());
    }
}