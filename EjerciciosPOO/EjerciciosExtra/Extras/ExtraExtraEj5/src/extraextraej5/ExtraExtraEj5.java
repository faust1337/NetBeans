/*
Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
operar. Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
● Calcular área
● Calcular perímetro
● Mostrar los datos del triangulo que tenga el área de mayor superficie
*/
package extraextraej5;

import extraextraej5.Entidades.Triangulo;
import java.util.Scanner;

public class ExtraExtraEj5 {
    final static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        int n = 3;//Edito este número para cambiar el tamaño del vector triangulos.
        Triangulo[] triangulos = new Triangulo[n];
        for (int i = 0; i < n; i++) {
            triangulos[i] = crearTriangulo();
        }
        mostrarTriangulos(triangulos);
        Triangulo mayor = mayorPerimetro(triangulos);
        System.out.print("El mayor perímetro de todos los triangulos es de " + mayor.perimetro());
    }
    public static Triangulo crearTriangulo(){
        System.out.print("Base: ");
        double a = leer.nextDouble();
        System.out.print("Catetos: ");
        double b = leer.nextDouble();
        /*System.out.print("Lado C: "); Esto está comentado xq creo que no entendí muy bien la consigna...
        double c = leer.nextDouble();*/
        return new Triangulo(a,b,b);
    }
    public static void mostrarTriangulos(Triangulo[] triangulos){
        for (int i = 0; i < triangulos.length; i++) {
            if(triangulos[i].esIsosceles()==true){
                System.out.println("\nEl "+(i+1)+"º triangulo es isosceles");
                System.out.println("Su area es "+triangulos[i].area()+".");
                System.out.println("Y su perimetro es " + triangulos[i].perimetro() + ".");
            }else System.out.println("\nEl "+(i+1)+"º triangulo no es isosceles");
        }
    }
    public static Triangulo mayorPerimetro(Triangulo[] triangulos){
        Triangulo mayor = triangulos[0];
        for (int i = 0; i < triangulos.length; i++) {
            if(triangulos[i].perimetro()>mayor.perimetro()) mayor = triangulos[i];
        }
        return mayor;
    }
}
