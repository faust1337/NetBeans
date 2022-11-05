import java.util.*;
public class ExtraEj7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, suma = 0;
        do {
            System.out.println("¿Cuántos números desea leer?");
            n = leer.nextInt();
            if (n<=0) System.out.println("Número inválido. Reingrese.");
        } while (n<=0);
        /*System.out.println("¿Cuántos números desea leer?");
        n = leer.nextInt();
        while(n<=0){
            System.out.println("Número inválido. Reingrese");
            System.out.println("¿Cuántos números desea leer?");
            n = leer.nextInt();
        }*/
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = leer.nextInt();
            suma+=numeros[i];
        }
        int max = numeros[0], min = numeros[0];
        for (int i = 0; i < n; i++) {
            if(numeros[i]>max) max = numeros[i];
            if(numeros[i]<min) min = numeros[i];
        }
        System.out.println("Promedio de numeros leídos: " + suma/n);
        System.out.println("Mayor número leído: " + max);
        System.out.println("Menor número leído: " + min);
    }    
}
