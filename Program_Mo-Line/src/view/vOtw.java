/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Farhan
 */
public class vOtw extends javax.swing.JFrame {

    /**
     * Creates new form vRating
     */
    public vOtw() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lMaps = new javax.swing.JLabel();
        lMontir = new javax.swing.JLabel();
        lNamaMontir = new javax.swing.JLabel();
        lIDMontir = new javax.swing.JLabel();
        lRating = new javax.swing.JLabel();
        lAngkaRating = new javax.swing.JLabel();
        lTujuan = new javax.swing.JLabel();
        lCapWaktuTiba = new javax.swing.JLabel();
        lJarakMontir = new javax.swing.JLabel();
        lHarga = new javax.swing.JLabel();
        bBatal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 102, 0));

        lMaps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/maps.png"))); // NOI18N

        lMontir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/montir.png"))); // NOI18N

        lNamaMontir.setFont(new java.awt.Font("Hobo Std", 0, 18)); // NOI18N
        lNamaMontir.setForeground(new java.awt.Color(153, 153, 153));
        lNamaMontir.setText("ANHAR ABIMANYU");

        lIDMontir.setFont(new java.awt.Font("Hobo Std", 0, 18)); // NOI18N
        lIDMontir.setForeground(new java.awt.Color(153, 153, 153));
        lIDMontir.setText("MO-001");

        lRating.setFont(new java.awt.Font("Hobo Std", 0, 18)); // NOI18N
        lRating.setForeground(new java.awt.Color(153, 153, 153));
        lRating.setText("RATING");

        lAngkaRating.setFont(new java.awt.Font("Hobo Std", 0, 18)); // NOI18N
        lAngkaRating.setForeground(new java.awt.Color(153, 153, 153));
        lAngkaRating.setText("4.5 / 5.0");

        lTujuan.setFont(new java.awt.Font("Hobo Std", 0, 14)); // NOI18N
        lTujuan.setForeground(new java.awt.Color(153, 153, 153));
        lTujuan.setText("TO KUTABUMI");

        lCapWaktuTiba.setFont(new java.awt.Font("Hobo Std", 0, 14)); // NOI18N
        lCapWaktuTiba.setForeground(new java.awt.Color(153, 153, 153));
        lCapWaktuTiba.setText("MONTIR AKAN TIBA DALAM 4 MENIT");

        lJarakMontir.setFont(new java.awt.Font("Hobo Std", 0, 14)); // NOI18N
        lJarakMontir.setForeground(new java.awt.Color(153, 153, 153));
        lJarakMontir.setText("JARAK MONTIR 6 KM");

        lHarga.setFont(new java.awt.Font("Hobo Std", 0, 18)); // NOI18N
        lHarga.setForeground(new java.awt.Color(153, 153, 153));
        lHarga.setText("RP 200.000 - 400.000");

        bBatal.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
        bBatal.setText("BATAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lHarga)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lMontir)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lIDMontir)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lRating)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lAngkaRating))
                                            .addComponent(lNamaMontir, javax.swing.GroupLayout.Alignment.LEADING))))
                                .addComponent(lTujuan)
                                .addComponent(lJarakMontir)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lCapWaktuTiba)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(lMaps, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lMaps, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lNamaMontir)
                        .addGap(18, 18, 18)
                        .addComponent(lIDMontir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lRating)
                            .addComponent(lAngkaRating)))
                    .addComponent(lMontir))
                .addGap(18, 18, 18)
                .addComponent(lTujuan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lCapWaktuTiba)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lJarakMontir)
                .addGap(24, 24, 24)
                .addComponent(lHarga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bBatal)
                .addContainerGap(38, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(vOtw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vOtw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vOtw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vOtw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vOtw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBatal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lAngkaRating;
    private javax.swing.JLabel lCapWaktuTiba;
    private javax.swing.JLabel lHarga;
    private javax.swing.JLabel lIDMontir;
    private javax.swing.JLabel lJarakMontir;
    private javax.swing.JLabel lMaps;
    private javax.swing.JLabel lMontir;
    private javax.swing.JLabel lNamaMontir;
    private javax.swing.JLabel lRating;
    private javax.swing.JLabel lTujuan;
    // End of variables declaration//GEN-END:variables
}