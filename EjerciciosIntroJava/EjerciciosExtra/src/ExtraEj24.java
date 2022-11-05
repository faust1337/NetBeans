import java.util.*;
public class ExtraEj24 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Qué cantidad de números de la sucesión de Fibonacci desea ver?");
        int n = leer.nextInt();
        int[] f = new int[n];
        for (int i = 0; i < n; i++) {
            if(i==0){
                f[i] = 1;
            }else if(i==1){
                f[i] = 1;
            }else{
                f[i] = f[i-1]+f[i-2];
            }
            System.out.print(f[i] + " ");
        }
    } 
}