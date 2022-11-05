package extraej6;

import extraej6.Entidades.Ahorcado;
import java.util.*;

public class ExtraEj6 {

    public static void main(String[] args) {
        juego();
    }    
    
    public static Ahorcado crearJuego(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Palabra secreta: ");
        String palabra = leer.next(); palabra = palabra.toLowerCase();
        char[] vectorPalabra = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            vectorPalabra[i] = palabra.charAt(i);
        }
        int intentos;
        do{
            System.out.print("Intentos posibles: ");
            intentos = leer.nextInt();
            if(intentos<=0){
                System.out.println("Número inválido. Reintente.");
            }
        }while(intentos<=0);
        return new Ahorcado(vectorPalabra,0,intentos);
    }
    public static void juego(){        
        Scanner leer = new Scanner(System.in);
        Ahorcado ahorcado = crearJuego();
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        System.out.println("---------------------------\nINICIA EL JUEGO\n---------------------------");
        char letra;
        do{
            System.out.println("\nLa palabra tiene " + ahorcado.longitud() + " letras.");
            System.out.println("Le quedan " + ahorcado.intentos() + " intentos.");
            System.out.print("Letra: ");
            letra = leer.next().charAt(0);
            ahorcado.encontradas(letra);
        }while(ahorcado.getJugadas()>0 && ahorcado.getLetrasEncontradas()!=ahorcado.longitud());
        if(ahorcado.getLetrasEncontradas()!=ahorcado.longitud()){
            System.out.println("No has encontrado la palabra :(");
        }else System.out.println("¡Felicitaciones! Has encontrado la palabra.");
    }
}