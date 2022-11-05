import java.util.Scanner;

public class ExtraEj1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Minutos: ");
        int minutos = leer.nextInt();
        int dias = minutos/60/24;
        int horas = minutos/60;
        while(horas>24){
            horas -=24;
        }
        System.out.println("Equivale a "+dias+" dias, "+horas+" horas.");
    }    
}