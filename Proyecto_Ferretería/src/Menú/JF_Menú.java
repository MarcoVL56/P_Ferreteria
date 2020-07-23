package Menú;

import Inventario.JF_Inventario;
import Proformas.JF_Proformas;
import RegistrarEmpleado.JF_RegistrarCliente;
import RegistrarUsuario.JF_RegistrarUsuario;
import ReporteProducto.JF_ReporteProducto;
import Ventas.JF_Ventas;

public class JF_Menú extends javax.swing.JFrame {

    public JF_Menú() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelMenu = new javax.swing.JPanel();
        BtnFiltrarFactura = new rsbuttom.RSButtonMetro();
        BtnRegistrarCliente = new rsbuttom.RSButtonMetro();
        BtnProforma = new rsbuttom.RSButtonMetro();
        BtnVentas = new rsbuttom.RSButtonMetro();
        jPanel3 = new javax.swing.JPanel();
        btnSubMenu = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1418, 713));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelMenu.setBackground(new java.awt.Color(204, 204, 204));
        PanelMenu.setForeground(new java.awt.Color(255, 255, 255));
        PanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnFiltrarFactura.setBackground(new java.awt.Color(153, 153, 153));
        BtnFiltrarFactura.setText("Filtrar factura");
        BtnFiltrarFactura.setColorHover(new java.awt.Color(255, 102, 51));
        BtnFiltrarFactura.setColorNormal(new java.awt.Color(153, 153, 153));
        PanelMenu.add(BtnFiltrarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        BtnRegistrarCliente.setBackground(new java.awt.Color(153, 153, 153));
        BtnRegistrarCliente.setText("Registrar Cliente");
        BtnRegistrarCliente.setColorHover(new java.awt.Color(255, 102, 51));
        BtnRegistrarCliente.setColorNormal(new java.awt.Color(153, 153, 153));
        PanelMenu.add(BtnRegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        BtnProforma.setBackground(new java.awt.Color(153, 153, 153));
        BtnProforma.setText("Profromas");
        BtnProforma.setColorHover(new java.awt.Color(255, 102, 51));
        BtnProforma.setColorNormal(new java.awt.Color(153, 153, 153));
        PanelMenu.add(BtnProforma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        BtnVentas.setBackground(new java.awt.Color(153, 153, 153));
        BtnVentas.setText("Ventas");
        BtnVentas.setColorHover(new java.awt.Color(255, 102, 51));
        BtnVentas.setColorNormal(new java.awt.Color(153, 153, 153));
        PanelMenu.add(BtnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jPanel1.add(PanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 190, 660));

        jPanel3.setBackground(new java.awt.Color(255, 102, 51));

        btnSubMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Menu_35px_2.png"))); // NOI18N
        btnSubMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnSubMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1338, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSubMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 50));

        btnReporteProductos.setBackground(new java.awt.Color(255, 102, 51));
        btnReporteProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReporteProductosMouseClicked(evt);
            }
        });
        btnReporteProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        jLabel11.setText("Reporte de productos");
        btnReporteProductos.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 190, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-producto-nuevo-80.png"))); // NOI18N
        btnReporteProductos.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 90, 90));

        jPanel1.add(btnReporteProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 690, 140));

        jPanel6.setBackground(new java.awt.Color(255, 102, 51));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        jLabel12.setText("Registrar");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 80, 30));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 240, 30));

        btnProformas.setBackground(new java.awt.Color(255, 102, 51));
        btnProformas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProformasMouseClicked(evt);
            }
        });
        btnProformas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        jLabel13.setText("Proformas");
        btnProformas.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-herramienta-de-pintura-en-línea-64.png"))); // NOI18N
        btnProformas.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 120, 90));

        jPanel1.add(btnProformas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 280, 140));

        btnFiltroFacturas.setBackground(new java.awt.Color(255, 102, 51));
        btnFiltroFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFiltroFacturasMouseClicked(evt);
            }
        });
        btnFiltroFacturas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        jLabel17.setText("Filtro de facturas");
        btnFiltroFacturas.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 140, 30));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-comportamiento-de-las-ventas-50.png"))); // NOI18N
        btnFiltroFacturas.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 70, 90));

        jPanel1.add(btnFiltroFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 420, 410, 140));

        btnInventario.setBackground(new java.awt.Color(255, 102, 51));
        btnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInventarioMouseClicked(evt);
            }
        });
        btnInventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        jLabel19.setText("Inventario ");
        btnInventario.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-almacén-64.png"))); // NOI18N
        btnInventario.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 120, 90));

        jPanel1.add(btnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, 270, 140));

        btnVentas.setBackground(new java.awt.Color(255, 102, 51));
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentasMouseClicked(evt);
            }
        });
        btnVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        jLabel15.setText("Ventas");
        btnVentas.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, 30));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-dinero-64.png"))); // NOI18N
        btnVentas.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 120, 90));

        jPanel1.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 240, 270, 140));

        btnRUsuario.setBackground(new java.awt.Color(255, 102, 51));
        btnRUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRUsuarioMouseClicked(evt);
            }
        });
        btnRUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        jLabel22.setText("Usuario");
        btnRUsuario.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, 30));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-añadir-usuario-masculino-64.png"))); // NOI18N
        btnRUsuario.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 60, 60));

        jPanel1.add(btnRUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 120, 100));

        btnRCliente.setBackground(new java.awt.Color(255, 102, 51));
        btnRCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRClienteMouseClicked(evt);
            }
        });
        btnRCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Calibri Light", 0, 16)); // NOI18N
        jLabel24.setText("Cliente");
        btnRCliente.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, 30));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-carpeta-de-usuario-64.png"))); // NOI18N
        btnRCliente.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, 60));

        jPanel1.add(btnRCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 110, 100));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Bienvenido ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubMenuMouseClicked
        int posicion = PanelMenu.getX();
        if (posicion > -1) {
            Animacion.Animacion.mover_izquierda(0, -264, 2, 2, PanelMenu);
        } else {
            Animacion.Animacion.mover_derecha(-264, 0, 2, 2, PanelMenu);
        }
    }//GEN-LAST:event_btnSubMenuMouseClicked

    private void btnRUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRUsuarioMouseClicked
        JF_RegistrarUsuario m = new JF_RegistrarUsuario();
        m.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnRUsuarioMouseClicked

    private void btnRClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRClienteMouseClicked
        JF_RegistrarCliente m = new JF_RegistrarCliente();
        m.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnRClienteMouseClicked

    private void btnProformasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProformasMouseClicked
        JF_Proformas m = new JF_Proformas();
        m.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnProformasMouseClicked

    private void btnInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMouseClicked
        JF_Inventario m = new JF_Inventario();
        m.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnInventarioMouseClicked

    private void btnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseClicked
        JF_Ventas m = new JF_Ventas();
        m.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnVentasMouseClicked

    private void btnReporteProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteProductosMouseClicked
        JF_ReporteProducto m = new JF_ReporteProducto();
        m.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnReporteProductosMouseClicked

    private void btnFiltroFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFiltroFacturasMouseClicked
        JF_RegistrarUsuario m = new JF_RegistrarUsuario();
        m.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnFiltroFacturasMouseClicked

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
            java.util.logging.Logger.getLogger(JF_Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Menú.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_Menú().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro BtnFiltrarFactura;
    private rsbuttom.RSButtonMetro BtnProforma;
    private rsbuttom.RSButtonMetro BtnRegistrarCliente;
    private rsbuttom.RSButtonMetro BtnVentas;
    private javax.swing.JPanel PanelMenu;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
