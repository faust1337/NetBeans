package extraej2;

import extraej2.Entidad.CantanteFamoso;
import extraej2.Servicios.Servicio;
import java.util.*;
public class ExtraEj2 {
    static Servicio svc = new Servicio();
    static ArrayList<CantanteFamoso> cantantes;
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        
        cantantes = svc.crearListaCantantes();
        menu();
        
    }
    public static void menu(){
        int opc;
        do{
            System.out.println("1: Agregar otro cantante"
                    + "\n2: Mostrar lista de cantantes"
                    + "\n3: Eliminar un cantante"
                    + "\n4: Salir");
            System.out.print("Opción: "); opc = leer.nextInt();
            switch(opc){
                case 1: cantantes.add(svc.cargarCantante()); break;
                case 2: svc.mostrarCantantes(cantantes); break;
                case 3: svc.eliminarCantante(cantantes); break;
                case 4: System.out.println("Fin."); break;
                default: System.out.println("Opción inválida.");
            }
        }while(opc!=4);
    }
}