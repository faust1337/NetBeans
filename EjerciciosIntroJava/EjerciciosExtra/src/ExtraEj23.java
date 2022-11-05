import java.util.*;

public class ExtraEj23 {

    public static void main(String[] args) {
        Random random = new Random();
        String palabra;
        String[] palabras = new String[]{"AAAAA","BBBBB","CCCCC","DDDDD","EEEEE"};//borrar X y poner 5 en String[].
        String[][] sopa = new String[20][20];
        /*for (int i = 0; i < 5; i++) {
            palabras[i] = ingresarPalabra();
        }*/
        int fila, columna, aux = 0, x, y;
        for (int j = 0; j < 20; j+=5) {            
            if (aux < 5) {
                columna = j;
                fila = random.nextInt(20);
                x = 0;
                y = 1;
                for (int i = 0; i < palabras[aux].length(); i++) {
                    while(sopa[fila][columna]!=null){
                        fila = random.nextInt(20);
                    }
                    sopa[fila][columna] = palabras[aux].substring(x, y);
                    x++; y++; columna++;
                }j-=2;
            }            
            aux++;
        }
        //RELLENO LO RESTANTE CON NUMEROS
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if(sopa[i][j] == null){//si existen null en la matriz, la rellena con números.
                    sopa[i][j] = Integer.toString((int)(Math.random()*10));
                }
            }
        }
        //MUESTRO LA MATRIZ
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("|" + sopa[i][j] + "");
            }
            System.out.println("|");
        }
    }
    
    public static String ingresarPalabra(){
        Scanner leer = new Scanner(System.in);
        String palabra;
        int longitud;
        do {
                System.out.print("Ingrese una palabra: ");
                palabra = leer.next(); palabra = palabra.toUpperCase();
                longitud = palabra.length();
                if(longitud<3 || longitud>5) System.out.println("Palabra inválida. Reingrese.");
            } while(longitud<3 || longitud>5);
        return palabra;
    }
}