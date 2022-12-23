/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4extranomaven.Entidades;
public class Estudiante extends Persona{
    private String curso;
    public Estudiante(){
        cargarEstudiante();
    }
    public Estudiante(String curso, String nombre, boolean estadoCivil, Integer numID) {
        super(nombre, estadoCivil, numID);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void cambiarCurso(){
        System.out.print("Nombre del curso a matricular: ");
        curso = leer.next();
    }
    
    public final void cargarEstudiante(){
        super.cargarPersona();
        cambiarCurso();
    }
}

