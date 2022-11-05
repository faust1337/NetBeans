import java.util.*;
public class ExtraEj21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = 2;
        double suma = 0, pTP, sTP, pI, sI;
        double[] alumnos = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEvaluando el " + (i+1) + "º alumnx.");
            System.out.print("Nota del primer trabajo práctico: ");
            pTP = leer.nextInt();
            System.out.print("Nota del segundo trabajo práctico: ");
            sTP = leer.nextInt();
            System.out.print("Nota del primer integrador: ");
            pI = leer.nextInt();
            System.out.print("Nota del segundo integrador: ");
            sI = leer.nextInt();
            alumnos[i] = (pTP + sTP + pI + sI)/4;
        }
        for (int i = 0; i < n; i++) {
            if(alumnos[i]>=7.0){
                System.out.println("El " + (i+1) + "º alumnx está aprobado.");
            }else System.out.println("El " + (i+1) + "º alumnx está reprobado.");
        }
    }
}