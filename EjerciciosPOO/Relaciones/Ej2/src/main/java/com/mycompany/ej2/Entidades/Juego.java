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
        /*for(Jugador j : jugadores){ //Para un numero fijo de 6 jugadores
            j.disparo(r);
            if(j.mojado==true) {
                System.out.println("Jugador mojado: " + j.getNombre());
                break;
            }
            else{
                r.siguienteChorro();
            }
        }*/
        int aux = 0;
        Jugador j = new Jugador();
        System.out.println(r.toString());
        do{
            j = jugadores.get(aux);
            j.disparo(r);
            if(aux==jugadores.size()-1){
                aux = 0;
                r.siguienteChorro();
            }else {
                r.siguienteChorro();
                aux++;
            }
        }while(j.mojado==false);
        System.out.println("Jugador mojado: " + j.getNombre());
    }
}