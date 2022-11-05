package ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num1 = leer.nextInt();
        System.out.print("Ingrese otro número: ");
        int num2 = leer.nextInt();
        System.out.println("La suma de ambos números es: " + (num1 + num2));
    }
    
}
