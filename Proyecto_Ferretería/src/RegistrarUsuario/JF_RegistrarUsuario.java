package RegistrarUsuario;

import Conexion.datosP;
import Factura.JF_FiltroFactura;
import Menú.JF_Menú;
import Proformas.JF_Proformas;
import RegistrarEmpleado.JF_RegistrarCliente;
import Ventas.JF_Ventas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class JF_RegistrarUsuario extends javax.swing.JFrame {

    public JF_RegistrarUsuario() {
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
        PanelMenuRU = new javax.swing.JPanel();
        BtnMenu = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        BtnVentas = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        BtnProforma = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        BtnIRegistrarCliente = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsuarioVentas = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPrimerP = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        chVerContra = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        cmbTipoUsuario = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        txtSegundoP = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        BtnIngresar1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();

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

        PanelMenuRU.setBackground(new java.awt.Color(204, 204, 204));
        PanelMenuRU.setForeground(new java.awt.Color(255, 255, 255));
        PanelMenuRU.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        PanelMenuRU.add(BtnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 150, 30));

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

        PanelMenuRU.add(BtnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 150, -1));

        BtnProforma.setBackground(new java.awt.Color(153, 153, 153));
        BtnProforma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnProformaMouseClicked(evt);
            }
        });
        BtnProforma.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setBackground(new java.awt.Color(67, 81, 141));
        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Proformas");
        BtnProforma.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 90, 30));

        PanelMenuRU.add(BtnProforma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 150, -1));

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

        PanelMenuRU.add(BtnIRegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 150, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Usuario");
        PanelMenuRU.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        txtUsuarioVentas.setEditable(false);
        txtUsuarioVentas.setBackground(new java.awt.Color(245, 245, 245));
        txtUsuarioVentas.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txtUsuarioVentas.setText("      ");
        txtUsuarioVentas.setBorder(null);
        txtUsuarioVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioVentasActionPerformed(evt);
            }
        });
        PanelMenuRU.add(txtUsuarioVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 120, 40));

        jLabel26.setBackground(new java.awt.Color(245, 245, 245));
        jLabel26.setOpaque(true);
        PanelMenuRU.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 40, 40));

        jPanel1.add(PanelMenuRU, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 190, 660));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        jLabel14.setText("Registrar un empleado");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 120, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Cédula");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));
        jPanel2.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 145, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Primer");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Apellido");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));
        jPanel2.add(txtPrimerP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 145, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Contraseña");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, -1, -1));
        jPanel2.add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 145, -1));
        jPanel2.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 120, -1));

        chVerContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chVerContraMouseClicked(evt);
            }
        });
        chVerContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chVerContraActionPerformed(evt);
            }
        });
        jPanel2.add(chVerContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("1. Administrador 2. Empleado");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, -1, -1));

        cmbTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2" }));
        jPanel2.add(cmbTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 120, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Usuario");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, -1));
        jPanel2.add(txtSegundoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 145, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Segundo");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Apellido");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Email");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 141, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Usuario");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("Tipo de ");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 860, 480));

        BtnIngresar1.setBackground(new java.awt.Color(255, 204, 51));
        BtnIngresar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnIngresar1MouseClicked(evt);
            }
        });
        BtnIngresar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setBackground(new java.awt.Color(67, 81, 141));
        jLabel22.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        jLabel22.setText("Agregar");
        BtnIngresar1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 100, 40));

        jPanel1.add(BtnIngresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 630, 190, -1));

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
        int posicion = PanelMenuRU.getX();
        if (posicion > -1) {
            Animacion.Animacion.mover_izquierda(0, -264, 2, 2, PanelMenuRU);
        } else {
            Animacion.Animacion.mover_derecha(-264, 0, 2, 2, PanelMenuRU);
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
        m.txtUsuarioIniciado.setText(txtUsuarioVentas.getText());
    }//GEN-LAST:event_BtnMenuMouseClicked

    private void BtnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVentasMouseClicked
        JF_Ventas m = new JF_Ventas();
        m.setVisible(true);
        dispose();
        m.mostrardatosProducto("");
        m.txtUsuarioVentas.setText(txtUsuarioVentas.getText());
    }//GEN-LAST:event_BtnVentasMouseClicked

    private void BtnProformaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnProformaMouseClicked
        JF_Proformas m = new JF_Proformas();
        m.setVisible(true);
        dispose();
        m.txtUsuarioVentas.setText(txtUsuarioVentas.getText());
    }//GEN-LAST:event_BtnProformaMouseClicked

    private void BtnIRegistrarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIRegistrarClienteMouseClicked
        JF_RegistrarCliente m = new JF_RegistrarCliente();
        m.setVisible(true);
        dispose();
        m.txtUsuarioVentas.setText(txtUsuarioVentas.getText());
    }//GEN-LAST:event_BtnIRegistrarClienteMouseClicked

    private void chVerContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chVerContraActionPerformed

        if (chVerContra.isSelected()) {
            txtContraseña.setEchoChar((char) 0);
        } else {
            txtContraseña.setEchoChar('*');
        }

    }//GEN-LAST:event_chVerContraActionPerformed

    private void BtnIngresar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIngresar1MouseClicked

        try {
            datosP cc = new datosP();
            Connection cn = cc.conexion();

            PreparedStatement pst = cn.prepareStatement("INSERT INTO registro_usuario(Usuario,"
                    + "Contraseña,Cédula,Nombre,PrimerApellido,SegundoApellido,CorreoElectronico,Fk_TipoUsuario) VALUES (?,?,?,?,?,?,?,?)");
            pst.setString(1, txtUsuario.getText());
            pst.setString(2, txtContraseña.getText());
            pst.setString(3, txtcedula.getText());
            pst.setString(4, txtnombre.getText());
            pst.setString(5, txtPrimerP.getText());
            pst.setString(6, txtSegundoP.getText());
            pst.setString(7, txtEmail.getText());
            pst.setString(8, (String) cmbTipoUsuario.getSelectedItem());

            pst.executeUpdate();

        } catch (Exception e) {
            System.out.print(e);
        }

        txtUsuario.setText("");
        txtContraseña.setText("");
        txtcedula.setText("");
        txtnombre.setText("");
        txtPrimerP.setText("");
        txtSegundoP.setText("");
        txtEmail.setText("");
        JOptionPane.showMessageDialog(this, "Guardado con exito");


    }//GEN-LAST:event_BtnIngresar1MouseClicked

    private void chVerContraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chVerContraMouseClicked
        if (chVerContra.isSelected()) {
            txtContraseña.setEchoChar((char) 0);
        } else {
            txtContraseña.setEchoChar('*');
        }

    }//GEN-LAST:event_chVerContraMouseClicked

    private void txtUsuarioVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioVentasActionPerformed

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
            java.util.logging.Logger.getLogger(JF_RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_RegistrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnIRegistrarCliente;
    private javax.swing.JPanel BtnIngresar1;
    private javax.swing.JPanel BtnMenu;
    private javax.swing.JLabel BtnMinimizar;
    private javax.swing.JPanel BtnProforma;
    private javax.swing.JLabel BtnSalir;
    private javax.swing.JPanel BtnVentas;
    private javax.swing.JPanel PanelMenuRU;
    private javax.swing.JLabel btnSubMenu;
    private javax.swing.JCheckBox chVerContra;
    private javax.swing.JComboBox cmbTipoUsuario;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
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
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPrimerP;
    private javax.swing.JTextField txtSegundoP;
    private javax.swing.JTextField txtUsuario;
    public javax.swing.JTextField txtUsuarioVentas;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
