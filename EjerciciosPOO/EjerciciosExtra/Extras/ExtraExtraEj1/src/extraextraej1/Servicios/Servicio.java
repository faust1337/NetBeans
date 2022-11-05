package extraextraej1.Servicios;

import extraextraej1.Entidades.Fraccion;
import java.util.Scanner;

public class Servicio {
    final static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Fraccion generarFraccion(){
        int denominadorX, denominadorY;
        System.out.println("Primera fracción:");
        System.out.print("Numerador: "); int numeradorX = leer.nextInt();
        do{
            System.out.print("Denominador: "); denominadorX = leer.nextInt();
            if(denominadorX==0) System.out.println("No puede dividir por 0. Reintente.");
        }while(denominadorX==0);
        System.out.println("Segunda fracción:");
        System.out.print("Numerador: "); int numeradorY = leer.nextInt();
        do{
            System.out.print("Denominador: "); denominadorY = leer.nextInt();
            if(denominadorY==0) System.out.println("No puede dividir por 0. Reintente.");
        }while(denominadorY==0);
        return new Fraccion(numeradorX,denominadorX,numeradorY,denominadorY);
    }
    public static void mostrarFraccion(Fraccion f){
        System.out.println(f.toString());
    }
    
    public static void sumar(Fraccion f){
        int numSuma = f.getNumeradorX()*f.getDenominadorY() + f.getNumeradorY()*f.getDenominadorX();
        int denSuma = f.getDenominadorX()*f.getDenominadorY();
        int mcd = maximoComunDivisorRecursivo(numSuma, denSuma);
        numSuma = numSuma/mcd;
        denSuma = denSuma/mcd;
        double suma = (double) numSuma / denSuma;
        System.out.println("Suma: " + numSuma + "/" + denSuma + "     " + suma);
    }
    public static void restar(Fraccion f){
        int numResta = f.getNumeradorX()*f.getDenominadorY() - f.getNumeradorY()*f.getDenominadorX();
        int denResta = f.getDenominadorX()*f.getDenominadorY();
        int mcd = maximoComunDivisorRecursivo(numResta, denResta);
        numResta = numResta/mcd;
        denResta = denResta/mcd;
        double resta = (double) numResta / denResta;
        System.out.println("Resta: " + numResta + "/" + denResta + "     " + resta);
    }
    public static void multiplicar(Fraccion f){
        int numMulti = f.getNumeradorX() * f.getNumeradorY();
        int denMulti = f.getDenominadorX() * f.getDenominadorY();
        int mcd = maximoComunDivisorRecursivo(numMulti, denMulti);
        numMulti = numMulti/mcd;
        denMulti = denMulti/mcd;
        double multi = (double) numMulti/denMulti;
        System.out.println("Multiplicación: " + numMulti + "/" + denMulti + "     " + multi);
    }
    public static void dividir(Fraccion f){
        int numDiv = f.getNumeradorX() * f.getDenominadorY();
        int denDiv = f.getNumeradorY() * f.getDenominadorX();
        int mcd = maximoComunDivisorRecursivo(numDiv, denDiv);
        numDiv = numDiv/mcd;
        denDiv = denDiv/mcd;
        double division = (double) numDiv/denDiv;
        System.out.println("División: " + numDiv + "/" + denDiv + "     " + division);
    }
    
    public static int maximoComunDivisorRecursivo(int a, int b) {
        if (b == 0) return a;
        return maximoComunDivisorRecursivo(b, a % b);
    }
}
