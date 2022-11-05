package ahorcadonuevo;

import ahorcadonuevo.Entidades.Ahorcado;
import java.util.*;

public class AhorcadoNuevo {

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
        char[] letrasLeidas = new char[ahorcado.getJugadas()+ahorcado.longitud()];
        int aux = 0;/*  aux es el contador de elementos de letrasLeidas.
        Vector con letras leídas. Cant. elementos: intentos + cantidad de letras de la palabra secreta.
        ej: 3 intentos + 4 de "hola" = 7. La idea es recorrer este vector para ver que las letras no estén repetidas.
        */
        System.out.println("---------------------------\nINICIA EL JUEGO\n---------------------------");
        char letra;
        do{
            System.out.println("\nLa palabra tiene " + ahorcado.longitud() + " letras.");
            System.out.println("Le quedan " + ahorcado.intentos() + " intentos.");
            System.out.print("Letra: ");
            letra = leer.next().charAt(0); letra = Character.toLowerCase(letra);
            if(letraRepetida(letrasLeidas,letra) == false){
                ahorcado.encontradas(letra);
                letrasLeidas[aux] = letra; 
                aux++;
            }else System.out.println("Ya ha ingresado esa letra. Ingrese otra.");            
        }while(ahorcado.getJugadas()>0 && ahorcado.getLetrasEncontradas()!=ahorcado.longitud());
        if(ahorcado.getLetrasEncontradas()!=ahorcado.longitud()){
            System.out.println("No has encontrado la palabra :(");
        }else System.out.println("¡Felicitaciones! Has encontrado la palabra.");
    }
    public static boolean letraRepetida(char[] vector, char letra){
        for(char c : vector){
            if(letra == c) return true;
        }        
        return false;
    }
}