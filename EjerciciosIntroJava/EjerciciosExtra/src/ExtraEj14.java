import java.util.Scanner;

public class ExtraEj14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Cantidad de familias: ");
        int n = leer.nextInt();
        int m, edad, total = 0, cant = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Cantidad de hijos de la "+(i+1)+"º familia: ");
            m = leer.nextInt();
            for (int j = 0; j < m; j++) {
                System.out.print("Edad del " + (j+1) + "º hije: ");
                edad = leer.nextInt();
                total+=edad;
                cant++;
            }
        }
        double promedio = total/cant;
        System.out.println("La media de edad de los hijos de todas las familias es: " + promedio);
    }    
}