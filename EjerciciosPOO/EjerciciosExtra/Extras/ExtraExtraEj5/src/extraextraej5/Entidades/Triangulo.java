package extraextraej5.Entidades;

public class Triangulo {
    private double a,b,c;
    //Builders
    public Triangulo() {
        }
    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //Setters y Getters
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    public boolean esIsosceles(){
        if(a==b && a==c && b==c){
            return false;
        }else if(a==b || a==c){
            return true;
        }else return (b==a || b==c);
    }
    public double area(){
        double h = Math.sqrt(b*b-(a*a/4));
        return a*h/2;
    }
    public double perimetro(){
        return a+b+c;
    }
}
