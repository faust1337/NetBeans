package ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Número ["+i+"]["+j+"]: ");
                matriz[i][j] = leer.nextInt();
                while(matriz[i][j]<0 || matriz[i][j]>9){
                    System.out.println("Número inválido. Reingrese.");
                    System.out.print("Número ["+i+"]["+j+"]: ");
                    matriz[i][j] = leer.nextInt();
                }
            }
        }
        int diagonalPrincipal = verificarD1(matriz); //System.out.println("Diagonal principal: " + diagonalPrincipal);
        int diagonalSecundaria = verificarD2(matriz); //System.out.println("Diagonal secundaria: " + diagonalSecundaria);
        boolean filas = verificarFilas(matriz); //System.out.println(filas);
        boolean columnas = verificarColumnas(matriz); //System.out.println(columnas);
        if(filas == columnas){
            if(diagonalPrincipal == diagonalSecundaria){
                System.out.println("La matriz es mágica.");
            } else System.out.println("La matriz no es mágica.");
        }else System.out.println("La matriz no es mágica.");
    } 
    
    public static int verificarD1(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < 3; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }
    public static int verificarD2(int[][] matriz){
        int suma = 0, aux = 2;
        for (int i = 0; i < 3; i++) {
            suma += matriz[i][aux];
            aux--;
        }
        return suma;
    }
    public static boolean verificarFilas(int[][] matriz){
        boolean flag = true;
        int[] vector = {0,0,0};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                vector[i] += matriz[i][j];
            }
        }
        for (int i = 0; i < 2; i++) {
            if(vector[i] != vector[i+1]) flag = false;
        }
        return flag;
    }
    public static boolean verificarColumnas(int[][] matriz){
        boolean flag = true;
        int[] vector = {0,0,0};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                vector[i] += matriz[j][i];
            }
        }
        for (int i = 0; i < 2; i++) {
            if(vector[i] != vector[i+1]) flag = false;
        }
        return flag;
    }
}