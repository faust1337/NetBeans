/*Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.*/

package ej6.Servicios;
import java.util.*;
public class Servicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String,Float> catalogo = new HashMap();
    public void ingresarElemento(){
        System.out.print("Nombre del producto: ");
        String nombre = leer.next();        
        if (catalogo.containsKey(nombre)) {
            System.out.println("Ya se encuentra un producto con ese nombre.");
        } else {
            System.out.print("Precio: $");
            Float precio = leer.nextFloat();
            catalogo.put(nombre, precio);
        }
    }
    public void modificarPrecio(){
        System.out.println("¿El precio de qué producto desea modificar?");
        String nombre = leer.next();
        if(!catalogo.containsKey(nombre)){
            System.out.println("No se encuentra ese producto.");
        }else{
            System.out.print("Nuevo precio: $");
            Float precioNuevo = leer.nextFloat();
            catalogo.replace(nombre, precioNuevo);
        }
    }
    public void eliminarProducto(){
        System.out.print("Producto a eliminar: ");
        String eliminar = leer.next();
        if(!(catalogo.containsKey(eliminar))) System.out.println("No se encuentra este producto.");
        else catalogo.remove(eliminar);
    }
    public void mostrarProductos(){
        for(Map.Entry<String,Float> c : catalogo.entrySet()){
            System.out.println(c.getKey() + ": $" + c.getValue());
        }
    }
    public void run(){
        int opc;
        do{
            System.out.println("1: Ingresar un producto"
                    + "\n2: Modificar precio de un producto"
                    + "\n3: Eliminar un producto"
                    + "\n4: Mostrar productos"
                    + "\n5: Salir");
            System.out.print("Opción: ");
            opc = leer.nextInt();
            switch(opc){
                case 1: ingresarElemento(); break;
                case 2: modificarPrecio(); break;
                case 3: eliminarProducto(); break;
                case 4: mostrarProductos(); break;
                case 5: System.out.println("Fin."); break;
                default: System.out.println("Opción inválida.");
            }
        }while(opc!=5);
    }
}
