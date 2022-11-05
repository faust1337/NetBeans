
import java.util.*;

public class Ej23NotByMe {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rdn = new Random();
        String[][] matriz = new String[20][20];
        String palabra;
        int cont = 0;
        do {
            int fila = rdn.nextInt(19);
            String[] vector = new String[5];
            int x = 0, y = 1;
            System.out.println("Ingrese una palabra de 3 a 5 caracteres");
            palabra = leer.nextLine();
            palabra = palabra.toUpperCase();
            if (palabra.length() > 2 && palabra.length() < 6) {
                for (int i = 0; i < vector.length; i++) {
                    if (y <= palabra.length()) {
                        vector[i] = palabra.substring(x, y);
                        x++;
                        y++;
                    }
                    System.out.print("[" + vector[i] + "]");
                }
                System.out.println("\n====================================================");
                for (int i = fila; i < fila + 1; i++) {
                    for (int j = 0; j < 1; j++) {
                        for (int k = 0; k < vector.length; k++) {
                            if (matriz[i][k] == null) {
                                matriz[i][k] = vector[k];
                            }
                        }
                    }
                }
                cont++;
            } else {
                System.out.println("Palabra Incorrecta");
            }
        } while (cont < 5);
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (matriz[i][j] == null) {
                    String cara = "";
                    int num = rdn.nextInt(9);
                    cara = Integer.toString(num);
                    matriz[i][j] = cara;
                }
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
    }
}