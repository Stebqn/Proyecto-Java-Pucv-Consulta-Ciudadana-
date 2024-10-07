
package ventanas;

import Controllers.controladorMenu;
import modelos.Consulta;
import modelos.Sistema;



public class Principal extends javax.swing.JFrame {


    private Sistema system = new Sistema();
    public Principal() {
        initComponents();             
        this.setLocationRelativeTo(null);  
        controladorMenu ctr = new controladorMenu(this, system);
        
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
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JToggleButton();
        rutVotanteModificar = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        idModificar = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        newNombre = new javax.swing.JTextField();
        newEdad = new javax.swing.JTextField();
        newGenero = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        newVeredictoMod = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        idConsultaFiltrado = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        veredictoDeseado = new javax.swing.JTextField();
        btnMostrarFiltrado = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        button_reporte = new javax.swing.JButton();

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
        jLabel8.setText("Eliminar Voto");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Ingrese el RUT del votante :");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel7.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, -1, -1));

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
        jLabel16.setText("Ingrese el ID de la consulta y el RUT del votante a eliminar.");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

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

        jTabbedPane1.addTab("Eliminar Voto", jPanel6);

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
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));
        jPanel9.add(rutVotAgg, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 170, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Ingrese el veredicto del votante :");
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));
        jPanel9.add(veredictoVotoAgg, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 170, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel5.setText("Ejemplo : (Apruebo / Rechazo).");
        jPanel9.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        btnAgregarVoto.setText("Agregar");
        jPanel9.add(btnAgregarVoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel9.setText("Ejemplo : (123456789-0)");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

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
        jPanel9.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));
        jPanel9.add(edadVotoAgg, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 170, -1));

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

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel21.setText("Modificar Voto");
        jPanel11.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, 20));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setText("Ingrese el RUT del votante :");
        jPanel11.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });
        jPanel11.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, -1, -1));

        rutVotanteModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutVotanteModificarActionPerformed(evt);
            }
        });
        jPanel11.add(rutVotanteModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 140, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setText("ID consulta :");
        jPanel11.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 20));

        idModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idModificarActionPerformed(evt);
            }
        });
        jPanel11.add(idModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 140, 30));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setText("Ingrese el ID de la consulta y el RUT del votante a modificar.");
        jPanel11.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));
        jPanel11.add(newNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 170, 30));
        jPanel11.add(newEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 170, 30));
        jPanel11.add(newGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 170, 30));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel25.setText("Ejemplo : (123456789-0)");
        jPanel11.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setText("Nuevo nombre votante :");
        jPanel11.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setText("Nueva edad votante:");
        jPanel11.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setText("Nuevo genero votante :");
        jPanel11.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setText("Nuevo veredicto votante :");
        jPanel11.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        newVeredictoMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newVeredictoModActionPerformed(evt);
            }
        });
        jPanel11.add(newVeredictoMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 170, 30));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel30.setText("Ejemplo : (Apruebo / Rechazo).");
        jPanel11.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel31.setText("Ejemplo : Hombre/Mujer");
        jPanel11.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Modificar voto", jPanel10);

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel32.setText("Filtrado de Votos");
        jPanel13.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel33.setText("Ingrese la ID de la consulta :");
        jPanel13.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));
        jPanel13.add(idConsultaFiltrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 180, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel34.setText("Ingrese el veredicto deseado :");
        jPanel13.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));
        jPanel13.add(veredictoDeseado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 180, -1));

        btnMostrarFiltrado.setText("Mostrar");
        btnMostrarFiltrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarFiltradoActionPerformed(evt);
            }
        });
        jPanel13.add(btnMostrarFiltrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel35.setText("Ingrese el ID de la consulta y el veredicto deseado.");
        jPanel13.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jLabel36.setText("Ejemplo veredicto deseado :  Apruebo/Rechazo.");
        jPanel13.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        button_reporte.setText("Generar reporte");
        button_reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_reporteActionPerformed(evt);
            }
        });
        jPanel13.add(button_reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 140, 30));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Filtadro de Votos", jPanel12);

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

    private void nombreVotAggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreVotAggActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreVotAggActionPerformed

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarMouseClicked

    private void rutVotanteModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutVotanteModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutVotanteModificarActionPerformed

    private void idModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idModificarActionPerformed

    private void newVeredictoModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newVeredictoModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newVeredictoModActionPerformed

    private void btnMostrarFiltradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarFiltradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarFiltradoActionPerformed

    private void button_reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_reporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_reporteActionPerformed

    public Sistema getSystem() {
        return system;
    }
    
    
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
    public javax.swing.JButton btnMostrarFiltrado;
    public javax.swing.JButton buttonBuscar;
    public javax.swing.JButton button_busquedaRUT;
    public javax.swing.JButton button_reporte;
    public javax.swing.JTextField edadVotoAgg;
    public javax.swing.JTextField idConsultaAgg;
    public javax.swing.JTextField idConsultaBuscada;
    public javax.swing.JTextField idConsultaFiltrado;
    public javax.swing.JTextField idModificar;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTextField newEdad;
    public javax.swing.JTextField newGenero;
    public javax.swing.JTextField newNombre;
    public javax.swing.JTextField newVeredictoMod;
    public javax.swing.JTextField nombreVotAgg;
    public javax.swing.JTextField rutBusqueda;
    public javax.swing.JTextField rutVotAgg;
    public javax.swing.JTextField rutVotanteG;
    public javax.swing.JTextField rutVotanteModificar;
    public javax.swing.JTextField sexVotoAgg;
    public javax.swing.JTextField veredictoDeseado;
    public javax.swing.JTextField veredictoVotoAgg;
    // End of variables declaration//GEN-END:variables
}
