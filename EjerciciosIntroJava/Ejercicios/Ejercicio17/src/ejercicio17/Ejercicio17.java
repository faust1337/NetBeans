package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

    public static int contarDigitos(int n){
        int cantidadDeDigitos = 0;
        if(n == 0) n++;
        n = Math.abs(n);
        while(n>0){
            n=n/10;
            cantidadDeDigitos++; 
        }
        return cantidadDeDigitos;
    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Tamaño del vector: ");
        int n = leer.nextInt(), n2;
        int[] vec = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un número de hasta 5 dígitos: ");
            n2 = leer.nextInt();
            while(n2>99999){
                System.out.println("Número inválido. Reingrese.");
                System.out.print("Ingrese un número de hasta 5 dígitos: ");
                n2 = leer.nextInt();
            }
            vec[i] = n2;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("El " + (i+1) + "º número tiene " + contarDigitos(vec[i]) + " dígitos.");
        }
    }    
}