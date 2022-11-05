package extraej3.Entidades;

public class Raices {
    private int a;
    private int b;
    private int c;
    public Raices() {
    }
    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }
    
    public double getDiscriminate(){
        return Math.pow(b,2)-4*a*c;
    }
    public boolean tieneRaices(){
        return getDiscriminate()>=0.0;
    }
    public boolean tieneRaiz(){
        return getDiscriminate()==0.0;
    }
    public void obtenerRaices(){
        if (tieneRaices() == true){
            double x0 = (double) (-b+Math.sqrt(getDiscriminate()))/2*a;
            double x1 = (double) (-b-Math.sqrt(getDiscriminate()))/2*a;
            System.out.println("x0 = " + x0 + "\nx1 = " + x1);
        }
    }
    public void obtenerRaiz(){
        if (tieneRaiz()==true){
            System.out.println("Raíz = " + (double) -b/2*a);
        }
    }

    @Override
    public String toString() {
        return "Raices{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
}
