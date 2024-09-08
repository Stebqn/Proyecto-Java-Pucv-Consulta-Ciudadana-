import java.util.Scanner;


public class Voto {

    private int id;
    private String rut;
    private boolean veredicto;
    
    //========BUILDER==============\\
    public Voto(){
        this.id = 0;
        this.rut = new String();
        this.veredicto = false;
    }

    public Voto (int id, String rut, boolean veredicto){
        this.id = id;
        this.rut = rut;
        this.veredicto = veredicto;
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
    public String posicionVoto(boolean veredicto){
        if (veredicto)
            return "A favor";
        else
            return "En contra";
    }

    public void mostrarVoto(){
        System.out.print("Ciudadan@ (rut): " + this.getRut() +
                "\nID: " + this.getId() +
                "\nPosición: " + posicionVoto(this.veredicto) + "\n\n");
    }

    public void mostrarVoto(String rut) {

        if (this.rut.equals(rut)) {
            System.out.println("Voto encontrado:");
            System.out.println("ID: " + id);
            System.out.println("RUT: " + rut);
            if (veredicto) {
                System.out.println("Veredicto: A favor");
            } else {
                System.out.println("Veredicto: En contra");
            }
        } else {
            System.out.println("Voto no encontrado para el RUT: " + rut);
        }
    }

    public void mostrarVoto(int id) {

        if (this.id == id) {
            System.out.println("Voto encontrado:");
            System.out.println("ID: " + id);
            System.out.println("RUT: " + rut);
            if (veredicto) {
                System.out.println("Veredicto: A favor");
            } else {
                System.out.println("Veredicto: En contra");
            }
        } else {
            System.out.println("Voto no encontrado para el ID: " + id);
        }
    }

        public void modificarVoto(){
        Scanner lector = new Scanner(System.in);
        int opcion;
    do {
        mostrarVoto();
        System.out.println("¿Qué desea modificar del voto actual?");
        System.out.println("0. Salir\n 1. ID 2. Rut 3. Veredicto");

        //Se lee con escaner y se guarda en la variable opcion  
        opcion = lector.nextInt(); 
        
        // Se utiliza nextLine(Lee un string) para poder leer el '\n' faltante ya que este se deja al leer el nexInt
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

