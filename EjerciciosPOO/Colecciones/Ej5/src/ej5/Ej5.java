package ej5;

import ej5.Servicios.Servicio;

public class Ej5 {

    public static void main(String[] args) {
        //TreeSet asd = new TreeSet();
        Servicio svc = new Servicio();
        svc.crearConjuntoPaises();
        svc.mostrarPaises();
        svc.borrarPais();
        svc.mostrarPaises();
    }    
}