package com.mycompany.ej1extra.Entidades;

public class Yate extends BarcoMotor{
    private int camarotes;

    public Yate(){
        crearYate();
    }
    public Yate(String matricula, int eslora, int anioFabricacion, int potencia, int camarotes) {
        super(matricula, eslora, anioFabricacion, potencia);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }
    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }
    
    public final void crearYate(){
        super.crearBarco();
        System.out.print("Potencia en CV: ");
        potencia = leer.nextInt();
        System.out.print("Cantidad de camarotes: ");
        camarotes = leer.nextInt();
    }
    
    @Override
    public int modulo(){
        return 10*eslora + potencia + camarotes;
    }
}
