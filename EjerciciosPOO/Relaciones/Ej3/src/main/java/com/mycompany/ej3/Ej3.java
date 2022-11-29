package com.mycompany.ej3;
import com.mycompany.ej3.Entidades.*;
import java.util.*;
public class Ej3 {
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        Baraja baraja = new Baraja(llenarBaraja());
        menu(baraja);
    }
    public static LinkedList<Carta> llenarBaraja(){
        LinkedList<Carta> cartas = new LinkedList();
        
        for(int p = 1; p < 5; p++){//Bucle for para los PALOS.
            for(int c = 1; c < 11; c++){//Bucle for para los NUMEROS. 8 = 10, 9 = 11, 10 = 12.
                Carta carta = new Carta();
                switch(c){
                    case 8: carta.setNum(10); break;
                    case 9: carta.setNum(11); break;
                    case 10: carta.setNum(12); break;
                    default: carta.setNum(c);
                }
                switch(p){
                    case 1: carta.setPalo("espada"); break;
                    case 2: carta.setPalo("basto"); break;
                    case 3: carta.setPalo("oro"); break;
                    case 4: carta.setPalo("copa"); break;
                }
                cartas.add(carta);
            }
        }
        return cartas;
    }
    public static void menu(Baraja baraja){
        int opc;
        do{
            System.out.println("1: Barajar"
                    + "\n2: Dar la siguiente carta"
                    + "\n3: Dar X cantidad de cartas"
                    + "\n4: Cartas disponibles"
                    + "\n5: Cartas que ya salieron"
                    + "\n6: Mostrar baraja"
                    + "\n7: Salir");
            System.out.print("Opción: "); opc = leer.nextInt();
            switch(opc){
                case 1: baraja.barajar(); break;
                case 2: baraja.siguienteCarta(); break;
                case 3: baraja.darCartas(); break;
                case 4: baraja.cartasDisponibles(); break;
                case 5: baraja.cartasMonton(); break;
                case 6: baraja.mostrarBaraja(); break;
                case 7: System.out.println("Fin."); break;
                default: System.out.println("Opción inválida. Reingrese.");
            }
        }while(opc!=7);
    }
}
