package ahorcadonuevo.Entidades;
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
    public int buscar(char letra){   // Busco una letra en el ahorcado[]
        int retorno = 0;             // La idea es que, si la letra está repetida, retorne cuántas veces
        for(char c : ahorcado){      // en el retorno.
            if(c == letra) retorno++;//
        }
        return retorno;
    }
    public boolean encontradas(char letra){
        boolean flag = false;
        int coincidencias = buscar(letra);
        if(coincidencias>0){
            System.out.println("Se encontró la letra.");
        }else{
            System.out.println("No se encontró la letra.");
            jugadas--;
        }
        while(coincidencias>0){
            letrasEncontradas++;
            coincidencias--;
            flag = true;
        }
        System.out.println("Letras encontradas: " + letrasEncontradas);
        System.out.println("Letras restantes: " + (longitud()-letrasEncontradas));
        return flag;
    }
}