package ej8.Servicio;

import ej8.Entidades.Cadena;
import java.util.*;

public class Servicio {
    private final Scanner leer = new Scanner(System.in);
    public int mostrarVocales(Cadena c){
        int vocales = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            char letra = c.getCadena().charAt(i); letra = Character.toUpperCase(letra);
            switch(letra){
                case 'A': vocales++; break;
                case 'E': vocales++; break;
                case 'I': vocales++; break;
                case 'O': vocales++; break;
                case 'U': vocales++; break;
            }
        }
        return vocales;
    }
    public void invertirFrase(Cadena c){
        int inv = c.getLongitud()-1;
        for (int i = 0; i < c.getLongitud(); i++) {
            System.out.print(c.getCadena().charAt(inv));
            inv--;
        }
        System.out.println("");
    }
    public int vecesRepetido(Cadena c, String letra){
        int repetido = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            if(c.getCadena().substring(i, i+1).equalsIgnoreCase(letra)){
                repetido++;
            }
        }
        return repetido;
    }
    public void compararFrases(Cadena c, String frase){
        if(c.getLongitud()==frase.length()){
            System.out.println("Ambas frases tienen la misma longitud.");
        }else if (c.getLongitud() > frase.length()){
            System.out.println("La frase original tiene una mayor longitud.");
        }else System.out.println("La nueva frase tiene una mayor longitud.");
    }
    public String unirFrases(Cadena c){
        System.out.println("Frase para unir.");
        String frase = leer.nextLine();
        return c.getCadena().concat(" "+frase);
    }
    public void reemplazar(Cadena c){
        System.out.print("Caracter que desea reemplazar por la a: ");
        String caracter = leer.next();
        for (int i = 0; i < c.getLongitud(); i++) {
            if (c.getCadena().substring(i, i+1).equalsIgnoreCase("a")) {
                System.out.print(caracter);
            }else System.out.print(c.getCadena().substring(i, i+1));
            /*if(c.getCadena().substring(i, i+1).equalsIgnoreCase("a")){
                c.reemplazarLetra(caracter, i);
            } NO FUNCIONA EL REEMPLAZO*/     
        }
        System.out.println("");
    }
    public boolean contiene(Cadena c){
        System.out.println("¿Qué letra desea buscar?");
        String letra = leer.next();
        for (int i = 0; i < c.getLongitud(); i++) {
            if(c.getCadena().substring(i, i+1).equalsIgnoreCase(letra)){
                return true;
            }
        }
        return false;
    }
}
