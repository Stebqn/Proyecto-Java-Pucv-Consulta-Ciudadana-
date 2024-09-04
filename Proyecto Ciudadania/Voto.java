import java.util.Scanner;


public class Voto {

    private int id;
    private String rut;
    private boolean veredicto;
    
    //========BUILDER==============\\
    public Voto(){

    }

    //========GETTER==============
    public int getId() {
        return id;
    }
    
    public String getRut() {
        return rut;
    }

    public Boolean getveredicto() {
        return veredicto;
    }

    //==========SETTER===============\\
    public void setRut(String rut) {
        this.rut = rut;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setveredicto(Boolean veredicto) {
        this.veredicto = veredicto;
    }

    //==========MÉTODOS===============\\



    public String posicionVoto(boolean pos){
        if (pos)
            return "A favor";
        else
            return "En contra";
    }
    public void mostrarVoto(){
        System.out.print("Ciudadan@ (rut): " + this.getRut() +
                "\nID: " + this.getId() +
                "\nPosición: " + posicionVoto(this.veredicto) + "\n\n");
    }

    public void modifVoto(){
        Scanner lector = new Scanner(System.in);
        int opcion;
    do {
        mostrarVoto();
        System.out.println("¿Qué desea modificar del voto actual?");
        System.out.println("0. Salir\n 1. ID 2. Rut 3. Veredicto");

        opcion = lector.nextInt();
        lector.nextLine();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el nuevo ID: ");
                this.id = lector.nextInt();
                System.out.println("ID modificado.");
                break;
            case 2:
                System.out.print("Ingrese el nuevo rut: ");
                this.rut = lector.nextLine();
                System.out.println("Rut modificado.");
                break;
            case 3:
                System.out.print("Ingrese el nuevo Veredicto: ");
                this.veredicto = lector.nextBoolean();
                System.out.println("Veredicto Veredicto.");
                break;
            case 0:
                System.out.println("Saliendo del menú de actualización.");
                break;
            default:
                System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
        }while (opcion != 0);
    }        
}

