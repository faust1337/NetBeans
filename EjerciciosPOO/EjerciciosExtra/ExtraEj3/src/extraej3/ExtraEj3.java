package extraej3;

import extraej3.Entidades.Raices;
import java.util.Scanner;

public class ExtraEj3 {
    
    public static void main(String[] args) {
        Raices r = crearRaices();
        if(r.tieneRaiz() == true){
            r.obtenerRaiz();
        }else if(r.tieneRaices() == true){
            r.obtenerRaices();
        }else System.out.println("No tiene solución real. El discriminante es menor a 0.");        
    }
    
    public static Raices crearRaices(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("a: "); int a = leer.nextInt();
        System.out.print("b: "); int b = leer.nextInt();
        System.out.print("c: "); int c = leer.nextInt();
        return new Raices(a,b,c);
    }    
}
