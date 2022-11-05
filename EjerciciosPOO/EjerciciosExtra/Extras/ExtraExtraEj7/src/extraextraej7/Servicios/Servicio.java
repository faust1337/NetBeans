/*
Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color del
vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),
Crear métodos que permitan:
● Que un usuario cargue su ficha del auto.
● Que el usuario, modifique la titularidad del vehículo.
● Indicar un trayecto recorrido, modificando de este modo los KM del motor
● Crear un método que indique si es necesario realizar Service al vehículo, considerando que al llegar a los 10.000km corresponde realizarlo.
*/
package extraextraej7.Servicios;

import extraextraej7.Entidades.Auto;
import java.util.*;

public class Servicio {
    final static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Auto auto = new Auto();
    public void cargarFicha(){
        System.out.print("Nombre del titular: ");
        auto.setNombre(leer.next());
        System.out.println("Fecha de vencimiento del carnet.");
        System.out.print("Día: "); int dia = leer.nextInt();
        System.out.print("Mes: "); int mes = leer.nextInt();
        System.out.print("Año: "); int anio = leer.nextInt();
        Date vencimiento = new Date(anio,mes,dia);
        auto.setVencimientoCarnet(vencimiento);
        System.out.print("Color del vehículo: ");
        auto.setColor(leer.next());
        System.out.print("Modelo: ");
        auto.setModelo(leer.next());
        auto.setKm(7500);
    }
    public void verFicha(){
        System.out.print(auto.toString());
    }
    public void modificarTitular(){
        System.out.print("Nuevo titular: ");
        auto.setNombre(leer.next());
    }
    public void sumarKM(){
        System.out.print("Kilometros recorridos: ");
        auto.setKm(auto.getKm()+leer.nextInt());
    }
    public boolean service(){
        return(auto.getKm()>10000);
    }
}
