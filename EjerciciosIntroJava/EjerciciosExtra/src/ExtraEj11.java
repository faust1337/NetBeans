
import java.util.Scanner;

public class ExtraEj11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = leer.nextInt();
        System.out.println("El número tiene " + cantDigitos(n) + " digitos.");
    }
    
    public static int cantDigitos(int n){
        int digitos = 0;
        if(n==0) n++;
        n = Math.abs(n);
        while(n>0){
            n/=10;
            digitos++;
        }
        return digitos;
    }
}
