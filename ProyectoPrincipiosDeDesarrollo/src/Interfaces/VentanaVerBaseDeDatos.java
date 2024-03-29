package Interfaces;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaVerBaseDeDatos extends javax.swing.JFrame {
    private String dia,hora,intensidad_luminosa,grado_de_inclinacion,confirmacion_de_cambio;
    private DefaultComboBoxModel<Datos> modelo1 =  new DefaultComboBoxModel();
    private DefaultComboBoxModel<Datos> modelo2 =  new DefaultComboBoxModel();
    private DefaultTableModel modeloTabla1 = new DefaultTableModel();
    Datos d = new Datos();
    
    public static final String URL = "jdbc:mysql://localhost:3306/principios?autoReconnet=true&useSSL=false";
    public static final String USUARIO = "root";
    public static final String CONTRASEÑA = "D4118038cm";
    
    
    public VentanaVerBaseDeDatos() {
        llenarModeloComboBox();
        agregarModeloTabla();
        initComponents();
    }
    
    public void llenarModeloComboBox(){
        modelo1.addElement(new Datos("Datos especificos"));
        
        modelo2.addElement(new Datos("Tabla"));
    }
    
    private void agregarModeloTabla(){
        modeloTabla1.addColumn("Dia");
        modeloTabla1.addColumn("Hora");
        modeloTabla1.addColumn("Intensidad lu");
        modeloTabla1.addColumn("Grado de inclinación");
        modeloTabla1.addColumn("Confirmación de cambio");
    }
    
    public void cambioDeTabla(){
        d = (Datos) modelo1.getSelectedItem();
        if(d.toString()=="Datos especificos"){
            System.out.println("Hola");
        }
        else if(d.toString()=="Promedio de datos en un dia especifico"){
            System.out.println("Hola");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        comboBoxDato = new javax.swing.JComboBox<>();
        comboBoxFormato = new javax.swing.JComboBox<>();
        cajaHora = new javax.swing.JTextField();
        cajaDia = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();

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
        etiquetaTitulo1.setText("Ver base de datos");

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

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 51));
        jLabel5.setText("\"El futuro es la energia verde, la sostenibilidad, las energias renovables\"  ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 51));
        jLabel6.setText("-Arnold schwarzenegger");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Buscar información en la base de datos MySQL");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Ingrese que tipo de dato quiere buscar: ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Ingrese formato para ver los datos: ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Ingrese dia que desea buscar: ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Ingrese hora que desea buscar: ");

        comboBoxDato.setModel(modelo1);
        comboBoxDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDatoActionPerformed(evt);
            }
        });

        comboBoxFormato.setModel(modelo2);
        comboBoxFormato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxFormatoActionPerformed(evt);
            }
        });

        cajaHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaHoraActionPerformed(evt);
            }
        });

        cajaDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaDiaActionPerformed(evt);
            }
        });

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        tabla1.setModel(modeloTabla1);
        jScrollPane1.setViewportView(tabla1);

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
                                .addGap(15, 15, 15)
                                .addComponent(botonPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(botonIngresarDatos1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonProcesamientoDeDatos1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonBaseDeDatos1)))
                        .addGap(0, 65, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(29, 29, 29))
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(etiquetaTitulo1))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7))
                        .addGap(51, 51, 51)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBoxDato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxFormato, 0, 158, Short.MAX_VALUE)
                            .addComponent(cajaHora)
                            .addComponent(cajaDia))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(botonBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(etiquetaTitulo1)
                .addGap(11, 11, 11)
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
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(comboBoxDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9))
                            .addComponent(comboBoxFormato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10))
                    .addComponent(cajaDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(cajaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonBuscar)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
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
                .addContainerGap(16, Short.MAX_VALUE))
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

    private void botonProcesamientoDeDatos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProcesamientoDeDatos1ActionPerformed
        VentanaProcesamientoDeDatos vProcesamientoDeDatos = new VentanaProcesamientoDeDatos();
        vProcesamientoDeDatos.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_botonProcesamientoDeDatos1ActionPerformed

    private void cajaHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaHoraActionPerformed

    private void cajaDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaDiaActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed

        Connection conexion = getConnection();
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            ps = conexion.prepareStatement("select * from tabla");
            rs = ps.executeQuery();
            
            while(rs.next()){
                if(rs.getString("dia").equals(cajaDia.getText())){
                    if(rs.getString("hora").equals(cajaHora.getText())){
                        dia = rs.getString("dia");
                        hora = rs.getString("hora");
                        intensidad_luminosa = rs.getString("intensidad_luminosa");
                        grado_de_inclinacion = rs.getString("grado_de_inclinacion");
                        confirmacion_de_cambio = rs.getString("confirmacion_de_cambio");
                        
                        System.out.println(dia);
                        System.out.println(hora);
                        System.out.println(intensidad_luminosa);
                        System.out.println(grado_de_inclinacion);
                        System.out.println(confirmacion_de_cambio);
                        
                        String [] obs = {dia,hora,intensidad_luminosa,grado_de_inclinacion,confirmacion_de_cambio};
                        
                        
                        
                        modeloTabla1.addRow(obs);
                    }
                }
            }
            
            conexion.close();
        }catch(Exception ex){
            System.out.println("Error: " +ex);
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonAyuda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAyuda1ActionPerformed
        JOptionPane.showMessageDialog(null,".:AYUDA:.\nPara revisar el manual de ayuda ingrese el siguiente link al buscador de google \nhttps://paneles.com/ayuda-placas-solares-autoconsumo/");
    }//GEN-LAST:event_botonAyuda1ActionPerformed

    private void comboBoxDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDatoActionPerformed
        cambioDeTabla();
    }//GEN-LAST:event_comboBoxDatoActionPerformed

    private void comboBoxFormatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxFormatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxFormatoActionPerformed

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
    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaVerBaseDeDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton botonAyuda1;
    private javax.swing.JButton botonBaseDeDatos1;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonContacto1;
    private javax.swing.JButton botonIngresarDatos1;
    private javax.swing.JButton botonPrincipal1;
    private javax.swing.JButton botonProcesamientoDeDatos1;
    private javax.swing.JTextField cajaDia;
    private javax.swing.JTextField cajaHora;
    private javax.swing.JComboBox<Datos> comboBoxDato;
    private javax.swing.JComboBox<Datos> comboBoxFormato;
    private javax.swing.JLabel etiquetaPanelesSolaresSoftware1;
    private javax.swing.JLabel etiquetaTitulo1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
}
