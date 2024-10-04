
package ventanas;

import Controllers.controladorMenu;
import Excepciones.rutInvalidException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Consulta;
import modelos.Sistema;
import modelos.Voto;


public class Principal extends javax.swing.JFrame {

    Consulta consulta = new Consulta();
    Sistema system = new Sistema();
    public Principal() {
        initComponents();             
        this.setLocationRelativeTo(null);  
        
        Consulta consulta1 = new Consulta();
        consulta1.setId(1);
        consulta1.setFecha("10/09/98");
        consulta1.setNombre("Consulta San Felipe");
        system.agregarConsulta(consulta1);
        
        Voto voto1 = new Voto();
        
        try {
            voto1.setRut("21825087-4");
        } catch (rutInvalidException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        voto1.setVeredicto(true);
        consulta1.agregarVoto(voto1);
        
        Voto voto2 = new Voto();
        
        try {
            voto2.setRut("21772576-3");
        } catch (rutInvalidException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        voto2.setVeredicto(false);
        consulta1.agregarVoto(voto2);
        
        controladorMenu ctr = new controladorMenu(this, system, consulta1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idPrincipal = new javax.swing.JTextField();
        buttonBuscar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rutBusqueda = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        VeredictoBusqueda = new javax.swing.JTextField();
        button_busquedaRUT = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JToggleButton();
        btnModificar = new javax.swing.JToggleButton();
        rutVotanteG = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        idConsultaBuscada = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        idConsultaAgg = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        rutVotAgg = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        veredictoVotoAgg = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAgregarVoto = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        nombreVotAgg = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        edadVotoAgg = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        sexVotoAgg = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenido al menu de Consultas");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ID :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        idPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPrincipalActionPerformed(evt);
            }
        });
        jPanel3.add(idPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 130, -1));

        buttonBuscar.setText("Buscar");
        jPanel3.add(buttonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Ingrese el id de su consulta para mostrar su informacion ");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Menu Principal", jPanel2);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Busqueda de Voto y Veredicto");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jLabel4.setText("Ingresa el rut :");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));
        jPanel5.add(rutBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 130, -1));

        jLabel6.setText("Resultado :");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));
        jPanel5.add(VeredictoBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 90, -1));

        button_busquedaRUT.setText("Buscar");
        jPanel5.add(button_busquedaRUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 80, 20));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Buscar voto", jPanel4);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Gestion de voto");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Ingrese el RUT del votante :");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel7.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });
        jPanel7.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, -1, -1));

        rutVotanteG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutVotanteGActionPerformed(evt);
            }
        });
        jPanel7.add(rutVotanteG, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 170, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("ID consulta :");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, 20));
        jPanel7.add(idConsultaBuscada, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 170, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Ingrese el ID de la consulta y el RUT del votante a gestionar.");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Gestionar Voto", jPanel6);

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setText("Agregar Votos");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        idConsultaAgg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idConsultaAggActionPerformed(evt);
            }
        });
        jPanel9.add(idConsultaAgg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 170, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Ingrese ID de la consulta: ");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Ingrese el RUT del Votante :");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));
        jPanel9.add(rutVotAgg, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 170, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Ingrese el veredicto del votante :");
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, -1));
        jPanel9.add(veredictoVotoAgg, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 170, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel5.setText("Ejemplo : (Apruebo / Rechazo).");
        jPanel9.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        btnAgregarVoto.setText("Agregar");
        jPanel9.add(btnAgregarVoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel9.setText("Ejemplo : (123456789-0)");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        nombreVotAgg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreVotAggActionPerformed(evt);
            }
        });
        jPanel9.add(nombreVotAgg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 170, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Ingrese el nombre del votante :");
        jPanel9.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Ingrese la edad del votante :");
        jPanel9.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));
        jPanel9.add(edadVotoAgg, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 170, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Ingrese el Sexo del votante :");
        jPanel9.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));
        jPanel9.add(sexVotoAgg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 170, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel20.setText("Ejemplo : Hombre/Mujer");
        jPanel9.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Agregar Votos", jPanel8);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPrincipalActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void idConsultaAggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idConsultaAggActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idConsultaAggActionPerformed

    private void rutVotanteGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutVotanteGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutVotanteGActionPerformed

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarMouseClicked

    private void nombreVotAggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreVotAggActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreVotAggActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField VeredictoBusqueda;
    public javax.swing.JButton btnAgregarVoto;
    public javax.swing.JToggleButton btnEliminar;
    public javax.swing.JToggleButton btnModificar;
    public javax.swing.JButton buttonBuscar;
    public javax.swing.JButton button_busquedaRUT;
    public javax.swing.JTextField edadVotoAgg;
    public javax.swing.JTextField idConsultaAgg;
    public javax.swing.JTextField idConsultaBuscada;
    public javax.swing.JTextField idPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTextField nombreVotAgg;
    public javax.swing.JTextField rutBusqueda;
    public javax.swing.JTextField rutVotAgg;
    public javax.swing.JTextField rutVotanteG;
    public javax.swing.JTextField sexVotoAgg;
    public javax.swing.JTextField veredictoVotoAgg;
    // End of variables declaration//GEN-END:variables
}
