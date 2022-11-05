import java.util.Scanner;

public class ExtraEj10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, x = (int)(Math.random()*10) * (int)(Math.random()*10);
        do {
            System.out.print("Adiviná la multiplicación: ");
            n = leer.nextInt();
            if (n!=x) System.out.println("Vuelve a intentarlo.");
        } while (n!=x);
        System.out.println("Adivinaste.");
    }    
}