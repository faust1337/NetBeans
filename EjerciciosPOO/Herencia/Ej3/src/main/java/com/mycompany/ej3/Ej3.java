package com.mycompany.ej3;
import com.mycompany.ej3.Entidades.*;
import java.util.*;
public class Ej3 {
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        List<Electrodomestico> electro = new ArrayList();
        electro.add(new Lavadora("blanco",'a',1000,81,31));
        electro.add(new Lavadora("negro",'a',1000,81,29));
        electro.add(new Televisor("blanco",'a',1000,81,42,true));
        electro.add(new Televisor("negro",'a',1000,81,42,false));
        double sumaPrecios = 0;
        for (int i = 0; i < 4; i++) {
            Electrodomestico aux = electro.get(i);
            aux.precioFinal();
            System.out.println(aux.toString());
            sumaPrecios+=aux.getPrecio();
        }
        System.out.println("==================================================\nEl valor total de los electrodomésticos es de: $"+sumaPrecios);
    }
}
