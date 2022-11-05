import java.util.Scanner;

public class ExtraEj17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = leer.nextInt();
        if(esPrimo(n)){
            System.out.println("El número es primo.");
        }else{System.out.println("El número no es primo.");}
        
    }
    public static boolean esPrimo(int n){
        int aux = 2;
        boolean flag = true;
        while((aux <= n/2) && flag==true){
            if(n%aux==0){
                flag = false;
            }else{
                aux++;
            }
        }
        return flag;
    }
}
