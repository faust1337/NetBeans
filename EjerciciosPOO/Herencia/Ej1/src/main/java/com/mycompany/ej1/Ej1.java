package com.mycompany.ej1;

import com.mycompany.ej1.Entidades.*;

public class Ej1 {

    public static void main(String[] args) {
        Animal tito = new Perro("Tito","todo","salchitrucho",3);
        Animal roque = new Gato("Roque","croquetas","gris",3);
        Animal pinta = new Caballo("Pinta","pasto","pinto",3);
        
        tito.alimentarse();
        roque.alimentarse();
        pinta.alimentarse();
    }
}