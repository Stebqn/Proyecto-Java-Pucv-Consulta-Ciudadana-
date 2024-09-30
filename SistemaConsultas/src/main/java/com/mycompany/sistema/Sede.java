/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema;

/**
 *
 * @author a
 */
public class Sede extends Consulta {
    private int identificador;
    private String localizacion;

    public Sede(int idConsulta, int idSede, String nombre, String fecha, String localizacion) {
        super(idConsulta, nombre, fecha);
        this.identificador = idSede;
        this.localizacion = localizacion;
    }
    
            

}
