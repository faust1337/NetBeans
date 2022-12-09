package com.mycompany.ej4extra.Entidades;
import java.util.*;
public class Simulador {
    String abecedario = "abcdefghijklmnopqrstuvwxyz";
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public String generarString(){//Funciona
        String retorno = "";
        int random;
        for(int i = 0; i < 5; i++){
            random = (int)(Math.random()*abecedario.length());
            retorno = retorno.concat(Character.toString(abecedario.charAt(random)));
            //                                ^ identifico caracter y lo hago string para poder concatenar.
        }
        return retorno;
    }
    
    public String generarNombreRandom(){
        String[] nombresNotSoRandom = new String[]{"Fausto","Leandro","Agustina","Juan Pablo","Cristiano","Lisardo","Lionel","Rodrigo","Shakira","Brenda","Florencia","Francisco","Matías","Martín","Priscila","Lucía","Paula","Alejandra","Alejandro","Pedro","Gerónimo","Facundo","Agustín","Valentín","Benjamín","Rodrigo","Lautaro"};
        String[] apellidoNotSoRandom = new String[]{"Rodriguez","Raimundo","Perez","Alvarez","Messi","Ronaldo","Pezzi","Saint Claire","Dominguez","Romero","Zalazar","Buonanotte","Pilipiak","Douat","Prado","Lopez","Lucero","Barbera","Sánchez","Perez","Reynoso","Baccarelli","Cantore"};
        int r1 = (int)(Math.random()*nombresNotSoRandom.length);
        int r2 = (int)(Math.random()*apellidoNotSoRandom.length);
        String nombreRandom = nombresNotSoRandom[r1] + " " + apellidoNotSoRandom[r2];
        return nombreRandom;
    }
    
    public ArrayList<String> generarNombres(){//Funciona
        ArrayList<String> nombres = new ArrayList();
        System.out.print("Cantidad de alumnos: ");
        int n = leer.nextInt();
        while(n<10){System.out.println("Número inválido, deben ser más de 10.\nReingrese: "); n=leer.nextInt();}
        String aux = "";
        for (int i = 0; i < n; i++) {
            nombres.add(generarNombreRandom());
        }
        return nombres;
    }
    
    public ArrayList<Integer> generarDocumentos(ArrayList<String> nombres){
        ArrayList<Integer> dnis = new ArrayList();
        for(int i = 0; i<nombres.size(); i++){
            Integer dniRandom = (int)(Math.random()*100000000);
            dnis.add(dniRandom);
        }
        return dnis;
    }
    
    public ArrayList<Alumno> generarAlumnos(ArrayList<String> nombres, ArrayList<Integer> dnis){
        ArrayList<Alumno> alumnosAux = new ArrayList();
        for (int i = 0; i < nombres.size(); i++) {
            Alumno alumno = new Alumno();//Creo un alumno vacio.
            alumno.setNombre(nombres.get(i)); //Le pongo el primer nombre de la lista, sin importar si se repite.
            alumno.setDni(dnis.get(i));//Le seteo el primer dni que cruzo.
                if (!alumnosAux.isEmpty()) {//Si la lista alumnos no está vacía...
                while (mismoDNI(alumnosAux, alumno.getDni())) {//... y mientras el DNI no se repita en ese listado,
                    alumno.setDni(alumno.getDni() + 1);// al dni que le puse (repetido) le sumo 1.
                }
            }
            alumnosAux.add(alumno);//Luego de setear nombre y dni, lo agrego a la lista. Todavía no tiene votos.
        }
        return alumnosAux;
    }
    
    public boolean mismoDNI(ArrayList<Alumno> alumnos, int dni){
        boolean flag = false;
        for(Alumno a : alumnos){
            if(a.getDni() == dni) flag = true;
        }
        return flag;
    }
    
    public void votacion(ArrayList<Alumno> alumnos){ //ARREGLAR 
        for(int i = 0; i<alumnos.size(); i++){
            Voto voto = new Voto();
            voto.setVotante(alumnos.get(i));
            voto.setVotosDados(tresVotos(alumnos, alumnos.get(i)));
            alumnos.get(i).setVoto(voto);
        }
        for(Alumno a : alumnos){
            for(Alumno b : alumnos){
                if(b.getVoto().getVotosDados().contains(a)){
                    a.setVotosRecibidos(a.getVotosRecibidos()+1);
                }
            }
        }
    }
    
    public ArrayList<Alumno> tresVotos(ArrayList<Alumno> alumnos, Alumno votante){
        ArrayList<Alumno> aux = new ArrayList(alumnos);
        aux.remove(votante);
        Collections.shuffle(aux);
        ArrayList<Alumno> retorno = new ArrayList();
        for(int i = 0 ; i < 3 ; i++){
            retorno.add(aux.get(i));
        }
        return retorno;
    }
    
    public int contarVotos(Alumno a, ArrayList<Alumno> alumnos){
        int cantidad = 0;
        for(Alumno alumno : alumnos){
            if(alumno.getVoto().getVotosDados().contains(a)){
                cantidad++;
            }
        }
        return cantidad;
    }
    
    public void mostrarVotos(ArrayList<Alumno> alumnos){
        System.out.println("==========Recuento de votos==========");
        for(Alumno a : alumnos){
            System.out.println("El alumno " + a.getNombre() + " ha votado a: "
                    + "\n*" + a.getVoto().getVotosDados().get(0).getNombre()
                    + "\n*" + a.getVoto().getVotosDados().get(1).getNombre()
                    + "\n*" + a.getVoto().getVotosDados().get(2).getNombre());
        }
        System.out.println("=====================================");
    }
    
    public void mostrarAlumnos(ArrayList<Alumno> alumnos){
        System.out.println("===============Alumnos===============");
        for(Alumno a : alumnos){
            System.out.println("* " + a.getNombre() + "  |  " + "Nº DNI: " + a.getDni());
        }
        System.out.println("=====================================");
    }
    
    public void ranking(ArrayList<Alumno> alumnos){
        System.out.println("#################Ranking de votos#################");
        alumnos.sort(alumnos.get(0).compararCantVotos);
        System.out.println("===============Facilitadores===============");
        for(int i = 0; i < 5; i++){
            Alumno alumno = alumnos.get(i);
            System.out.println("* " + alumno.getNombre() + ", con una cantidad de " + alumno.getVotosRecibidos() + " votos.");
        }
        System.out.println("\n===============TOP 5 menciones===============");
        for(int i = 5; i < 10; i++){
            Alumno alumno = alumnos.get(i);
            System.out.println("* " + alumno.getNombre() + ", con una cantidad de " + alumno.getVotosRecibidos() + " votos.");
        }
        System.out.println("################################################");                                                                                         easterEgg(alumnos);
    }{
}
















    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void easterEgg(ArrayList<Alumno> alumnos){
        boolean thereIsDios = false;
        for(Alumno alumno : alumnos){
            if(alumno.getDni()==40307376) thereIsDios = true;//(?
        }
        if (thereIsDios) System.out.println("Hay un dios en esta clase.");
    }
}