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

        System.out.println("1.Crear un voto");
        System.out.println("2.Listado de votos"); 

        opcion = escaner.nextInt();
        do{ 
            switch(opcion){
                case 1:
                    int idVotoNuevo;
                    String RutNuevo;
                    boolean veredictoNuevo;
                    boolean resultadoAgregacion;
                    Voto votoNuevo = new Voto();

                    System.out.println("Ingrese el id del nuevo voto");
                    idVotoNuevo = escaner.nextInt();
                    escaner.nextLine();
                    System.out.println("Ingrese el rut del votante");
                    RutNuevo = escaner.nextLine();
                    System.out.println("Ingrese el veredicto del votante");
                    veredictoNuevo = escaner.nextBoolean();
                    escaner.nextLine();

                    //resultadoAgregacion = votoNuevo.agregarVoto(idVotoNuevo,RutNuevo,veredictoNuevo);

                    //if(resultadoAgregacion){
                       //System.out.println("Agregacion exitosa!"); 
                    //}

                    System.out.println("Lo sentimos, su intento ha fallado");   
                    break;
                case 2:
                    System.out.println("Listado de votos terminado!");
                    break;
            }
        }while(opcion >= 0);
        return;
    }
    
}







