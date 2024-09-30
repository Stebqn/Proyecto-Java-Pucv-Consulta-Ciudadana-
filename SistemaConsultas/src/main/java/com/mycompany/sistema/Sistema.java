package com.mycompany.sistema;

import java.util.ArrayList;
import HUD.MenuPrincipal;

public class Sistema {
    private static ArrayList<Consulta> consultas;
    
    public static void main(String[] args) {
        consultas = new ArrayList<>();
        
        Consulta consulta1 = new Consulta(1, "Consulta San Felipe", "10/09/98");
        Consulta consulta2 = new Consulta(2, "Consulta San Joaquin", "10/09/98");
        consulta1.agregarVoto(1, "123456789-0", true);
        consulta1.agregarVoto(2, "987654321-0", false);
        consulta1.agregarVoto(3, "111111111-1", false);

        consulta2.agregarVoto(1, "111111222-0", true);
        consulta2.agregarVoto(2, "222111333-9", false);
        consultas.add(consulta1);
        consultas.add(consulta2);
        
        //verificarCantVotos();
        MenuPrincipal.iniciar();

    }

    public static Consulta buscarConsulta(int id){
        Consulta consulta;

        for(int i = 0; i < consultas.size(); i++){
            consulta = (Consulta) consultas.get(i);
            if(consulta.getId() == id)
                return consulta;
        }
        return null;    
    }
    
    
}
