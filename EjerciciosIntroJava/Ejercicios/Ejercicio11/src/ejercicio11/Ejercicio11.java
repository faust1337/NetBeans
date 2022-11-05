package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número para operar: "); int num1 = leer.nextInt();
        System.out.print("Ingrese otro número para operar: "); int num2 = leer.nextInt();
        int opc; char opc2;
        do{   
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Opcion: "); opc = leer.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + num1*num2);
                    break;
                case 4:
                    System.out.println("Resultado: " + num1/num2);
                    break;
                case 5:
                    System.out.print("¿Desea salir? S/N ");
                    opc2 = leer.next().charAt(0); //Leo la opción, que la deposita en char opc2                  
                    while(opc2!='s' && opc2!='S' && opc2!='n' && opc2!='N'){ //Si la opción que ingresó, es distinta
                        System.out.println("Opción inválida. Reingrese.");   //de s, S, n o N, entonces me pide de nuevo
                        System.out.print("¿Desea salir? S/N ");              //hasta que ingrese una de esas 4.
                        opc2 = leer.next().charAt(0);
                    }
                    if (opc2 == 'S' || opc2 == 's'){//Si desea salir, termina el switch y sale del do-while.
                        break;
                    }else { //Si no desea salir (hasta acá, salió del while anterior únicamente con S o N. En este caso, N.)
                        opc = 0; //fuerza a que la opción elegida al principio, sea 0 en vez de 5. Por lo que...
                        break;//... con el break, termina el switch, pero vuelve a mostrar el menú.
                    }                    
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }while(opc != 5);
        System.out.println("Gracias por usar nuestro programa.");
    }    
}