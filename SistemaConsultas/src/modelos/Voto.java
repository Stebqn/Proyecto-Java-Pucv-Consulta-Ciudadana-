
package modelos;
/**
 * Clase que hereda de Persona.
 * Esta clase esta pensada para ser un objeto que simule a una persona que ya haya
 * realizado el voto.
 */

public class Voto extends Persona{

    private boolean veredicto;
    private int IDconsulta;

    //========GETTERS==============\\
    
    public Boolean getVeredicto() {
        return veredicto;
    }    
    
    public int getIDConsulta() {
        return IDconsulta;
    }
    
    //==========SETTERS===============\\
    
    public void setVeredicto(Boolean veredicto) {
        this.veredicto = veredicto;
    }    
    
    public void setIDConsulta(int consulta) {
        this.IDconsulta = consulta;
    }
    //==========MÉTODOS===============\\

    
    /**
     * @modificar
     * Función que sobreescribe de Persona.java.
     * Primeramente se verifica que el rut igresado corresponda con el del objeto,
     * en caso de coincidir, se realiza un cambio en el veredicto del objeto.
     * 
     * @param rut ; cadena de texto que corresponde
     * @param veredicto ; parámetro que corresponde al nuevo veredicto(o mismo)
     * que se quiera settear.
     * 
     * @return true; en caso de que el rut ingresado coincida con el del objeto.
     *         false; en caso de el rut ingresado no coincida con el de objeto.
     */
    public boolean modificar(String rut, boolean veredicto) {
        if (getRut().equals(rut)) {
            this.veredicto = veredicto;
            return true; 
        }
        return false; 
    }     

    

}
