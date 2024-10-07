
package Excepciones;


public class rutInvalidException extends Exception {
    public rutInvalidException (){
        super("El Rut ingresado es invalido");
    }
}
