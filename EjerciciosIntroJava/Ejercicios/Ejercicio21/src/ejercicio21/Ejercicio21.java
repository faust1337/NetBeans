package ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] m = new int[10][10], p = new int[3][3];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                //m[i][j] = (int)(Math.random()*10);
                System.out.print("Número ["+i+"]["+j+"]: ");
                m[i][j] = leer.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //p[i][j] = (int)(Math.random()*10);
                System.out.print("Número ["+i+"]["+j+"]: ");
                p[i][j] = leer.nextInt();
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(buscarMatriz(m,p,i,j)){
                    System.out.println("Se encontró una coincidencia en la posición ["+i+"]["+j+"].");
                }
            }
        }
    }
    
    public static boolean buscarMatriz(int[][] m, int[][] p, int f, int c){
        boolean flag = true;
        int filaP = 0, columnaP = 0;
        for (int i = f; i < f+3; i++) {
            for (int j = c; j < c+3; j++) {
                if(m[i][j] != p[filaP][columnaP]){
                    flag = false;
                }
                columnaP++;
            }
            filaP++;
            columnaP = 0;
        }
        return flag;
    }
}