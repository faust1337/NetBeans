package Ej11;

import java.util.*;

public class ej11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Dia: "); int dia = leer.nextInt();
        System.out.print("Mes: "); int mes = leer.nextInt(); mes = mes -1;
        System.out.print("Año: "); int anio = leer.nextInt(); anio = anio-1900;
        Date fechaActual = new Date();
        Date fechaIngresada = new Date(anio,mes,dia);
        System.out.println("Fecha actual: " + fechaActual.toString());
        System.out.println("Fecha ingresada: " + fechaIngresada.toString());
        int difAnios = Math.abs(fechaActual.getYear() - fechaIngresada.getYear());
        if(difAnios == 0){
            System.out.println("Son el mismo año.");
        }else System.out.println("Hay " + difAnios + " años diferencia.");
    }
}