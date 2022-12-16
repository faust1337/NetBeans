package com.mycompany.ej1extra.Entidades;

public class BarcoMotor extends Barco{
    protected int potencia;

    public BarcoMotor(){
        crearBarcoMotor();
    }
    public BarcoMotor(String matricula, int eslora, int anioFabricacion, int potencia) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    public final void crearBarcoMotor(){
        super.crearBarco();
        System.out.print("Potencia en CV: ");
        potencia = leer.nextInt();
    }
    
    @Override
    public int modulo(){
        return 10*eslora + potencia;
    }
}
