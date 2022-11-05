/*
Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color del
vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),
Crear métodos que permitan:
● Que un usuario cargue su ficha del auto.
● Que el usuario, modifique la titularidad del vehículo.
● Indicar un trayecto recorrido, modificando de este modo los KM del motor
● Crear un método que indique si es necesario realizar Service al vehículo, considerando que al llegar a los 10.000km corresponde realizarlo.
*/
package extraextraej7.Entidades;

import java.util.*;

public class Auto {
    private String nombre, color, modelo;
    private Date vencimientoCarnet;
    private int km;

    public Auto() {
    }
    public Auto(String nombre, String color, String modelo, Date vencimientoCarnet, int km) {
        this.nombre = nombre;
        this.color = color;
        this.modelo = modelo;
        this.vencimientoCarnet = vencimientoCarnet;
        this.km = km;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Date getVencimientoCarnet() {
        return vencimientoCarnet;
    }
    public void setVencimientoCarnet(Date vencimientoCarnet) {
        this.vencimientoCarnet = vencimientoCarnet;
    }
    public int getKm() {
        return km;
    }
    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "Titular: " + nombre + "\nColor: " + color + "\nModelo: " + modelo + "\nVencimiento del carnet=" + vencimientoCarnet.getDay()+"/"+vencimientoCarnet.getMonth()+"/"+vencimientoCarnet.getYear() + "\nKilometros: " + km;
    }
        
}