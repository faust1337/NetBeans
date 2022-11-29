package com.mycompany.ej3.Entidades;
import java.util.*;
public class Baraja {
    private LinkedList<Carta> baraja;
    private LinkedList<Carta> cartasDadas;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Baraja(LinkedList<Carta> baraja) {
        this.baraja = baraja;
        cartasDadas = new LinkedList();
    }
    public Baraja() {
        baraja = new LinkedList();
        cartasDadas = new LinkedList();
    }

    public LinkedList<Carta> getBaraja() {
        return baraja;
    }
    public void setBaraja(LinkedList<Carta> baraja) {
        this.baraja = baraja;
    }
    public LinkedList<Carta> getCartasDadas() {
        return cartasDadas;
    }
    public void setCartasDadas(LinkedList<Carta> cartasDadas) {
        this.cartasDadas = cartasDadas;
    }
    
    public void barajar(){
        Collections.shuffle(baraja);
    }
    public void siguienteCarta(){
        if(!baraja.isEmpty()){
            System.out.println(baraja.get(0).toString());
            if(baraja.size()==1) System.out.println("¡ÚLTIMA CARTA!");
            cartasDadas.add(baraja.get(0));
            baraja.remove(0);
        }else System.out.println("¡La baraja está vacía!");
    }
    
    public void cartasDisponibles(){
        System.out.println("Hay " + baraja.size() + " cartas disponibles.");
    }
    public void darCartas(){
        System.out.print("Cantidad de cartas para dar: ");
        int dar = leer.nextInt();
        if(dar>baraja.size()){
            System.out.println("Acción denegada. No hay suficientes cartas.");
        }else{
            for (int i = 0; i < dar; i++) {//Desde el índice 0 hasta dar-1 
                cartasDadas.add(baraja.get(i));
            }
            for (int i = dar-1; i > -1; i--) {
                baraja.remove(i);
            }
        }
    }
    public void cartasMonton(){
        if(!cartasDadas.isEmpty()) { //Solución automática, pero es entendible. Se recomienda así xq el if original tenía 1 sola línea y el else el resto.
            System.out.println("Cartas repartidas: ");
            for(Carta c : cartasDadas){//pero de esta manera, el if tiene más líneas de código que el else.
                System.out.println("* " + c.toString());
            }
        } else System.out.println("No se han dado cartas aún.");
    }
    public void mostrarBaraja(){
        System.out.println("Cartas disponibles en la baraja: ");
        for(Carta c : baraja){
            System.out.println("* " + c.toString());
        }
    }
    
}