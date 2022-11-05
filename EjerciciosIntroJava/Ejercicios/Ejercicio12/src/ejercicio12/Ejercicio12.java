package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Ingreso:
        String frase = "";
        int correctas = 0, incorrectas = 0;
        boolean flag1, flag2;
        do{
            flag1 = false; flag2 = false;
            System.out.print("Ingrese una frase de 5 caracteres max.: ");
            frase = leer.nextLine();
            frase = frase.toUpperCase();
            if(frase.length() > 5){
                System.out.println("La frase tiene más de 5 caracteres. Reingrese.");
            }else if(!(frase.equals("&&&&&"))){
                //primer caracter tiene que ser X y el último una O.for (int i = 0; i == frase.length()-1 ; i++) {
                flag1 = (frase.substring(0,1).equals("X"));
                flag2 = (frase.substring(frase.length()-1,frase.length()).equals("O"));
                if (flag1 == true && flag2 == true){
                    correctas += 1;
                }else{
                    incorrectas += 1;
                }
            }
        }while (/*! = not*/!(frase.equals("&&&&&")));        
        System.out.println("Cantidad de frases correctas leidas: " + correctas);
        System.out.println("Cantidad de frases incorrectas leidas: " + incorrectas);
    }    
}