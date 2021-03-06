/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReporteProducto;

import Conexion.datosP;
import Menú.JF_Menú;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MarcoVL20
 */
public class JF_ReporteProducto extends javax.swing.JFrame {

    /**
     * Creates new form JF_ReporteProducto
     */
    public JF_ReporteProducto() {
        initComponents();
        setLocationRelativeTo(null);
       
    }

    public void obtenerFechas() {

        //Get fecha Inicial
        String diaInicio = Integer.toString(jDCFechaInicio.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mesInicio = Integer.toString(jDCFechaInicio.getCalendar().get(Calendar.MONTH) + 1);
        String yearInicio = Integer.toString(jDCFechaInicio.getCalendar().get(Calendar.YEAR));
        String fechaInicio = (yearInicio + "-" + mesInicio + "-" + diaInicio);
        //txtFechaInicio.setText(fechaInicio);

        //Get fecha final
        String diaFinal = Integer.toString(jDCFechaFinal.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mesFinal = Integer.toString(jDCFechaFinal.getCalendar().get(Calendar.MONTH) + 1);
        String yearFinal = Integer.toString(jDCFechaFinal.getCalendar().get(Calendar.YEAR));
        String fechaFinal = (yearFinal + "-" + mesFinal + "-" + diaFinal);
         //txtFechaFinal.setText(fechaInicio);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnSubMenu = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JLabel();
        BtnMinimizar = new javax.swing.JLabel();
        PanelMenuRPro = new javax.swing.JPanel();
        BtnFiltrarFactura = new rsbuttom.RSButtonMetro();
        BtnRegistrarCliente = new rsbuttom.RSButtonMetro();
        BtnProforma = new rsbuttom.RSButtonMetro();
        BtnVentas = new rsbuttom.RSButtonMetro();
        btnMenú = new rsbuttom.RSButtonMetro();
        lblBuscar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();
        txtTotalFacturado = new javax.swing.JTextField();
        jDCFechaInicio = new com.toedter.calendar.JDateChooser();
        jDCFechaFinal = new com.toedter.calendar.JDateChooser();
        lblTotalFacturado = new javax.swing.JLabel();
        lblTituloReporte = new javax.swing.JLabel();
        lblFecha1 = new javax.swing.JLabel();
        lblHasta1 = new javax.swing.JLabel();

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

        PanelMenuRPro.setBackground(new java.awt.Color(204, 204, 204));
        PanelMenuRPro.setForeground(new java.awt.Color(255, 255, 255));
        PanelMenuRPro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnFiltrarFactura.setBackground(new java.awt.Color(153, 153, 153));
        BtnFiltrarFactura.setText("Filtrar factura");
        BtnFiltrarFactura.setColorHover(new java.awt.Color(0, 102, 255));
        BtnFiltrarFactura.setColorNormal(new java.awt.Color(153, 153, 153));
        PanelMenuRPro.add(BtnFiltrarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        BtnRegistrarCliente.setBackground(new java.awt.Color(153, 153, 153));
        BtnRegistrarCliente.setText("Registrar Cliente");
        BtnRegistrarCliente.setColorHover(new java.awt.Color(0, 102, 255));
        BtnRegistrarCliente.setColorNormal(new java.awt.Color(153, 153, 153));
        PanelMenuRPro.add(BtnRegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        BtnProforma.setBackground(new java.awt.Color(153, 153, 153));
        BtnProforma.setText("Profromas");
        BtnProforma.setColorHover(new java.awt.Color(0, 102, 255));
        BtnProforma.setColorNormal(new java.awt.Color(153, 153, 153));
        PanelMenuRPro.add(BtnProforma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        BtnVentas.setBackground(new java.awt.Color(153, 153, 153));
        BtnVentas.setText("Ventas");
        BtnVentas.setColorHover(new java.awt.Color(0, 102, 255));
        BtnVentas.setColorNormal(new java.awt.Color(153, 153, 153));
        PanelMenuRPro.add(BtnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        btnMenú.setBackground(new java.awt.Color(255, 51, 51));
        btnMenú.setText("Menú");
        btnMenú.setColorHover(new java.awt.Color(255, 51, 51));
        btnMenú.setColorNormal(new java.awt.Color(255, 51, 51));
        btnMenú.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenúMouseClicked(evt);
            }
        });
        PanelMenuRPro.add(btnMenú, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 150, 30));

        jPanel1.add(PanelMenuRPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 190, 660));

        lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscar.png"))); // NOI18N
        lblBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscarMouseClicked(evt);
            }
        });
        jPanel1.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel3.setText("Montos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 590, 280));
        jPanel1.add(txtTotalFacturado, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, 80, -1));

        jDCFechaInicio.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(jDCFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        jDCFechaFinal.setDateFormatString("yyyy-MM-dd\n");
        jPanel1.add(jDCFechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, -1, -1));

        lblTotalFacturado.setBackground(new java.awt.Color(0, 0, 0));
        lblTotalFacturado.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        lblTotalFacturado.setText("Total Facturado:");
        jPanel1.add(lblTotalFacturado, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 530, -1, 40));

        lblTituloReporte.setBackground(new java.awt.Color(0, 0, 0));
        lblTituloReporte.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        lblTituloReporte.setText("Reporte de productos");
        jPanel1.add(lblTituloReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        lblFecha1.setBackground(new java.awt.Color(0, 0, 0));
        lblFecha1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        lblFecha1.setText("Fecha:");
        jPanel1.add(lblFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 166, -1, 30));

        lblHasta1.setBackground(new java.awt.Color(0, 0, 0));
        lblHasta1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        lblHasta1.setText("Hasta:");
        jPanel1.add(lblHasta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, -1, 40));

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
        int posicion = PanelMenuRPro.getX();
        if (posicion > -1) {
            Animacion.Animacion.mover_izquierda(0, -264, 2, 2, PanelMenuRPro);
        } else {
            Animacion.Animacion.mover_derecha(-264, 0, 2, 2, PanelMenuRPro);
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

    private void lblBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscarMouseClicked

        try {

            DefaultTableModel modelo = new DefaultTableModel();
            jTableDatos.setModel(modelo);

            //Preparar consulta
            PreparedStatement ps = null;
            ResultSet rs = null;

            //Llamar conexión
            datosP cc = new datosP();
            Connection con = cc.conexion();
            
            //Consulta sql
            String sql = "Consulta";
            ps = con.prepareStatement(sql);     
            //Trae todos los datos de la consulta
            rs = ps.executeQuery();
            //Pasando resultado de la consulta
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            //Encabezados      
            modelo.addColumn("Producto");
            modelo.addColumn("Cantidad");
            modelo.addColumn("Presentación");
            modelo.addColumn("Precio");
            modelo.addColumn("Total por producto");
            
            while(rs.next()){
            Object[] filas = new Object[cantidadColumnas];
            
            for (int i=0; 1< cantidadColumnas; i++){
                filas[i] = rs.getObject(i+1);
            }
            modelo.addRow(filas);
            }
  
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }


    }//GEN-LAST:event_lblBuscarMouseClicked

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
            java.util.logging.Logger.getLogger(JF_ReporteProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_ReporteProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_ReporteProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_ReporteProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_ReporteProducto().setVisible(true);
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
    private javax.swing.JPanel PanelMenuRPro;
    private rsbuttom.RSButtonMetro btnMenú;
    private javax.swing.JLabel btnSubMenu;
    private com.toedter.calendar.JDateChooser jDCFechaFinal;
    private com.toedter.calendar.JDateChooser jDCFechaInicio;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDatos;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblFecha1;
    private javax.swing.JLabel lblHasta1;
    private javax.swing.JLabel lblTituloReporte;
    private javax.swing.JLabel lblTotalFacturado;
    private javax.swing.JTextField txtTotalFacturado;
    // End of variables declaration//GEN-END:variables
}
