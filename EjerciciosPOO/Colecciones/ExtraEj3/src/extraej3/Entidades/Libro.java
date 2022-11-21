package extraej3.Entidades;

public class Libro {
    private String titulo, autor;
    private Integer ejemplares, ejemplaresPrestados;
    //Constructores
    public Libro(String titulo, String autor, Integer ejemplares, Integer ejemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }
    public Libro() {
        ejemplaresPrestados = 0;
    }
    //Getters y Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Integer getEjemplares() {
        return ejemplares;
    }
    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }
    public Integer getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }
    public void setEjemplaresPrestados(Integer ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    @Override
    public String toString() {
        return "Libro: " + titulo + " del autor " + autor + "\nEjemplares totales: " + ejemplares + ", ejemplares prestados: " + ejemplaresPrestados + '.';
    }
}
