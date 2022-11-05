package extraej6.Entidades;

public class Ahorcado {
    private char[] ahorcado;
    private int letrasEncontradas, jugadas;

    public Ahorcado() {
    }
    public Ahorcado(char[] ahorcado, int letrasEncontradas, int jugadas) {
        this.ahorcado = ahorcado;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadas = jugadas;
    }

    public char[] getAhorcado() {
        return ahorcado;
    }
    public void setAhorcado(char[] ahorcado) {
        this.ahorcado = ahorcado;
    }
    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }
    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }
    public int getJugadas() {
        return jugadas;
    }
    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }
    
    public int longitud(){
        return ahorcado.length;
    }
    public int intentos(){
        return jugadas;
    }
    public boolean buscar(char letra){
        boolean flag = false;
        for (char c : ahorcado) {
            if(c == letra){
                flag = true;
            }
        }
        if(flag == true){
            System.out.println("Se encontró la letra.");
        }else System.out.println("No se encontró la letra.");
        return flag;
    }
    public boolean encontradas(char letra){
        boolean flag = false;
        if(buscar(letra) == true){
            letrasEncontradas++;
            flag = true;
        }else jugadas--;
        System.out.println("Letras encontradas: " + letrasEncontradas);
        System.out.println("Letras restantes: " + (longitud()-letrasEncontradas));
        return flag;
    }
}