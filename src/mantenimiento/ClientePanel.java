/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mantenimiento;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Cliente;
import modelos.ClienteDAO;

/**
 *
 * @author armando
 */
public class ClientePanel extends javax.swing.JPanel {

    Cliente cliente = new Cliente();
    ClienteDAO clienteDAO = new ClienteDAO();
    DefaultTableModel modelo = new DefaultTableModel();
    int id;

    /**
     * Creates new form panelCliente
     */
    public ClientePanel() {
        initComponents();
        listar();
    }

    void listar() {
        List<Cliente> lista = clienteDAO.listar();
        modelo = (DefaultTableModel) tabla.getModel();
        Object[] o = new Object[9];
        for (int i = 0; i < lista.size(); i++) {
            o[0] = lista.get(i).getId();
            o[1] = lista.get(i).getNombre();
            o[2] = lista.get(i).getRfc();
            o[3] = lista.get(i).getDireccion();
            o[4] = lista.get(i).getTelefono();
            o[5] = lista.get(i).getColonia();
            o[6] = lista.get(i).getCp();
            o[7] = lista.get(i).getCiudad();
            o[8] = lista.get(i).getCorreo();
            modelo.addRow(o);
        }
        tabla.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 217, 0));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 44));
        jLabel1.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 44));
        jLabel2.setText("RFC:");

        txtRFC.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 44));
        jLabel3.setText("Dirección:");

        txtDireccion.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 44));
        jLabel4.setText("Teléfono:");

        txtTelefono.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 44));
        jLabel5.setText("Colonia:");

        txtColonia.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 44));
        jLabel6.setText("C.P:");

        txtCP.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 44));
        jLabel7.setText("Ciudad:");

        txtCiudad.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 44));
        jLabel8.setText("Correo electrónico:");

        txtCorreo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        btnAgregar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "RFC", "Dirección", "Teléfono", "Colonia", "C.P.", "Ciudad", "Correo electrónico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        scroll.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(313, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(42, 42, 42)
                        .addComponent(btnActualizar)
                        .addGap(42, 42, 42)
                        .addComponent(btnEliminar)
                        .addGap(42, 42, 42)
                        .addComponent(btnNuevo)
                        .addGap(23, 23, 23)))
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "¡Para actualizar debes seleccionar una fila!", "Selecciona para actualizar", JOptionPane.WARNING_MESSAGE);
        } else if (fila != -1) {
            if (txtNombre.getText().equals("") || txtRFC.getText().equals("") || txtDireccion.getText().equals("") || txtTelefono.getText().equals("") || txtColonia.getText().equals("") || txtCP.getText().equals("") || txtCiudad.getText().equals("") || txtCorreo.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "¡Debes rellanar todos los campos!", "Campos vacios", JOptionPane.WARNING_MESSAGE);
                if (txtNombre.getText().equals("")) {
                    txtNombre.requestFocus();
                } else if (txtRFC.getText().equals("")) {
                    txtRFC.requestFocus();
                } else if (txtDireccion.getText().equals("")) {
                    txtDireccion.requestFocus();
                } else if (txtTelefono.getText().equals("")) {
                    txtTelefono.requestFocus();
                } else if (txtColonia.getText().equals("")) {
                    txtColonia.requestFocus();
                } else if (txtCP.getText().equals("")) {
                    txtCP.requestFocus();
                } else if (txtCiudad.getText().equals("")) {
                    txtCiudad.requestFocus();
                } else if (txtCorreo.getText().equals("")) {
                    txtCorreo.requestFocus();
                }
            } else {
                actualizar();
                limpiar();
                listar();
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (txtNombre.getText().equals("") || txtRFC.getText().equals("") || txtDireccion.getText().equals("") || txtTelefono.getText().equals("") || txtColonia.getText().equals("") || txtCP.getText().equals("") || txtCiudad.getText().equals("") || txtCorreo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "¡Debes rellanar todos los campos!", "Campos vacios", JOptionPane.WARNING_MESSAGE);
            if (txtNombre.getText().equals("")) {
                txtNombre.requestFocus();
            } else if (txtRFC.getText().equals("")) {
                txtRFC.requestFocus();
            } else if (txtDireccion.getText().equals("")) {
                txtDireccion.requestFocus();
            } else if (txtTelefono.getText().equals("")) {
                txtTelefono.requestFocus();
            } else if (txtColonia.getText().equals("")) {
                txtColonia.requestFocus();
            } else if (txtCP.getText().equals("")) {
                txtCP.requestFocus();
            } else if (txtCiudad.getText().equals("")) {
                txtCiudad.requestFocus();
            } else if (txtCorreo.getText().equals("")) {
                txtCorreo.requestFocus();
            }
        } else {
            agregar();
            limpiar();
            listar();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "¡Para eliminar debes seleccionar una fila!", "Selecciona para eliminar", JOptionPane.WARNING_MESSAGE);
        } else {
            eliminar();
            limpiar();
            listar();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        nuevo();
        limpiar();
        listar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila = tabla.getSelectedRow();
        id = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
        String nombre = tabla.getValueAt(fila, 1).toString();
        String rfc = tabla.getValueAt(fila, 2).toString();
        String direccion = tabla.getValueAt(fila, 3).toString();
        String telefono = tabla.getValueAt(fila, 4).toString();
        String colonia = tabla.getValueAt(fila, 5).toString();
        String cp = tabla.getValueAt(fila, 6).toString();
        String ciudad = tabla.getValueAt(fila, 7).toString();
        String correo = tabla.getValueAt(fila, 8).toString();
        txtNombre.setText(nombre);
        txtRFC.setText(rfc);
        txtDireccion.setText(direccion);
        txtTelefono.setText(telefono);
        txtColonia.setText(colonia);
        txtCP.setText(cp);
        txtCiudad.setText(ciudad);
        txtCorreo.setText(correo);
    }//GEN-LAST:event_tablaMouseClicked

    void agregar() {
        String nombre = txtNombre.getText();
        String rfc = txtRFC.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();
        String colonia = txtColonia.getText();
        String cp = txtCP.getText();
        String ciudad = txtCiudad.getText();
        String correo = txtCorreo.getText();
        Object[] o = new Object[8];
        o[0] = nombre;
        o[1] = rfc;
        o[2] = direccion;
        o[3] = telefono;
        o[4] = colonia;
        o[5] = cp;
        o[6] = ciudad;
        o[7] = correo;
        clienteDAO.agregar(o);
    }

    void actualizar() {
        String nombre = txtNombre.getText();
        String rfc = txtRFC.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();
        String colonia = txtColonia.getText();
        String cp = txtCP.getText();
        String ciudad = txtCiudad.getText();
        String correo = txtCorreo.getText();
        Object[] o = new Object[9];
        o[0] = nombre;
        o[1] = rfc;
        o[2] = direccion;
        o[3] = telefono;
        o[4] = colonia;
        o[5] = cp;
        o[6] = ciudad;
        o[7] = correo;
        o[8] = id;
        clienteDAO.actualizar(o);
    }

    void eliminar() {
        int fila = tabla.getSelectedRow();
        int id = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
        clienteDAO.eliminar(id);
    }

    void nuevo() {
        txtNombre.setText("");
        txtRFC.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtColonia.setText("");
        txtCP.setText("");
        txtCiudad.setText("");
        txtCorreo.setText("");
        txtNombre.requestFocus();
    }

    void limpiar() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCP;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}