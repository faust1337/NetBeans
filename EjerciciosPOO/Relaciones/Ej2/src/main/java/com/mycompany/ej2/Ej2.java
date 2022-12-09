package com.mycompany.ej2;
import com.mycompany.ej2.Entidades.Juego;
import com.mycompany.ej2.Entidades.Jugador;
import com.mycompany.ej2.Entidades.Revolver;
import java.util.*;
public class Ej2 {
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        Juego juego = new Juego();
        
        ArrayList<Jugador> jugadores = crearJugadores();
        
        Revolver r = new Revolver();
        
        juego.llenarJuego(jugadores, r);
        juego.ronda();
    }
    public static ArrayList<Jugador> crearJugadores(){
        ArrayList<Jugador> jugadores = new ArrayList();
        System.out.print("Cantidad de jugadores: ");
        int n = leer.nextInt();
        while(n>6 || n<1){
            System.out.println("Cantidad inválida. Deben ser hasta 6 jugadores.");
            System.out.print("Cantidad de jugadores: ");
            n = leer.nextInt();
        }
        for (int i = 0; i < n; i++) {
            Jugador j = new Jugador();
            System.out.print("Nombre: ");
            j.setNombre(leer.next());
            j.setId((i+1));
            jugadores.add(j);
        }
        return jugadores;
    }
}