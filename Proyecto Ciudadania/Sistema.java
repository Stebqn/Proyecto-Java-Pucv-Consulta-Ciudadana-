import java.io.*;
import java.lang.*;
import java.util.ArrayList;

public class Sistema {

    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Consulta> consultas = new ArrayList<Consulta>();
        Consulta consulta1 = new Consulta(1, "Consulta San Felipe", "10/09/98");
        Consulta consulta2 = new Consulta(2, "Consulta San Joaquin", "10/09/98");


        consulta1.agregarVoto(1, "123456789-0", true);
        consulta1.agregarVoto(2, "987654321-0", false);
        consulta1.agregarVoto(3, "111111111-1", false);

        consulta2.agregarVoto(1, "111111222-0", true);
        consulta2.agregarVoto(2, "222111333-9", false);
        consultas.add(consulta1);
        consultas.add(consulta2);

        menuDeInicio(lector, consultas);


    }

    public static void menuDeInicio(BufferedReader lector, ArrayList consultas) throws IOException {
        int opcion;
        System.out.println("Ingrese 1 para inciar el menu Prinipal");
        opcion = Integer.parseInt(lector.readLine());

        switch (opcion) {
            case 1:
                menuConsulta(lector, consultas);
                break;
            case 0:
                System.out.println("Gracias por su visita!");
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                menuConsulta(lector, consultas);
                break;
        }
    }

    public static void menuConsulta(BufferedReader lector, ArrayList consultas) throws IOException {
        int opcion;

        do {
            System.out.println("Bienvenido al menu de consultas!");
            System.out.println("¿Que desea realizar?\n");

            System.out.println("1. Ingresar a una consulta");
            System.out.println("0. Salir");

            opcion = Integer.parseInt(lector.readLine());
            switch (opcion) {
                case 1:
                    int idConsulta;
                    Consulta consulta;

                    System.out.println("Ingrese el id del consulta");
                    idConsulta = Integer.parseInt(lector.readLine());

                    consulta = buscarConsulta(consultas,idConsulta);

                    menuPrincipal(lector,consulta);
                    break;
                case 0:
                    System.out.println("Gracias por su visita!");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    menuDeInicio(lector, consultas);
                    break;
            }
        }while(opcion != 0);
    }

    public static void menuPrincipal(BufferedReader lector, Consulta consulta) throws IOException {
        int opcion;

        do {
            System.out.println("Bienvenido se encuentra en el menu de consultas profesional");
            System.out.println("¿Que desea realizar?\n");

            System.out.println("1. Crear un voto");
            System.out.println("2. Listado de votos");
            System.out.println("3. Consultar voto");
            System.out.println("0. Salir");

            opcion = Integer.parseInt(lector.readLine()); // Se pide la opción en cada ciclo

            switch (opcion) {
                case 1:
                    int idVotoNuevo;
                    String RutNuevo;
                    boolean veredictoNuevo;

                    System.out.println("Ingrese el id del nuevo voto");
                    idVotoNuevo = Integer.parseInt(lector.readLine());

                    System.out.println("Ingrese el rut del votante sin puntos y con digito vereficador");
                    RutNuevo = lector.readLine();

                    System.out.println("Ingrese el veredicto del voto (Apruebo o Rechazo)");

                    String veredicto = lector.readLine();
                    if (veredicto.equals("Apruebo")) {
                        veredictoNuevo = true;
                    } else if (veredicto.equals("Rechazo")) {
                        veredictoNuevo = false;
                    } else {
                        System.out.println("Entrada de datos no valida, por favor ingrese nuevamente.");
                        break;
                    }

                    consulta.agregarVoto(idVotoNuevo, RutNuevo, veredictoNuevo);
                    System.out.println("Voto agregado exitosamente");
                    break;
                case 2:
                    consulta.listarVotos();
                    System.out.println("Listado de votos terminado!");
                    break;
                case 3:
                    System.out.println("Ingrese el metodo de busqueda (1-Mediante id o 2- Mediante RUT)");
                    int opcion2 = Integer.parseInt(lector.readLine());

                    if(opcion2 == 1){
                        System.out.println("Ingrese el id del voto");
                        consulta.mostrarVoto(Integer.parseInt(lector.readLine()));
                    }else if(opcion2 == 2){
                        System.out.println("Ingrese el RUT del votante sin puntos y con digito verficador");
                        consulta.mostrarVoto(lector.readLine());
                    }else{
                        System.out.println("Ingrese una opcion valida, vuelva intentarlo");
                        break;
                    }
                    System.out.println("Consulta Exitosa!");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 0);
    }

    public static Consulta buscarConsulta (ArrayList consultas,int idConsulta){
        Consulta consulta = null;

        for(int i = 0; i < consultas.size(); i++){
            consulta = (Consulta) consultas.get(i);

            if(consulta.getId() == idConsulta){
                return consulta;
            }
        }
        return null;
    }
}
