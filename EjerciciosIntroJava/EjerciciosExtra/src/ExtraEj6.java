import java.util.*;
public class ExtraEj6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float altura, total = 0, promedio = 0, bajos = 0, promedioBajos = 0; 
        int aux = 1;
        do {
            System.out.print("Altura de la " + aux + "º persona: ");
            aux++;
            altura = leer.nextFloat();
            if(altura>0){
                total +=altura;
                promedio++;
                if(altura<=1.6){
                    bajos++;
                    promedioBajos+=altura;
                }
            }
        } while (altura>=0);
        System.out.println("Cantidad de personas leídas: " + promedio);
        System.out.println("Altura promedio: " + total/promedio + " mts.");
        System.out.println("Promedio de altura de personas de estatura menor a 1.60m.: " + promedioBajos/bajos + " mts.");
    }    
}