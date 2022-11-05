package ej3;

import ej3.Atributos.Operacion;
import ej3.Servicios.Servicios;
import java.util.*;

public class Ej3 {
    Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        Servicios svc = new Servicios();
        Operacion op = svc.crearOperacion();
        System.out.println("La suma es: " + svc.sumar(op));
        System.out.println("La resta es: " + svc.restar(op));
        if(svc.multiplicar(op) == 0){
            System.out.println("Error, la multiplicación da 0.");
        }else System.out.println("La multiplicación es: " + svc.multiplicar(op));
        if(svc.dividir(op) == -1){
            System.out.println("Error, estás dividiendo por 0.");
        }else System.out.println("La división es: " + svc.dividir(op));
    }
}
