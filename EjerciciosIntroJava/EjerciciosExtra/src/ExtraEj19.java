import java.util.*;
public class ExtraEj19 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] v1 = new int[5], v2 = new int[5];
        System.out.println("V1   V2");
        for (int i = 0; i < 5; i++) {
            v1[i] = random.nextInt(10);
            v2[i] = random.nextInt(10);
            System.out.println(v1[i] + "    " + v2[i]);
        }
        int n = 0;
        while(n<5){
            if(v1[n]!=v2[n]){
                break;
            }
            n++;
        }
        if(n==5){
            System.out.println("Los vectores son iguales.");
        }else System.out.println("Los vectores no son iguales.");
    }
}