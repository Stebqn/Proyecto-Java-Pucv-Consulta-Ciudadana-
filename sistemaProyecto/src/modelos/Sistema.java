
package modelos;

import java.util.ArrayList;


public class Sistema {
    
    private ArrayList<Consulta> consultas = new ArrayList();
    
    public void agregarConsulta(Consulta consulta){
        
        consultas.add(consulta);
    }
    
    public boolean buscarConsultaPorId(int id){
        Consulta consulta;

        for(int i = 0; i < consultas.size(); i++){
            consulta = consultas.get(i);
            if(consulta.getId() == id)
                return true;
        }
        return false;    
    }
    
    public Consulta buscarConsulta(int id){
        Consulta consulta;

        for(int i = 0; i < consultas.size(); i++){
            consulta = consultas.get(i);
            if(consulta.getId() == id)
                return consulta;
        }
        return null;    
    }
    
}
