import java.lang.*;

public class Ciudadano {

    private String nombre;
    private String rut;
    private int edad;
    private Boolean mayorDeEdad;

    
    
    
    
    
    //==========GETTER==============
    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public int getEdad() {
        return edad;
    }

    public Boolean getMayorDeEdad() {
        return mayorDeEdad;
    }

    //==========SETTER===============
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setMayorDeEdad(Boolean mayorDeEdad) {
        this.mayorDeEdad = mayorDeEdad;
    }
}
