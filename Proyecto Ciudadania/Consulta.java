import java.util.HashMap;

public class Consulta {

    private int id;
    private String nombre;
    private String fecha;
    private int cantDeVotos;
    private HashMap<String, Voto> votos;

    //=========== Builder ==============\\
    
    public Consulta(int id, String nombre, String fecha, int cantDeVotos){
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.cantDeVotos = cantDeVotos;
        votos = new HashMap<String,Voto>();
    }
   



   
    //=========== Getters ==============\\
    public int getId(){
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public int getCantDeVotos() {
        return cantDeVotos;
    }

    public HashMap<String, Voto> getVotos() {
        return votos;
    }

    //===========Setters==============\\
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCantDeVotos(int cantDeVotos) {
        this.cantDeVotos = cantDeVotos;
    }

    public void setVotos(HashMap<String,Voto> votos) {
        this.votos = votos;
    }

    //=========== Métodos ==============\\
    


    public void agregarVoto(Votos voto){
        votos.put(voto.getId(), voto);
        cantDeVotos++;


    }

    // Proximamente eliminar //

    public Votos obtenerVoto(String idVoto) {
        return votos.get(idVoto);
    }


    public int contarVotos(){
        return votos.size();
    }

    public void mostrarConsulta(){
        System.out.println("Consulta ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha: " + fecha);
        System.out.println("Cantidad de Votos: " + cantDeVotos);

        if(votos.isEmpty()){
            System.out.println("No hay votos disponibles");
        }
        else{
            System.out.println("Votos:");
            

        }

    }
    
}
