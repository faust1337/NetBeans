package ej5.Entidades;

import java.util.Scanner;

public class Cuenta {
    public int nroCuenta;
    public long dni;
    public double saldo;
    public String titular;
    
    public Cuenta(){}
    
    public Cuenta(int nroCuenta, long dni, double saldo, String titular) {
        this.nroCuenta = nroCuenta;
        this.dni = dni;
        this.saldo = saldo;
        this.titular = titular;
    }    

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public int getNroCuenta() {
        return nroCuenta;
    }
    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }
    public long getDni() {
        return dni;
    }
    public void setDni(long dni) {
        this.dni = dni;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void ingreso(double ingreso){
        saldo+=ingreso;
    }
    
    public void retiro(double retiro){
        if(retiro>saldo){
            saldo = 0;
        }else saldo-=retiro;
    }
    
    public void extraccionRapida(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Cantidad a retirar: $");
        double retiro = leer.nextDouble();
        while(retiro>saldo*0.2){
            System.out.println("No puedes retirar esa cantidad, ingrese un monto menor: ");
            retiro = leer.nextDouble();
        }
        saldo-=retiro;
    }
    
    public void consultarSaldo(){
        System.out.println("Su saldo es de: $" + saldo);
    }
    
    public void consultarDatos(){
        System.out.println("Número de cuenta: " + nroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo);
    }
}
