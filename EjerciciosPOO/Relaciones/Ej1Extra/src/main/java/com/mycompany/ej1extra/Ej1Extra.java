package com.mycompany.ej1extra;

import com.mycompany.ej1extra.Servicios.Servicio;
public class Ej1Extra {
    public static void main(String[] args) {
        Servicio svc = new Servicio();
        svc.cargarPerros();
        svc.cargarPersonas();
        svc.adoptar();
        svc.mostrarRelaciones();
    }
}