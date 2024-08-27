import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;


public class Main {

    private static BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException{
       
        HashMap<String, Consulta> Consulta = new HashMap<String, Consulta>();
        ArrayList<Voto> votos = new ArrayList<Voto>();
        
        menuPrincipal();
    }

    public static void menuPrincipal() throws IOException{
        int confirmacion;
        
        System.out.println("Bienvenido al sistema de votaciones");
        System.out.println("Ingrese '1' para ingresar al sistema de votaciones");
        confirmacion = Integer.parseInt(lector.readLine());
        
        switch(confirmacion) {
            case 1:
                System.out.println("Hello world!");
                break;
            case 0:
                System.out.println("Gracias por su visita!");
                break;
            default:
                System.out.println("Opción inválida.");
                menuPrincipal();
                break;
        }
    }
}
