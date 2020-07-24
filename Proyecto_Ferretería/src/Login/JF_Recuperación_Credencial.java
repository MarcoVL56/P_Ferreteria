package Login;

import Conexion.datosP;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JF_Recuperación_Credencial extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();

    public JF_Recuperación_Credencial() {
        initComponents();
        setLocationRelativeTo(null);
    }

    void mostrarusu(String valor) {

        modelo.addColumn("User");
        modelo.addColumn("Pass");

        tbusu.setModel(modelo);
        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT Usuario, Contraseña FROM `registro_usuario` WHERE CorreoElectronico ='" + txtCorreoEnviar.getText() + "'";

        }
        String[] datos = new String[2];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                txtusu.setText(datos[0] = rs.getString(1));
                txtpass.setText(datos[1] = rs.getString(2));

                modelo.addRow(datos);
            }
            tbusu.setModel(modelo);
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtusu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbusu = new javax.swing.JTable();
        txtpass = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtCorreoEnviar = new javax.swing.JTextField();
        BtnEnviarCorreo = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSubMenu = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JLabel();
        BtnMinimizar = new javax.swing.JLabel();
        PanelMenuRCreden = new javax.swing.JPanel();
        btnMenú = new rsbuttom.RSButtonMetro();
        jLabel2 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        tbusu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbusu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbusuKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tbusu);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCorreoEnviar.setBackground(new java.awt.Color(245, 245, 245));
        txtCorreoEnviar.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txtCorreoEnviar.setBorder(null);
        jPanel1.add(txtCorreoEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 630, 40));

        BtnEnviarCorreo.setBackground(new java.awt.Color(255, 204, 51));
        BtnEnviarCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEnviarCorreoMouseClicked(evt);
            }
        });
        BtnEnviarCorreo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(67, 81, 141));
        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        jLabel11.setText("Recuperar");
        BtnEnviarCorreo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 140, 40));

        jPanel1.add(BtnEnviarCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 370, 50));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel1.setText("Por favor ingrese su correo electrónico ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, -1, -1));

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

        PanelMenuRCreden.setBackground(new java.awt.Color(204, 204, 204));
        PanelMenuRCreden.setForeground(new java.awt.Color(255, 255, 255));
        PanelMenuRCreden.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenú.setBackground(new java.awt.Color(255, 51, 51));
        btnMenú.setText("Volver al Login");
        btnMenú.setColorHover(new java.awt.Color(255, 51, 51));
        btnMenú.setColorNormal(new java.awt.Color(255, 51, 51));
        btnMenú.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenúMouseClicked(evt);
            }
        });
        btnMenú.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenúActionPerformed(evt);
            }
        });
        PanelMenuRCreden.add(btnMenú, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 150, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-olvidó-su-contraseña-100.png"))); // NOI18N
        PanelMenuRCreden.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 110, 130));

        jPanel1.add(PanelMenuRCreden, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 190, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEnviarCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEnviarCorreoMouseClicked

        mostrarusu("");

        try {

            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(props);

            String correoRemitente = "ferreteria648@gmail.com";
            String passwordRemitente = "ferreteria3bbb";
            String correoReceptor = txtCorreoEnviar.getText();
            String asunto = "Recuperación de usuario y contraseña";
            String mensaje = "Su Usuario es: " + txtusu.getText() + "  // Su Contraseña es: " + txtpass.getText();

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(correoRemitente));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
            message.setSubject(asunto);
            message.setText(mensaje, "ISO-8859-1", "html");

            Transport t = session.getTransport("smtp");
            t.connect(correoRemitente, passwordRemitente);
            t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            t.close();

            JOptionPane.showMessageDialog(null, "Correo Electronico Enviado");

        } catch (AddressException ex) {
            Logger.getLogger(JF_Recuperación_Credencial.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(JF_Recuperación_Credencial.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtCorreoEnviar.setText("");

    }//GEN-LAST:event_BtnEnviarCorreoMouseClicked

    private void btnSubMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubMenuMouseClicked
        int posicion = PanelMenuRCreden.getX();
        if (posicion > -1) {
            Animacion.Animacion.mover_izquierda(0, -264, 2, 2, PanelMenuRCreden);
        } else {
            Animacion.Animacion.mover_derecha(-264, 0, 2, 2, PanelMenuRCreden);
        }
    }//GEN-LAST:event_btnSubMenuMouseClicked

    private void BtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_BtnSalirMouseClicked

    private void BtnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_BtnMinimizarMouseClicked

    private void btnMenúMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenúMouseClicked
        JF_Login m = new JF_Login();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenúMouseClicked

    private void btnMenúActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenúActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenúActionPerformed

    private void tbusuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbusuKeyPressed

    }//GEN-LAST:event_tbusuKeyPressed

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
            java.util.logging.Logger.getLogger(JF_Recuperación_Credencial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Recuperación_Credencial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Recuperación_Credencial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Recuperación_Credencial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_Recuperación_Credencial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnEnviarCorreo;
    private javax.swing.JLabel BtnMinimizar;
    private javax.swing.JLabel BtnSalir;
    private javax.swing.JPanel PanelMenuRCreden;
    private rsbuttom.RSButtonMetro btnMenú;
    private javax.swing.JLabel btnSubMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tbusu;
    public javax.swing.JTextField txtCorreoEnviar;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtusu;
    // End of variables declaration//GEN-END:variables

    datosP cc = new datosP();
    Connection cn = cc.conexion();
}
