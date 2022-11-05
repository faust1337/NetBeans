import java.util.Scanner;

public class ExtraEj13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Tamaño de la escalera: ");
        int size = leer.nextInt();
        dibujarEscalera(size);
    }
    public static void dibujarEscalera(int n){
        String cadena = "";
        for (int i = 1; i < n+1; i++) {
            cadena = cadena.concat(Integer.toString(i));
            cadena = cadena.concat(" ");
            System.out.println(cadena);
        }
    }
}