package com.mycompany.ej1extra.Servicios;

import com.mycompany.ej1extra.Entidades.Perro;
import com.mycompany.ej1extra.Entidades.Persona;
import java.util.*;
public class Servicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Persona> personas = new ArrayList();
    ArrayList<Perro> perrosDisponibles = new ArrayList();
    //Métodos
    public ArrayList<Persona> getPersona(){
        return personas;
    }
    public ArrayList<Perro> getPerrosDisponibles(){
        return perrosDisponibles;
    }
    public Perro cargarPerro(){
        Perro p = new Perro();
        System.out.print("Nombre: ");
        p.setNombre(leer.next());
        /*System.out.print("Edad: ");
        p.setEdad(leer.nextInt());
        System.out.print("Raza: ");
        p.setRaza(leer.next());
        System.out.print("Tamaño: ");
        p.setTamaño(leer.next());*/
        return p;
    }
    public Persona cargarPersona(){
        Persona p = new Persona();
        System.out.print("Nombre: ");
        p.setNombre(leer.next());
        System.out.print("Apellido: ");
        p.setApellido(leer.next());
        /*System.out.print("Edad: ");
        p.setEdad(leer.nextInt());
        System.out.print("DNI: ");
        p.setDocumento(leer.nextInt());*/
        System.out.println("");//Salto de linea x las dudas.
        return p;
    }
    public void cargarPersonas(){
        int n;
        do{
            System.out.println("¿Cuántas personas desea cargar?");
            n = leer.nextInt();
            if(n>perrosDisponibles.size()) System.out.println("No hay suficientes perros para tantas personas. Reingrese.");
        }while(n>perrosDisponibles.size());
        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "º persona.");
            personas.add(cargarPersona());
        }
    }
    public void cargarPerros(){
        System.out.println("¿Cuántos perros desea cargar?");
        int n = leer.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "º perro.");
            perrosDisponibles.add(cargarPerro());
        }
    }
    public void mostrarPersonas(){
        for(Persona p : personas){
            System.out.println(p.getNombre() +" "+ p.getApellido());
        }
    }
    public void mostrarPerros(){
        for(Perro p : perrosDisponibles){
            System.out.println(p.getNombre());
        }
    }
    public void adoptar(){
        for(int i = 0; i < personas.size(); i++){
            Persona p = personas.get(i);
            System.out.println("¡Hola " + p.getNombre() +'!');
            do{
                System.out.println("Perros disponibles");
                mostrarPerros();
                System.out.println("¿Qué perro desea adoptar?");
                String nombrePerro = leer.next();
                p.setPerro(existePerro(nombrePerro));
                if(p.getPerro().getNombre()==null) System.out.println("No existe ese perro");
                else if(p.getPerro().getAdoptado()==true){
                    System.out.println("Lo sentimos, ese perro ya se encuentra adoptado.");
                    p.setPerro(new Perro());
                }else p.getPerro().setAdoptado(true);
            }while(p.getPerro().getNombre()==null);
        }
    }
    public void mostrarRelaciones(){
        for(Persona p : personas){
            p.mostrarDatos();
        }
    }
    public Perro existePerro(String perroIngresado){
       Perro perro = new Perro();
       for(Perro p : perrosDisponibles){
           if(p.getNombre().equalsIgnoreCase(perroIngresado)) perro = p;
       }
       return perro;
    }
}
