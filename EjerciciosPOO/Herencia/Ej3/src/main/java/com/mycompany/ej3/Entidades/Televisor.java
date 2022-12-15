package com.mycompany.ej3.Entidades;

public class Televisor extends Electrodomestico {
    private float resolucion;
    private boolean sintonizador;
    
    public Televisor() {
        crearTelevisor();
    }
    public Televisor(String color, char consumoEnergetico, double precio, double peso, float resolucion, boolean sintonizador) {
        super(color, consumoEnergetico, precio, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public float getResolucion() {
        return resolucion;
    }
    public void setResolucion(float resolucion) {
        this.resolucion = resolucion;
    }
    public boolean isSintonizador() {
        return sintonizador;
    }
    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
    public final void crearTelevisor(){
        crearElectrodomestico();
        System.out.print("Resolución en pulgadas de la T.V.: ");
        resolucion = leer.nextFloat();
        System.out.print("¿Tiene sintonizador T.D.T.?\nS/N: ");
        char opc = leer.next().charAt(0);
        while(opc!='s'&&opc!='S'&&opc!='n'&&opc!='N'){
            System.out.println("Opción inválida. Ingrese S o N.");
            System.out.print("¿Tiene sintonizador TDT?\nS/N: ");
            opc = leer.next().charAt(0);
        }
        sintonizador = (opc=='s' || opc=='S');
    }
    public String conOSin(){
        if(sintonizador) return "con";
        else return "sin";
    }
    @Override
    public void precioFinal(){
        super.precioFinal();
        if(resolucion>40) precio *= 1.3;//Sumo un 30%
        if(sintonizador) precio += 500;
    }
    
    @Override
    public String toString(){
        return("Televisor "+ color +" de " + resolucion + " pulgadas " + conOSin() + " sintonizador T.D.T.: $" + precio);
    }
}
