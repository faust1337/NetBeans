package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Frase: ");
        String frase = leer.nextLine();
        if (frase.substring(0,1).equals("A") || frase.substring(0,1).equals("a")) {
            System.out.println("CORRECTO.");
        }else{
            System.out.println("INCORRECTO.");
        }
    }    
}