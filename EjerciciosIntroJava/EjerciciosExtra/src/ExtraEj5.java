import java.util.*;
public class ExtraEj5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        System.out.print("Ingrese el tipo de plan (A/B/C): ");
        String plan = leer.nextLine(); plan = plan.toUpperCase();
        while(!(plan.equals("A")) && !(plan.equals("B")) && !(plan.equals("C"))){
            System.out.println("Ingreso inválido.");
            System.out.print("Ingrese el tipo de plan (A/B/C): ");
            plan = leer.nextLine(); plan = plan.toUpperCase();
        }
        float costo = 0;
        do {
            System.out.print("Costo total: $");
            costo = leer.nextFloat();
            if (costo<1) System.out.println("Ingreso inválido.");
        } while (costo<1);        
        switch (plan){
            case "A":
                System.out.println("Costo a pagar: $" + costo*0.5); break;
            case "B":
                System.out.println("Costo a pagar: $" + costo*0.65); break;
            case "C":
                System.out.println("Costo a pagar: $" + costo); break;
        }
    }    
}