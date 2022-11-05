import java.util.Scanner;

public class ExtraEj16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Cantidad de personas a procesar: ");
        int n = leer.nextInt();
        int edad; String nombre, opc;
        while(n!=0){
            System.out.print("Nombre: "); 
            nombre = leer.next();
            System.out.print("Edad: "); 
            edad = leer.nextInt();
            if(edad>=18){
                System.out.println(nombre + " es mayor de edad.");
            }else{System.out.println(nombre + " no es mayor de edad.");}
            n--;
            if (n != 0) {
                System.out.println("Desea seguir procesando? Si/No");
                opc = leer.next();
                if (opc.equalsIgnoreCase("No")) {
                    break;
                }
            }
        }
    }    
}
/*nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.*/