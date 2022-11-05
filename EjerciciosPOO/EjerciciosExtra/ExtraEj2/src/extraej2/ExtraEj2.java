package extraej2;

import extraej2.Entidades.Punto;
import extraej2.Entidades.Puntos;
import java.util.Scanner;

public class ExtraEj2 {

    public static void main(String[] args) {
        //distancia = sqrt((x2-x1)^2 + (y2-y1)^2)
        /*Punto origen = new Punto();
        System.out.print("X: "); int x = leer.nextInt();
        System.out.print("Y: "); int y = leer.nextInt();
        Punto ingreso = new Punto(x,y);
        double formula = (double) Math.sqrt(Math.pow((ingreso.getX()-origen.getX()),2) + Math.pow((ingreso.getY()-origen.getY()),2));
        System.out.println("La distancia entre el punto ingresado y el origen es de " + formula + ".");*/
        Puntos puntos = crearPuntos();
        puntos.distanciaPuntos();
    }
    public static Puntos crearPuntos(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("PRIMER PUNTO");
        System.out.print("X: "); int x1 = leer.nextInt();
        System.out.print("Y: "); int y1 = leer.nextInt();
        System.out.println("\nSEGUNDO PUNTO");
        System.out.print("X: "); int x2 = leer.nextInt();
        System.out.print("Y: "); int y2 = leer.nextInt();
        return new Puntos(x1,y1,x2,y2);
    }
}