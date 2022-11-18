package ej5.Servicios;

import java.util.*;

public class Servicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    TreeSet<String> paises = new TreeSet();
    public void crearConjuntoPaises(){
        char opc;
        do{
            System.out.print("Nombre del país: ");
            paises.add(leer.next());
            System.out.println("¿Desea seguir agregando países? S/N");
            opc = leer.next().charAt(0); opc = Character.toLowerCase(opc);
            while(opc!='n' && opc!='s'){
                System.out.println("Opción inválida. Reingrese.");
                System.out.println("¿Desea seguir agregando países? S/N");
                opc = leer.next().charAt(0); opc = Character.toLowerCase(opc);
            }
        }while(opc=='s');
    }
    public void borrarPais(){
        System.out.print("País a eliminar: ");
        String eliminar = leer.next();
        Iterator iter = paises.iterator();
        if(!(paises.contains(eliminar))) System.out.println("No se ha encontrado el país.");
        else{
            while (iter.hasNext()) {
                if (iter.next().equals(eliminar)) {
                    paises.remove(eliminar);
                }
            }
        }
    }
    public void mostrarPaises(){
        for(String pais : paises){
            System.out.println(pais);
        }
    }
}