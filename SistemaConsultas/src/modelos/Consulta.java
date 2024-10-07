package modelos;

import java.util.ArrayList;
import java.util.HashMap;
/**
 * Clase que simula una consulta y sus respectivos votos.
 */

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
    
    public void setCantDeVotos(int cant) {
        cantDeVotos = cant;
    }

    //=========== Métodos ==============\\
    
    /**
     * @verificarVoto
     * 
     * Función que verifica si el rut el voto que se referencia por parámetro ya existe en el mapa.
     * 
     * @param voto ;  se recibe una referencia al voto que se recibe en el programa.
     * 
     * @return true;  en caso de que no existiese un voto.rut asociado al voto entrante.
     *         false; en caso de que existiera un voto mapeado con tal voto.rut
     */
    private boolean verificarVoto(Voto voto){
        Voto votoAnterior = votos.put(voto.getRut(), voto);

        if(votoAnterior == null){
            cantDeVotos++;
            return true;
        }
        return false;
        
    }
    
    /**
     * @agregarVoto
     * 
     * Función que agrega el Voto referenciado por parámetro al HashMap de votos.
     * 
     * @param voto ;  se recibe una referencia al voto que se recibe en el programa.
     * 
     * @return true; en caso de que voto se haya agregado y no existiese un rut
     * asociado al rut del voto.
     *         false;en caso de que voto se haya agregado y existiese un rut
     * asociado al rut del voto.
     */
    public boolean agregarVoto(Voto voto){
        return verificarVoto(voto);
    }
    
    /**
     * @obtenerVoto
     * Función que busca un voto y si existe retorna su referencia.
     * 
     * @param rut cadena de texto que sirve como buscador de un posible voto existente
     * en el HashMap de votos.
     * 
     * @return Voto; en caso de que exista un voto mapeado con el rut.
     *         null; en caso de que no existise un Voto asociado al rut.
     */
    public Voto obtenerVoto(String rut){
        if(votos.containsKey(rut))
            return votos.get(rut);
        return null;
    }
    
    /**
     * @actualizar
     * Función procedural que realiza una actualización en el atributo @cantDeVotos
     * correspondiente al tamaño de los pares "keys/values" del HashMap.
     */
    
    public void actualizar(){
        cantDeVotos = votos.size();
    }

    
    /**
     * @eliminarVoto
     * 
     * Función que eliminar un voto mapeado en caso de existir.
     * 
     * @param rut ; cadena de texto, correspondiente a un rut
     * @return true; en caso de que el rut haya sido eliminado exitosamente del HashMap.
     *         false; en caso de que no se haya eliminado un voto asociado a ese rut.
     */
    public boolean eliminarVoto(String rut) {
        if (votos.containsKey(rut)) {
            Voto voto = votos.get(rut);
            if (voto != null && voto.getIDConsulta() == this.id) {
                votos.remove(rut);
                actualizar();
                return true;
            }
        }
        return false;
}

    /**
     * @modificarVoto
     * Función que realiza un cambio en los atributos de un voto mapeado.
     * 
     * @param rutVotante ; rut del votante al que se le quiera realizar los cambios
     * @param veredictoNuevo ; nuevo veredicto del votante
     * @return true; en caso de que los cambios sean realizados.
     *         false; en caso de que no existe un votante asociado.
     */
    public boolean modificarVoto(String rutVotante, boolean veredictoNuevo){
        Voto votoModificar = votos.get(rutVotante);
        if(votoModificar != null){
            votoModificar.modificar(rutVotante, veredictoNuevo);
            votos.put(rutVotante, votoModificar);
            return true;
        } 
        return false;
    }
    
    /**
     * @listarVotos
     * Función que se usa exclusivamente para mostrar todos los votos de una consulta.
     * 
     * @return una colección de todos los voto del mapa.
     */
    public ArrayList<Voto> listarVotos(){

        ArrayList<Voto> listaVotos = new ArrayList();
        for(String ruts : votos.keySet())
           listaVotos.add(votos.get(ruts));
       return listaVotos;
    }
    
    /**
     * @listaDeVotosSegunVeredicto
     * Función que se usa exclusivamente para mostrar los votos de cierta consulta
     * bajo un cierto criterio
     * 
     * @param veredictoBuscado ; parámetro que me permite filtrar votos según si tienen 
     * ese veredicto.
     * 
     * @return una colección que corresponde a los votos que cumplan con el criterio.
     */
    public ArrayList<Voto> listaDeVotosSegunVeredicto(boolean veredictoBuscado){
        ArrayList<Voto> votosFiltrados = new ArrayList();
        
        for (Voto votoBusqueda : votos.values()){
            if(votoBusqueda.getVeredicto() == veredictoBuscado){
                votosFiltrados.add(votoBusqueda);
            }
        }
        return votosFiltrados;
    }   
}
