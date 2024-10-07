package modelos;

import Excepciones.MenorEdadException;
import Excepciones.rutInvalidException;

public class Persona{
    private String nombre;
    private int edad;
    private String rut;
    private String genero;
    
    //============GETTER============
    public String getRut() {
        return rut;
    }
    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    
    //================SETTER==========
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public void setEdad(int edad) throws MenorEdadException {
        if(edad >= 18)
            this.edad = edad;
        else
            throw new MenorEdadException();
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 
    
    public void setRut(String rut) throws rutInvalidException {
        if (rut.length() == 10 || rut.length() == 9){
            if (verificarRut(rut)){
                this.rut = rut;
            }else{
                throw new rutInvalidException();
            } 
        }else{
            throw new rutInvalidException();
        }
    }
    
    //=================METODOS================
    
    public boolean verificarRut(String rut){
        String rutLimpio = rut.replace("-", "");
        String numeroRUT = rutLimpio.substring(0, rutLimpio.length() - 1);
        char dvIngresado = rutLimpio.charAt(rutLimpio.length() - 1);

        char dvCalculado = calcularDigitoVerificador(numeroRUT);

        return dvIngresado == dvCalculado;
    }

    public char calcularDigitoVerificador(String rut) {
        int suma = 0;
        int multiplicador = 2;
        int rutNum = Integer.parseInt(rut);
       
        for (int i = rut.length() - 1; i >= 0; i--) {
            suma += Character.getNumericValue(rut.charAt(i)) * multiplicador;
            multiplicador++;
            if (multiplicador > 7) {
                multiplicador = 2; 
            }
        }

        int resto = suma % 11;
        int dv = 11 - resto;

        if (dv == 11) {
            return '0'; 
        } else if (dv == 10) {
            return 'K'; 
        } else {
            return (char) (dv + '0'); 
        }

    }
    
    public boolean modificar (String nombre, String rut, int edad ,String genero){
        if(this.rut.equals(rut)){
            this.nombre = nombre;
            this.edad = edad;
            this.genero = genero;
            return true;
        }
        return false;
    }
}
