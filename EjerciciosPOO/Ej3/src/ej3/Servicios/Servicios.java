package ej3.Servicios;

import ej3.Atributos.Operacion;
import java.util.Scanner;

public class Servicios {
    Scanner leer = new Scanner(System.in);
    public Operacion crearOperacion(){
        Operacion op = new Operacion();
        System.out.print("Numero 1: ");
        op.setNum1(leer.nextInt());
        System.out.print("Numero 2: ");
        op.setNum2(leer.nextInt());
        return op;
    }
    public int sumar(Operacion op){
        return op.getNum1() + op.getNum2();
    }
    public int restar(Operacion op){
        return op.getNum1() - op.getNum2();
    }
    public int multiplicar(Operacion op){
        if(op.getNum1() == 0 || op.getNum2() == 0){
            return 0;
        }else return op.getNum1()*op.getNum2(); 
    }
    public int dividir(Operacion op){
        if(op.getNum2() == 0){
            return -1;
        }else return op.getNum1()/op.getNum2();
    }    
}