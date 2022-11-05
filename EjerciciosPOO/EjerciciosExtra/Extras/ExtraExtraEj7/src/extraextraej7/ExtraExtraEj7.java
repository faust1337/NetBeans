/*
Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color del
vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),
Crear métodos que permitan:
● Que un usuario cargue su ficha del auto.
● Que el usuario, modifique la titularidad del vehículo.
● Indicar un trayecto recorrido, modificando de este modo los KM del motor
● Crear un método que indique si es necesario realizar Service al vehículo, considerando que al llegar a los 10.000km corresponde realizarlo.
*/

package extraextraej7;

import extraextraej7.Servicios.Servicio;

public class ExtraExtraEj7 {

    public static void main(String[] args) {
        Servicio svc = new Servicio();
        svc.cargarFicha();
        svc.verFicha();
        svc.sumarKM();
        svc.modificarTitular();
        if(svc.service()) System.out.println("Es necesario un service.");
    }   
}