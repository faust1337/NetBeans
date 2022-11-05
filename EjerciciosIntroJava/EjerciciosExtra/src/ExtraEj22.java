import java.util.*;
public class ExtraEj22 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Cantidad de filas: ");
        int f = leer.nextInt();
        System.out.print("Cantidad de columnas: ");
        int c = leer.nextInt();
        int[][] matriz = new int[f][c];
        int suma = 0;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = random.nextInt(10);
                System.out.print(matriz[i][j] + " ");
                suma+=matriz[i][j];
            }
            System.out.println("");
        }
        System.out.println("Suma de sus elementos: " + suma);
    }    
}