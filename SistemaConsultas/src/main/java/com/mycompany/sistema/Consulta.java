package com.mycompany.sistema;

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

    public Voto getVoto(String key) {
        return votos.get(key);
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

    public boolean agregarVoto(int id, String rut, boolean veredicto){
        Voto nuevoVoto = new Voto(id,rut,veredicto);
        return verificarVoto(nuevoVoto);
    }
    
    public Voto obtenerVoto(int idVoto) {
        for (String rut : votos.keySet()) {
            Voto voto = votos.get(rut);
            if (voto.getId() == idVoto) 
                return voto;  // Retorna el voto si el id coincide
        }
        return null;  // Retorna null si no se encuentra el voto
    }

    /**
     * 
     * @param rut
     * @return 
     */
    public Voto obtenerVoto(String rut){
        if(votos.containsKey(rut))
            return votos.get(rut);
        return null;
    }

    public void actualizar(){
        cantDeVotos = votos.size();
    }
    /**Método eliminarVoto
     * Se buscará un voto en particular en el HashMap para su posterior 
     * eliminación en caso de existir. 
     * 
     * @param rut 
     * String que servirá para acceder al valor contenido con esa llave en el 
     * mapa en caso de existir.
     * 
     * @return 
     * true en caso de exista de que tal llave (rut) y su valor asociado sean
     * eliminados exitosamente.
     * false en caso de que tal llave (rut) no exista como llave en el HashMap.
     * 
     * 
     */
    public boolean eliminarVoto(String rut){
        if(votos.containsKey(rut)){
            votos.remove(rut);
            actualizar();
            return true;
        }
        return false;
    }

    /**
     * 
     * @param idNuevo
     * @param rutVotante
     * @param veredictoNuevo
     * 
     * @return 
     * true en caso de que exista rutVotante en el HashMap y sea modificado exitosante
     * 
     * 
     */
    public boolean modificarVoto(int idNuevo, String rutVotante, boolean veredictoNuevo){
        if(votos.get(rutVotante) != null){
            Voto votoModificar = votos.get(rutVotante);
            
            votoModificar.setId(idNuevo);
            votoModificar.setveredicto(veredictoNuevo);
            votos.put(rutVotante, votoModificar);
            return true;
        } 
        return false;
    }
}

