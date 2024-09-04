import java.io.*;
import java.util.Scanner;


public class Menu {

    public static void menuDeInicio() throws IOException{
        int opcion;
        Scanner escaner = new Scanner (System.in);
        System.out.println("Ingrese 1 para inciar el menu Prinipal");

        opcion = escaner.nextInt();
        
        switch(opcion) {
            case 1:
                menuPrincipal();
                break;
            case 0:
                System.out.println("Gracias por su visita!");
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                menuDeInicio();
                break;   
        }
    } 

    public static void menuPrincipal(){
        int opcion;
        Scanner escaner = new Scanner(System.in);

        System.out.println("Bienvenido se encuentra en el menu de consultas profesional");
        System.out.println("¿Que desea realizar?\n");

        System.out.println("1.Agregar un voto");
        System.out.println("2.Insertar un voto"); 
        System.out.println("3.Listado de votos"); 

        opcion = escaner.nextInt();
        do{ 
            switch(opcion){
                case 1:
                    
                    System.out.println("Agregacion exitosa!");   
                    break;
                case 2:
                    System.out.println("Insertar exitoso!");
                    break;
                case 3:
                    System.out.println("Listado de votos terminado!");
                    break;
            }
        }while(opcion >= 0);


        return;
    }
    
}







