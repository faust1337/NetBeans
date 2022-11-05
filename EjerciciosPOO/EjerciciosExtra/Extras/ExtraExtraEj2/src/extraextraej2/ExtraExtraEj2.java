package extraextraej2;

import extraextraej2.Entidades.Tiempo;
import java.util.Scanner;

public class ExtraExtraEj2 {
    final static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        Tiempo reloj = crearReloj();//Creo el reloj con hora/min/seg pedidos al usuario.
        reloj.imprimirHoraCompleta();
        reloj = correrLaHora(reloj);//Solicito cuántos segundos avanzar en el reloj y ejecuto. Reemplazo el viejo reloj por el nuevo.
        reloj.imprimirHoraCompleta();//Muestro la hora corrida.
    }
    public static Tiempo crearReloj(){
        int hora,min,seg;
        do{
            System.out.print("Horas: ");
            hora = leer.nextInt();
            if (hora<0) System.out.println("Número inválido. Reingrese.");
        }while(hora<0);
        do{
            System.out.print("Minutos: ");
            min = leer.nextInt();
            if(min>59 || min<0) System.out.println("Número inválido. Reingrese.");
        }while(min>59 || min<0);
        do{
            System.out.print("Segundos: ");
            seg = leer.nextInt();
            if(seg>59 || seg<0) System.out.println("Número inválido. Reingrese.");
        }while(seg>59 || seg<0);
        return new Tiempo(hora,min,seg);
    }
    public static Tiempo correrLaHora(Tiempo pasado){
        int segFuturo = 0, minFuturo = 0, horaFuturo = 0;
        do{
            System.out.println("¿Cuántos segundos desea adelantar?");
            segFuturo = leer.nextInt();
        }while(segFuturo<0);//Medida para que no ingrese números negativos.
        segFuturo += pasado.getSeg();//Sumo los segundos a adelantar, más los que ya tengo.
        while(segFuturo>59){//Resto 'un minuto' cada vez que segFuturo sea mayor a 59.
            segFuturo-=60;
            minFuturo++;//Aumento al contador de minutos adelantados.
        }
        minFuturo += pasado.getMin();//Lo mismo que antes, pero relación minutos-horas.
        while(minFuturo>59){
            minFuturo-=60;
            horaFuturo++;
        }
        horaFuturo+=pasado.getHora();//Le sumo las horas previas a lo que se haya corrido.
        return new Tiempo(horaFuturo,minFuturo,segFuturo); //Retorno un nuevo reloj con los segundos adelantados.
    }
}