
package Interfaces;

import javax.swing.JOptionPane;


public class VentanaIngresarDatos extends javax.swing.JFrame {
    public String confirmacionDeCambio,hora,dia, intensidadLuminosa,gradoDeInclinacion;
    VentanaProcesamientoDeDatos vProcesamientoDeDatos = new VentanaProcesamientoDeDatos();
    
    public VentanaIngresarDatos() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        etiquetaPanelesSolaresSoftware1 = new javax.swing.JLabel();
        botonContacto1 = new javax.swing.JButton();
        botonAyuda1 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        etiquetaTitulo1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        botonPrincipal1 = new javax.swing.JButton();
        botonIngresarDatos1 = new javax.swing.JButton();
        botonProcesamientoDeDatos1 = new javax.swing.JButton();
        botonBaseDeDatos1 = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cajaGradoDeInclinacion = new javax.swing.JTextField();
        cajaIntensidadLuminosa = new javax.swing.JTextField();
        cajaConfirmacionDeCambio = new javax.swing.JTextField();
        cajaDia = new javax.swing.JTextField();
        cajaHora = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        botonSiguiente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel1.setBackground(new java.awt.Color(255, 255, 255));

        etiquetaPanelesSolaresSoftware1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaPanelesSolaresSoftware1.setForeground(new java.awt.Color(0, 153, 255));
        etiquetaPanelesSolaresSoftware1.setText("Paneles solares software");

        botonContacto1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        botonContacto1.setText("Contacto");
        botonContacto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContacto1ActionPerformed(evt);
            }
        });

        botonAyuda1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        botonAyuda1.setText("Ayuda");
        botonAyuda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAyuda1ActionPerformed(evt);
            }
        });

        etiquetaTitulo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaTitulo1.setForeground(new java.awt.Color(51, 153, 255));
        etiquetaTitulo1.setText("Ingresar datos");

        botonPrincipal1.setText("Principal");
        botonPrincipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPrincipal1ActionPerformed(evt);
            }
        });

        botonIngresarDatos1.setText("Ingresar datos");
        botonIngresarDatos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarDatos1ActionPerformed(evt);
            }
        });

        botonProcesamientoDeDatos1.setText("Procesamiento de datos");
        botonProcesamientoDeDatos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProcesamientoDeDatos1ActionPerformed(evt);
            }
        });

        botonBaseDeDatos1.setText("Ver base de datos");
        botonBaseDeDatos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBaseDeDatos1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Intensidad luminosa:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Grado de inclinación:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Confirmación de cambio: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Hora: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Día:");

        cajaGradoDeInclinacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaGradoDeInclinacionActionPerformed(evt);
            }
        });

        cajaIntensidadLuminosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaIntensidadLuminosaActionPerformed(evt);
            }
        });

        cajaConfirmacionDeCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaConfirmacionDeCambioActionPerformed(evt);
            }
        });

        cajaDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaDiaActionPerformed(evt);
            }
        });

        cajaHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaHoraActionPerformed(evt);
            }
        });

        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonSiguiente.setText("Siguiente");
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setText("Ejmplo: 6.00 (No agregar medida)");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("Ejmplo: 15 (No agregar medida)");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setText("Ejmplo: 2021-04-25 (año-mes-dia con guiones)");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setText("Ejmplo: 15:00 (No usar sistema AM/PM)");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setText("Ejmplo: si/no");

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 204, 51));
        jLabel12.setText("\"El futuro es la energia verde, la sostenibilidad, las energias renovables\"  ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 204, 51));
        jLabel13.setText("-Arnold schwarzenegger");

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator7)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(etiquetaPanelesSolaresSoftware1)
                                .addGap(363, 363, 363)
                                .addComponent(botonContacto1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonAyuda1))
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(botonPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(botonIngresarDatos1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonProcesamientoDeDatos1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonBaseDeDatos1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cajaIntensidadLuminosa, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(97, 97, 97)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajaConfirmacionDeCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaGradoDeInclinacion, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(99, 99, 99))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(49, 49, 49))
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(etiquetaTitulo1))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(etiquetaPanelesSolaresSoftware1))
                    .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonAyuda1)
                        .addComponent(botonContacto1)))
                .addGap(14, 14, 14)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(etiquetaTitulo1)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonPrincipal1)
                            .addComponent(botonIngresarDatos1)
                            .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(botonProcesamientoDeDatos1)
                                .addComponent(botonBaseDeDatos1)))
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cajaIntensidadLuminosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajaGradoDeInclinacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addGap(24, 24, 24)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cajaConfirmacionDeCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))))
                    .addComponent(cajaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cajaDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(60, 60, 60)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardar)
                    .addComponent(botonSiguiente))
                .addGap(43, 43, 43)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBaseDeDatos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBaseDeDatos1ActionPerformed
        VentanaVerBaseDeDatos vVerBaseDeDatos = new VentanaVerBaseDeDatos();
        vVerBaseDeDatos.setVisible(true);

        dispose();
    }//GEN-LAST:event_botonBaseDeDatos1ActionPerformed

    private void botonProcesamientoDeDatos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProcesamientoDeDatos1ActionPerformed
        vProcesamientoDeDatos.setVisible(true);
        vProcesamientoDeDatos.agregarEtiqueta(dia,hora,intensidadLuminosa,confirmacionDeCambio,gradoDeInclinacion);

        dispose();
    }//GEN-LAST:event_botonProcesamientoDeDatos1ActionPerformed

    private void botonIngresarDatos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarDatos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonIngresarDatos1ActionPerformed

    private void botonPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPrincipal1ActionPerformed
        VentanaPrincipal vPrincipal = new VentanaPrincipal();
        vPrincipal.setVisible(true);

        dispose();
    }//GEN-LAST:event_botonPrincipal1ActionPerformed

    private void botonContacto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContacto1ActionPerformed
        JOptionPane.showMessageDialog(null,".:CONTACTO:.\nNombre: Ricardo Perez Zapata \nCelular: 3165982356 \nCorreo: ricardopz@paneles.co");
    }//GEN-LAST:event_botonContacto1ActionPerformed

    private void cajaGradoDeInclinacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaGradoDeInclinacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaGradoDeInclinacionActionPerformed

    private void cajaIntensidadLuminosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaIntensidadLuminosaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaIntensidadLuminosaActionPerformed

    private void cajaConfirmacionDeCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaConfirmacionDeCambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaConfirmacionDeCambioActionPerformed

    private void cajaDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaDiaActionPerformed

    private void cajaHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaHoraActionPerformed

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
        vProcesamientoDeDatos.setVisible(true);
        vProcesamientoDeDatos.setLocation(750,0);
        vProcesamientoDeDatos.agregarEtiqueta(dia,hora,intensidadLuminosa,confirmacionDeCambio,gradoDeInclinacion);
        
     
    }//GEN-LAST:event_botonSiguienteActionPerformed

    private void botonAyuda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAyuda1ActionPerformed
        JOptionPane.showMessageDialog(null,".:AYUDA:.\nPara revisar el manual de ayuda ingrese el siguiente link al buscador de google \nhttps://paneles.com/ayuda-placas-solares-autoconsumo/");
    }//GEN-LAST:event_botonAyuda1ActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        intensidadLuminosa =  cajaIntensidadLuminosa.getText();
        gradoDeInclinacion = cajaGradoDeInclinacion.getText();
        confirmacionDeCambio = cajaConfirmacionDeCambio.getText();
        hora = cajaHora.getText();
        dia = cajaDia.getText();
        
        vProcesamientoDeDatos.agregarEtiqueta(dia,hora,intensidadLuminosa,confirmacionDeCambio,gradoDeInclinacion);
    }//GEN-LAST:event_botonGuardarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaIngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaIngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaIngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaIngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaIngresarDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton botonAyuda1;
    private javax.swing.JButton botonBaseDeDatos1;
    private javax.swing.JButton botonContacto1;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonIngresarDatos1;
    private javax.swing.JButton botonPrincipal1;
    private javax.swing.JButton botonProcesamientoDeDatos1;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JTextField cajaConfirmacionDeCambio;
    private javax.swing.JTextField cajaDia;
    private javax.swing.JTextField cajaGradoDeInclinacion;
    private javax.swing.JTextField cajaHora;
    private javax.swing.JTextField cajaIntensidadLuminosa;
    private javax.swing.JLabel etiquetaPanelesSolaresSoftware1;
    private javax.swing.JLabel etiquetaTitulo1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    // End of variables declaration//GEN-END:variables
}
