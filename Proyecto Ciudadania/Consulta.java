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
    


    public boolean verificarVoto(Voto voto){
        Voto votoAnterior = votos.put(voto.getRut(), voto);

        if(votoAnterior == null){
            cantDeVotos++;
            return true;
        }
        return false;
    }

    public boolean agregarVoto(int id, String rut, boolean veredicto){
        Voto nuevoVoto = new Voto();
        nuevoVoto.setId(id);
        nuevoVoto.setRut(rut);
        nuevoVoto.setveredicto(veredicto);
        
        boolean agregado = verificarVoto(nuevoVoto);

        if(agregado == true){
            return true;
        }
        return false;
    }



    // Proximamente eliminar //

    public Voto obtenerVoto(int idVoto) {
        Voto votoRevision = new Voto();
        votoRevision.setId(idVoto);
        
        return votos.get(String.valueOf(idVoto)); 
    }

    public Voto obtenerVoto(String rut){
        Voto votoRevision = new Voto();
        votoRevision.setRut(rut);
        return votos.get(String.valueOf(rut));
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

    public void listarVotos() {
        if (votos.isEmpty()) {
            System.out.println("No hay votos registrados.");
        } else {
            for (String key : votos.keySet()) {  
                Voto voto = votos.get(key);       
                
                // Imprimiendo la salida en el formato que solicitas
                System.out.println("Id Voto : " + voto.getId());
                System.out.println("Rut Votante : " + voto.getRut());
                
                // Usando if-else para determinar el veredicto
                if (voto.getveredicto()) {
                    System.out.println("Veredicto : Apruebo");
                } else {
                    System.out.println("Veredicto : Rechazo");
                }

                System.out.println();  
            }
        }
    }
    
}
