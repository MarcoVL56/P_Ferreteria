package MenúSimple;

import Factura.JF_FiltroFactura;
import Inventario.JF_Inventario;
import Login.JF_Login;
import Proformas.JF_Proformas;

import RegistrarEmpleado.JF_RegistrarCliente;
import RegistrarUsuario.JF_RegistrarUsuario;
import ReporteProducto.JF_ReporteProducto;

import Ventas.JF_Ventas;
import javax.swing.JOptionPane;

public class JF_MenúSimple extends javax.swing.JFrame {

    public JF_MenúSimple() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnReporteProductos = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnProformas = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnFiltroFacturas = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnInventario = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnVentas = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnRUsuario = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnRCliente = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PanelMenuI = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuarioIniciado = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        BtnMenu = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSubMenu = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JLabel();
        BtnMinimizar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReporteProductos.setBackground(new java.awt.Color(0, 102, 255));
        btnReporteProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReporteProductosMouseClicked(evt);
            }
        });
        btnReporteProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel11.setText("Reporte de productos");
        btnReporteProductos.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 190, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-producto-nuevo-80.png"))); // NOI18N
        btnReporteProductos.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 90, 90));

        jPanel1.add(btnReporteProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 690, 140));

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel12.setText("Registrar");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 80, 30));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 240, 30));

        btnProformas.setBackground(new java.awt.Color(0, 102, 255));
        btnProformas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProformasMouseClicked(evt);
            }
        });
        btnProformas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel13.setText("Proformas");
        btnProformas.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-herramienta-de-pintura-en-línea-64.png"))); // NOI18N
        btnProformas.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 120, 90));

        jPanel1.add(btnProformas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 280, 140));

        btnFiltroFacturas.setBackground(new java.awt.Color(0, 102, 255));
        btnFiltroFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFiltroFacturasMouseClicked(evt);
            }
        });
        btnFiltroFacturas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel17.setText("Registro de facturas");
        btnFiltroFacturas.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 180, 30));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-comportamiento-de-las-ventas-50.png"))); // NOI18N
        btnFiltroFacturas.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 70, 90));

        jPanel1.add(btnFiltroFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 420, 390, 140));

        btnInventario.setBackground(new java.awt.Color(0, 102, 255));
        btnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInventarioMouseClicked(evt);
            }
        });
        btnInventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel19.setText("Inventario ");
        btnInventario.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 90, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-almacén-64.png"))); // NOI18N
        btnInventario.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 120, 90));

        jPanel1.add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, 270, 140));

        btnVentas.setBackground(new java.awt.Color(0, 102, 255));
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentasMouseClicked(evt);
            }
        });
        btnVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel15.setText("Ventas");
        btnVentas.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, 30));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-dinero-64.png"))); // NOI18N
        btnVentas.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 120, 90));

        jPanel1.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 240, 250, 140));

        btnRUsuario.setBackground(new java.awt.Color(0, 102, 255));
        btnRUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRUsuarioMouseClicked(evt);
            }
        });
        btnRUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel22.setText("Usuario");
        btnRUsuario.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, 30));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-añadir-usuario-masculino-64.png"))); // NOI18N
        btnRUsuario.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 60, 60));

        jPanel1.add(btnRUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 120, 100));

        btnRCliente.setBackground(new java.awt.Color(0, 102, 255));
        btnRCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRClienteMouseClicked(evt);
            }
        });
        btnRCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        jLabel24.setText("Cliente");
        btnRCliente.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, 30));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-carpeta-de-usuario-64.png"))); // NOI18N
        btnRCliente.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, 60));

        jPanel1.add(btnRCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 110, 100));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Bienvenido ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, -1, -1));

        PanelMenuI.setBackground(new java.awt.Color(204, 204, 255));
        PanelMenuI.setForeground(new java.awt.Color(255, 255, 255));
        PanelMenuI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-usuario-100.png"))); // NOI18N
        PanelMenuI.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 110, 150));

        txtUsuarioIniciado.setEditable(false);
        txtUsuarioIniciado.setBackground(new java.awt.Color(245, 245, 245));
        txtUsuarioIniciado.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txtUsuarioIniciado.setText("      ");
        txtUsuarioIniciado.setBorder(null);
        txtUsuarioIniciado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioIniciadoActionPerformed(evt);
            }
        });
        PanelMenuI.add(txtUsuarioIniciado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 120, 40));

        jLabel26.setBackground(new java.awt.Color(245, 245, 245));
        jLabel26.setOpaque(true);
        PanelMenuI.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 40, 40));

        BtnMenu.setBackground(new java.awt.Color(255, 0, 0));
        BtnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnMenuMouseClicked(evt);
            }
        });
        BtnMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setBackground(new java.awt.Color(67, 81, 141));
        jLabel27.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Cerrar sesión");
        BtnMenu.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 30));

        PanelMenuI.add(BtnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 150, 30));

        jPanel1.add(PanelMenuI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 190, 660));

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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Accedido por un: Empleado");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubMenuMouseClicked
        int posicion = PanelMenuI.getX();
        if (posicion > -1) {

            Animacion.Animacion.mover_izquierda(0, -264, 2, 2, PanelMenuI);

        } else {
            Animacion.Animacion.mover_derecha(-264, 0, 2, 2, PanelMenuI);
        }
    }//GEN-LAST:event_btnSubMenuMouseClicked

    private void btnRUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRUsuarioMouseClicked
        JOptionPane.showMessageDialog(this, "No tienes acceso");

    }//GEN-LAST:event_btnRUsuarioMouseClicked

    private void btnRClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRClienteMouseClicked
        JF_RegistrarCliente m = new JF_RegistrarCliente();
        m.setVisible(true);
        dispose();
        m.txtUsuarioVentas.setText(txtUsuarioIniciado.getText());

    }//GEN-LAST:event_btnRClienteMouseClicked

    private void btnProformasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProformasMouseClicked
        JF_Proformas m = new JF_Proformas();
        m.setVisible(true);
        dispose();
        m.txtUsuarioVentas.setText(txtUsuarioIniciado.getText());

    }//GEN-LAST:event_btnProformasMouseClicked

    private void btnInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMouseClicked

        JOptionPane.showMessageDialog(this, "No tienes acceso");
    }//GEN-LAST:event_btnInventarioMouseClicked

    private void btnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseClicked
        JF_Ventas m = new JF_Ventas();
        m.setVisible(true);
        dispose();

        m.txtUsuarioVentas.setText(txtUsuarioIniciado.getText());

        m.mostrardatosProducto("");

        int posicion2 = m.PanelPermiso.getX();
        if (posicion2 > -1) {
            Animacion.Animacion.mover_izquierda(0, -264, 2, 2, m.PanelPermiso);
        } else {
            Animacion.Animacion.mover_derecha(-264, 0, 2, 2, m.PanelPermiso);
        }
    }//GEN-LAST:event_btnVentasMouseClicked

    private void btnReporteProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteProductosMouseClicked

        JOptionPane.showMessageDialog(this, "No tienes acceso");
    }//GEN-LAST:event_btnReporteProductosMouseClicked

    private void btnFiltroFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltroFacturasMouseClicked

        JOptionPane.showMessageDialog(this, "No tienes acceso");
    }//GEN-LAST:event_btnFiltroFacturasMouseClicked

    private void BtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_BtnSalirMouseClicked

    private void BtnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_BtnMinimizarMouseClicked

    private void txtUsuarioIniciadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioIniciadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioIniciadoActionPerformed

    private void BtnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMenuMouseClicked
        JF_Login m = new JF_Login();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnMenuMouseClicked

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
            java.util.logging.Logger.getLogger(JF_MenúSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_MenúSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_MenúSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_MenúSimple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_MenúSimple().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnMenu;
    private javax.swing.JLabel BtnMinimizar;
    private javax.swing.JLabel BtnSalir;
    private javax.swing.JPanel PanelMenuI;
    private javax.swing.JPanel btnFiltroFacturas;
    private javax.swing.JPanel btnInventario;
    private javax.swing.JPanel btnProformas;
    private javax.swing.JPanel btnRCliente;
    private javax.swing.JPanel btnRUsuario;
    private javax.swing.JPanel btnReporteProductos;
    private javax.swing.JLabel btnSubMenu;
    private javax.swing.JPanel btnVentas;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JTextField txtUsuarioIniciado;
    // End of variables declaration//GEN-END:variables
}
