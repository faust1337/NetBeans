package com.mycompany.ej2.Entidades;
import java.util.*;
public class Juego {
    private ArrayList<Jugador> jugadores;
    private Revolver r;

    public Juego() {
    }
    
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r){
        this.jugadores = jugadores;
        this.r = r;
    }
    public void ronda(){
        r.llenarRevolver();
        int contadorJugadores = 0;
        Jugador aux;
        System.out.println(r.toString());
        do{
            aux = jugadores.get(contadorJugadores);
            aux.disparo(r);
            if(contadorJugadores==jugadores.size()-1){
                contadorJugadores = 0;
            }else {
                contadorJugadores++;
            }
            r.siguienteChorro();
        }while(aux.mojado==false);
        System.out.println("Jugador mojado: " + aux.getNombre());
    }
}