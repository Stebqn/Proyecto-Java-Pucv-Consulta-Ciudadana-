
package modelos;

import java.util.ArrayList;
import java.util.HashMap;

public class Consulta {

    private int id;
    private String nombre;
    private String fecha;
    private int cantDeVotos;
    private HashMap<String, Voto> votos = new HashMap<String,Voto>();
    
    
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

    //=========== Métodos ==============\\
    
    public boolean verificarVoto(Voto voto){
        Voto votoAnterior = votos.put(voto.getRut(), voto);

        if(votoAnterior == null){
            cantDeVotos++;
            return true;
        }
        return false;
    }

    public boolean agregarVoto(Voto voto){
        return verificarVoto(voto);
    }
    
    
    public Voto obtenerVoto(String rut){
        if(votos.containsKey(rut))
            return votos.get(rut);
        return null;
    }

    public void actualizar(){
        cantDeVotos = votos.size();
    }

    public boolean eliminarVoto(String rut){
        if(votos.containsKey(rut)){
            votos.remove(rut);
            actualizar();
            return true;
        }
        return false;
    }

    public boolean modificarVoto(String rutVotante, boolean veredictoNuevo){
        if(votos.get(rutVotante) != null){
            Voto votoModificar = votos.get(rutVotante);
            
            votoModificar.setVeredicto(veredictoNuevo);
            votos.put(rutVotante, votoModificar);
            return true;
        } 
        return false;
    }
    
    public ArrayList<Voto> listarVotos(){

        ArrayList<Voto> listaVotos = new ArrayList();
        for(String ruts : votos.keySet())
           listaVotos.add(votos.get(ruts));
       return listaVotos;
    
    }
}
