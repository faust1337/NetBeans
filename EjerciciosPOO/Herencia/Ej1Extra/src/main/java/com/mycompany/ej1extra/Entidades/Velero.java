package com.mycompany.ej1extra.Entidades;

public class Velero extends Barco{
    private int cantMastiles;
    public Velero(){
        crearVelero();
    }
    public Velero(String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
    }

    public int getCantMastiles() {
        return cantMastiles;
    }
    public void setCantMastiles(int cantMastiles) {
        this.cantMastiles = cantMastiles;
    }
    
    public final void crearVelero(){
        super.crearBarco();
        System.out.print("Cantidad de mastiles: ");
        cantMastiles = leer.nextInt();
    }
    
    @Override
    public int modulo(){
        return 10*eslora + cantMastiles;
    }
}
