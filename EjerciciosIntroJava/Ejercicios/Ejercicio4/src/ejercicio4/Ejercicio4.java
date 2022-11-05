package ejercicio4;

import java.util.Scanner;


public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Grados centígrados: ");
        float centigrados = leer.nextFloat();
        System.out.println("Grados Fahrenheit: " + ((centigrados*9/5)+32));
    }    
}
