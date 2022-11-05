package extraej4.Entidades;

public class NIF {
    private long dni;
    private char letra;
    //Builders
    public NIF() {
    }
    public NIF(long dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }
    //Setters & Getters
    public long getDni() {
        return dni;
    }
    public void setDni(long dni) {
        this.dni = dni;
    }
    public char getLetra() {
        return letra;
    }
    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    public void mostrar(){
        String dniString = Long.toString(dni), nif = "";
        for (int i = dniString.length(); i < 8; i++) {
            nif = nif.concat("0");
        }
        nif = nif.concat(dniString + "-" + letra);
        System.out.println(nif);
    }
}
