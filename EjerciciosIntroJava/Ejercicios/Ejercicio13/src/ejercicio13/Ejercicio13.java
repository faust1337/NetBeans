package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Tamaño del cuadrado: "); 
        int n = leer.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                if(i == 0 || i == n-1){
                    System.out.print("* ");
                }else if(j == 0 || j == n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }    
}