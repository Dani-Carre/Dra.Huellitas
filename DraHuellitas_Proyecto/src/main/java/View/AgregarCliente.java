/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ClienteController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author XPC
 */
public class AgregarCliente extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public AgregarCliente() {

        initComponents();
                ///////////////////////NAVBAR///////////////////////
        //Accion del Boton de Ir a pantalla de Inicio
        navBtnInicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Inicio inicio = new Inicio();
                inicio.setVisible(true);
                setVisible(false);
            }
        });

        //Accion del Boton de Ir a pantalla de Expedientes
        navBtnExpedientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Expedientes expediente = new Expedientes();
                expediente.setVisible(true);
                setVisible(false);

            }
        });

        //Accion del Boton de Ir a pantalla de Expedientes
        navBtnFacturar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                //Facturar facturar = new Facturar();
                //facturar.setVisible(true);
                setVisible(false);

            }
        });

        //Accion del Boton de Ir a pantalla de Expedientes
        navBtnServicios.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
        ///////////////////////NAVBAR///////////////////////
        
        

        ClienteController clienteController = new ClienteController();

        btnAgragarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!inTxtNombre.getText().equals("")
                        && !inTxtApellido.getText().equals("")
                        && !inTxtTelefono.getText().equals("")
                        && !inTxtCorreo.getText().equals("")
                        && !inTxtDireccion.getText().equals("")) {

                    // Extrae los datos desde los campos del formulario
                    String nombre = inTxtNombre.getText();
                    String apellido = inTxtApellido.getText();
                    String telefono = inTxtTelefono.getText();
                    String email = inTxtCorreo.getText();
                    String direccion = inTxtDireccion.getText();

                    // Llama al método para agregar al cliente
                    clienteController.agregarCliente(nombre, apellido, telefono, email, direccion);

                    JOptionPane.showMessageDialog(null, "Se agregó el cliente correctamente :)", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);

                    AgregarMascota mascota = new AgregarMascota();
                    mascota.setVisible(true);
                    setVisible(false);

                } else {

                }
            }
        });
        
        
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        inTxtNombre = new javax.swing.JTextField();
        inTxtApellido = new javax.swing.JTextField();
        inTxtTelefono = new javax.swing.JTextField();
        inTxtCorreo = new javax.swing.JTextField();
        inTxtDireccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAgragarCliente = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        navBtnInicio = new javax.swing.JButton();
        navBtnFacturar = new javax.swing.JButton();
        navBtnExpedientes = new javax.swing.JButton();
        navBtnServicios = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dra.Huellitas");

        inTxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inTxtNombreActionPerformed(evt);
            }
        });

        inTxtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inTxtApellidoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Teléfono");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Correo");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Dirección");

        btnAgragarCliente.setText("Agregar");

        btnCancelar.setText("Cancelar");

        jPanel2.setBackground(new java.awt.Color(24, 114, 184));
        jPanel2.setPreferredSize(new java.awt.Dimension(960, 110));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" Veterinaria Dra.Huellitas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        navBtnInicio.setBackground(new java.awt.Color(255, 255, 255));
        navBtnInicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        navBtnInicio.setForeground(new java.awt.Color(0, 0, 0));
        navBtnInicio.setText("Inicio");
        navBtnInicio.setBorder(null);
        navBtnInicio.setMaximumSize(new java.awt.Dimension(102, 27));
        navBtnInicio.setMinimumSize(new java.awt.Dimension(102, 27));
        navBtnInicio.setPreferredSize(new java.awt.Dimension(102, 27));
        navBtnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navBtnInicioActionPerformed(evt);
            }
        });

        navBtnFacturar.setBackground(new java.awt.Color(255, 255, 255));
        navBtnFacturar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        navBtnFacturar.setForeground(new java.awt.Color(0, 0, 0));
        navBtnFacturar.setText("Facturar");
        navBtnFacturar.setBorder(null);
        navBtnFacturar.setMaximumSize(new java.awt.Dimension(102, 27));
        navBtnFacturar.setMinimumSize(new java.awt.Dimension(102, 27));
        navBtnFacturar.setPreferredSize(new java.awt.Dimension(102, 27));
        navBtnFacturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navBtnFacturarActionPerformed(evt);
            }
        });

        navBtnExpedientes.setBackground(new java.awt.Color(255, 255, 255));
        navBtnExpedientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        navBtnExpedientes.setForeground(new java.awt.Color(0, 0, 0));
        navBtnExpedientes.setText("Expedientes");
        navBtnExpedientes.setBorder(null);
        navBtnExpedientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                navBtnExpedientesActionPerformed(evt);
            }
        });

        navBtnServicios.setBackground(new java.awt.Color(255, 255, 255));
        navBtnServicios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        navBtnServicios.setForeground(new java.awt.Color(0, 0, 0));
        navBtnServicios.setText("Servicios");
        navBtnServicios.setBorder(null);
        navBtnServicios.setMaximumSize(new java.awt.Dimension(102, 27));
        navBtnServicios.setMinimumSize(new java.awt.Dimension(102, 27));
        navBtnServicios.setPreferredSize(new java.awt.Dimension(102, 27));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(navBtnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(navBtnFacturar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(navBtnExpedientes)
                .addGap(89, 89, 89)
                .addComponent(navBtnServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(navBtnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(navBtnFacturar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(navBtnExpedientes)
                    .addComponent(navBtnServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgragarCliente))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(inTxtTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inTxtCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inTxtDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inTxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inTxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inTxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inTxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inTxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgragarCliente)
                    .addComponent(btnCancelar))
                .addGap(93, 93, 93))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inTxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inTxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inTxtNombreActionPerformed

    private void inTxtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inTxtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inTxtApellidoActionPerformed

    private void navBtnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navBtnInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_navBtnInicioActionPerformed

    private void navBtnFacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navBtnFacturarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_navBtnFacturarActionPerformed

    private void navBtnExpedientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_navBtnExpedientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_navBtnExpedientesActionPerformed

    public JButton getBtnAgragarCliente() {
        return btnAgragarCliente;
    }

    public void setBtnAgragarCliente(JButton btnAgragarCliente) {
        this.btnAgragarCliente = btnAgragarCliente;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JTextField getInTxtApellido() {
        return inTxtApellido;
    }

    public void setInTxtApellido(JTextField inTxtApellido) {
        this.inTxtApellido = inTxtApellido;
    }

    public JTextField getInTxtCorreo() {
        return inTxtCorreo;
    }

    public void setInTxtCorreo(JTextField inTxtCorreo) {
        this.inTxtCorreo = inTxtCorreo;
    }

    public JTextField getInTxtDireccion() {
        return inTxtDireccion;
    }

    public void setInTxtDireccion(JTextField inTxtDireccion) {
        this.inTxtDireccion = inTxtDireccion;
    }

    public JTextField getInTxtNombre() {
        return inTxtNombre;
    }

    public void setInTxtNombre(JTextField inTxtNombre) {
        this.inTxtNombre = inTxtNombre;
    }

    public JTextField getInTxtTelefono() {
        return inTxtTelefono;
    }

    public void setInTxtTelefono(JTextField inTxtTelefono) {
        this.inTxtTelefono = inTxtTelefono;
    }

    public JButton getNavBtnExpedientes() {
        return navBtnExpedientes;
    }

    public void setNavBtnExpedientes(JButton navBtnExpedientes) {
        this.navBtnExpedientes = navBtnExpedientes;
    }

    public JButton getNavBtnProductos() {
        return navBtnFacturar;
    }

    public void setNavBtnProductos(JButton navBtnProductos) {
        this.navBtnFacturar = navBtnProductos;
    }

    public JButton getNavBtnServicios() {
        return navBtnServicios;
    }

    public void setNavBtnServicios(JButton navBtnServicios) {
        this.navBtnServicios = navBtnServicios;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgragarCliente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JTextField inTxtApellido;
    private javax.swing.JTextField inTxtCorreo;
    private javax.swing.JTextField inTxtDireccion;
    private javax.swing.JTextField inTxtNombre;
    private javax.swing.JTextField inTxtTelefono;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton navBtnExpedientes;
    private javax.swing.JButton navBtnFacturar;
    private javax.swing.JButton navBtnInicio;
    private javax.swing.JButton navBtnServicios;
    // End of variables declaration//GEN-END:variables
}
