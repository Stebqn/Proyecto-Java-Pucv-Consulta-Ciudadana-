/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema;

import Excepciones.MenorEdadException;


/**
 *
 * @author los 3
 */
public class Persona extends Voto {
    private int edad;
    private String nombre;
    private int genero; // (1) Mujer, (2) Hombre
    
    public Persona(int id, String rut, boolean veredicto,int edad, String nombre) {
        super(id, rut, veredicto);
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws MenorEdadException {
        if(edad >= 18)
            this.edad = edad;
        else
            throw new MenorEdadException();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public boolean modificar(){
        
    }
    
}
