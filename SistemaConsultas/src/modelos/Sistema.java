
package modelos;

import Excepciones.MenorEdadException;
import Excepciones.rutInvalidException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase principal que simula el sistema del programa.
 */

public class Sistema {
    
    private ArrayList<Consulta> consultas = new ArrayList();
    private String csv = "src/Datos/bd.csv";
    private String csvVoto = "src/Datos/bdVotos.csv";

    public Sistema() {
        cargarCSV();
        cargarCSVotos();
    }
    
    
    public void agregarConsulta(Consulta consulta){
        consultas.add(consulta);
    }
    
    
    /**
     * @buscarConsultaPorId
     * 
     * @param id ; parámetro que permite buscar un objeto Consulta dentro del
     * ArrayList.
     * 
     * @return true; en caso de encuentre un objeto Consulta asociado al id
     *         false; en caso de que no encuentre un objeto asociado a ese id
     */
    public boolean buscarConsultaPorId(int id){
        Consulta consulta;
        for(int i = 0; i < consultas.size(); i++){
            consulta = consultas.get(i);
            if(consulta.getId() == id)
                return true;
        }
        return false;    
    }
    
    /**
     * @buscarConsulta
     * Función que busca un objeto Consulta en el ArrayList y lo retorna.
     * 
     * @param id ; id que permite buscar la consulta en el ArrayList.
     * 
     * @return Consulta; en caso de que exista un objeto que tenga asociada esa id.
     *         null; en caso de que no exista un objeto Consulta asociado a ese id.
     */
    public Consulta buscarConsulta(int id){
        Consulta consulta;
        for(int i = 0; i < consultas.size(); i++){
            consulta = consultas.get(i);
            if(consulta.getId() == id)
                return consulta;
        }
        return null;    
    }
    
    /**
     * @cargarCSV
     * 
     * Función procedural que permite cargar los datos de Consultas de un Archivo csv.
     */
    public void cargarCSV(){
        
        try (BufferedReader ll = new BufferedReader(new FileReader(csv))) {
            String siguienteLinea;
            Consulta consulta = new Consulta();
            while ((siguienteLinea = ll.readLine()) != null) {
                String[] datos = siguienteLinea.split(",");
                consulta.setId(Integer.parseInt(datos[0]));
                consulta.setNombre(datos[1]);
                consulta.setFecha(datos[2]);
                consulta.setCantDeVotos(Integer.parseInt(datos[3]));
                consultas.add(consulta);
                consulta = new Consulta();  
            }    
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * @meterVoto
     * Función que ingresa los datos del archivo CSV a las consultas que correspondan. 
     */
    public void meterVoto(Voto voto){
        for(Consulta consulta : consultas){
            
            if(consulta.getId() == voto.getIDConsulta()){
                consulta.agregarVoto(voto);
            }
        }
    }
    /**
     * @cargarCSVotos
     * Función procedural que permite cargar los datos de Votos de un Archivo csv.
     */
    public void cargarCSVotos(){
        
        try (BufferedReader ll = new BufferedReader(new FileReader(csvVoto))) {
            String siguienteLinea;
            Voto voto = new Voto();
            while ((siguienteLinea = ll.readLine()) != null) {
                String[] datos = siguienteLinea.split(",");
                voto.setNombre(datos[0]);
                voto.setEdad(Integer.parseInt(datos[1]));
                voto.setRut(datos[2]);
                voto.setGenero(datos[3]);
                if(datos[4].equals("True")) voto.setVeredicto(true);
                else voto.setVeredicto(false);
                voto.setIDConsulta(Integer.parseInt(datos[5]));
                meterVoto(voto);
                voto = new Voto();
                
            }    
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MenorEdadException ex) {
            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
        } catch (rutInvalidException ex) {
            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * @reporte
     * Función que permite realizar un reporte en el apartado de FiltrarVotos.
     */
    public void reporte(ArrayList<Voto> votos){
        String reporte = "src/Datos/reporte.csv";
        try (BufferedWriter e = new BufferedWriter(new FileWriter(reporte))) {
                for (Voto v : votos) {
                    String tString = v.getRut() + "," + v.getNombre() + "," + v.getVeredicto();
                    
                    e.write(tString);
                    e.newLine(); 
                }
            } catch (IOException e) {}
    }
    
    
    /**
     * @actualizarCSVVotos
     * Función que actualiza el archivo CSV de votos según la información que del 
     * programa actual.
     */
    public void actualizarCSVVotos() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(csvVoto))) {
            for (Consulta consulta : consultas) {
                List<Voto> votos = consulta.listarVotos();
                for (Voto voto : votos) {
                    // Prepara la línea a escribir sin comillas
                    String linea = String.format("%s,%d,%s,%s,%b,%d",
                        voto.getNombre(),
                        voto.getEdad(),
                        voto.getRut(),
                        voto.getGenero(),
                        voto.getVeredicto(),
                        voto.getIDConsulta()
                    );
                    writer.write(linea);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo CSV de votos: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
