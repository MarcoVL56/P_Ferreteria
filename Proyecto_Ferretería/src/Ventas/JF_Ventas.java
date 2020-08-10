package Ventas;

import Conexion.datosP;
import Factura.JF_Factura;
import Factura.JF_FiltroFactura;
import Menú.JF_Menú;
import Proformas.JF_Proformas;
import RegistrarEmpleado.JF_RegistrarCliente;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class JF_Ventas extends javax.swing.JFrame {

    TableRowSorter trsfiltro;
    String date;

    public JF_Ventas() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void processCalendar() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //yyyy-MM-dd
        date = dateFormat.format(txtFechaFact.getDate());

    }

    public void mostrardatosProducto(String valor) {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Presentación");
        modelo.addColumn("Precio unitario");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Proveedor");

        tbProductoInventario.setModel(modelo);
        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT Id_Disponibilidad , Nombre , Presentacion, PrecioUnitario, Cantidad, NombreProveedor "
                    + "FROM inventario a INNER JOIN producto b on (b.Id_Producto = a.Fk_Productos) INNER Join proveedor c on (c.Id_Proveedor = a.Fk_Proveedor)";

        }
        String[] datos = new String[6];
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

                modelo.addRow(datos);
            }
            tbProductoInventario.setModel(modelo);
        } catch (SQLException ex) {
            System.out.println(ex);
            // Logger.getLogger(ingresoproductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void mostrarBusquedaProducto(String valor) {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Presentación");
        modelo.addColumn("Precio unitario");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Proveedor");

        tbProductoInventario.setModel(modelo);
        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT Id_Disponibilidad , Nombre , Presentacion, PrecioUnitario, Cantidad, NombreProveedor FROM inventario a INNER JOIN producto b on (b.Id_Producto = a.Fk_Productos) "
                    + "INNER Join proveedor c on (c.Id_Proveedor = a.Fk_Proveedor)";

        }
        String[] datos = new String[6];
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

                modelo.addRow(datos);
            }
            tbProductoInventario.setModel(modelo);
        } catch (SQLException ex) {
            System.out.println(ex);
            // Logger.getLogger(ingresoproductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void mostrarProductosSeleccionados(String valor) {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id_Producto");
        modelo.addColumn("Producto");
        modelo.addColumn("Presentacion");
        modelo.addColumn("Precio Unitario");
        modelo.addColumn("Cantidad");

        tbProductosSelec.setModel(modelo);
        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT b.Id_Producto, b.Nombre, b.Presentacion, b.PrecioUnitario, a.Cantidad"
                    + " FROM orden a INNER JOIN producto b on (b.Id_Producto = a.Fk_Producto) where Fk_Estado = 3";

        }
        String[] datos = new String[5];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);

                modelo.addRow(datos);
            }
            tbProductosSelec.setModel(modelo);
        } catch (SQLException ex) {
            System.out.println(ex);
            // Logger.getLogger(ingresoproductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void mostrarCliente(String valor) {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("AP1");
        modelo.addColumn("AP2");

        tbCliente.setModel(modelo);
        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT Nombre, PrimerApellido, SegundoApellido FROM registro_cliente where Id_Cliente = '" + txtCedula.getText() + "'";

        }
        String[] datos = new String[3];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);

                modelo.addRow(datos);
            }
            tbCliente.setModel(modelo);
        } catch (SQLException ex) {
            System.out.println(ex);
            // Logger.getLogger(ingresoproductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void mostrardatoSubtotal(String valor) {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Monto inicial");

        tbSubtotal.setModel(modelo);
        String sql = "";
        if (valor.equals("")) {
            sql = "select sum( a.Cantidad * b.PrecioUnitario ) as Monto from orden a INNER JOIN producto b on (b.Id_Producto = a.Fk_Producto) where Fk_Estado = 3";

        }
        String[] datos = new String[1];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                datos[0] = rs.getString(1);

                modelo.addRow(datos);
            }
            tbSubtotal.setModel(modelo);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void Montos() {

        int Subtotal = Integer.parseInt(txtSubTotal.getText());
        Double Descuento = 0.0;
        Double Impuesto;
        Double TotalPagar;

        if (Subtotal < 250000) {

            Descuento = 0.0;

            Impuesto = (Subtotal * 0.13);

            TotalPagar = (Subtotal + Impuesto) - Descuento;

            txtImpuesto.setText("" + Impuesto);
            txtDescuento.setText("" + Descuento);
            txtTotalPagar.setText("" + TotalPagar);

        } else if (Subtotal >= 250000 && Subtotal < 500000) {

            Descuento = (Subtotal * 0.10);

            Impuesto = (Subtotal * 0.13);

            TotalPagar = (Subtotal + Impuesto) - Descuento;

            txtImpuesto.setText("" + Impuesto);
            txtDescuento.setText("" + Descuento);
            txtTotalPagar.setText("" + TotalPagar);

        } else if (Subtotal >= 500000 && Subtotal < 1000000) {

            Descuento = (Subtotal * 0.15);

            Impuesto = (Subtotal * 0.13);

            TotalPagar = (Subtotal + Impuesto) - Descuento;

            txtImpuesto.setText("" + Impuesto);
            txtDescuento.setText("" + Descuento);
            txtTotalPagar.setText("" + TotalPagar);

        } else if (Subtotal >= 1000000) {

            Descuento = (Subtotal * 0.20);

            Impuesto = (Subtotal * 0.13);

            TotalPagar = (Subtotal + Impuesto) - Descuento;

            txtImpuesto.setText("" + Impuesto);
            txtDescuento.setText("" + Descuento);
            txtTotalPagar.setText("" + TotalPagar);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnSubMenu = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JLabel();
        BtnMinimizar = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCliente = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProductoInventario = new javax.swing.JTable();
        BtnProf = new javax.swing.JButton();
        BtnPagar = new javax.swing.JButton();
        VerSubtotal = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtImpuesto = new javax.swing.JTextField();
        txtDescuento = new javax.swing.JTextField();
        txtTotalPagar = new javax.swing.JTextField();
        txtSubTotal = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtFechaFact = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnAplicarDescuento = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        BtnVerificar = new javax.swing.JButton();
        PanelMenuV = new javax.swing.JPanel();
        BtnMenu = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        BtnFiltrarF = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        BtnProforma = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        BtnIRegistrarCliente = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtUsuarioVentas = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        BtnAgregar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbProductosSelec = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbSubtotal = new javax.swing.JTable();
        txtCodigoBarras = new javax.swing.JTextField();

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

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        jLabel14.setText("Monto");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 360, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nombre del producto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 620, -1, -1));

        tbCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbCliente.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tbCliente);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 260, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Productos en inventario ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Productos seleccionados");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 80, -1, -1));

        tbProductoInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbProductoInventario.setGridColor(new java.awt.Color(255, 255, 255));
        tbProductoInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProductoInventarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbProductoInventario);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 620, 310));

        BtnProf.setText("Guardar como proforma");
        BtnProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProfActionPerformed(evt);
            }
        });
        jPanel1.add(BtnProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 570, 220, 30));

        BtnPagar.setText("Pagar ");
        BtnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPagarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 640, 220, 30));

        VerSubtotal.setText("Ver total");
        VerSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerSubtotalActionPerformed(evt);
            }
        });
        jPanel1.add(VerSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 480, 110, -1));

        jPanel4.setBackground(new java.awt.Color(0, 102, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Descuento");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total a pagar ");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        txtImpuesto.setEditable(false);
        jPanel4.add(txtImpuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 100, -1));

        txtDescuento.setEditable(false);
        jPanel4.add(txtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 100, -1));

        txtTotalPagar.setEditable(false);
        jPanel4.add(txtTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 100, 20));

        txtSubTotal.setEditable(false);
        jPanel4.add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 100, -1));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Impuesto");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        jPanel4.add(txtFechaFact, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 100, 20));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Subtotal");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 320, 250, 240));

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

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Cédula");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 200, 30));

        BtnVerificar.setText("Verificar");
        BtnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerificarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 200, -1));

        PanelMenuV.setBackground(new java.awt.Color(204, 204, 204));
        PanelMenuV.setForeground(new java.awt.Color(255, 255, 255));
        PanelMenuV.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        PanelMenuV.add(BtnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 150, 30));

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

        PanelMenuV.add(BtnFiltrarF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 150, -1));

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

        PanelMenuV.add(BtnProforma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 150, -1));

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

        PanelMenuV.add(BtnIRegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 150, 30));

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
        PanelMenuV.add(txtUsuarioVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 120, 40));

        jLabel26.setBackground(new java.awt.Color(245, 245, 245));
        jLabel26.setOpaque(true);
        PanelMenuV.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 40, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Usuario");
        PanelMenuV.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jPanel1.add(PanelMenuV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 190, 660));

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 650, 160, 30));

        jLabel10.setText("Código");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 620, -1, -1));

        txtCodigo.setEditable(false);
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 620, 110, -1));

        jLabel16.setText("Cantidad");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 660, -1, -1));
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 660, 110, -1));

        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 640, -1, -1));

        tbProductosSelec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbProductosSelec.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(tbProductosSelec);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 110, 540, 190));

        jLabel19.setText("Cliente");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, -1, -1));

        tbSubtotal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbSubtotal.setGridColor(new java.awt.Color(255, 255, 255));
        tbSubtotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSubtotalMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbSubtotal);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 420, 110, 50));

        txtCodigoBarras.setEditable(false);
        jPanel1.add(txtCodigoBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 80, 110, -1));

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

    private void btnAplicarDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarDescuentoActionPerformed
        JF_Permiso m = new JF_Permiso();
        m.setVisible(true);

    }//GEN-LAST:event_btnAplicarDescuentoActionPerformed

    private void BtnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMenuMouseClicked
        JF_Menú m = new JF_Menú();
        m.setVisible(true);
        dispose();

        m.txtUsuarioIniciado.setText(txtUsuarioVentas.getText());

    }//GEN-LAST:event_BtnMenuMouseClicked

    private void BtnFiltrarFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFiltrarFMouseClicked
        JF_FiltroFactura m = new JF_FiltroFactura();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnFiltrarFMouseClicked

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

    private void filtro() {
        int columnatb = 1;
        trsfiltro.setRowFilter(RowFilter.regexFilter(txtnombre.getText(), columnatb));

    }


    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        // TODO add your handling code here:
        txtnombre.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtnombre.getText());
                txtnombre.setText(cadena);
                filtro();
            }
        });
        trsfiltro = new TableRowSorter(tbProductoInventario.getModel());
        tbProductoInventario.setRowSorter(trsfiltro);
    }//GEN-LAST:event_txtnombreKeyTyped

    private void BtnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPagarActionPerformed

        try {
            datosP cc = new datosP();
            Connection cn = cc.conexion();
            processCalendar();

            PreparedStatement pst = cn.prepareStatement("INSERT INTO factura(Id_Factura, Fecha, Subtotal, Impuesto, "
                    + "Descuento, TotalPagar, Fk_Usuario) VALUES (?,?,?,?,?,?,?)");

            pst.setString(1, txtCodigoBarras.getText());
            pst.setString(2, date);
            pst.setString(3, txtSubTotal.getText());
            pst.setString(4, txtImpuesto.getText());
            pst.setString(5, txtDescuento.getText());
            pst.setString(6, txtTotalPagar.getText());
            pst.setString(7, txtUsuarioVentas.getText());

            pst.executeUpdate();

        } catch (Exception e) {
            System.out.print(e);
        }

        try {
            PreparedStatement pst = cn.prepareStatement("UPDATE orden SET Fk_Factura=" + txtCodigoBarras.getText() + ", Fk_Estado = 1 where Fk_Estado = 3");
            pst.executeUpdate();

        } catch (Exception e) {
            System.out.print(e.getMessage());
        }

        JF_Factura m = new JF_Factura();
        m.setVisible(true);
        dispose();

        m.txtCodigoFac.setText(txtCodigoBarras.getText());


    }//GEN-LAST:event_BtnPagarActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed

        try {
            datosP cc = new datosP();
            Connection cn = cc.conexion();

            PreparedStatement pst = cn.prepareStatement("INSERT INTO orden(Cantidad,"
                    + "Fk_Producto,Fk_Cliente, FK_Estado) VALUES (?,?,?,'3')");

            pst.setString(1, txtCantidad.getText());
            pst.setString(2, txtCodigo.getText());
            pst.setString(3, txtCedula.getText());

            pst.executeUpdate();

        } catch (Exception e) {
            System.out.print(e);
        }
        txtCantidad.setText("");
        txtCodigo.setText("");
        txtnombre.setText("");

        mostrarProductosSeleccionados("");

        mostrardatoSubtotal("");


    }//GEN-LAST:event_BtnAgregarActionPerformed


    private void BtnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerificarActionPerformed
        mostrarCliente("");
    }//GEN-LAST:event_BtnVerificarActionPerformed

    private void VerSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerSubtotalActionPerformed

        int numero;
        numero = (int) (Math.random() * 1000000000) + 1;
        txtCodigoBarras.setText("" + numero);

        Montos();

    }//GEN-LAST:event_VerSubtotalActionPerformed

    private void tbSubtotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSubtotalMouseClicked

        int seleccionar = tbSubtotal.rowAtPoint(evt.getPoint());
        txtSubTotal.setText(String.valueOf(tbSubtotal.getValueAt(seleccionar, 0)));
    }//GEN-LAST:event_tbSubtotalMouseClicked

    private void tbProductoInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductoInventarioMouseClicked
        int seleccionar = tbProductoInventario.rowAtPoint(evt.getPoint());
        txtCodigo.setText(String.valueOf(tbProductoInventario.getValueAt(seleccionar, 0)));
    }//GEN-LAST:event_tbProductoInventarioMouseClicked

    private void BtnProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProfActionPerformed

        try {
            datosP cc = new datosP();
            Connection cn = cc.conexion();
            processCalendar();

            PreparedStatement pst = cn.prepareStatement("INSERT INTO factura(Id_Factura, Fecha, Subtotal, Impuesto, "
                    + "Descuento, TotalPagar, Fk_Usuario) VALUES (?,?,?,?,?,?,?)");

            pst.setString(1, txtCodigoBarras.getText());
            pst.setString(2, date);
            pst.setString(3, txtSubTotal.getText());
            pst.setString(4, txtImpuesto.getText());
            pst.setString(5, txtDescuento.getText());
            pst.setString(6, txtTotalPagar.getText());
            pst.setString(7, txtUsuarioVentas.getText());

            pst.executeUpdate();

        } catch (Exception e) {
            System.out.print(e);
        }

        try {
            PreparedStatement pst = cn.prepareStatement("UPDATE orden SET Fk_Factura=" + txtCodigoBarras.getText() + ", Fk_Estado = 2 where Fk_Estado = 3");
            pst.executeUpdate();

        } catch (Exception e) {
            System.out.print(e.getMessage());
        }

        txtSubTotal.setText("");
        txtImpuesto.setText("");
        txtDescuento.setText("");
        txtTotalPagar.setText("");
        txtCodigoBarras.setText("");

        DefaultTableModel tb = (DefaultTableModel) tbProductosSelec.getModel();
        int a = tbProductosSelec.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }

        DefaultTableModel tb2 = (DefaultTableModel) tbSubtotal.getModel();
        int b = tbSubtotal.getRowCount() - 1;
        for (int i = b; i >= 0; i--) {
            tb2.removeRow(tb2.getRowCount() - 1);
        }


    }//GEN-LAST:event_BtnProfActionPerformed

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
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JPanel BtnFiltrarF;
    private javax.swing.JPanel BtnIRegistrarCliente;
    private javax.swing.JPanel BtnMenu;
    private javax.swing.JLabel BtnMinimizar;
    private javax.swing.JButton BtnPagar;
    private javax.swing.JButton BtnProf;
    private javax.swing.JPanel BtnProforma;
    private javax.swing.JLabel BtnSalir;
    private javax.swing.JButton BtnVerificar;
    private javax.swing.JPanel PanelMenuV;
    private javax.swing.JButton VerSubtotal;
    private javax.swing.JButton btnAplicarDescuento;
    private javax.swing.JLabel btnSubMenu;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel26;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tbCliente;
    public javax.swing.JTable tbProductoInventario;
    private javax.swing.JTable tbProductosSelec;
    private javax.swing.JTable tbSubtotal;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoBarras;
    private javax.swing.JTextField txtDescuento;
    private com.toedter.calendar.JDateChooser txtFechaFact;
    private javax.swing.JTextField txtImpuesto;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotalPagar;
    public javax.swing.JTextField txtUsuarioVentas;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
  datosP cc = new datosP();
    Connection cn = cc.conexion();
}
