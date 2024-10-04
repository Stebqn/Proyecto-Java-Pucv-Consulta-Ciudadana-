
package Controllers;

import Excepciones.MenorEdadException;
import Excepciones.rutInvalidException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Consulta;
import modelos.Sistema;
import modelos.Voto;
import ventanas.ModificarVoto;
import ventanas.Principal;
import ventanas.TablaVotos;


public class controladorMenu implements ActionListener, MouseListener{
    
    DefaultTableModel tablaVoto = new DefaultTableModel();
    Principal view;
    Consulta consulta;
    Sistema system;
    DefaultTableModel modificarVoto = new DefaultTableModel();
    
    public controladorMenu(Principal view, Sistema system, Consulta consulta) {
        this.view = view;
        this.system = system;
        this.consulta = consulta;
        this.view.buttonBuscar.addActionListener(this);
        this.view.button_busquedaRUT.addMouseListener(this);
        this.view.btnModificar.addActionListener(this);
        this.view.btnEliminar.addMouseListener(this);
        this.view.btnAgregarVoto.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == view.buttonBuscar){
            
            try{
                int id = Integer.parseInt(view.idPrincipal.getText());
                System.out.println(id);
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
                
        }else if(e.getSource() == view.btnModificar){
            try{
                Consulta consultaBuscada = system.buscarConsulta(Integer.parseInt(view.idConsultaBuscada.getText()));
                if(consultaBuscada!=null){
                    Voto votoBuscado = consultaBuscada.obtenerVoto(view.rutVotanteG.getText());
                    if(votoBuscado !=null){
                        if(votoBuscado.getRut().equals(view.rutVotanteG.getText())){
                            ModificarVoto ventanaMod = new ModificarVoto();
                            ventanaMod.setVisible(true);
                        } 
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Consulta o Voto no existentes"); 
                }    
            }catch(NumberFormatException ee){
                JOptionPane.showMessageDialog(null, "Ingresa datos validos");
                return;
            }
        }
    }
    public void todo_voto(TablaVotos v){
        
        ArrayList<Voto> lista_pp = consulta.listarVotos();
        tablaVoto = (DefaultTableModel) v.tablaVotos.getModel();
        Object[] row = new Object[5];
        
        for(int i = 0; i < lista_pp.size(); i++){
            
            row[0] = lista_pp.get(i).getRut();
            if(lista_pp.get(i).getveredicto()){
                row[1] = "Apruebo";
            }else row[1] = "Rechazo";           
            tablaVoto.addRow(row);
        }      
    } 

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource() == view.button_busquedaRUT){
            Voto v = consulta.obtenerVoto(view.rutBusqueda.getText().trim());
            if(v != null){
                if(v.getveredicto()){
                    view.VeredictoBusqueda.setText("Apruebo");
                }else view.VeredictoBusqueda.setText("Rechazo");
            }           
        }else if(e.getSource() == view.btnEliminar){
            Consulta consultaBuscada = system.buscarConsulta(Integer.parseInt(view.idConsultaBuscada.getText()));
            if(consultaBuscada != null){
                if(consultaBuscada.eliminarVoto(view.rutVotanteG.getText()))
                    consultaBuscada.actualizar();
                    JOptionPane.showMessageDialog(null, "Voto eliminado con exito");
            }  
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
                        
                        if(view.veredictoVotoAgg.getText().equals("Apruebo")){
                            votoNuevo.setVeredicto(true);
                        }else if (view.veredictoVotoAgg.getText().equals("Rechazo")){
                            votoNuevo.setVeredicto(false);
                        }
                        
                        consultaBuscada.agregarVoto(votoNuevo);
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
