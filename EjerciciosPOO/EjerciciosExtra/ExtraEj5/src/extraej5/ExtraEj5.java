package extraej5;

import extraej5.Entidades.Mes;
import java.util.Scanner;

public class ExtraEj5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Mes secreto = new Mes();
        String ingreso;
        System.out.println("¡Intente adivinar el mes secreto!");
        do{
            System.out.print("Ingrese un mes en minúsculas: ");
            ingreso = leer.next();
            if(!(ingreso.equals(secreto.getSecreto()))){
                System.out.println("No has acertado :(");
                System.out.println("Intenta nuevamente.");
            }
        } while(!(ingreso.equals(secreto.getSecreto())));
        System.out.println("¡Ha acertado! :)");
    }
}