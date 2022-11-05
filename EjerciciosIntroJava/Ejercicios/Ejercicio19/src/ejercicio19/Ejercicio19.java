package ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[][] matrizT = new int[3][3];
        System.out.println("MATRIZ: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Número ["+i+"]["+j+"]: ");
                matriz[i][j] = leer.nextInt();
            }
        }
        //System.out.println("\nMATRIZ TRASPUESTA: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizT[i][j] = matriz[j][i];
            }
        }
        boolean flag = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if((matriz[i][j]*-1) != matrizT[i][j]){
                    flag = false;
                }
            }
        }
        if (flag == true) {
            System.out.println("La matriz es anti-simétrica.");
        }else System.out.println("La matriz no es anti-simétrica.");      
    }    
}