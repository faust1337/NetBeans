package extraextraej4;

import extraextraej4.Entidades.Fecha;
import java.util.Scanner;

public class ExtraExtraEj4 {
    final static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    final static int[] fechas = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        Fecha ingreso = crearFecha();
        System.out.println(ingreso.toString());
        if(esBisiesto(ingreso)){
            System.out.println("Es bisiesto.");
        }else System.out.println("No es bisiesto.");
        Fecha mañana = diaSiguiente(ingreso);
        System.out.println("El día de mañana es: " + mañana.toString());
        Fecha ayer = diaAnterior(ingreso);
        System.out.println("El día de ayer es: " + ayer.toString());
    }
    
    
    
    public static Fecha crearFecha(){
        System.out.print("Año: ");
        int anio = leer.nextInt();
        if(anio<1900 || anio>2022) anio = 1900;
        System.out.print("Mes: ");
        int mes = leer.nextInt();
        while(mes<1 || mes>12){
            System.out.print("No existe. Ingrese otro mes: ");
            mes = leer.nextInt();
        }
        System.out.print("Dia: ");
        int limite = cantidadDeDias(mes);
        int dia = leer.nextInt();
        while(dia>limite) {
            System.out.print("El mes no tiene tantos días. \nReingrese: ");
            dia = leer.nextInt();
        }
        return new Fecha(dia,mes,anio);
    }
    public static int cantidadDeDias(int mes){
        String[] meses = new String[]{"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        System.out.println("Usted ingresó mes " + mes + "(" + meses[mes-1] +"), que tiene " + fechas[mes-1] + " días.");
        return fechas[mes-1];
    }
    public static Fecha diaSiguiente(Fecha hoy){
        if(hoy.getDia()==31 && hoy.getMes()==12){//Si es 31/12/19xx, lo hace 1/1/19xx+1.
            return new Fecha(1,1,hoy.getAnio()+1);
        }else if(hoy.getDia()==fechas[hoy.getMes()-1]){//Si es 31/x/19xx, lo hace 1/x+1/19xx
            return new Fecha(1,hoy.getMes()+1,hoy.getAnio());
        }else return new Fecha(hoy.getDia()+1, hoy.getMes(), hoy.getAnio());//Si es x/x/19xx, lo hace x+1/x/19xx
    }
    public static Fecha diaAnterior(Fecha hoy){
        if(hoy.getDia()==1 && hoy.getMes()==1){
            return new Fecha(31,12,hoy.getAnio()-1);
        }else if(hoy.getDia()==1){
            return new Fecha(fechas[hoy.getMes()-2],hoy.getMes()-1,hoy.getAnio());
        }else return new Fecha(hoy.getDia()-1,hoy.getMes(),hoy.getAnio());        
    }
    public static boolean esBisiesto(Fecha hoy){
        int anio = hoy.getAnio();
        if(anio%400==0){
            return true;
        }else return (anio%4==0 && anio%100!=0); //Si da true, es bisiesto, y sino, no.
    }
}