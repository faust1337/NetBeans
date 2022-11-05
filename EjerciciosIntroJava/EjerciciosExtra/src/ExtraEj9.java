
import java.util.Scanner;

public class ExtraEj9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2;
        do {
            System.out.print("Dividendo: ");
            n1 = leer.nextInt();
        } while (n1<1);       
        do {
            System.out.print("Divisor: ");
            n2 = leer.nextInt();
        } while (n2<1 || n2>n1);
        int cociente = 0;
        while(n1>=n2){
            n1 = n1 - n2;
            cociente++;
        }
        System.out.println("Cociente: " + cociente);
        System.out.println("Resto: " + n1);
    }
}