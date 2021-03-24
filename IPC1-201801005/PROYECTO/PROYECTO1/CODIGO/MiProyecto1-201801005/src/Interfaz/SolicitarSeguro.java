/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Persona.Persona;
import javax.swing.JOptionPane;

/**
 *
 * @author HernandezMartinez
 */
public class SolicitarSeguro extends javax.swing.JDialog {

    public double valor;
    public double valorestablecido;

    public static Persona[] datos = new Persona[25];

    /**
     * Creates new form SolicitarSeguro
     *
     * @param parent
     * @param modal
     */
    public SolicitarSeguro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        CargarTipo();
        CargarModelo();
        CargarUso();
        CargarMarca();
        CargarLinea();
    }

    public void CargarTipo() {

        for (int i = 0; i < CargarDatos.contadorTipo; i++) {

            JTipo.addItem(CargarDatos.tipo[i].Resumen());
        }
    }

    public void CargarModelo() {

        for (int i = 0; i < CargarDatos.contadorModelo; i++) {

            JModelo.addItem(String.valueOf(CargarDatos.modelo[i].Resumen()));
        }
    }

    public void CargarUso() {

        for (int i = 0; i < CargarDatos.contadorUso; i++) {

            JUso.addItem(CargarDatos.uso[i].Resumen());
        }
    }

    public void CargarMarca() {

        for (int i = 0; i < CargarDatos.contadorMarca; i++) {

            JMarca.addItem(CargarDatos.marca[i].Resumen());
        }
    }

    public void CargarLinea() {

        for (int i = 0; i < CargarDatos.contadorLinea; i++) {

            JLinea.addItem(CargarDatos.linea[i].Resumen());
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
        JNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JPhone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JDPI = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        JTipo = new javax.swing.JComboBox<>();
        JLinea = new javax.swing.JComboBox<>();
        JMarca = new javax.swing.JComboBox<>();
        JUso = new javax.swing.JComboBox<>();
        JModelo = new javax.swing.JComboBox<>();
        JValorVehiculo = new javax.swing.JTextField();
        BtnCotizar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        JCostoPrima = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        JDeducible = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        JPosibleCP = new javax.swing.JTextField();
        JPosibleDeduc = new javax.swing.JTextField();
        BtnMenorDeduc = new javax.swing.JButton();
        BtnMayorDeduc = new javax.swing.JButton();
        BtnSolicitarSeguro = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Solicitar Seguro Automas");

        jLabel1.setText("Nombres:");

        JNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JNombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellidos:");

        JApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JApellidoActionPerformed(evt);
            }
        });

        jLabel4.setText("Telefono:");

        JPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPhoneActionPerformed(evt);
            }
        });

        jLabel3.setText("DPI:");

        JDPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JDPIActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo de Vehículo:");

        jLabel6.setText("Uso del Vehículo:");

        jLabel7.setText("Marca:");

        jLabel8.setText("Linea:");

        jLabel9.setText("Modelo:");

        jLabel10.setText("Valor del Vehículo");

        JTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTipoActionPerformed(evt);
            }
        });

        JValorVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JValorVehiculoActionPerformed(evt);
            }
        });

        BtnCotizar.setText("Cotizar");
        BtnCotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCotizarActionPerformed(evt);
            }
        });

        jLabel11.setText("Costo Prima:");

        jLabel12.setText("Deducible:");

        jLabel13.setText("Posible Costo Prima: ");

        jLabel14.setText("Posible Deducible:");

        BtnMenorDeduc.setText("-Deducible");
        BtnMenorDeduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenorDeducActionPerformed(evt);
            }
        });

        BtnMayorDeduc.setText("+Deducible");
        BtnMayorDeduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMayorDeducActionPerformed(evt);
            }
        });

        BtnSolicitarSeguro.setText("SOLICITAR SEGURO");
        BtnSolicitarSeguro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSolicitarSeguroActionPerformed(evt);
            }
        });

        BtnCancelar.setText("CANCELAR");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JApellido)
                            .addComponent(JDPI, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JPhone)
                            .addComponent(JTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JModelo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JLinea, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JMarca, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JUso, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JValorVehiculo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JPosibleCP, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JPosibleDeduc, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(BtnCotizar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCostoPrima, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JDeducible, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnMenorDeduc)
                                .addGap(18, 18, 18)
                                .addComponent(BtnMayorDeduc)
                                .addGap(18, 18, 18)
                                .addComponent(BtnSolicitarSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JDPI, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JUso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JValorVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(BtnCotizar)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCostoPrima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JDeducible, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPosibleCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPosibleDeduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnMenorDeduc)
                    .addComponent(BtnMayorDeduc)
                    .addComponent(BtnSolicitarSeguro)
                    .addComponent(BtnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void JNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JNombreActionPerformed

    private void JApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JApellidoActionPerformed

    private void JPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPhoneActionPerformed

    private void JDPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JDPIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JDPIActionPerformed

    private void JValorVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JValorVehiculoActionPerformed

    }//GEN-LAST:event_JValorVehiculoActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed

        this.setVisible(false);
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);

    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void JTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTipoActionPerformed

    private void BtnCotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCotizarActionPerformed

        valor = Double.parseDouble(JValorVehiculo.getText());

        valorestablecido = ValorEstablecido(JTipo.getSelectedItem().toString());

        double porcentajeAumentoMarca;
        porcentajeAumentoMarca = porcentajeMarca(JMarca.getSelectedItem().toString());

        double porcentajeAumentoLinea;
        porcentajeAumentoLinea = porcentajeLinea(JLinea.getSelectedItem().toString());

        double porcentajeAumentoUso;
        porcentajeAumentoUso = porcentajeUso(JUso.getSelectedItem().toString());

        double porcentajeDepreciación;
        porcentajeDepreciación = valorDepre(Integer.parseInt(JModelo.getSelectedItem().toString()));

        double valorReal;
        valorReal = VR(porcentajeDepreciación);

        double porcentajeRiesgo;
        porcentajeRiesgo = PTR(porcentajeAumentoMarca, porcentajeAumentoLinea, porcentajeAumentoUso);

        double primaTotal;
        primaTotal = PT(porcentajeRiesgo);

        double costoPrima;
        costoPrima = CP(primaTotal);

        double costoDeducible;
        costoDeducible = CD(valor);

        if (valorestablecido >= valor || valorReal > valor) {

            JCostoPrima.setText(String.valueOf(costoPrima));
            JCostoPrima.setEditable(false);
            JDeducible.setText(String.valueOf(costoDeducible));
            JDeducible.setEditable(false);
            JPosibleCP.setText(String.valueOf(costoPrima));
            JPosibleDeduc.setText(String.valueOf(costoDeducible));

        } else {
            JOptionPane.showMessageDialog(null, "Error, por favor ingrese un valor de vehículo menor");

        }

    }//GEN-LAST:event_BtnCotizarActionPerformed

    private void BtnMenorDeducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenorDeducActionPerformed

        double deduciblefinal, CPfinal, deducible, costoPrima, aux1, aux2;
        deducible = Double.parseDouble(JDeducible.getText());
        costoPrima = Double.parseDouble(JCostoPrima.getText());
        aux1 = deducible * 0.1;
        aux2 = costoPrima * 0.03;
        deduciblefinal = deducible - aux1;
        CPfinal = costoPrima + aux2;
        JPosibleCP.setText(String.valueOf(CPfinal));
        JPosibleCP.setEditable(false);
        JPosibleDeduc.setText(String.valueOf(deduciblefinal));
        JPosibleDeduc.setEditable(false);


    }//GEN-LAST:event_BtnMenorDeducActionPerformed

    private void BtnMayorDeducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMayorDeducActionPerformed

        double deduciblefinal, CPfinal, deducible, costoPrima, aux1, aux2;
        deducible = Double.parseDouble(JDeducible.getText());
        costoPrima = Double.parseDouble(JCostoPrima.getText());
        aux1 = deducible * 0.1;
        aux2 = costoPrima * 0.03;
        deduciblefinal = deducible + aux1;
        CPfinal = costoPrima - aux2;
        JPosibleCP.setText(String.valueOf(CPfinal));
        JPosibleDeduc.setText(String.valueOf(deduciblefinal));


    }//GEN-LAST:event_BtnMayorDeducActionPerformed

    private void BtnSolicitarSeguroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSolicitarSeguroActionPerformed

        Persona datos = new Persona(JNombre.getText(), JApellido.getText(), JPhone.getText(),
                JDPI.getText(), JTipo.getSelectedItem().toString(), JUso.getSelectedItem().toString(),
                JMarca.getSelectedItem().toString(), JLinea.getSelectedItem().toString(), JModelo.getSelectedItem().toString(),
                JValorVehiculo.getText(), JPosibleCP.getText(), JPosibleDeduc.getText());
        guardarSolicitud(datos);
        
        JNombre.setText(" ");
        JApellido.setText(" ");
        JPhone.setText(" ");
        JDPI.setText(" ");
        JValorVehiculo.setText(" ");
        JCostoPrima.setText(" ");
        JDeducible.setText(" ");
        JPosibleCP.setText(" ");
        JPosibleDeduc.setText(" ");
    }//GEN-LAST:event_BtnSolicitarSeguroActionPerformed

    public void guardarSolicitud(Persona sol) {
        for (int i = 0; i < datos.length; i++) {

            if (datos[i] == null) {
                datos[i] = sol;
                break;
            }
        }

    }

    public double ValorEstablecido(String tipo) {
        for (int i = 0; i < 50; i++) {

            if (CargarDatos.tipo[i].getNombre().equals(tipo)) {

                return CargarDatos.tipo[i].getValormax();
            }

        }
        return 0;

    }

    public double CD(double valorVehiculo) {

        double cd = 0.007 * valorVehiculo;

        return cd;
    }

    public double CP(double PT) {

        double CP;
        CP = PT / 12;

        return CP;
    }

    public double PT(double PTR) {

        double PT;
        PT = valor * (0.1 + PTR);
        return PT;
    }

    public double PTR(double porcentajeMarca, double porcentajeLinea, double porcentajeUso) {

        double PTR = porcentajeMarca + porcentajeLinea + porcentajeUso;
        return PTR;
    }

    public double valorDepre(int modelo) {

        for (int i = 0; i < 50; i++) {

            if (CargarDatos.modelo[i].getAño() == modelo) {

                return CargarDatos.modelo[i].getPctdepre();
            }

        }
        return 0;
    }

    public double VR(double pctdepre) {
        double valorReal;
        double aux;

        aux = pctdepre * valorestablecido;
        valorReal = valorestablecido - aux;

        return valorReal;
    }

    public double porcentajeMarca(String nombre) {

        for (int i = 0; i < 50; i++) {

            if (CargarDatos.marca[i].getNombre().equals(nombre)) {

                return CargarDatos.marca[i].getPctaumento();
            }

        }
        return 0;
    }

    public double porcentajeLinea(String linea) {
        for (int i = 0; i < 50; i++) {

            if (CargarDatos.linea[i].getNombre().equals(linea)) {

                return CargarDatos.linea[i].getPctaumento();
            }

        }
        return 0;

    }

    public double porcentajeUso(String uso) {
        for (int i = 0; i < 50; i++) {

            if (CargarDatos.uso[i].getNombre().equals(uso)) {

                return CargarDatos.uso[i].getPctaumento();
            }

        }
        return 0;

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
            java.util.logging.Logger.getLogger(SolicitarSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SolicitarSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SolicitarSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SolicitarSeguro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SolicitarSeguro dialog = new SolicitarSeguro(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnCotizar;
    private javax.swing.JButton BtnMayorDeduc;
    private javax.swing.JButton BtnMenorDeduc;
    private javax.swing.JButton BtnSolicitarSeguro;
    private javax.swing.JTextField JApellido;
    private javax.swing.JTextField JCostoPrima;
    private javax.swing.JTextField JDPI;
    private javax.swing.JTextField JDeducible;
    private javax.swing.JComboBox<String> JLinea;
    private javax.swing.JComboBox<String> JMarca;
    private javax.swing.JComboBox<String> JModelo;
    private javax.swing.JTextField JNombre;
    private javax.swing.JTextField JPhone;
    private javax.swing.JTextField JPosibleCP;
    private javax.swing.JTextField JPosibleDeduc;
    public static javax.swing.JComboBox<String> JTipo;
    private javax.swing.JComboBox<String> JUso;
    private javax.swing.JTextField JValorVehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
