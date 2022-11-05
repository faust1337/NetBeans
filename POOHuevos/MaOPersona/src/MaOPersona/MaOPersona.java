package MaOPersona;

import Entidades.Persona;

public class MaOPersona {

    public static void main(String[] args) {
        Persona persona = new Persona("Fausto","River");
        System.out.println(persona.nombre + " es hincha de " + persona.hinchaDe + ".");
    }    
}