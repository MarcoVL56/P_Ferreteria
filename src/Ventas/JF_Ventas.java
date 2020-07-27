
package Ventas;

import Menú.JF_Menú;


public class JF_Ventas extends javax.swing.JFrame {

   
    public JF_Ventas() {
        initComponents();
            setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnSubMenu = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JLabel();
        BtnMinimizar = new javax.swing.JLabel();
        PanelMenuV = new javax.swing.JPanel();
        BtnFiltrarFactura = new rsbuttom.RSButtonMetro();
        BtnRegistrarCliente = new rsbuttom.RSButtonMetro();
        BtnProforma = new rsbuttom.RSButtonMetro();
        BtnVentas = new rsbuttom.RSButtonMetro();
        btnMenú = new rsbuttom.RSButtonMetro();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDatos1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnAplicarDescuento = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 255));

        btnSubMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Menu_35px_2.png"))); // NOI18N
        btnSubMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubMenuMouseClicked(evt);
            }
        });

        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-cerrar-ventana-48.png"))); // NOI18N
        BtnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSalirMouseClicked(evt);
            }
        });

        BtnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-minimizar-la-ventana-48 (1).png"))); // NOI18N
        BtnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnMinimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnSubMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1235, Short.MAX_VALUE)
                .addComponent(BtnMinimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnSalir))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSubMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(BtnSalir)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(BtnMinimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 50));

        PanelMenuV.setBackground(new java.awt.Color(204, 204, 204));
        PanelMenuV.setForeground(new java.awt.Color(255, 255, 255));
        PanelMenuV.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnFiltrarFactura.setBackground(new java.awt.Color(153, 153, 153));
        BtnFiltrarFactura.setText("Filtrar factura");
        BtnFiltrarFactura.setColorHover(new java.awt.Color(0, 102, 255));
        BtnFiltrarFactura.setColorNormal(new java.awt.Color(153, 153, 153));
        PanelMenuV.add(BtnFiltrarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        BtnRegistrarCliente.setBackground(new java.awt.Color(153, 153, 153));
        BtnRegistrarCliente.setText("Registrar Cliente");
        BtnRegistrarCliente.setColorHover(new java.awt.Color(0, 102, 255));
        BtnRegistrarCliente.setColorNormal(new java.awt.Color(153, 153, 153));
        PanelMenuV.add(BtnRegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        BtnProforma.setBackground(new java.awt.Color(153, 153, 153));
        BtnProforma.setText("Profromas");
        BtnProforma.setColorHover(new java.awt.Color(0, 102, 255));
        BtnProforma.setColorNormal(new java.awt.Color(153, 153, 153));
        PanelMenuV.add(BtnProforma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        BtnVentas.setBackground(new java.awt.Color(153, 153, 153));
        BtnVentas.setText("Ventas");
        BtnVentas.setColorHover(new java.awt.Color(0, 102, 255));
        BtnVentas.setColorNormal(new java.awt.Color(153, 153, 153));
        PanelMenuV.add(BtnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        btnMenú.setBackground(new java.awt.Color(255, 51, 51));
        btnMenú.setText("Menú");
        btnMenú.setColorHover(new java.awt.Color(255, 51, 51));
        btnMenú.setColorNormal(new java.awt.Color(255, 51, 51));
        btnMenú.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenúMouseClicked(evt);
            }
        });
        PanelMenuV.add(btnMenú, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 150, 30));

        jPanel1.add(PanelMenuV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 190, 660));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        jLabel14.setText("Montos");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 440, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 180, 30));

        jLabel1.setText("Nombre del producto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        jButton1.setText("Buscar");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 180, -1));

        tbDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbDatos.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tbDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, 520, 190));

        jLabel2.setText("Productos en inventario ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        jLabel3.setText("Productos seleccionados");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 90, -1, -1));

        tbDatos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbDatos1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tbDatos1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 550, 310));

        jButton2.setText("Guardar como proforma");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 570, 220, 30));

        jButton3.setText("Pagar ");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 630, 220, 30));

        jButton4.setText("Ver total a pagar ");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 310, 520, -1));

        jPanel4.setBackground(new java.awt.Color(0, 102, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SubTotal");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Impuesto");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 80, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Descuento");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 128, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total a pagar ");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 86, -1));
        jPanel4.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 86, -1));
        jPanel4.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 86, -1));
        jPanel4.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 86, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 350, 220, 210));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        jLabel15.setText("Catálogo de productos");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        btnAplicarDescuento.setText("Aplicar un nuevo descuento ");
        btnAplicarDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarDescuentoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAplicarDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 570, 230, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "21", "22", "23", "24", "25" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 600, 150, -1));

        jLabel8.setText("Porcentaje ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 600, -1, -1));

        jLabel9.setText("Es necesario un usuario administrador");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 660, -1, -1));

        jLabel11.setText("Cédula");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, -1, -1));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 200, 30));

        jButton5.setText("Verificar");
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 200, -1));

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

    private void btnSubMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubMenuMouseClicked
        int posicion = PanelMenuV.getX();
        if (posicion > -1) {
            Animacion.Animacion.mover_izquierda(0, -264, 2, 2, PanelMenuV);
        } else {
            Animacion.Animacion.mover_derecha(-264, 0, 2, 2, PanelMenuV);
        }
    }//GEN-LAST:event_btnSubMenuMouseClicked

    private void BtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseClicked
          System.exit(0);
    }//GEN-LAST:event_BtnSalirMouseClicked

    private void BtnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMinimizarMouseClicked
         this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_BtnMinimizarMouseClicked

    private void btnMenúMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenúMouseClicked
        JF_Menú m = new JF_Menú();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenúMouseClicked

    private void btnAplicarDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarDescuentoActionPerformed
       JF_Permiso m = new JF_Permiso();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAplicarDescuentoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JF_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro BtnFiltrarFactura;
    private javax.swing.JLabel BtnMinimizar;
    private rsbuttom.RSButtonMetro BtnProforma;
    private rsbuttom.RSButtonMetro BtnRegistrarCliente;
    private javax.swing.JLabel BtnSalir;
    private rsbuttom.RSButtonMetro BtnVentas;
    private javax.swing.JPanel PanelMenuV;
    private javax.swing.JButton btnAplicarDescuento;
    private rsbuttom.RSButtonMetro btnMenú;
    private javax.swing.JLabel btnSubMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTable tbDatos;
    private javax.swing.JTable tbDatos1;
    // End of variables declaration//GEN-END:variables
}
