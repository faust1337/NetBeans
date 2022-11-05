package ej4.Servicios;
import ej4.Entidades.Rectangulo;
import java.util.*;
public class Servicio {
    Scanner leer = new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        Rectangulo rec = new Rectangulo();
        System.out.print("Tamaño de la base: ");
        rec.setBase(leer.nextInt());
        System.out.print("Tamaño de la altura: ");
        rec.setAltura(leer.nextInt());
        return rec;
    }
    public int superficie(Rectangulo rec){
        return rec.getAltura() * rec.getBase();
    }
    public int perimetro(Rectangulo rec){
        return (rec.getAltura()+rec.getBase())*2;
    }
    public void dibujarRectangulo(Rectangulo rec){
        for (int i = 0; i < rec.getAltura(); i++) {
            for (int j = 0; j < rec.getBase(); j++) {
                if(i!=0 && i!=rec.getAltura()-1 && j!=0 && j!=rec.getBase()-1){
                    System.out.print("  ");
                }else {System.out.print("* ");}
            }
            System.out.println("");
        }
    }
}
