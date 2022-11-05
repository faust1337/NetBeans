package ej8.Entidades;

public class Cadena {
    private String cadena;
    private int longitud;
    //Constructores.
    public Cadena() {
    }
    public Cadena(String cadena, int longitud) {
        this.cadena = cadena;
        this.longitud = longitud;
    }
    //Getters y setters.
    public String getCadena() {
        return cadena;
    }
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    public int getLongitud() {
        return longitud;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    /*public void reemplazarLetra(String letra, int i){
        cadena.replace(cadena.substring(i, i+1),letra);
    } NO FUNCIONA*/
}
