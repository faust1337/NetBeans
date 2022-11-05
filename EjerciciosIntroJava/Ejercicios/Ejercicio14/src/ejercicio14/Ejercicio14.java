package ejercicio14;

import java.util.*;

/*
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/

public class Ejercicio14 {
    
    public static void intercambio(int euro, String cambio){
        switch (cambio){
            case "libras":
                System.out.println("Son " + euro*0.86 + " libras."); break;
            case "dolar":
                System.out.println("Son " + euro*1.28611 + " dólares."); break;
            case "yen":
                System.out.println("Son " + euro*129.852 + " yenes."); break;
            default:
                System.out.println("Esa moneda no existe. Reintente.");
        }
    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cambio;
        char opc = 0;
        System.out.print("Cantidad de  euros a convertir: ");
        int n = leer.nextInt();
        System.out.print("Moneda a convertir: ");
        cambio = leer.next(); 
        cambio = cambio.toLowerCase();
        intercambio(n,cambio); 
        while(opc!='N' && opc!='n'){
            System.out.println("¿Desea procesar nuevamente? S/N");
            opc = leer.next().charAt(0);
            if (opc == 'S' || opc == 's'){
                System.out.print("Moneda a convertir: ");
                cambio = leer.next(); cambio = cambio.toLowerCase();
                intercambio(n,cambio); 
            }            
        }
    }
}
