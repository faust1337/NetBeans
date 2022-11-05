package ejercicio3;
import java.util.*;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = leer.nextLine();
        System.out.println("Frase en mayúsculas: " + frase.toUpperCase());
        System.out.println("Frase en minúsculas: " + frase.toLowerCase());
    }    
}
