/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import model.*;


/**
 *
 * @author Farhan
 */
public class vFirst extends javax.swing.JFrame {
    private Database Db = new Database();
    private mSign_Up s;
    private mLogin l;
    public static String id_cust ;
        
   
    /**
     * Creates new form vFirst
     */
    public vFirst() {
        initComponents();
        this.setLocationRelativeTo(null);
        //setSize(360, 640);
    }
    
    public String getTfEmail() {
        return tfUsername.getText();
    }

    public String getPfPassword() {
        return pfPassword.getText();
    }
    
    public void showMessage(String message, String title, int type){
        JOptionPane.showMessageDialog(null, message, title, type);
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
        logoMoLine = new javax.swing.JLabel();
        labelMoLine = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        lPassword = new javax.swing.JLabel();
        pfPassword = new javax.swing.JPasswordField();
        bLogin = new javax.swing.JButton();
        bDaftar = new javax.swing.JButton();
        bForget = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 102, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 640));

        logoMoLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icon/logoMoLine.png"))); // NOI18N

        labelMoLine.setFont(new java.awt.Font("Hobo Std", 0, 36)); // NOI18N
        labelMoLine.setForeground(new java.awt.Color(153, 153, 153));
        labelMoLine.setText("Mo-Line");

        labelUsername.setFont(new java.awt.Font("Hobo Std", 0, 13)); // NOI18N
        labelUsername.setForeground(new java.awt.Color(153, 153, 153));
        labelUsername.setText("EMAIL");

        tfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsernameActionPerformed(evt);
            }
        });

        lPassword.setFont(new java.awt.Font("Hobo Std", 0, 13)); // NOI18N
        lPassword.setForeground(new java.awt.Color(153, 153, 153));
        lPassword.setText("PASSWORD");

        bLogin.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
        bLogin.setText("LOGIN");
        bLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoginActionPerformed(evt);
            }
        });

        bDaftar.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
        bDaftar.setText("REGISTER");
        bDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDaftarActionPerformed(evt);
            }
        });

        bForget.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
        bForget.setText("FORGET");
        bForget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bForgetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 117, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelMoLine)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bForget, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bDaftar, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                        .addGap(122, 122, 122))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(lPassword))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfUsername)
                                .addComponent(logoMoLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pfPassword))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(labelUsername)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(logoMoLine)
                .addGap(18, 18, 18)
                .addComponent(labelMoLine)
                .addGap(60, 60, 60)
                .addComponent(labelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(bLogin)
                .addGap(40, 40, 40)
                .addComponent(bDaftar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bForget)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsernameActionPerformed

    private void bDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDaftarActionPerformed
       vRegistrasi reg = new vRegistrasi();
       reg.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_bDaftarActionPerformed

    private void bLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoginActionPerformed
        String id_cust = this.getTfEmail();
        String password = this.getPfPassword();
        if (id_cust.isEmpty() && password.isEmpty()){
            this.showMessage("Anda Belum memasukkan Username dan Password", "Error", 0);
            /*new vFirst().setVisible(true);
            this.dispose();*/
        }else if (id_cust.isEmpty() ){
                this.showMessage("Anda Belum memasukkan Username", "Error", 0);
                /*new vFirst().setVisible(true);
                this.dispose();*/
        }else if (password.isEmpty() ){
                this.showMessage("Anda Belum memasukkan Password", "Error", 0);
                /*new vFirst().setVisible(true);
                this.dispose();*/
        }else{
            if (!Db.checkDuplicateEmail(id_cust)){
                this.showMessage("Email Salah atau Belum Terdaftar","Error", 0);
                new vFirst().setVisible(true);
                this.dispose();
            }else{
                if(!Db.checkDuplicatePassword(id_cust,password)){
                this.showMessage("Password Salah atau Belum Terdaftar","Error", 0);
                new vFirst().setVisible(true);
                this.dispose();
                }else {
                    this.id_cust = id_cust;
                    this.showMessage("Login Berhasil","Success", 1);
                    new vPesan().setVisible(true);
                    this.dispose();
                }
            }
        }
        /*vMenu men = new vMenu();
        men.setVisible(true);
        this.dispose();*/
    }//GEN-LAST:event_bLoginActionPerformed

    private void bForgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bForgetActionPerformed
       vForget get = new vForget();
       get.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_bForgetActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDaftar;
    private javax.swing.JButton bForget;
    private javax.swing.JButton bLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lPassword;
    private javax.swing.JLabel labelMoLine;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JLabel logoMoLine;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables

   
}
