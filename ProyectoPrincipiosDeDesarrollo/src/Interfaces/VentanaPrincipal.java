package Interfaces;

import Interfaces.VentanaIngresarDatos;
import Interfaces.VentanaIngresarDatos;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class VentanaPrincipal extends javax.swing.JFrame {
    
    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        etiquetaPanelesSolaresSoftware = new javax.swing.JLabel();
        botonContacto = new javax.swing.JButton();
        botonAyuda = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        etiquetaTitulo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        botonPrincipal = new javax.swing.JButton();
        botonIngresarDatos = new javax.swing.JButton();
        botonProcesamientoDeDatos = new javax.swing.JButton();
        botonBaseDeDatos = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Panel.setBackground(new java.awt.Color(255, 255, 255));

        etiquetaPanelesSolaresSoftware.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaPanelesSolaresSoftware.setForeground(new java.awt.Color(0, 153, 255));
        etiquetaPanelesSolaresSoftware.setText("Paneles solares software");

        botonContacto.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        botonContacto.setText("Contacto");
        botonContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContactoActionPerformed(evt);
            }
        });

        botonAyuda.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        botonAyuda.setText("Ayuda");
        botonAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAyudaActionPerformed(evt);
            }
        });

        etiquetaTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(51, 153, 255));
        etiquetaTitulo.setText("ÁNGULO DE INCLINACIÓN OPTIMO");

        botonPrincipal.setText("Principal");
        botonPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPrincipalActionPerformed(evt);
            }
        });

        botonIngresarDatos.setText("Ingresar datos");
        botonIngresarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarDatosActionPerformed(evt);
            }
        });

        botonProcesamientoDeDatos.setText("Procesamiento de datos");
        botonProcesamientoDeDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProcesamientoDeDatosActionPerformed(evt);
            }
        });

        botonBaseDeDatos.setText("Ver base de datos");
        botonBaseDeDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBaseDeDatosActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Para dar solución a la problematica, se propone desarrollar un sistema automatico \nencargado de determinar ángulo de inclinación más optimo durante los diferentes \nmomentos del dia, en función de la intensidad lumínica. Para posteriormente mandar\ndicha información a esta aplicación donde se ingresaran, procesaran y almacenaran \nlos datos obtenidos durante la captura.");
        jTextArea1.setCaretColor(new java.awt.Color(204, 204, 204));
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea1.setOpaque(false);
        jTextArea1.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenPanel (1).jpg"))); // NOI18N

        jScrollPane3.setBorder(null);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("Hoy día, la baja absorción de energía en los\npaneles solares en la mayor parte del día se\ndebe a que estos en su mayoría permanecen\nestaticos o hay una mala implementación del\nángulo de inclinación. Además de que no se \nlleva a cabo un procesamiento de datos\nadecuado, ya que no se dispone de un software\nadecuado para ingresar, procesar y almacenar\ndatos.");
        jTextArea3.setCaretColor(new java.awt.Color(204, 204, 204));
        jTextArea3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea3.setOpaque(false);
        jTextArea3.setRequestFocusEnabled(false);
        jScrollPane3.setViewportView(jTextArea3);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 51));
        jLabel2.setText("\"El futuro es la energia verde, la sostenibilidad, las energias renovables\"  ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 51));
        jLabel3.setText("-Arnold schwarzenegger");

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(etiquetaPanelesSolaresSoftware)
                                .addGap(363, 363, 363)
                                .addComponent(botonContacto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonAyuda))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(etiquetaTitulo))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(botonPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(botonIngresarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonProcesamientoDeDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonBaseDeDatos))))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(29, 29, 29))
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(etiquetaPanelesSolaresSoftware))
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonAyuda)
                        .addComponent(botonContacto)))
                .addGap(14, 14, 14)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(etiquetaTitulo)
                .addGap(14, 14, 14)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonPrincipal)
                    .addComponent(botonIngresarDatos)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonProcesamientoDeDatos)
                        .addComponent(botonBaseDeDatos)))
                .addGap(5, 5, 5)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContactoActionPerformed
        JOptionPane.showMessageDialog(null,".:CONTACTO:.\nNombre: Ricardo Perez Zapata \nCelular: 3165982356 \nCorreo: ricardopz@paneles.co");
    }//GEN-LAST:event_botonContactoActionPerformed

    private void botonPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonPrincipalActionPerformed

    private void botonIngresarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarDatosActionPerformed
        VentanaIngresarDatos vIngresarDatos = new VentanaIngresarDatos();
        vIngresarDatos.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_botonIngresarDatosActionPerformed

    private void botonProcesamientoDeDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProcesamientoDeDatosActionPerformed
        VentanaProcesamientoDeDatos vProcesamientoDeDatos = new VentanaProcesamientoDeDatos();
        vProcesamientoDeDatos.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_botonProcesamientoDeDatosActionPerformed

    private void botonBaseDeDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBaseDeDatosActionPerformed
        VentanaVerBaseDeDatos vVerBaseDeDatos = new VentanaVerBaseDeDatos();
        vVerBaseDeDatos.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_botonBaseDeDatosActionPerformed

    private void botonAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAyudaActionPerformed
        JOptionPane.showMessageDialog(null,".:AYUDA:.\nPara revisar el manual de ayuda ingrese el siguiente link al buscador de google \nhttps://paneles.com/ayuda-placas-solares-autoconsumo/");
    }//GEN-LAST:event_botonAyudaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            UIManager.setLookAndFeel("com.jtatto.plaf.texture.TextureLookAndFeel");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            //Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton botonAyuda;
    private javax.swing.JButton botonBaseDeDatos;
    private javax.swing.JButton botonContacto;
    private javax.swing.JButton botonIngresarDatos;
    private javax.swing.JButton botonPrincipal;
    private javax.swing.JButton botonProcesamientoDeDatos;
    private javax.swing.JLabel etiquetaPanelesSolaresSoftware;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}
