package ejercicio18;

public class Ejercicio18 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        System.out.println("MATRIZ: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int)(Math.random()*10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("\nMATRIZ TRASPUESTA");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println("");
        }
    }    
}
