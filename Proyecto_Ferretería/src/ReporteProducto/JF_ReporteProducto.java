/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReporteProducto;

import Conexion.datosP;
import Factura.JF_FiltroFactura;
import Menú.JF_Menú;
import Proformas.JF_Proformas;
import RegistrarEmpleado.JF_RegistrarCliente;
import Ventas.JF_Ventas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MarcoVL20
 */
public class JF_ReporteProducto extends javax.swing.JFrame {

    String date;
    String date2;

    public JF_ReporteProducto() {
        initComponents();
        setLocationRelativeTo(null);

    }

    public void processCalendar() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //yyyy-MM-dd
        date = dateFormat.format(txtFecha1.getDate());

    }

    public void processCalendar2() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        date2 = dateFormat.format(txtFecha2.getDate());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnSubMenu = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JLabel();
        BtnMinimizar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbprod = new javax.swing.JTable();
        lblTotalFacturado = new javax.swing.JLabel();
        lblTituloReporte = new javax.swing.JLabel();
        lblFecha1 = new javax.swing.JLabel();
        lblHasta1 = new javax.swing.JLabel();
        btnVer = new javax.swing.JButton();
        txtFecha1 = new com.toedter.calendar.JDateChooser();
        txtFecha2 = new com.toedter.calendar.JDateChooser();
        Btnfecha1 = new javax.swing.JButton();
        btnFecha2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbMonto = new javax.swing.JTable();
        PanelMenuRPro = new javax.swing.JPanel();
        BtnMenu = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        BtnFiltrarF = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        BtnVentas = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        BtnProforma = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        BtnIRegistrarCliente = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();

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

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel3.setText("Montos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tbprod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbprod);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 740, 280));

        lblTotalFacturado.setBackground(new java.awt.Color(0, 0, 0));
        lblTotalFacturado.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        lblTotalFacturado.setText("Total en productos:");
        jPanel1.add(lblTotalFacturado, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 600, -1, 40));

        lblTituloReporte.setBackground(new java.awt.Color(0, 0, 0));
        lblTituloReporte.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        lblTituloReporte.setText("Reporte de productos");
        jPanel1.add(lblTituloReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, -1));

        lblFecha1.setBackground(new java.awt.Color(0, 0, 0));
        lblFecha1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        lblFecha1.setText("Fecha:");
        jPanel1.add(lblFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, 30));

        lblHasta1.setBackground(new java.awt.Color(0, 0, 0));
        lblHasta1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        lblHasta1.setText("Hasta:");
        jPanel1.add(lblHasta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, -1, 40));

        btnVer.setText("Ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        jPanel1.add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 90, -1));
        jPanel1.add(txtFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 160, 31));
        jPanel1.add(txtFecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, 160, 31));

        Btnfecha1.setText("Una fecha");
        Btnfecha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btnfecha1ActionPerformed(evt);
            }
        });
        jPanel1.add(Btnfecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 160, -1));

        btnFecha2.setText("Dos fechas");
        btnFecha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecha2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnFecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, 160, -1));

        tbMonto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbMonto);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 590, 160, 50));

        PanelMenuRPro.setBackground(new java.awt.Color(204, 204, 204));
        PanelMenuRPro.setForeground(new java.awt.Color(255, 255, 255));
        PanelMenuRPro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        PanelMenuRPro.add(BtnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 150, 30));

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

        PanelMenuRPro.add(BtnFiltrarF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 150, -1));

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

        PanelMenuRPro.add(BtnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 150, -1));

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

        PanelMenuRPro.add(BtnProforma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 150, -1));

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

        PanelMenuRPro.add(BtnIRegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, 30));

        jPanel1.add(PanelMenuRPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 190, 660));

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

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        mostrarProductos("");
        mostrarProductosMonto("");
    }//GEN-LAST:event_btnVerActionPerformed

    private void Btnfecha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btnfecha1ActionPerformed
        mostrarProductos1fecha("");
        mostrarProductosMontoFecha1("");
    }//GEN-LAST:event_Btnfecha1ActionPerformed

    private void btnFecha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecha2ActionPerformed
        mostrarProductos1fecha("");
        mostrarProductosMontoFecha2("");
    }//GEN-LAST:event_btnFecha2ActionPerformed

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
        m.mostrardatosProducto("");
    }//GEN-LAST:event_BtnVentasMouseClicked

    private void BtnProformaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnProformaMouseClicked
        JF_Proformas m = new JF_Proformas();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnProformaMouseClicked

    private void BtnIRegistrarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnIRegistrarClienteMouseClicked
        JF_RegistrarCliente m = new JF_RegistrarCliente();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnIRegistrarClienteMouseClicked

    public void mostrarProductos(String valor) {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Presentación");
        modelo.addColumn("Precio");
        modelo.addColumn("Total por producto");

        tbprod.setModel(modelo);

        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT producto.Nombre, orden.Cantidad, producto.Presentacion, producto.PrecioUnitario, "
                    + "factura.TotalPagar FROM producto INNER JOIN orden on producto.Id_Producto = orden.Fk_Producto INNER JOIN factura ON factura.Id_Factura = orden.Fk_Factura";

        }
        String[] datos = new String[5];
        try {
            PreparedStatement pst = null;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            pst = cn.prepareStatement(sql);

            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);

                modelo.addRow(datos);
            }
            tbprod.setModel(modelo);
        } catch (SQLException ex) {
            System.out.println(ex);
            // Logger.getLogger(ingresoproductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void mostrarProductosMonto(String valor) {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Monto total");

        tbMonto.setModel(modelo);

        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT sum(producto.PrecioUnitario) * SUM(orden.Cantidad) FROM producto"
                    + " INNER JOIN orden on producto.Id_Producto = orden.Fk_Producto INNER JOIN factura ON factura.Id_Factura = orden.Fk_Factura";

        }
        String[] datos = new String[1];
        try {
            PreparedStatement pst = null;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            pst = cn.prepareStatement(sql);

            while (rs.next()) {

                datos[0] = rs.getString(1);

                modelo.addRow(datos);
            }
            tbMonto.setModel(modelo);
        } catch (SQLException ex) {
            System.out.println(ex);
            // Logger.getLogger(ingresoproductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void mostrarProductos1fecha(String valor) {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Presentación");
        modelo.addColumn("Precio");
        modelo.addColumn("Total por producto");

        tbprod.setModel(modelo);

        processCalendar();

        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT producto.Nombre, orden.Cantidad, producto.Presentacion, producto.PrecioUnitario, factura.TotalPagar FROM producto "
                    + "INNER JOIN orden on producto.Id_Producto = orden.Fk_Producto INNER JOIN factura ON factura.Id_Factura = orden.Fk_Factura where factura.Fecha = '" + date + "'";

        }
        String[] datos = new String[5];
        try {
            PreparedStatement pst = null;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            pst = cn.prepareStatement(sql);

            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);

                modelo.addRow(datos);
            }
            tbprod.setModel(modelo);
        } catch (SQLException ex) {
            System.out.println(ex);
            // Logger.getLogger(ingresoproductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void mostrarProductosMontoFecha1(String valor) {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Monto total");

        tbMonto.setModel(modelo);

        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT sum(producto.PrecioUnitario) * SUM(orden.Cantidad) FROM producto"
                    + " INNER JOIN orden on producto.Id_Producto = orden.Fk_Producto INNER JOIN factura ON factura.Id_Factura = orden.Fk_Factura where factura.Fecha = '" + date + "'";

        }
        String[] datos = new String[1];
        try {
            PreparedStatement pst = null;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            pst = cn.prepareStatement(sql);

            while (rs.next()) {

                datos[0] = rs.getString(1);

                modelo.addRow(datos);
            }
            tbMonto.setModel(modelo);
        } catch (SQLException ex) {
            System.out.println(ex);
            // Logger.getLogger(ingresoproductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void mostrarProductos2fechas(String valor) {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Presentación");
        modelo.addColumn("Precio");
        modelo.addColumn("Total por producto");

        tbprod.setModel(modelo);
        processCalendar();
        processCalendar2();

        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT producto.Nombre, orden.Cantidad, producto.Presentacion, producto.PrecioUnitario, "
                    + "factura.TotalPagar FROM producto INNER JOIN orden on producto.Id_Producto = orden.Fk_Producto "
                    + "INNER JOIN factura ON factura.Id_Factura = orden.Fk_Factura where factura.Fecha between '" + date + "' and '" + date2 + "'";

        }
        String[] datos = new String[5];
        try {
            PreparedStatement pst = null;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            pst = cn.prepareStatement(sql);

            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);

                modelo.addRow(datos);
            }
            tbprod.setModel(modelo);
        } catch (SQLException ex) {
            System.out.println(ex);
            // Logger.getLogger(ingresoproductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void mostrarProductosMontoFecha2(String valor) {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Monto total");

        tbMonto.setModel(modelo);
        processCalendar();
        processCalendar2();

        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT sum(producto.PrecioUnitario) * SUM(orden.Cantidad) FROM producto "
                    + "INNER JOIN orden on producto.Id_Producto = orden.Fk_Producto "
                    + "INNER JOIN factura ON factura.Id_Factura = orden.Fk_Factura where factura.Fecha between '" + date + "' and '" + date2 + "'";

        }
        String[] datos = new String[1];
        try {
            PreparedStatement pst = null;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            pst = cn.prepareStatement(sql);

            while (rs.next()) {

                datos[0] = rs.getString(1);

                modelo.addRow(datos);
            }
            tbMonto.setModel(modelo);
        } catch (SQLException ex) {
            System.out.println(ex);
            // Logger.getLogger(ingresoproductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void SumaTotal(String valor) {

        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT SUM(PrecioUnitario * Cantidad) FROM producto";

        }
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
//            txtTotalFacturado.setText(sql);

        } catch (SQLException ex) {
            System.out.println(ex);
            // Logger.getLogger(ingresoproductos.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

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
    private javax.swing.JPanel BtnFiltrarF;
    private javax.swing.JPanel BtnIRegistrarCliente;
    private javax.swing.JPanel BtnMenu;
    private javax.swing.JLabel BtnMinimizar;
    private javax.swing.JPanel BtnProforma;
    private javax.swing.JLabel BtnSalir;
    private javax.swing.JPanel BtnVentas;
    private javax.swing.JButton Btnfecha1;
    private javax.swing.JPanel PanelMenuRPro;
    private javax.swing.JButton btnFecha2;
    private javax.swing.JLabel btnSubMenu;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFecha1;
    private javax.swing.JLabel lblHasta1;
    private javax.swing.JLabel lblTituloReporte;
    private javax.swing.JLabel lblTotalFacturado;
    private javax.swing.JTable tbMonto;
    private javax.swing.JTable tbprod;
    private com.toedter.calendar.JDateChooser txtFecha1;
    private com.toedter.calendar.JDateChooser txtFecha2;
    // End of variables declaration//GEN-END:variables
datosP cc = new datosP();
    Connection cn = cc.conexion();
}
