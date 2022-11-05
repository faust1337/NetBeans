package ej5;

import ej5.Entidades.Cuenta;
import java.util.Scanner;

public class Ej5 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cuenta cuenta = crearCuenta();
        int op;
        do {
            System.out.println("\n1: Ingresar dinero\n2: Retirar dinero\n3: Extracción rápida\n4: Consultar saldo\n5: Consultar datos de cuenta\n6: Salir");
            op = leer.nextInt();
            switch (op){
                case 1:
                    System.out.print("Cantidad a ingresar: $"); cuenta.ingreso(leer.nextDouble()); break;
                case 2:
                    System.out.println("Cantidad a retirar: $"); cuenta.retiro(leer.nextDouble()); break;
                case 3:
                    cuenta.extraccionRapida(); break;
                case 4:
                    cuenta.consultarSaldo(); break;
                case 5:
                    cuenta.consultarDatos(); break;
                case 6:
                    System.out.println("Gracias por utilizar nuestros servicios."); break;
                default:
                    System.out.println("Opción inválida. Vuelva a intentar.");
            }
        } while (op!=6);        
    }
    
    
    public static Cuenta crearCuenta(){
        Scanner leer = new Scanner(System.in);
        Cuenta c = new Cuenta();
        System.out.println("Número de cuenta: ");
        c.setNroCuenta(leer.nextInt());
        System.out.println("Nombre del titular: ");
        c.setTitular(leer.next());
        System.out.println("DNI: ");
        c.setDni(leer.nextLong());
        System.out.println("Saldo: ");
        c.setSaldo(leer.nextDouble());
        return c;
    }
}
