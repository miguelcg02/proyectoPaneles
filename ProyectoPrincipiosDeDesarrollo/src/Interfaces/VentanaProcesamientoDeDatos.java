
package Interfaces;

import static Interfaces.VentanaVerBaseDeDatos.CONTRASEÑA;
import static Interfaces.VentanaVerBaseDeDatos.URL;
import static Interfaces.VentanaVerBaseDeDatos.USUARIO;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaProcesamientoDeDatos extends javax.swing.JFrame {
    private DefaultTableModel modeloTabla1 = new DefaultTableModel();
    public String confirmacionDeCambio,hora,dia,intensidadLuminosa,gradoDeInclinacion;
    public double intensidadLuminosaD,gradoDeInclinacionD;
    
    public static final String URL = "jdbc:mysql://localhost:3306/principios?autoReconnet=true&useSSL=false";
    public static final String USUARIO = "root";
    public static final String CONTRASEÑA = "D4118038cm";
    PreparedStatement ps;
    ResultSet rs;
    
    public VentanaProcesamientoDeDatos() {
        agregarModeloTabla();
        initComponents();
    }

    private void agregarModeloTabla(){
        modeloTabla1.addColumn("Dia");
        modeloTabla1.addColumn("Hora");
        modeloTabla1.addColumn("Intensidad lu");
        modeloTabla1.addColumn("Grado de inclinación");
        modeloTabla1.addColumn("Confirmación de cambio");
    }
    
    public void agregarEtiqueta(String a, String y, String u, String d,String o){
        etiquetaDia.setText(a);
        etiquetaHora.setText(y);
        etiquetaIntensidadLuminosa.setText(u);
        etiquetaConfirmacionDeCambio.setText(d);
        etiquetaGradoDeInclinacion.setText(o);
    }
    
     public Connection getConnection(){
        Connection conexion=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL,USUARIO,CONTRASEÑA);
            
        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
        
        return conexion;
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        etiquetaDia = new javax.swing.JLabel();
        etiquetaHora = new javax.swing.JLabel();
        etiquetaIntensidadLuminosa = new javax.swing.JLabel();
        etiquetaGradoDeInclinacion = new javax.swing.JLabel();
        etiquetaConfirmacionDeCambio = new javax.swing.JLabel();
        botonAgregarDatosALaTabla = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatosRegistrados = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

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
        etiquetaTitulo1.setText("Procesamiento de datos");

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

        botonBaseDeDatos1.setText("Ver base de datos");
        botonBaseDeDatos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBaseDeDatos1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 51));
        jLabel5.setText("\"El futuro es la energia verde, la sostenibilidad, las energias renovables\"  ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Día:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Hora:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Intensidad luminosa:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Grado de inclinación:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Confirmación de cambio:");

        etiquetaDia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiquetaDia.setText("...");

        etiquetaHora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiquetaHora.setText("...");

        etiquetaIntensidadLuminosa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiquetaIntensidadLuminosa.setText("...");

        etiquetaGradoDeInclinacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiquetaGradoDeInclinacion.setText("...");

        etiquetaConfirmacionDeCambio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiquetaConfirmacionDeCambio.setText("...");

        botonAgregarDatosALaTabla.setText("Agregar datos a la tabla");
        botonAgregarDatosALaTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarDatosALaTablaActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("TABLA DE DATOS REGISTRADOS");

        tablaDatosRegistrados.setModel(modeloTabla1);
        jScrollPane1.setViewportView(tablaDatosRegistrados);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 51));
        jLabel6.setText("-Arnold schwarzenegger");

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172))))
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator7)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiquetaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiquetaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiquetaConfirmacionDeCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaGradoDeInclinacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(etiquetaIntensidadLuminosa, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonAgregarDatosALaTabla)
                                .addGap(114, 114, 114))))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(etiquetaPanelesSolaresSoftware1)
                                .addGap(363, 363, 363)
                                .addComponent(botonContacto1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonAyuda1))
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel5))
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addGap(253, 253, 253)
                                .addComponent(etiquetaTitulo1))
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addGap(256, 256, 256)
                                .addComponent(jLabel17)))
                        .addGap(0, 66, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(botonPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonIngresarDatos1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonProcesamientoDeDatos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonBaseDeDatos1)
                .addGap(33, 33, 33))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(etiquetaPanelesSolaresSoftware1))
                    .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonAyuda1)
                        .addComponent(botonContacto1)))
                .addGap(14, 14, 14)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiquetaTitulo1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonPrincipal1)
                    .addComponent(botonIngresarDatos1)
                    .addComponent(botonProcesamientoDeDatos1)
                    .addComponent(botonBaseDeDatos1))
                .addGap(5, 5, 5)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(etiquetaDia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(etiquetaHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etiquetaIntensidadLuminosa)
                        .addComponent(botonAgregarDatosALaTabla)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaGradoDeInclinacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(etiquetaConfirmacionDeCambio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6))
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
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonContacto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContacto1ActionPerformed
        JOptionPane.showMessageDialog(null,".:CONTACTO:.\nNombre: Ricardo Perez Zapata \nCelular: 3165982356 \nCorreo: ricardopz@paneles.co");
    }//GEN-LAST:event_botonContacto1ActionPerformed

    private void botonPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPrincipal1ActionPerformed
        VentanaPrincipal vPrincipal = new VentanaPrincipal();
        vPrincipal.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_botonPrincipal1ActionPerformed

    private void botonIngresarDatos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarDatos1ActionPerformed
        VentanaIngresarDatos vIngresarDatos = new VentanaIngresarDatos();
        vIngresarDatos.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_botonIngresarDatos1ActionPerformed

    private void botonBaseDeDatos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBaseDeDatos1ActionPerformed
        VentanaVerBaseDeDatos vVerBaseDeDatos = new VentanaVerBaseDeDatos();
        vVerBaseDeDatos.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_botonBaseDeDatos1ActionPerformed

    private void botonAyuda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAyuda1ActionPerformed
        JOptionPane.showMessageDialog(null,".:AYUDA:.\nPara revisar el manual de ayuda ingrese el siguiente link al buscador de google \nhttps://paneles.com/ayuda-placas-solares-autoconsumo/");
    }//GEN-LAST:event_botonAyuda1ActionPerformed

    private void botonAgregarDatosALaTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarDatosALaTablaActionPerformed
        confirmacionDeCambio = etiquetaConfirmacionDeCambio.getText();
        dia = etiquetaDia.getText();
        hora = etiquetaHora.getText();
        intensidadLuminosa = etiquetaIntensidadLuminosa.getText();
        gradoDeInclinacion = etiquetaGradoDeInclinacion.getText();
        
        intensidadLuminosaD= Double.parseDouble(etiquetaIntensidadLuminosa.getText());
        gradoDeInclinacionD= Double.parseDouble(etiquetaGradoDeInclinacion.getText());
        
        String[] obs = {dia,hora,intensidadLuminosa,gradoDeInclinacion,confirmacionDeCambio};
        
        modeloTabla1.addRow(obs);
        
        
        Connection conexion = null;
        
        try{
            conexion = getConnection();
            ps = conexion.prepareStatement("insert into tabla (dia,hora,intensidad_luminosa,grado_de_inclinacion,confirmacion_de_cambio) values (?,?,?,?,?)");
            ps.setString(1,dia);
            ps.setString(2,hora);
            ps.setString(3,intensidadLuminosa);
            ps.setString(4,gradoDeInclinacion);
            ps.setString(5,confirmacionDeCambio);
            
            int resultado = ps.executeUpdate(); //Ejecuta la insercion en la bd
            
            if(resultado>0){
                System.out.println("Se guardo correctamente en la bd");
            }
            else{
                System.out.println("ERROR AL GUARDAR EN LA BD");
            }
            
        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }//GEN-LAST:event_botonAgregarDatosALaTablaActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaProcesamientoDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaProcesamientoDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaProcesamientoDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaProcesamientoDeDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaProcesamientoDeDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton botonAgregarDatosALaTabla;
    private javax.swing.JButton botonAyuda1;
    private javax.swing.JButton botonBaseDeDatos1;
    private javax.swing.JButton botonContacto1;
    private javax.swing.JButton botonIngresarDatos1;
    private javax.swing.JButton botonPrincipal1;
    private javax.swing.JButton botonProcesamientoDeDatos1;
    private javax.swing.JLabel etiquetaConfirmacionDeCambio;
    private javax.swing.JLabel etiquetaDia;
    private javax.swing.JLabel etiquetaGradoDeInclinacion;
    private javax.swing.JLabel etiquetaHora;
    private javax.swing.JLabel etiquetaIntensidadLuminosa;
    private javax.swing.JLabel etiquetaPanelesSolaresSoftware1;
    private javax.swing.JLabel etiquetaTitulo1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tablaDatosRegistrados;
    // End of variables declaration//GEN-END:variables

}
