package ejercicio16;

import java.util.*;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Tamaño del vector: ");
        int n = leer.nextInt();
        int[] vec = new int[n];
        for (int i = 0; i < n; i++) {
            vec[i] = (int) (Math.random()*10);
        }
        System.out.print("\n¿Qué número desea buscar? ");
        int buscar = leer.nextInt();
        int coincidencias = 0;
        for (int i = 0; i < n; i++) {
            if(vec[i] == buscar){
                System.out.println("Se encontró en la pocisión: " + i);
                coincidencias++;
            }
        }
        if (coincidencias > 1){
            System.out.println("Está repetido " + coincidencias + " veces.");
        }else if(coincidencias == 0) System.out.println("No se encontró.");
    }    
}
