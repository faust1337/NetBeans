package extraej1;
import java.util.*;
public class ExtraEj1 {

    public static void main(String[] args) {
        Integer n, suma = 0, cont = 0;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Integer> numeros = new ArrayList();
        do{
            System.out.print("Ingrese un número: ");
            n = leer.nextInt();
            if(n!=-99) {
                numeros.add(n);
                suma+=n;
                cont++;
            }
        }while(n!=-99);
        System.out.print("Se leyeron " + cont + " números."
                + "\n Su suma es de: " + suma +
                "\n y su media es de: " + (float) suma/cont);
    }
}