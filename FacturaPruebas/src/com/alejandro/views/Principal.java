/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.views;

import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlackMoonLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueMoonLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueSteelLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaGreenDreamLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaMauveMetallicLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaOrangeMetallicLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaSilverMoonLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaSimple2DLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaSkyMetallicLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaWhiteVisionLookAndFeel;
import facturapruebas.FacturaPruebas;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author Alejandro
 */
public class Principal extends javax.swing.JFrame implements Runnable {
    //Extiende solamente el JFRAME

    public Image imagenFondo;
    public URL fondo;

    //extiende el JFRAME y el implements Runnable
    String hora, segundos, minutos, ampm;
    Calendar calendario;
    Thread h1;

    public Principal() {
        initComponents();
        h1 = new Thread(this);
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        h1.start();
        cerrar();
    }

    public void cerrar() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    confirmarSalida();
                }
            });
            this.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void confirmarSalida() {
        int dato = JOptionPane.showConfirmDialog(this, "Esta seguro de cerrar la aplicacion?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (dato == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Gracias por usar la aplicacion", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            FacturaPruebas.limiteSegundos();
            System.exit(0);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panell = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        Salir = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        item1 = new javax.swing.JMenuItem();
        item2 = new javax.swing.JMenuItem();
        item3 = new javax.swing.JMenuItem();
        item4 = new javax.swing.JMenuItem();
        item5 = new javax.swing.JMenuItem();
        item7 = new javax.swing.JMenuItem();
        item8 = new javax.swing.JMenuItem();
        item9 = new javax.swing.JMenuItem();
        item10 = new javax.swing.JMenuItem();
        item11 = new javax.swing.JMenuItem();
        item12 = new javax.swing.JMenuItem();
        item13 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        reloj = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU PRINCIPAL");

        javax.swing.GroupLayout panellLayout = new javax.swing.GroupLayout(panell);
        panell.setLayout(panellLayout);
        panellLayout.setHorizontalGroup(
            panellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );
        panellLayout.setVerticalGroup(
            panellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/archivos.png"))); // NOI18N
        jMenu1.setText("ARCHIVO");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/persona.png"))); // NOI18N
        jMenu3.setText("PERSONA");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarpersona.png"))); // NOI18N
        jMenuItem1.setText("NUEVA PERSONA");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        jMenuItem3.setText("EDITAR PERSONA");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenu1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        jMenu4.setText("USUARIO");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editarusuario.png"))); // NOI18N
        jMenuItem2.setText("EDITAR USUARIO");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenu1.add(jMenu4);

        Salir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        Salir.setText("SALIR");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jMenu1.add(Salir);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu7);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acercade.png"))); // NOI18N
        jMenu2.setText("ACERCA DE:");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuBar1.add(jMenu2);
        jMenuBar1.add(jMenu6);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/temas.png"))); // NOI18N
        jMenu5.setText("TEMAS");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        item1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item1.setText("BLACK EYE");
        item1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item1ActionPerformed(evt);
            }
        });
        jMenu5.add(item1);

        item2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item2.setText("BLACK MOON");
        item2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item2ActionPerformed(evt);
            }
        });
        jMenu5.add(item2);

        item3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item3.setText("BLUE ICE");
        item3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item3ActionPerformed(evt);
            }
        });
        jMenu5.add(item3);

        item4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item4.setText("BLUE MOON");
        item4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item4ActionPerformed(evt);
            }
        });
        jMenu5.add(item4);

        item5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item5.setText("BLUE STEEL");
        item5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item5ActionPerformed(evt);
            }
        });
        jMenu5.add(item5);

        item7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item7.setText("GREEN DREAM");
        item7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item7ActionPerformed(evt);
            }
        });
        jMenu5.add(item7);

        item8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item8.setText("MAUVE METALLIC");
        item8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item8ActionPerformed(evt);
            }
        });
        jMenu5.add(item8);

        item9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item9.setText("ORANGE METALLIC");
        item9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item9ActionPerformed(evt);
            }
        });
        jMenu5.add(item9);

        item10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item10.setText("SILVER MOON");
        item10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item10ActionPerformed(evt);
            }
        });
        jMenu5.add(item10);

        item11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item11.setText("SIMPLE 2D");
        item11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item11ActionPerformed(evt);
            }
        });
        jMenu5.add(item11);

        item12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item12.setText("SKY METALLIC");
        item12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item12ActionPerformed(evt);
            }
        });
        jMenu5.add(item12);

        item13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        item13.setText("WHITE VISION");
        item13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item13ActionPerformed(evt);
            }
        });
        jMenu5.add(item13);

        jMenuBar1.add(jMenu5);
        jMenuBar1.add(jMenu8);

        reloj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        reloj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reloj.png"))); // NOI18N
        reloj.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuBar1.add(reloj);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        PersonaView pview = new PersonaView(null, true, null);
        pview.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        BuscarPersonaView pview = new BuscarPersonaView(null, true);
        pview.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        BuscarUsuarioView uview = new BuscarUsuarioView(null, true);
        uview.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        confirmarSalida();
    }//GEN-LAST:event_SalirActionPerformed

    private void item13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item13ActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaWhiteVisionLookAndFeel());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");

        }
        Principal p = new Principal();
        p.setVisible(true);
    }//GEN-LAST:event_item13ActionPerformed

    private void item12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item12ActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaSkyMetallicLookAndFeel());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");

        }
        Principal p = new Principal();
        p.setVisible(true);
    }//GEN-LAST:event_item12ActionPerformed

    private void item11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item11ActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaSimple2DLookAndFeel());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");

        }
        Principal p = new Principal();
        p.setVisible(true);
    }//GEN-LAST:event_item11ActionPerformed

    private void item10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item10ActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaSilverMoonLookAndFeel());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");

        }
        Principal p = new Principal();
        p.setVisible(true);
    }//GEN-LAST:event_item10ActionPerformed

    private void item9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item9ActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaOrangeMetallicLookAndFeel());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");

        }
        Principal p = new Principal();
        p.setVisible(true);
    }//GEN-LAST:event_item9ActionPerformed

    private void item8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item8ActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaMauveMetallicLookAndFeel());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");

        }
        Principal p = new Principal();
        p.setVisible(true);
    }//GEN-LAST:event_item8ActionPerformed

    private void item7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item7ActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaGreenDreamLookAndFeel());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");

        }
        Principal p = new Principal();
        p.setVisible(true);
    }//GEN-LAST:event_item7ActionPerformed

    private void item5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item5ActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaBlueSteelLookAndFeel());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");

        }
        Principal p = new Principal();
        p.setVisible(true);
    }//GEN-LAST:event_item5ActionPerformed

    private void item4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item4ActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaBlueMoonLookAndFeel());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");

        }
        Principal p = new Principal();
        p.setVisible(true);
    }//GEN-LAST:event_item4ActionPerformed

    private void item3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item3ActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaBlueIceLookAndFeel());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");

        }
        Principal p = new Principal();
        p.setVisible(true);
    }//GEN-LAST:event_item3ActionPerformed

    private void item2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item2ActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaBlackMoonLookAndFeel());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");

        }
        Principal p = new Principal();
        p.setVisible(true);
    }//GEN-LAST:event_item2ActionPerformed

    private void item1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item1ActionPerformed
        try {
            UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");

        }
        Principal p = new Principal();
        p.setVisible(true);

    }//GEN-LAST:event_item1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenuItem item1;
    private javax.swing.JMenuItem item10;
    private javax.swing.JMenuItem item11;
    private javax.swing.JMenuItem item12;
    private javax.swing.JMenuItem item13;
    private javax.swing.JMenuItem item2;
    private javax.swing.JMenuItem item3;
    private javax.swing.JMenuItem item4;
    private javax.swing.JMenuItem item5;
    private javax.swing.JMenuItem item7;
    private javax.swing.JMenuItem item8;
    private javax.swing.JMenuItem item9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel panell;
    private javax.swing.JMenu reloj;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        while (ct == h1) {
            calcula();
            reloj.setText(hora + ":" + minutos + ":" + segundos + ":" + ampm);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    private void calcula() {
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";
        if (ampm.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY);
            hora = h > 9 ? "" + h : "0" + h;
        } else {
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }
}
