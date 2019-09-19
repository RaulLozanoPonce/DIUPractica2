/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diupractica2;

import java.awt.Color;
import java.util.Hashtable;
import javax.swing.JLabel;

/**
 *
 * @author Raúl
 */
public class DIUPractica2 extends javax.swing.JFrame {
    
    private int[][] matriz;

    /**
     * Creates new form DIUPractica2
     */
    public DIUPractica2() {
        matriz = new int[10][10];
        initComponents();
        
        inicializarMatriz(0,100);
        matrizTextArea.setTabSize(2);
        matrizTextArea.setText(matrizToString());
        
        valorMinimo.setText("0");
        valorMaximo.setText("100");
        
        umbralSlider.setValue(0);
        umbralSlider.setMajorTickSpacing(10);
        umbralSlider.setPaintTicks(true);
        umbralSlider.setPaintLabels(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        valorMinimoLabel = new javax.swing.JLabel();
        valorMaximoLabel = new javax.swing.JLabel();
        valorMinimo = new javax.swing.JTextField();
        valorMaximo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        umbralSlider = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        matrizTextArea = new javax.swing.JTextArea();
        pabloPerdomoLabel = new javax.swing.JLabel();
        raulLozanoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tituloLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setText("FILTRADO DE MATRIZ CUADRADA");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores límite de la matriz"));

        valorMinimoLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        valorMinimoLabel.setText("Valor mínimo:");

        valorMaximoLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        valorMaximoLabel.setText("Valor máximo:");

        valorMinimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorMinimoActionPerformed(evt);
            }
        });

        valorMaximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorMaximoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(valorMinimoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valorMaximoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(valorMinimo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(valorMaximo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorMinimoLabel)
                    .addComponent(valorMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorMaximoLabel)
                    .addComponent(valorMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Selección de umbral"));

        umbralSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                umbralSliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(umbralSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(umbralSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        matrizTextArea.setColumns(20);
        matrizTextArea.setRows(5);
        jScrollPane1.setViewportView(matrizTextArea);

        pabloPerdomoLabel.setText("Pablo Perdomo Falcón");

        raulLozanoLabel.setText("Raúl Lozano Ponce");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(pabloPerdomoLabel)
                            .addComponent(raulLozanoLabel))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(raulLozanoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pabloPerdomoLabel))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valorMinimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorMinimoActionPerformed
        actualizarMatriz();
    }//GEN-LAST:event_valorMinimoActionPerformed

    private void valorMaximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorMaximoActionPerformed
        actualizarMatriz();
    }//GEN-LAST:event_valorMaximoActionPerformed

    private void umbralSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_umbralSliderStateChanged
        if(valoresSonNumeros()){
            matrizTextArea.setText(matrizToString());
        }else{
            matrizTextArea.setText("");
        }
    }//GEN-LAST:event_umbralSliderStateChanged

    private void actualizarMatriz(){
        if(valoresSonNumeros()){
            int min = Integer.parseInt(valorMinimo.getText());
            int max = Integer.parseInt(valorMaximo.getText());
            inicializarMatriz(min,max);
            matrizTextArea.setTabSize(Math.max(2,Integer.toString(max).length()));
            matrizTextArea.setText(matrizToString());
            inicializarSlider(min, max);
        }else{
            matrizTextArea.setText("");
        }
    }
    
    private boolean valoresSonNumeros(){
        boolean sonNumeros = true;
        
        try {
            valorMinimo.setForeground(Color.black);
            int valor = Integer.parseInt(valorMinimo.getText());
        } catch (NumberFormatException e) {
            valorMinimo.setForeground(Color.red);
            sonNumeros = false;
        }
        try {
            valorMaximo.setForeground(Color.black);
            int valor = Integer.parseInt(valorMaximo.getText());
        } catch (NumberFormatException e) {
            valorMaximo.setForeground(Color.red);
            sonNumeros = false;
        }
        
        return sonNumeros && !"".equals(valorMinimo.getText()) && !"".equals(valorMaximo.getText());
    }
    
    private void inicializarMatriz(int min, int max){
        matriz = new int[10][10];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) Math.round(Math.random()*(max-min) + min);
            }
        }
    }
    
    private String matrizToString(){
        String matrizString = "";
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizString += ((matriz[i][j] <= umbralSlider.getValue()) ? "-" : matriz[i][j] ) + "\t";
            }
            matrizString += "\n";
        }
        
        return matrizString;
    }
    
    private void inicializarSlider(int min, int max){
        umbralSlider.setMinimum(min);
        umbralSlider.setMaximum(max);
        umbralSlider.setValue(min);
        int incremento = (int) Math.round(0.1*(max-min));
        umbralSlider.setMajorTickSpacing(incremento);
        Hashtable labelTable = new Hashtable();
        int contador = 0;
        while(contador <= max){
            labelTable.put(contador,new JLabel(contador + ""));
            contador += incremento;
        }
        umbralSlider.setLabelTable(labelTable);
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
            java.util.logging.Logger.getLogger(DIUPractica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DIUPractica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DIUPractica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DIUPractica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DIUPractica2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea matrizTextArea;
    private javax.swing.JLabel pabloPerdomoLabel;
    private javax.swing.JLabel raulLozanoLabel;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JSlider umbralSlider;
    private javax.swing.JTextField valorMaximo;
    private javax.swing.JLabel valorMaximoLabel;
    private javax.swing.JTextField valorMinimo;
    private javax.swing.JLabel valorMinimoLabel;
    // End of variables declaration//GEN-END:variables
}
