package extraextraej3;

import extraextraej3.Entidades.Pass;
import java.util.Scanner;

public class ExtraExtraEj3 {
    final static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        Pass pw = new Pass();
        System.out.println(pw.toString());
        int opc;
        do{
            System.out.println("1. Crear contraseña\n2. Consultar nivel de seguridad de la contraseña.\n3. Modificar datos\n4. Salir");
            System.out.print("Ingrese su opción: ");
            opc = leer.nextInt();
            switch(opc){
                case 1:
                    if(pw.getPass()==""){
                        pw.setPass(crearPass()); 
                    }else System.out.println("La contraseña ya ha sido creada.");
                    break;
                case 2:
                    analizarPass(pw.getPass()); break;
                case 3:
                    cambiarDatos(pw); break;
                case 4:
                    System.out.println("¡Adiós!"); break;
                default:
                    System.out.println("Opción inválida. Reingrese.");
            }
        }while(opc!=4);
        System.out.println(pw.toString());
    }
    public static String crearPass(){
        System.out.println("Ingrese su contraseña (máx. 10 caracteres, min. 3 caracteres)");
        String pass = leer.next();
        while(pass.length()<3 || pass.length()>10){
            System.out.println("Cantidad de caracteres inválido.");
            System.out.println("Ingrese su contraseña (máx. 10 caracteres, min. 3 caracteres)");
            pass = leer.next();
        }
        return pass;
    }
    public static void analizarPass(String pw){
        if(pw.equals("")){
            System.out.println("La contraseña aún no ha sido registrada.");
        }else{
            int cantZ = 0, cantA = 0;
            for (int i = 0; i < pw.length(); i++) {
                if (pw.substring(i, i + 1).equalsIgnoreCase("z")) cantZ++;
                if (pw.substring(i, i + 1).equalsIgnoreCase("a")) cantA++;
            }
            if (cantA >= 2 && cantZ >= 1) {
                System.out.println("Nivel de seguridad ALTA");
            } else if (cantZ >= 1) {
                System.out.println("Nivel de seguridad MEDIA");
            } else {
                System.out.println("Nivel de seguridad BAJA");
            }
        }
        
    }
    public static void cambiarDatos(Pass pw) {
        if (pw.getPass().equals("")) {
            System.out.println("La contraseña no ha sido configurada.");
        } else {
            System.out.print("Ingrese su contraseña: ");
            String contra = leer.next();
            if (contra.equals(pw.getPass())) {
                System.out.println("1: Cambiar nombre de usuario\n2: Cambiar DNI\n3: Cambiar contraseña");
                System.out.print("Ingrese su opción:");
                int op = leer.nextInt();
                switch (op) {
                    case 1:
                        System.out.print("Ingrese su nuevo nombre de usuario: ");
                        pw.setNombre(leer.next());
                        break;
                    case 2:
                        System.out.print("Ingrese su nuevo DNI: ");
                        pw.setDni(leer.nextInt());
                        break;
                    case 3:
                        pw.setPass(crearPass());
                        break;
                    default:
                        System.out.println("Opción inválida. Vuelva a intentar.");
                }
            } else {
                System.out.println("Contraseña inválida.");
            }
        }
        
    }
}