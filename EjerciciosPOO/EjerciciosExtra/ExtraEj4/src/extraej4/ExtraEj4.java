package extraej4;

import extraej4.Entidades.NIF;
import java.util.*;

public class ExtraEj4 {
    public static void main(String[] args) {
        NIF nif = crearNIF();
        nif.mostrar();
    }
    public static NIF crearNIF(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");                
        System.out.print("D.N.I.: ");
        long dni = leer.nextLong();
        return new NIF(dni,calcularLetraNIF(dni));        
    }
    public static char calcularLetraNIF(long dni){
        char[] vector = new char[]{'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        return vector[(int)dni%23];
    }
}
