package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un límite: ");
        int lim = leer.nextInt();
        int suma = 0;
        do{
            System.out.print("\nNúmero: ");
            int num = leer.nextInt();
            suma += num;
        }while(suma<=lim);
        System.out.println("Fin.");
    }    
}