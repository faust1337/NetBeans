package extraextraej4.Entidades;

public class Fecha {
    private int dia, mes, anio;
    public Fecha() {
        dia = 1;
        mes = 1;
        anio = 1900;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "Fecha: "+dia+"/"+mes+"/"+anio;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
}
