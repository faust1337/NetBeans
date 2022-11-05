import java.util.*;
public class ExtraEj20 {

    public static void main(String[] args) {
        int[] vector = new int[5];
        llenarVector(vector);
        mostrarVector(vector);
    }
    public static int[] llenarVector(int[] v){
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            v[i] = random.nextInt(10);
        }
        return v;
    }
    public static void mostrarVector(int[] v){
        System.out.print("Vector: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(v[i] + " ");
        }System.out.println("");
    }
}