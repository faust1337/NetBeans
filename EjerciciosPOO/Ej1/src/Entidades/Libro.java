package Entidades;

public class Libro {
    public String isbn;
    public String titulo;
    public int paginas;

    public Libro() {
    }
    public Libro(String isbn, String titulo, int paginas){
        this.isbn = isbn;
        this.titulo = titulo;
        this.paginas = paginas;
    }
}