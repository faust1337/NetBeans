package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Número: ");
        double num = leer.nextInt();
        double doble = num*2; double triple = num*3; double raiz = Math.sqrt(num);
        System.out.println("Doble del numero: " + doble + "\nTriple del número: " + triple + "\nRaíz del número: " + raiz);
    }   
}
