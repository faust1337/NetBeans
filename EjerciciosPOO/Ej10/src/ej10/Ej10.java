package ej10;

import java.util.Arrays;

public class Ej10 {

    public static void main(String[] args) {
        double[] a = new double[50], b = new double[20];
        System.out.println("VECTOR A");
        for (int i = 0; i < 50; i++) {
            a[i] = (double) Math.random()*10;
            System.out.print(a[i] + " ");
        }
        Arrays.sort(a);
        System.out.println("\nVECTOR A ORDENADO");
        for (int i = 0; i < 50; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nVECTOR B");
        for (int i = 0; i < 20; i++) {
            if(i<10){
                b[i] = a[i];
            }else b[i] = 0.5;
            System.out.print(b[i] + " ");
        }
    }    
}