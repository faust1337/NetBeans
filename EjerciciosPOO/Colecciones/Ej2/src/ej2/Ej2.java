package ej2;

import java.util.*;

public class Ej2 {

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
        razas.forEach((r) -> {System.out.println("Raza: " + r);});
        
        System.out.println("¿Qué raza desea eliminar?");
        String eliminar = leer.next();
        Iterator razasIter = razas.iterator(); //Creo el iterator "copiando" la lista razas.
        if(Collections.frequency(razas, eliminar) == 0) System.out.println("No se ha encontrado en la lista.");
        else {
            while (razasIter.hasNext()) { //Mientras hayan elementos en el iterator...
                if (razasIter.next().equals(eliminar)) { //Si el elemento es igual al que quiero eliminar
                    razasIter.remove();              //Lo remueve de la lista
                }
            }
        }
        Collections.sort(razas);//Lo ordeno alfabéticamente
        razas.forEach((r)->{System.out.println("Raza: " + r);});
    }    
}