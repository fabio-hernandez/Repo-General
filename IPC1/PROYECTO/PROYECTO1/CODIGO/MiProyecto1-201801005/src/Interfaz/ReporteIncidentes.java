/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Persona.NoAsegurado;
import Tabla.TablaIncidentes;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author HernandezMartinez
 */
public class ReporteIncidentes extends javax.swing.JFrame {

    private final JTable Tablasol;
    Tabla.TablaIncidentes tablaModelo;

    public static NoAsegurado[] SinSeguro = new NoAsegurado[20];

    /**
     * Creates new form ReporteIncidentes
     */
    public ReporteIncidentes() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        CargarMecanica();
        CargarRepuesto();

        Tablasol = new JTable();
        tablaModelo = new TablaIncidentes(SinSeguro);
        Tablasol.setModel(tablaModelo);
        jScrollPane1.setViewportView(Tablasol);

    }

    public void CargarMecanica() {

        for (int i = 0; i < CargarDatos.contadorMecanica; i++) {

            JMecanica.addItem(CargarDatos.mecanica[i].Resumen());
        }
    }

    public void CargarRepuesto() {

        for (int i = 0; i < CargarDatos.contadorRepuesto; i++) {

            JRepuesto.addItem(CargarDatos.repuesto[i].Resumen());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JDPIAsegurado = new javax.swing.JTextField();
        JDPITercero = new javax.swing.JTextField();
        JCulpa = new javax.swing.JCheckBox();
        JTercero = new javax.swing.JCheckBox();
        JMecanica = new javax.swing.JComboBox<>();
        JRepuesto = new javax.swing.JComboBox<>();
        JAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DPI Asegurado: ");

        jLabel2.setText("DPI Tercero: ");

        jLabel3.setText("Tipo de servicio: ");

        jLabel4.setText("Repuesto: ");

        JDPIAsegurado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JDPIAseguradoActionPerformed(evt);
            }
        });

        JCulpa.setText("El asegurado es culpable");
        JCulpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCulpaActionPerformed(evt);
            }
        });

        JTercero.setText("El tercero tiene seguro");
        JTercero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTerceroActionPerformed(evt);
            }
        });

        JAgregar.setText("Agregar");
        JAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JAgregarActionPerformed(evt);
            }
        });

        jLabel5.setText("Total:");

        jButton2.setText("Reportar Incidente");

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)
                                    .addComponent(JDPIAsegurado, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(JDPITercero, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                                        .addComponent(JMecanica, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JRepuesto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JCulpa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JTercero, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JDPIAsegurado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCulpa))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JDPITercero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTercero))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JMecanica, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JRepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(JAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JDPIAseguradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JDPIAseguradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JDPIAseguradoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        this.setVisible(false);
        MenuAdmin volver = new MenuAdmin(this, true);
        volver.setVisible(true);


    }//GEN-LAST:event_jButton3ActionPerformed

    private void JTerceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTerceroActionPerformed


    }//GEN-LAST:event_JTerceroActionPerformed

    private void JCulpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCulpaActionPerformed

    }//GEN-LAST:event_JCulpaActionPerformed

    private void JAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JAgregarActionPerformed

        for (int i = 0; i < Solicitudes.seguro.length; i++) {

            if (JDPIAsegurado.getText().equals(Solicitudes.seguro[i].getDPI()) && Solicitudes.seguro[i] != null) {

                if (!JTercero.isSelected()) {
                    agregarSinSeguro();

                } else if (JTercero.isSelected()) {

                }

            } else {

                JOptionPane.showMessageDialog(null, "El DPI ingresado del asegurado no existe en la base de datos");
            }
            break;
        }


    }//GEN-LAST:event_JAgregarActionPerformed

    public void agregarSinSeguro() {

        String Nombre = JOptionPane.showInputDialog("Por favor ingrese su nombre: ");
        String Apellido = JOptionPane.showInputDialog("Por favor ingrese su apellido: ");
        String Telefono = JOptionPane.showInputDialog("Por favor ingrese su número de telefóno: ");
        NoAsegurado sinseguro = new NoAsegurado(Nombre, Apellido, JDPITercero.getText(), Telefono, JMecanica.getSelectedItem().toString(), (int) PrecioMecanica(JMecanica.getSelectedItem().toString()));
        guardarSolicitud(sinseguro);

    }

    /**
     *
     * @param sol
     */
    public void guardarSolicitud(NoAsegurado sol) {
        for (int i = 0; i < SinSeguro.length; i++) {

            if (SinSeguro[i] == null) {
                SinSeguro[i] = sol;
                break;
            }
        }

    }

    public double PrecioMecanica(String nombre) {

        for (int i = 0; i < 50; i++) {

            if (CargarDatos.mecanica[i].getNombreActividad().equals(nombre)) {

                return CargarDatos.mecanica[i].getPrecio();
            }

        }
        return 0;
    }

    public double PrecioRepuesto(String nombre) {

        for (int i = 0; i < 50; i++) {

            if (CargarDatos.repuesto[i].getNombre().equals(nombre)) {

                return CargarDatos.repuesto[i].getPrecio();
            }

        }
        return 0;
    }

    public String Rol(boolean dato) {

        String rol = " ";
        if (dato == false) {
            rol = "Afectado";
        } else {
            rol = "Autor";
        }

        return rol;
    }

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
            java.util.logging.Logger.getLogger(ReporteIncidentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteIncidentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteIncidentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteIncidentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteIncidentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JAgregar;
    private javax.swing.JCheckBox JCulpa;
    private javax.swing.JTextField JDPIAsegurado;
    private javax.swing.JTextField JDPITercero;
    private javax.swing.JComboBox<String> JMecanica;
    private javax.swing.JComboBox<String> JRepuesto;
    private javax.swing.JCheckBox JTercero;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
