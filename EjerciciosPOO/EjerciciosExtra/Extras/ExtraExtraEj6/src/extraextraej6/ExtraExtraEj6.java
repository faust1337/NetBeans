package extraextraej6;

import extraextraej6.Entidades.Sopa;
import java.util.*;

public class ExtraExtraEj6 {
    final static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        Sopa sopa = new Sopa();
        mostrarSopa(sopa);
        mostrarSopaInvertida(sopa);
        System.out.print("Palabra que desea buscar: ");
        String palabra = leer.next();
        palabra=palabra.toUpperCase();
        int[] palabraEncontrada = buscarPalabra(sopa, palabra);
        if(palabraEncontrada[0]==-1){
            System.out.println("No se ha encontrado la palabra.");
        }else System.out.println("Se encontró en la posición ["+palabraEncontrada[0]+"]["+palabraEncontrada[1]+"]");
        System.out.print("¿Qué palabra desea cambiar? ");
        String palabraACambiar = leer.next(); palabraACambiar = palabraACambiar.toUpperCase();
        int[] cambiarVector = buscarPalabra(sopa, palabraACambiar);
        System.out.println("Palabra que pondrá en su lugar: ");
        String cambiarAEstaPalabra = leer.next(); cambiarAEstaPalabra = cambiarAEstaPalabra.toUpperCase();
        if(cambiarVector[0]!=-1){
            sopa = (reemplazarPalabra(cambiarAEstaPalabra, sopa, cambiarVector[0], cambiarVector[1]));
        }
        mostrarSopa(sopa);
    }
    public static void mostrarSopa(Sopa sopa){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(sopa.getSopa()[i][j]==' '){
                    System.out.print("? ");
                }else System.out.print(sopa.getSopa()[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void mostrarSopaInvertida(Sopa sopa){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(sopa.getSopa()[j][i]==' '){
                    System.out.print("? ");
                }else System.out.print(sopa.getSopa()[j][i] + " ");
            }
            System.out.println("");
        }
    }
    public static int[] buscarPalabra(Sopa sopa, String palabra){
        int[] posiciones;
        String palabraAux;
        int posJAux;//Esta variable, me servirá para saber la posición de J donde se encontró la primer letra de la palabra.
        for (int i = 0; i < 10; i++) {
            palabraAux = "";
            posJAux = -1;
            for (int j = 0; j < 10; j++) {
                if(sopa.getSopa()[i][j]!=' '){
                    palabraAux = palabraAux.concat(Character.toString(sopa.getSopa()[i][j]));
                    posJAux++;
                }
                if(palabraAux.equals(palabra)){
                    posiciones = new int[]{i,j-posJAux};
                    return posiciones;
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static Sopa reemplazarPalabra(String palabra, Sopa sopa, int i, int j){
        char[][] sopaAux = sopa.getSopa();
        int aux;
        for (int k = 0; k < 10; k++) {
            aux = j;
            for (int l = 0; l < 10; l++) {
                if(k==i && l==aux && l<palabra.length()){
                    sopaAux[k][l]=palabra.charAt(l);
                }else if(k==i && l==aux) sopaAux[k][l]='?';
                aux++;
            }
        }
        return new Sopa(sopaAux);
    }
}
