/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author a
 */
public class MenorEdadException extends Exception {
    public MenorEdadException(){
        super("Menores de edad no pueden sufragar");
    }
}
