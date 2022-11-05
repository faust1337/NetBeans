package extraextraej1;

import extraextraej1.Entidades.Fraccion;
import extraextraej1.Servicios.Servicio;
import java.util.*;

public class ExtraExtraEj1 {
    
    final static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        Servicio svc = new Servicio();
        char opc = 's';
        do{
            if(opc!='s' && opc!='S'){
                System.out.println("Opción inválida. Reingrese.");
            }else {
                Fraccion f = svc.generarFraccion();
                menu(f);
            }
            System.out.println("¿Desea operar con otras fracciones? S/N");
            opc = leer.next().charAt(0);
            if(opc=='n' || opc == 'N') System.out.println("Adiós.");
        }while(opc!='n' && opc!='N');
        
    }
    public static void menu(Fraccion f){
        Servicio svc = new Servicio();
        int opc;
        do{
            System.out.println("---------------OPERACIONES---------------");
            System.out.println("1- SUMAR\n2- RESTAR\n3- MULTIPLICAR\n4- DIVIDIR\n5- SALIR");
            opc = leer.nextInt();
            switch (opc){
                case 1: svc.sumar(f); break;
                case 2: svc.restar(f); break;
                case 3: svc.multiplicar(f); break;
                case 4: svc.dividir(f); break;
                case 5: System.out.println("Gracias por utilizar mi calculadora."); break;
                default: System.out.println("Opción inválida. Reingrese.");
            }
        }while(opc!=5);
    }
}