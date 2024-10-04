
package modelos;

public class Voto extends Persona{

    private boolean veredicto;
    

    //========GETTER==============
    public Boolean getveredicto() {
        return veredicto;
    }
    //==========SETTER===============\\
    public void setVeredicto(Boolean veredicto) {
        this.veredicto = veredicto;
    }
    //==========MÉTODOS===============\\

    public boolean modificar(String rut , boolean veredicto){
       if(getRut().equals(rut)){
           this.veredicto = veredicto;
          return true; 
       }
       return false; 
    }        
}
