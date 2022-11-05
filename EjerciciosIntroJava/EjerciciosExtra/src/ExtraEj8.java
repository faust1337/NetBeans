import java.util.Scanner;

public class ExtraEj8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, total = 0, pares = 0, impares = 0;
        do {
            System.out.print("Ingrese un número: ");
            n = leer.nextInt();
            if(n>0){
                if(n%2==0){
                    pares++;
                }else impares++;
                total++;
            }
        } while (n%5!=0);
        System.out.println("Cantidad de números leídos: " + total);
        System.out.println("Cantidad de pares leídos: " + pares);
        System.out.println("Cantidad de impares leídos: " + impares);
    }    
}