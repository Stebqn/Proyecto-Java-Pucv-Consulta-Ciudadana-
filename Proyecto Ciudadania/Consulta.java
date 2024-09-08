import java.util.HashMap;

public class Consulta {

    private int id;
    private String nombre;
    private String fecha;
    private int cantDeVotos;
    private HashMap<String, Voto> votos;

    //=========== Builder ==============\\
    
    public Consulta(int id, String nombre, String fecha){
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.cantDeVotos = 0;
        this.votos = new HashMap<String,Voto>();
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

        return agregado;
    }
    
    public Voto obtenerVoto(int idVoto) {
        for (String rut : votos.keySet()) {
            Voto voto = votos.get(rut);
            if (voto.getId() == idVoto) {
                return voto;  // Retorna el voto si el id coincide
            }
        }
        return null;  // Retorna null si no se encuentra el voto
    }

    public Voto obtenerVoto(String rut){
        Voto votoRevision = new Voto();
        votoRevision.setRut(rut);
        return votos.get(String.valueOf(rut));
    }

    public void mostrarVoto(int idVoto){
        Voto votoMostrar = obtenerVoto(idVoto);

        if(votoMostrar != null){
            System.out.println("Id Voto : " + votoMostrar.getId());
            System.out.println("Rut Votante : " + votoMostrar.getRut());

            if(votoMostrar.getveredicto()) {
                System.out.println("Veredicto : Apruebo");
            }else{
                System.out.println("Veredicto : Rechazo");
            }
        }else{
            System.out.println("El id ingresado no existe");
            return;
        }
    }

    public void mostrarVoto(String rut){
        Voto votoMostrar2 = obtenerVoto(rut);
        if(votoMostrar2 != null){
            System.out.println("Id Voto : " + votoMostrar2.getId());
            System.out.println("Rut Votante : " + votoMostrar2.getRut());

            if(votoMostrar2.getveredicto()) {
                System.out.println("Veredicto : Apruebo");
            }else{
                System.out.println("Veredicto : Rechazo");
            }
        }else{

        }
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
                
                System.out.println("Id Voto : " + voto.getId());
                System.out.println("Rut Votante : " + voto.getRut());
                
                if (voto.getveredicto()) {
                    System.out.println("Veredicto : Apruebo");
                } else {
                    System.out.println("Veredicto : Rechazo");
                }
                System.out.println();  
            }
        }
    }

    // PROXIMAMENTE METODOS ELIMINAR \\
}
