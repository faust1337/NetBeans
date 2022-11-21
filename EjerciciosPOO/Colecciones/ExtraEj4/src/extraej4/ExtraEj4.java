package extraej4;

import java.util.*;

public class ExtraEj4 {
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        HashMap<Integer,String> ciudades = new HashMap();
        int n = 4;//Acá elijo la cantidad de ciudades que quiero cargar.
        for (int i = 0; i < n; i++) {
            cargarCiudad(ciudades);
        }
        mostrarDatos(ciudades);
        buscarCP(ciudades);
        /*mostrarDatos(ciudades);
        System.out.println("Cargar nueva ciudad");
        cargarCiudad(ciudades);
        mostrarDatos(ciudades);*/
        System.out.println("Eliminar 3 ciudades");
        for (int i = 0; i < 3; i++) {//Bucle de 3 para eliminar las 3 ciudades.
            System.out.print("Ciudad: ");
            String eliminar = leer.next();
            if(borrarCiudad(ciudades, eliminar)!=-1) ciudades.remove(borrarCiudad(ciudades, eliminar));
            /*Si la ciudad se encuentra, es decir, no retorna -1 la función, la remueve obteniendo la Key retornada*/
            else {
                System.out.println("No se ha encontrado la ciudad.");
                i--;//Si no encuentro la ciudad, me avisa y descuenta 1 a i en el bucle, para eliminar 3 ciudades si o si.
            }
        }
        mostrarDatos(ciudades);
    }
    public static void cargarCiudad(HashMap<Integer,String> ciudades){
        System.out.print("Nombre de la ciudad: ");
        String ciudad = leer.next();
        System.out.print("C.P.: ");
        Integer cp = leer.nextInt();
        ciudades.put(cp,ciudad);
    }
    public static void buscarCP(HashMap<Integer,String> ciudades){
        System.out.print("C.P. a buscar: ");
        Integer cp = leer.nextInt();
        if(ciudades.containsKey(cp)) System.out.println("Ciudad: " + ciudades.get(cp));
        else System.out.println("No se encuentra una ciudad con el código postal asociado.");
    }
    public static void mostrarDatos(HashMap<Integer,String> ciudades){
        for(Map.Entry<Integer,String> c : ciudades.entrySet()){
            System.out.println("-----------------------\nCiudad: " + c.getValue() + "\nCP: " + c.getKey());
        }
    }
    public static Integer borrarCiudad(HashMap<Integer,String> ciudades, String eliminar){
        for(Map.Entry<Integer, String> ciudad : ciudades.entrySet()){
            if(ciudad.getValue().equals(eliminar)){
                return ciudad.getKey();
            }
        }
        return -1;
    }
}