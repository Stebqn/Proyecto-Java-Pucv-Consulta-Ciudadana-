
package Excepciones;


public class MenorEdadException extends Exception {
    public MenorEdadException(){
        super("Menores de edad no pueden sufragar");
    }
}
