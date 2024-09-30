package com.mycompany.sistema;
import java.util.Scanner;


public class Voto {

    private int id;
    private String rut;
    private boolean veredicto;
    //========BUILDER==============\\
    public Voto (int id, String rut, boolean veredicto){
        this.id = id;
        this.rut = rut;
        this.veredicto = veredicto;
    }

    //========GETTER==============
    public int getId() {
        return id;
    }
    public String getRut() {
        return rut;
    }
    public Boolean getveredicto() {
        return veredicto;
    }
    //==========SETTER===============\\
    public void setRut(String rut) {
        this.rut = rut;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setveredicto(Boolean veredicto) {
        this.veredicto = veredicto;
    }
    //==========MÉTODOS===============\\


    public boolean modificar(int id , String rut , boolean veredicto){
        this.id=id;
        this.rut=rut;
        this.veredicto = veredicto;
        return true;
    }        
}
