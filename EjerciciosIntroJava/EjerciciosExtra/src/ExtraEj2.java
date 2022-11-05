import java.util.Scanner;

public class ExtraEj2 {

    public static void main(String[] args) {
        int a,b,c,d,aux;
        Scanner leer = new Scanner(System.in); 
        System.out.print("Numero A: "); a = leer.nextInt();
        System.out.print("Numero B: "); b = leer.nextInt();
        System.out.print("Numero C: "); c = leer.nextInt();
        System.out.print("Numero C: "); d = leer.nextInt();
        System.out.println("A: " + a + "\nB: "+b+"\nC: "+c+"\nD: "+d);
        System.out.println("==============CAMBIANDO================");
        aux = b;
        b = c; c = a; a = d; d = aux;
        System.out.println("A: " + a + "\nB: "+b+"\nC: "+c+"\nD: "+d);
    }    
}