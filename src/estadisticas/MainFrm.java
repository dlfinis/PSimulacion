package estadisticas;

import estadisticas.Clase;
import estadisticas.Frecuencia;
import javax.swing.table.DefaultTableModel;

public class MainFrm extends javax.swing.JFrame {

    private Frecuencia frec;

    public MainFrm() {
        initComponents();
        frec = new Frecuencia();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbManual = new javax.swing.JRadioButton();
        rbImportar = new javax.swing.JRadioButton();
        txtIngreso = new javax.swing.JTextField();
        btnCargar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDatos = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        btnCalcular = new javax.swing.JButton();
        btnGraficos = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso de Datos"));

        buttonGroup1.add(rbManual);
        rbManual.setSelected(true);
        rbManual.setText("Manual");
        rbManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbManualActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbImportar);
        rbImportar.setText("Importar Archivo");
        rbImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbImportarActionPerformed(evt);
            }
        });

        txtIngreso.setColumns(25);
        txtIngreso.setText("63,43,64,59,50,82,51,72,60,64,36,70,52,67,76,49,57,51,57,44,56,62,62,67,73,64,43,60,61,56,59,68,71,67,62,35,62,61,51,63,78,26,55,81,60");

        btnCargar.setText("Cargar");
        btnCargar.setEnabled(false);
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbManual)
                    .addComponent(rbImportar)
                    .addComponent(btnCargar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbManual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbImportar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCargar))
        );

        txtDatos.setColumns(20);
        txtDatos.setEditable(false);
        txtDatos.setLineWrap(true);
        txtDatos.setRows(5);
        jScrollPane1.setViewportView(txtDatos);

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "[ X - X >", "fi", "Fi", "hi", "Hi", "hi%", "Hi%"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblTabla);

        btnCalcular.setText("Calcular");
        btnCalcular.setEnabled(false);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnGraficos.setText("Mostrar Graficos");
        btnGraficos.setEnabled(false);
        btnGraficos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficosActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGraficos))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(btnCerrar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnGraficos))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbManualActionPerformed
        if (rbManual.isSelected()) {
            txtIngreso.setEnabled(true);
            btnCargar.setEnabled(false);
        }
    }//GEN-LAST:event_rbManualActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void rbImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbImportarActionPerformed
        if (rbImportar.isSelected()) {
            txtIngreso.setEnabled(false);
            btnCargar.setEnabled(true);
        }
    }//GEN-LAST:event_rbImportarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String[] str = txtIngreso.getText().trim().split(",");
        Double[] datos = new Double[str.length];
        for (int i = 0; i < datos.length; i++) {
            datos[i] = Double.parseDouble(str[i]);
            txtDatos.append(str[i] + " ");
        }
        frec.setValor(datos);
        txtIngreso.setText("");
        btnCalcular.setEnabled(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        Clase[] clases = frec.getClases();
        DefaultTableModel modelo = (DefaultTableModel) tblTabla.getModel();

        int n = frec.getK();
        int[] abs = frec.getFrecAbs();
        int[] absAc = frec.getFrecAbsAc();
        Double[] rel = frec.getFrecRel();
        Double[] relAc = frec.getFrecRelAc();
        txtDatos.append("\nN = " + frec.getValor().length);
        txtDatos.append("\nR = " + frec.getRango());
        txtDatos.append("\nK = " + frec.getK());
        txtDatos.append("\nA = " + frec.getA());
        borrarFilas();
        for (int i = 0; i < n; i++) {
            // Primero colocamos las marcas de clase
            String str = "[ " + Math.round(clases[i].getLimInf()) + "," +
                    Math.round(clases[i].getLimSup()) + " >";
            modelo.addRow(new String[]{str, abs[i] + "", absAc[i] + ""});
            modelo.setValueAt(redondear(rel[i], 4), i, 3);
            modelo.setValueAt(redondear(relAc[i], 4), i, 4);
            modelo.setValueAt(redondear(rel[i], 4)*100, i, 5);
            modelo.setValueAt(redondear(relAc[i], 4)*100, i, 6);
        }
        btnGraficos.setEnabled(true);
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnGraficosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficosActionPerformed
        dlgGraf graf=new dlgGraf(frec, this, true);
        graf.setLocationRelativeTo(this);
        graf.setVisible(true);
    }//GEN-LAST:event_btnGraficosActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCargarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGraficos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbImportar;
    private javax.swing.JRadioButton rbManual;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextArea txtDatos;
    private javax.swing.JTextField txtIngreso;
    // End of variables declaration//GEN-END:variables

    private void borrarFilas() {
        DefaultTableModel modelo = (DefaultTableModel) tblTabla.getModel();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(0);
        }
    }

    private Double redondear(Double d, int i) {
        Double valor =0.0;
        int factor=10*(i+1);
        valor = d;
        valor = valor * factor;
        valor = new Double(Math.round(valor));
        valor = valor / factor;

        return valor;
    }
}
