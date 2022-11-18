package extraej2.Servicios;
import extraej2.Entidad.CantanteFamoso;
import java.util.*;
public class Servicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public CantanteFamoso cargarCantante(){
        CantanteFamoso c = new CantanteFamoso();
        System.out.print("Nombre del cantante: ");
        c.setNombre(leer.next());
        System.out.print("Disco más vendido: ");
        c.setDiscoConMasVentas(leer.next());
        return c;
    }
    public ArrayList<CantanteFamoso> crearListaCantantes(){
        ArrayList<CantanteFamoso> lista = new ArrayList();
        for (int i = 0; i<3; i++) {
            lista.add(cargarCantante());
        }
        return lista;
    }
    public void mostrarCantantes(ArrayList<CantanteFamoso> lista){
        System.out.println("Listado de cantantes y sus discos más vendidos.");
        for(CantanteFamoso c : lista){
            System.out.println("* Artista: " + c.getNombre() + ". Disco más vendido: " + c.getDiscoConMasVentas());
        }
    }
    public void eliminarCantante(ArrayList<CantanteFamoso> lista){
        System.out.print("Cantante a eliminar: ");
        String cantante = leer.next();
        for(CantanteFamoso c : lista){
            if(c.getNombre().equals(cantante)){
                lista.remove(c);
            }
        }
    }
}
