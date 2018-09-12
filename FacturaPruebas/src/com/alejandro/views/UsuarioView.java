/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.views;

import com.alejandro.DAO.PersonaDao;
import com.alejandro.DAO.UsuarioDao;
import com.alejandro.dominio.Persona;
import com.alejandro.dominio.Usuario;
import javax.swing.JOptionPane;
import sun.security.util.Password;

/**
 *
 * @author Alejandro
 */
public class UsuarioView extends javax.swing.JDialog {

    private Usuario usuario;
    private Persona persona;

    /**
     * Creates new form UsuarioView
     */
    public UsuarioView(java.awt.Frame parent, boolean modal, Usuario user, Persona person) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(false);

        if (user != null) {
            usuario = user;
            cargarUsuario();
        } else {
            persona = person;
            cargarPersonaIngresado();
        }

        
    }

    public void cargarUsuario() {
        PersonaDao personadao = new PersonaDao();
        Persona p = personadao.getPersonaporId(usuario.getIdPersona());
        txtpersona.setText(p.getNombre());
        txtnombreusuario.setText(usuario.getNombreUsuario());
        txtcontraseña.setText(usuario.getPassword());
        txtrol.setText(usuario.getRol());

    }

    public void cargarPersonaIngresado() {
        if (persona != null) {
            txtpersona.setText(persona.getNombre());
        }
    }

    public void cargarUser() {
        if (usuario != null) {
            txtpersona.setText(usuario.getNombreUsuario());
        }
    }
//    public void traerUsuario(){
//       
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombreusuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtrol = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtpersona = new javax.swing.JTextField();
        txtcontraseña = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtconfirmacion = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EDITAR USUARIO");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nombre Usuario:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Contraseña:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Rol:");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("MENU");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrolActionPerformed(evt);
            }
        });

        jLabel4.setText("PERSONA:");

        txtpersona.setEditable(false);
        txtpersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpersonaActionPerformed(evt);
            }
        });

        txtcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraseñaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Confirmar Contraseña:");

        txtconfirmacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconfirmacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jButton1)
                        .addGap(53, 53, 53)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnombreusuario)
                            .addComponent(txtcontraseña)
                            .addComponent(txtpersona, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtrol, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtconfirmacion))))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtpersona, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnombreusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtconfirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtrol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(57, 57, 57))
        );

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
public boolean validarEntradasUsuario() {

        if (txtnombreusuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Llene el campo nombre de usuario");
            return false;
        } else if (txtcontraseña.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Llene el campo contraseña");
            return false;
        } else if (txtconfirmacion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lene la confirmacion de contraseña es muy importante");

        } else if (txtrol.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Llene el campo rol");
            return false;
        }

        return true;
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (validarEntradasUsuario()) {
            //se pone el if con equals par comparar si los dos STRINGS son iguales los string no se compara con ==
            if (txtconfirmacion.getText().equals(txtcontraseña.getText())) {
                if (usuario != null) {
                    usuario.setNombreUsuario(txtnombreusuario.getText());
                    usuario.setPassword(txtcontraseña.getText());
                    usuario.setRol(txtrol.getText());
                    int edicion = JOptionPane.showConfirmDialog(this, "Desea guardar los cambios de edicion", "Advertencia", JOptionPane.YES_NO_OPTION);
                    if (edicion == JOptionPane.YES_OPTION) {
                        UsuarioDao usuariodao = new UsuarioDao();
                        boolean estado = usuariodao.editarUsuario(usuario);

                        if (estado == true) {

                            JOptionPane.showMessageDialog(null, "Se edito correctamente");
                            dispose();

                        } else {
                            JOptionPane.showMessageDialog(null, "Error al editar");
                        }
                    }
                } else {
                    UsuarioDao usuariodao = new UsuarioDao();
                    Usuario usuario = new Usuario();
                    usuario.setIdUsuario(usuariodao.getSiguienteIdUsuario());
                    usuario.setNombreUsuario(txtnombreusuario.getText());
                    usuario.setPassword(txtcontraseña.getText());
                    usuario.setRol(txtrol.getText());
                    usuario.setIdPersona(persona.getIdPersona());

                    boolean estado = usuariodao.saveUsuario(usuario);
                    int guardar = JOptionPane.showConfirmDialog(this, "Desea guardar los cambios?", "Advertencia", JOptionPane.YES_NO_OPTION);
                    if (guardar == JOptionPane.YES_OPTION) {

                        if (estado == true) {
                            JOptionPane.showMessageDialog(null, "Se guardo correctamente");
                            dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "error al guardar");
                        }
                    }

                }
            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");

            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtpersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpersonaActionPerformed

    private void txtcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontraseñaActionPerformed

    private void txtconfirmacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconfirmacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconfirmacionActionPerformed

    private void txtrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrolActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtconfirmacion;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtnombreusuario;
    public javax.swing.JTextField txtpersona;
    private javax.swing.JTextField txtrol;
    // End of variables declaration//GEN-END:variables

    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the persona to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Persona getPersona() {
        return persona;
    }

//    /**
//     * @param persona the persona to set
//     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

}
