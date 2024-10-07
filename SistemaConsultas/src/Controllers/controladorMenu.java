
package Controllers;

import Excepciones.MenorEdadException;
import Excepciones.rutInvalidException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Consulta;
import modelos.Sistema;
import modelos.Voto;
import ventanas.Principal;
import ventanas.TablaVotos;
import ventanas.MostrarVotosFiltrados;


public class controladorMenu implements ActionListener, MouseListener{
    
    DefaultTableModel tablaVoto = new DefaultTableModel();
    Principal view;
    Consulta consulta = new Consulta();
    Sistema system;
    DefaultTableModel tablaVotosFiltrados = new DefaultTableModel();
    
    public controladorMenu(Principal view, Sistema system) {
        this.view = view;
        this.system = system;
        this.view.buttonBuscar.addActionListener(this);
        this.view.button_busquedaRUT.addMouseListener(this);
        this.view.btnModificar.addActionListener(this);
        this.view.btnEliminar.addMouseListener(this);
        this.view.btnAgregarVoto.addMouseListener(this);
        this.view.btnMostrarFiltrado.addActionListener(this);
        this.view.button_reporte.addActionListener(this);
    }

    @Override
    /**
     * Función que determina que acción realizar al hacer un "click" en cierto boton
     */
    public void actionPerformed(ActionEvent e) {
        //Si viene del boton buscar (Menu Principal)
        if(e.getSource() == view.buttonBuscar){
            
            try{
                int id = Integer.parseInt(view.idPrincipal.getText());
                if(system.buscarConsultaPorId(id)){

                    TablaVotos ventana = new TablaVotos();
                    ventana.setVisible(true);
                    todo_voto(ventana);
                }else{
                    JOptionPane.showMessageDialog(null, "El id no existe");              
                }
            }catch(NumberFormatException ee){
                JOptionPane.showMessageDialog(null, "Ingresa un caracter valido");
                return;
            }     
        //SI viene del boton modificar (Modificar Voto)       
        }else if(e.getSource() == view.btnModificar){
            try{
                Consulta consultaBuscada = system.buscarConsulta(Integer.parseInt(view.idModificar.getText()));
                if(consultaBuscada!=null){
                    Voto votoBuscado = consultaBuscada.obtenerVoto(view.rutVotanteModificar.getText());
                    if(votoBuscado !=null){ 
                        
                            votoBuscado.setNombre(view.newNombre.getText());
                            try{
                                votoBuscado.setEdad(Integer.parseInt(view.newEdad.getText()));
                            }catch(MenorEdadException ee){JOptionPane.showMessageDialog(null, "La edad no puede ser menor a 18"); return;}
                            votoBuscado.setGenero(view.newGenero.getText());
                            
                            if(view.newVeredictoMod.getText().equals("Apruebo")){
                                votoBuscado.setVeredicto(true);
                            }else if(view.newVeredictoMod.getText().equals("Rechazo")){
                                votoBuscado.setVeredicto(false);
                            }
                            votoBuscado.setIDConsulta(Integer.parseInt(view.idModificar.getText()));
                            system.actualizarCSVVotos();
                            JOptionPane.showMessageDialog(null, "Se han modificado los campos");
                            
                    }else JOptionPane.showMessageDialog(null, "La persona no existe");
                }else{
                    JOptionPane.showMessageDialog(null, "Consulta o Voto no existentes"); 
                }    
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Los datos ingresados no son validos"); 
                return;
            }
        // Si viene del boton mostrar (Apartado Filtrado de Votos)
        }else if(e.getSource() == view.btnMostrarFiltrado){
            
            try{
                int id = Integer.parseInt(view.idConsultaFiltrado.getText());
                boolean veredictoDeseado = true;
                if(system.buscarConsultaPorId(id)){
                    
                    
                    
                    if(view.veredictoDeseado.getText().equals("Apruebo")){
                        veredictoDeseado = true;
                        MostrarVotosFiltrados tabla = new MostrarVotosFiltrados();
                        tabla.setVisible(true);
                        votosFiltrados(tabla,veredictoDeseado);
                    }else if (view.veredictoDeseado.getText().equals("Rechazo")){
                        veredictoDeseado = false;
                        MostrarVotosFiltrados tabla = new MostrarVotosFiltrados();
                        tabla.setVisible(true);
                        votosFiltrados(tabla,veredictoDeseado);
                    }  
                }else{
                    JOptionPane.showMessageDialog(null, "El id no existe"); 
                }
            }catch(NumberFormatException ee){
                JOptionPane.showMessageDialog(null, "Ingresa un caracter valido");
                return;
            } 
        //Si viene del boton Generar Reporte (Apartado Filtrado de Votos)
        }else if(e.getSource() == view.button_reporte){
            
            if(view.veredictoDeseado.getText().equals("Apruebo")){
                system.reporte(consulta.listaDeVotosSegunVeredicto(true));
            }else{
                
                system.reporte(consulta.listaDeVotosSegunVeredicto(false));
            }
        }
    }
    /**
     * Función que ejecuta el relledo de datos a la ventana que muestra los votos 
     * de determinada id.
     * 
     * @param v ; Tabla de votos que será la ventana que se lanzará a hacer click 
     * en el boton "buscar" del apartado Menu Principal.
     */
    public void todo_voto(TablaVotos v){
        int id = Integer.parseInt(view.idPrincipal.getText());
        consulta = system.buscarConsulta(id);
        ArrayList<Voto> lista_pp = consulta.listarVotos();
        tablaVoto = (DefaultTableModel) v.tablaVotos.getModel();
        Object[] row = new Object[5];
        
        for(int i = 0; i < lista_pp.size(); i++){
            
            row[0] = lista_pp.get(i).getNombre();
            row[1] = lista_pp.get(i).getRut();
            if(lista_pp.get(i).getVeredicto()){
                row[2] = "Apruebo";
            }else row[2] = "Rechazo"; 
            row[3] = lista_pp.get(i).getEdad();
            tablaVoto.addRow(row);
        }      
    } 
    
    /**
     * Función que retornauna colección que se mostrará en la ventana 
     * de MostrarVotosFiltrador.
     */
    public ArrayList<Voto> votosFiltrados(MostrarVotosFiltrados tabla, boolean veredictoDeseado){
        ArrayList<Voto> listaVotFilt = consulta.listaDeVotosSegunVeredicto(veredictoDeseado);
        
        tablaVotosFiltrados = (DefaultTableModel) tabla.jTable1.getModel();
        Object[] lista = new Object[5];
        
        for(int i = 0; i < listaVotFilt.size(); i++){
            
            lista[0] = listaVotFilt.get(i).getNombre();
            lista[1] = listaVotFilt.get(i).getRut();
            if(listaVotFilt.get(i).getVeredicto()){
                lista[2] = "Apruebo";
            }else if(listaVotFilt.get(i).getVeredicto() ==  false){
                lista[2] = "Rechazo";
            }
            tablaVotosFiltrados.addRow(lista);
        }
        return listaVotFilt;     
    }
    

    @Override
    /**
     * Función de evento
     */
    public void mouseClicked(MouseEvent e) {
        //Si viene del boton buscar (Apartado Buscar Voto)
        if(e.getSource() == view.button_busquedaRUT){
            Voto v = consulta.obtenerVoto(view.rutBusqueda.getText().trim());
            if(v != null){
                if(v.getVeredicto()){
                    view.VeredictoBusqueda.setText("Apruebo");
                }else view.VeredictoBusqueda.setText("Rechazo");
            } 
        //Si viene del boton Eliminar (Apartado Eliminar Voto)
        }else if(e.getSource() == view.btnEliminar){
            Consulta consultaBuscada = system.buscarConsulta(Integer.parseInt(view.idConsultaBuscada.getText()));
            if(consultaBuscada != null){
                if(consultaBuscada.eliminarVoto(view.rutVotanteG.getText()))
                    system.actualizarCSVVotos();
                    consultaBuscada.actualizar();
                    JOptionPane.showMessageDialog(null, "Voto eliminado con exito");
            }
        //Si viene del boton Agregar (Apartado Agrega Votos)
        }else if(e.getSource() == view.btnAgregarVoto){
            int id = Integer.parseInt(view.idConsultaAgg.getText().trim());
            Consulta consultaBuscada = system.buscarConsulta(id);
            if(consultaBuscada != null){
                Voto votoBuscado = consulta.obtenerVoto(view.rutVotAgg.getText());
                if(votoBuscado == null){
                    try {
                        Voto votoNuevo = new Voto ();
                        votoNuevo.setRut(view.rutVotAgg.getText());
                        votoNuevo.setNombre(view.nombreVotAgg.getText());
                        int edad = Integer.parseInt(view.edadVotoAgg.getText());
                        votoNuevo.setEdad(edad);
                        votoNuevo.setGenero(view.sexVotoAgg.getText());
                        votoNuevo.setIDConsulta(Integer.parseInt(view.idConsultaAgg.getText()));
                        
                        if(view.veredictoVotoAgg.getText().equals("Apruebo")){
                            votoNuevo.setVeredicto(true);
                        }else if (view.veredictoVotoAgg.getText().equals("Rechazo")){
                            votoNuevo.setVeredicto(false);
                        }
                        
                        consultaBuscada.agregarVoto(votoNuevo);
                        system.actualizarCSVVotos();
                        JOptionPane.showMessageDialog(null, "Voto agregado correctamente");
                    } catch (rutInvalidException ex) {
                        JOptionPane.showMessageDialog(null, "Ingresa un rut valido");
                    } catch (MenorEdadException ex) {
                        JOptionPane.showMessageDialog(null, "Menor de edad no puede votar");
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Voto ya ha sido agregado");
                }
            }
        }
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
