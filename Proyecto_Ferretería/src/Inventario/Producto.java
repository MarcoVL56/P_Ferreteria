package Inventario;

import Factura.JF_FiltroFactura;
import Menú.JF_Menú;
import Proformas.JF_Proformas;
import RegistrarEmpleado.JF_RegistrarCliente;
import Ventas.JF_Ventas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Producto extends javax.swing.JFrame {

    Conexion.Conexion con = new Conexion.Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public Producto() {
        initComponents();
        setLocationRelativeTo(null);
        CargaProveedor();
        CargaProducto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnSubMenu = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JLabel();
        BtnMinimizar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbpresentacion = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnborrar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btningresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtIdbuscar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        PanelMenuProducto = new javax.swing.JPanel();
        BtnMenu = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        BtnFiltrarF = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        BtnVentas = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        BtnInventario = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        BtnProveedor = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtnombre1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cbproducto = new javax.swing.JComboBox<>();
        cbprove = new javax.swing.JComboBox<>();
        btnaddinventario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1236, Short.MAX_VALUE)
                .addComponent(BtnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnSalir))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSubMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BtnMinimizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, -1));
        jPanel2.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 260, 110, 30));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setText("Presentación");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, -1, -1));

        cbpresentacion.setBackground(new java.awt.Color(0, 0, 255));
        cbpresentacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilo", "Unidad", "Gramo" }));
        jPanel2.add(cbpresentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 110, 30));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setText("Precio Unitario");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 190, -1, -1));
        jPanel2.add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 190, 110, 30));

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnborrar.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnborrar.setText("Borrar");
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnborrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 90, 88, 38));

        btnmodificar.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 90, -1, 38));

        btnbuscar.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 90, 88, 38));

        btningresar.setBackground(new java.awt.Color(255, 204, 0));
        btningresar.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btningresar.setText("Ingresar");
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });
        jPanel1.add(btningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 90, 88, 38));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel8.setText("Nombre del producto");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, -1, -1));
        jPanel1.add(txtIdbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 98, -1));

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel9.setText("Opciones");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 28, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 680, 190));

        PanelMenuProducto.setBackground(new java.awt.Color(204, 204, 204));
        PanelMenuProducto.setForeground(new java.awt.Color(255, 255, 255));
        PanelMenuProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        PanelMenuProducto.add(BtnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 150, 30));

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

        PanelMenuProducto.add(BtnFiltrarF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 150, -1));

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

        PanelMenuProducto.add(BtnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 150, -1));

        BtnInventario.setBackground(new java.awt.Color(153, 153, 153));
        BtnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnInventarioMouseClicked(evt);
            }
        });
        BtnInventario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setBackground(new java.awt.Color(67, 81, 141));
        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Inventario");
        BtnInventario.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 90, 30));

        PanelMenuProducto.add(BtnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 150, -1));

        BtnProveedor.setBackground(new java.awt.Color(153, 153, 153));
        BtnProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnProveedorMouseClicked(evt);
            }
        });
        BtnProveedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(67, 81, 141));
        jLabel18.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Proveedor");
        BtnProveedor.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 30));

        PanelMenuProducto.add(BtnProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, 30));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-producto-nuevo-80.png"))); // NOI18N
        PanelMenuProducto.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 120, 100));

        jPanel2.add(PanelMenuProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 660));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setText("Cantidad");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, -1, -1));
        jPanel2.add(txtnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 120, 30));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        jLabel14.setText("Ingresar producto");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, -1, -1));

        cbproducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jPanel2.add(cbproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 320, 110, 30));

        cbprove.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jPanel2.add(cbprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 320, 110, 30));

        btnaddinventario.setBackground(new java.awt.Color(255, 255, 51));
        btnaddinventario.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnaddinventario.setText("Agregar Inventario");
        btnaddinventario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51), 2));
        btnaddinventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddinventarioActionPerformed(evt);
            }
        });
        jPanel2.add(btnaddinventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 390, 190, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1420, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubMenuMouseClicked
        int posicion = PanelMenuProducto.getX();
        if (posicion > -1) {
            Animacion.Animacion.mover_izquierda(0, -264, 2, 2, PanelMenuProducto);
        } else {
            Animacion.Animacion.mover_derecha(-264, 0, 2, 2, PanelMenuProducto);
        }
    }//GEN-LAST:event_btnSubMenuMouseClicked

    private void BtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_BtnSalirMouseClicked

    private void BtnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_BtnMinimizarMouseClicked

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed

        try {

            ps = con.conectar().prepareStatement("INSERT INTO producto (Nombre,Presentacion,PrecioUnitario,Cantidad) "
                    + "VALUES(?,?,?,?)");
            ps.setString(1, txtnombre1.getText());

            int seleccion = cbpresentacion.getSelectedIndex();
            ps.setString(2, cbpresentacion.getItemAt(seleccion));

            ps.setInt(3, Integer.parseInt(txtprecio.getText()));
            ps.setInt(4, Integer.parseInt(txtCantidad.getText()));
            ps.execute();
            Limpiar();
            JOptionPane.showMessageDialog(null, "Producto guardado");

            con.Desconectar();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar producto: ");
        }

    }//GEN-LAST:event_btningresarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        try {
            ps = con.conectar().prepareStatement("SELECT * FROM producto WHERE Nombre= ?");
            ps.setString(1, txtIdbuscar.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                txtnombre1.setText(rs.getString("Nombre"));
                cbpresentacion.setSelectedItem(rs.getString("Presentacion"));
                txtprecio.setText(rs.getString("PrecioUnitario"));
                txtCantidad.setText(rs.getString("Cantidad"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe un producto con el codigo ingresado...");

            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        try {
            ps = con.conectar().prepareStatement("UPDATE producto SET  "
                    + "Nombre=?,Presentacion=?,PrecioUnitario=?,Cantidad=? ");
            ps.setString(1, txtnombre1.getText());

            int seleccion = cbpresentacion.getSelectedIndex();
            ps.setString(2, cbpresentacion.getItemAt(seleccion));

            ps.setInt(3, Integer.parseInt(txtprecio.getText()));
            ps.setInt(4, Integer.parseInt(txtCantidad.getText()));

            ps.execute();

            JOptionPane.showMessageDialog(null, "Producto Modificado");

            con.Desconectar();
            Limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Modificar producto: ");
        }

    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        try {
            ps = con.conectar().prepareStatement("DELETE FROM producto WHERE Id_Producto=?");
            ps.setInt(1, Integer.parseInt(txtIdbuscar.getText()));

            ps.execute();

            JOptionPane.showMessageDialog(null, "Producto Eliminado");

            con.Desconectar();
            Limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar producto: ");
        }
    }//GEN-LAST:event_btnborrarActionPerformed

    private void BtnProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnProveedorMouseClicked
        Proveedor m = new Proveedor();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnProveedorMouseClicked

    private void BtnInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInventarioMouseClicked
        JF_Inventario m = new JF_Inventario();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnInventarioMouseClicked

    private void BtnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVentasMouseClicked
        JF_Ventas m = new JF_Ventas();
        m.setVisible(true);
        dispose();
        m.mostrardatosProducto("");
    }//GEN-LAST:event_BtnVentasMouseClicked

    private void BtnFiltrarFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFiltrarFMouseClicked
        JF_FiltroFactura m = new JF_FiltroFactura();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnFiltrarFMouseClicked

    private void BtnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMenuMouseClicked
        JF_Menú m = new JF_Menú();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnMenuMouseClicked

     private void CargaProveedor() {
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = con.conectar().prepareStatement("SELECT NombreProveedor FROM proveedor ORDER BY NombreProveedor ASC");

            rs = ps.executeQuery();

            while (rs.next()) {
                cbprove.addItem(rs.getString("NombreProveedor"));
            }
            con.Desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la matrix: " + e);
        }
    }

    private void CargaProducto() {
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = con.conectar().prepareStatement("SELECT Nombre FROM producto ORDER BY Nombre ASC");

            rs = ps.executeQuery();

            while (rs.next()) {
                cbproducto.addItem(rs.getString("Nombre"));
            }
            con.Desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la matrix: " + e);
        }
    }
    
    private void btnaddinventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddinventarioActionPerformed
        
        
        String pro;
        String prove;

        try {
            ps = con.conectar().prepareStatement("INSERT INTO inventario (Fk_Productos,Fk_Proveedor) "
                + "VALUES(?,?)");

            pro= cbproducto.getItemAt(cbproducto.getSelectedIndex());
            ps.setInt(1, Integer.parseInt(pro));
            prove=cbprove.getItemAt(cbprove.getSelectedIndex());
            ps.setInt(2, Integer.parseInt(prove));

            JOptionPane.showMessageDialog(null, "Agregado a Inventario");
            con.Desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Ingresar en Inventario: " + e);
        }

        //INSERT INTO `inventario` (`Id_Disponibilidad`, `Fk_Productos`, `Fk_Proveedor`) VALUES (NULL, '7', '3');
    }//GEN-LAST:event_btnaddinventarioActionPerformed
    private void Limpiar() {
        txtnombre1.setText("");
        txtprecio.setText("");
        txtIdbuscar.setText("");
        txtCantidad.setText("");
    }
    
    
    
/*
    private void cbproveedor() {
        try {
            ps = con.conectar().prepareStatement("SELECT NombreProveedor FROM proveedor ORDER BY NombreProveedor ASC");

            rs = ps.executeQuery();

            while (rs.next()) {
                cbprove.addItem(rs.getString("NombreProveedor"));
            }
            con.Desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la matrix: " + e);
        }
    }
*/
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
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnFiltrarF;
    private javax.swing.JPanel BtnInventario;
    private javax.swing.JPanel BtnMenu;
    private javax.swing.JLabel BtnMinimizar;
    private javax.swing.JPanel BtnProveedor;
    private javax.swing.JLabel BtnSalir;
    private javax.swing.JPanel BtnVentas;
    private javax.swing.JPanel PanelMenuProducto;
    private javax.swing.JLabel btnSubMenu;
    private javax.swing.JButton btnaddinventario;
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btningresar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JComboBox<String> cbpresentacion;
    private javax.swing.JComboBox<String> cbproducto;
    private javax.swing.JComboBox<String> cbprove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtIdbuscar;
    private javax.swing.JTextField txtnombre1;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
