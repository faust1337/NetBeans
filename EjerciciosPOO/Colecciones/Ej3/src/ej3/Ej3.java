package ej3;

import ej3.Entidades.Alumno;
import java.util.*;

public class Ej3 {
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList();
        char opc;
        do {
            Alumno alumno = new Alumno();
            System.out.print("Nombre del alumno: ");
            alumno.setNombre(leer.next());
            for (int i = 0; i < 3; i++) {
                System.out.print((i+1)+"º nota: ");
                alumno.getNotas().add(leer.nextDouble());
            }
            alumnos.add(alumno);
            do{
                System.out.println("Cargar otro alumno S/N");
                opc = leer.next().charAt(0);
                Character.toLowerCase(opc);
            }while(opc!='s' && opc!='n');
        }while (opc=='s');  
        buscarNotaFinal(alumnos);
        
    }
    public static void buscarNotaFinal(ArrayList<Alumno> alumnos){
        System.out.print("Nombre del alumno a buscar: ");
        String alumno = leer.next();
        int coincidencia = 0;
        for (Alumno a : alumnos) {
            if (a.getNombre().equals(alumno)) {
                System.out.println("Nota final: " + a.notaFinal());
                coincidencia++;
            }
        }
        if(coincidencia==0) System.out.println("No se ha encontrado el alumno.");
    }
}