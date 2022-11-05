package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Número: ");
        int num = leer.nextInt();
        if(num == 0){
            System.out.println("El número es cero.");
        } else if (num%2 != 0){
            System.out.println("El número es impar.");
        } else {
            System.out.println("El número es par.");
        }
    }    
}
