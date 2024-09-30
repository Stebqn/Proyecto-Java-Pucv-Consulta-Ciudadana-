/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *
 * @author Sebastián Castro
 */
public class RutException extends Exception {
    public RutException(){
        super("Rut invalido o inexistente.");
    }
}
