import java.util.Scanner;

public class ExtraEj3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char letra;
        System.out.print("Ingrese una letra: ");
        letra = leer.next().charAt(0); letra = Character.toLowerCase(letra);
        switch (letra){
            case 'a':
                System.out.println("Es una vocal."); break;
            case 'e':
                System.out.println("Es una vocal."); break;
            case 'i':
                System.out.println("Es una vocal."); break;
            case 'o':
                System.out.println("Es una vocal."); break;
            case 'u':
                System.out.println("Es una vocal."); break;
            default:
                System.out.println("No es una vocal.");
        }
    }    
}