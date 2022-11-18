/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.*/
package ej1;
import java.util.*;
public class Ej1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        char opc;
        String raza;
        ArrayList<String> razas = new ArrayList();
        do {
            System.out.print("Raza del perro: ");
            raza = leer.next();
            razas.add(raza);
            System.out.println("¿Desea agregar otra raza? S/N");
            opc = leer.next().charAt(0);
            while(opc!='s' && opc!='S' && opc!='n' && opc!='N'){
                System.out.println("Opción inválida. Reingrese.");
                System.out.println("¿Desea agregar otra raza? S/N");
                opc = leer.next().charAt(0);
            }
        }while (opc!='n' && opc!='N');
        //razas.forEach((r) -> {System.out.println("Raza: " + r);});
        for(String r : razas){
            System.out.println(r);
        }
    }
}