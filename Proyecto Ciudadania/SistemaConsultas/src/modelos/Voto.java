
package modelos;

public class Voto extends Persona{

    private boolean veredicto;
    private int IDconsulta;

    public int getIDConsulta() {
        return IDconsulta;
    }

    public void setIDConsulta(int consulta) {
        this.IDconsulta = consulta;
    }
    

    //========GETTER==============
    public Boolean getVeredicto() {
        return veredicto;
    }
    //==========SETTER===============\\
    public void setVeredicto(Boolean veredicto) {
        this.veredicto = veredicto;
    }
    //==========MÉTODOS===============\\
    
    
    
    //Sobrescritura
    public boolean modificar(String rut, boolean veredicto) {
        if (getRut().equals(rut)) {
            this.veredicto = veredicto;
            return true; 
        }
        return false; 
    }     

    

}
