package extraextraej1.Entidades;
public class Fraccion {
    private int numeradorX, denominadorX;
    private int numeradorY, denominadorY;
    private double x, y;
    //Constructores
    public Fraccion() {
    }
    public Fraccion(int numeradorX, int denominadorX, int numeradorY, int denominadorY) {
        this.numeradorX = numeradorX;
        this.denominadorX = denominadorX;
        this.numeradorY = numeradorY;
        this.denominadorY = denominadorY;
        x = (double) numeradorX/denominadorX;
        y = (double) numeradorY/denominadorY;
    }
    //Getters y Setters
    public int getNumeradorX() {
        return numeradorX;
    }
    public void setNumeradorX(int numeradorX) {
        this.numeradorX = numeradorX;
    }
    public int getDenominadorX() {
        return denominadorX;
    }
    public void setDenominadorX(int denominadorX) {
        this.denominadorX = denominadorX;
    }
    public int getNumeradorY() {
        return numeradorY;
    }
    public void setNumeradorY(int numeradorY) {
        this.numeradorY = numeradorY;
    }
    public int getDenominadorY() {
        return denominadorY;
    }
    public void setDenominadorY(int denominadorY) {
        this.denominadorY = denominadorY;
    }
    public double getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "Numero X: " + numeradorX + "/" + denominadorX + "    " + x +
             "\nNumero Y: " + numeradorY + "/" + denominadorY + "    " + y; 
    }
}