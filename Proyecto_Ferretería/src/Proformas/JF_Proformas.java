/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proformas;

import Conexion.datosP;
import Factura.JF_FiltroFactura;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Menú.JF_Menú;
import RegistrarEmpleado.JF_RegistrarCliente;
import Ventas.JF_Ventas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MarcoVL20
 */
public class JF_Proformas extends javax.swing.JFrame {

    void mostrardatos(String valor) {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Cliente");
        modelo.addColumn("Cédula");
        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Total a pagar");
        modelo.addColumn("Impuesto");

        tbDatos.setModel(modelo);
        String sql = "";
        if (valor.equals("")) {

            sql = "SELECT Id_Factura,Nombre,Cédula,FK_Producto,Cantidad,TotalPagar,Impuesto"
                    + " FROM factura a INNER JOIN orden b on (b.Id_Orden = a.Fk_orden) INNER Join registro_cliente c on (c.Id_Cliente = b.Fk_Cliente)"
                    + " where Cédula ='" + txtBuscar.getText() + "' and Fk_Estado = 2";

        }
        String[] datos = new String[7];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);

                modelo.addRow(datos);
            }
            tbDatos.setModel(modelo);
        } catch (SQLException ex) {
            System.out.println(ex);
            // Logger.getLogger(ingresoproductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void pagar() {

    }

    public JF_Proformas() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnSubMenu = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JLabel();
        BtnMinimizar = new javax.swing.JLabel();
        PanelMenuP = new javax.swing.JPanel();
        BtnMenu = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        BtnFiltrarF = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        BtnVentas = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        BtnIRegistrarCliente = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();

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

        PanelMenuP.setBackground(new java.awt.Color(204, 204, 204));
        PanelMenuP.setForeground(new java.awt.Color(255, 255, 255));
        PanelMenuP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnMenu.setBackground(new java.awt.Color(255, 0, 0));
        BtnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnMenuMouseClicked(evt);
            }
        });
        BtnMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(67, 81, 141));
        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Menú");
        BtnMenu.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 60, 30));

        PanelMenuP.add(BtnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 150, 30));

        BtnFiltrarF.setBackground(new java.awt.Color(153, 153, 153));
        BtnFiltrarF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnFiltrarFMouseClicked(evt);
            }
        });
        BtnFiltrarF.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(67, 81, 141));
        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Filtrar factura");
        BtnFiltrarF.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 110, 30));

        PanelMenuP.add(BtnFiltrarF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 150, -1));

        BtnVentas.setBackground(new java.awt.Color(153, 153, 153));
        BtnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnVentasMouseClicked(evt);
            }
        });
        BtnVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setBackground(new java.awt.Color(67, 81, 141));
        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Ventas");
        BtnVentas.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 60, 30));

        PanelMenuP.add(BtnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 150, -1));

        BtnIRegistrarCliente.setBackground(new java.awt.Color(153, 153, 153));
        BtnIRegistrarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnIRegistrarClienteMouseClicked(evt);
            }
        });
        BtnIRegistrarCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(67, 81, 141));
        jLabel18.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Registrar cliente");
        BtnIRegistrarCliente.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 30));

        PanelMenuP.add(BtnIRegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, 30));

        jPanel1.add(PanelMenuP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 190, 660));

        jLabel1.setText("Cédula vinculado a la proforma:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 190, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, -1, -1));

        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 610, 160, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 940, 370));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        jLabel14.setText("Registro de proformas");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, -1, -1));

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
        int posicion = PanelMenuP.getX();
        if (posicion > -1) {
            Animacion.Animacion.mover_izquierda(0, -264, 2, 2, PanelMenuP);
        } else {
            Animacion.Animacion.mover_derecha(-264, 0, 2, 2, PanelMenuP);
        }
    }//GEN-LAST:event_btnSubMenuMouseClicked

    private void BtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_BtnSalirMouseClicked

    private void BtnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_BtnMinimizarMouseClicked

    private void BtnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMenuMouseClicked
        JF_Menú m = new JF_Menú();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnMenuMouseClicked

    private void BtnFiltrarFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFiltrarFMouseClicked
        JF_FiltroFactura m = new JF_FiltroFactura();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnFiltrarFMouseClicked

    private void BtnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVentasMouseClicked
        JF_Ventas m = new JF_Ventas();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnVentasMouseClicked

    private void BtnIRegistrarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIRegistrarClienteMouseClicked
        JF_RegistrarCliente m = new JF_RegistrarCliente();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnIRegistrarClienteMouseClicked

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        // cambiar estado

    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        mostrardatos("");
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(JF_Proformas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Proformas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Proformas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Proformas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_Proformas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnFiltrarF;
    private javax.swing.JPanel BtnIRegistrarCliente;
    private javax.swing.JPanel BtnMenu;
    private javax.swing.JLabel BtnMinimizar;
    private javax.swing.JLabel BtnSalir;
    private javax.swing.JPanel BtnVentas;
    private javax.swing.JPanel PanelMenuP;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JLabel btnSubMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDatos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
   datosP cc = new datosP();
    Connection cn = cc.conexion();
}
