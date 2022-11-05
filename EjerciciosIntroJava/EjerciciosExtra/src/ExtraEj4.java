import java.util.*;
public class ExtraEj4 {
    public static void main(String[] args) {
        String[] romano = new String[]{"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        Scanner leer = new Scanner(System.in);
        int n = 0;
        do {
            System.out.print("Ingrese un número entre 1 y 10: ");
            n = leer.nextInt();
            if(n<=0 || n>10) System.out.println("Número inválido. Reingrese.");
        } while (n<=0 || n>10);
        n--;
        for (int i = 0; i < 10; i++) {
            if(i == n) System.out.println("Su equivalente en romano es "+romano[i]);
        }
    }
}