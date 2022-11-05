import java.util.*;

public class ExtraEj18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Tamaño del vector: ");
        int size = leer.nextInt();
        int suma = 0;
        int[] vector = new int[size];
        System.out.print("Numeros del vector: ");
        for (int i = 0; i < size; i++) {
            vector[i] = random.nextInt(9);
            suma += vector[i];
            System.out.print(vector [i] + " ");
        }
        System.out.println("\nLa suma de los valores del vector es: " + suma);
    }
    
}
