import java.util.ArrayList;

public class Consulta {

    private int id;
    private String nombre;
    private String fecha;
    private int cantDeVotos;
    private ArrayList<Voto> votos;

    
    
    
    
    
    //===========Getters==============
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

    public ArrayList<Voto> getVotos() {
        return votos;
    }

    // Setters
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

    public void setVotos(ArrayList<Voto> votos) {
        this.votos = votos;
    }
    
}
