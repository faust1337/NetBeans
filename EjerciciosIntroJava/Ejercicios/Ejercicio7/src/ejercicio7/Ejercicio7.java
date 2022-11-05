package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Frase: ");
        String frase = leer.nextLine();
        //frase = frase.toLowerCase();
        if (frase.equals("eureka")){
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
    }    
}
