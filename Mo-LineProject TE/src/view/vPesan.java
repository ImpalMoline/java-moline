/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class vPesan extends javax.swing.JFrame {
    
    /**
     * Creates new form Pesan
     */
    public vPesan() {
        initComponents();
        this.setLocationRelativeTo(null);
        //setSize(360, 640);
    }
    
    public void showMessage(String message, String title, int type){
        JOptionPane.showMessageDialog(null, message, title, type);
    }
    
    public void loading(){
        vPesan vpe = new vPesan();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                vpe.setVisible(true);
            }
        });
        vPilih vpi = new vPilih();
        try{
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(20);
            }
        }catch (Exception e){
            
        }
        vpe.showMessage("Berhasil Mendapatkan Montir","Success",1);
        vpi.setVisible(true);
        vpi.dispose();
    }

    public String getCbTahun() {
        int check = cbTahun.getSelectedIndex()+1;
        String ret = "";
        switch(check){
            case 1 : ret = "1945"; break;
            case 2 : ret = "1946"; break;
            case 3 : ret = "1947"; break;
            case 4 : ret = "1948"; break;
            case 5 : ret = "1949"; break;
            case 6 : ret = "1950"; break;
            case 7 : ret = "1951"; break;
            case 8 : ret = "1952"; break;
            case 9 : ret = "1953"; break;
            case 10 : ret = "1954"; break;
            case 11 : ret = "1955"; break;
            case 12 : ret = "1956"; break;
            case 13 : ret = "1957"; break;
            case 14 : ret = "1958"; break;
            case 15 : ret = "1959"; break;
            case 16 : ret = "1960"; break;
            case 17 : ret = "1961"; break;
            case 18 : ret = "1962"; break;
            case 19 : ret = "1963"; break;
            case 20 : ret = "1964"; break;
            case 21 : ret = "1965"; break;
            case 22 : ret = "1966"; break;
            case 23 : ret = "1967"; break;
            case 24 : ret = "1968"; break;
            case 25 : ret = "1969"; break;
            case 26 : ret = "1970"; break;
            case 27 : ret = "1971"; break;
            case 28 : ret = "1972"; break;
            case 29 : ret = "1973"; break;
            case 30 : ret = "1974"; break;
            case 31 : ret = "1975"; break;
            case 32 : ret = "1976"; break;
            case 33 : ret = "1977"; break;
            case 34 : ret = "1978"; break;
            case 35 : ret = "1979"; break;
            case 36 : ret = "1980"; break;
            case 37 : ret = "1981"; break;
            case 38 : ret = "1982"; break;
            case 39 : ret = "1983"; break;
            case 40 : ret = "1984"; break;
            case 41 : ret = "1985"; break;
            case 42 : ret = "1986"; break;
            case 43 : ret = "1987"; break;
            case 44 : ret = "1988"; break;
            case 45 : ret = "1989"; break;
            case 46 : ret = "1990"; break;
            case 47 : ret = "1991"; break;
            case 48 : ret = "1992"; break;
            case 49 : ret = "1993"; break;
            case 50 : ret = "1994"; break;
            case 51 : ret = "1995"; break;
            case 52 : ret = "1996"; break;
            case 53 : ret = "1997"; break;
            case 54 : ret = "1998"; break;
            case 55 : ret = "1999"; break;
            case 56 : ret = "2000"; break;
            case 57 : ret = "2001"; break;
            case 58 : ret = "2002"; break;
            case 59 : ret = "2003"; break;
            case 60 : ret = "2004"; break;
            case 61 : ret = "2005"; break;
            case 62 : ret = "2006"; break;
            case 63 : ret = "2007"; break;
            case 64 : ret = "2008"; break;
            case 65 : ret = "2009"; break;
            case 66 : ret = "2010"; break;
            case 67 : ret = "2011"; break;
            case 68 : ret = "2012"; break;
            case 69 : ret = "2013"; break;
            case 70 : ret = "2014"; break;
            case 71 : ret = "2015"; break;
            case 72 : ret = "2016"; break;
            case 73 : ret = "2017"; break;
            case 74 : ret = "2018"; break;
            case 75 : ret = "2019"; break;
        }
        return ret;
    }

    public String getTaDeskripsi() {
        return taDeskripsi.getText();
    }

    public String getTfMerek() {
        return tfMerek.getText();
    }

    public String getTfNamaMobil() {
        return tfNamaMobil.getText();
    }

    public String getTfPlatNoBlkng() {
        return tfPlatNoBlkng.getText();
    }

    public String getTfPlatNoDpn() {
        return tfPlatNoDpn.getText();
    }

    public String getTfPlatNoTgh() {
        return tfPlatNoTgh.getText();
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
        lPesan = new javax.swing.JLabel();
        lMerk = new javax.swing.JLabel();
        lNama = new javax.swing.JLabel();
        lTahun = new javax.swing.JLabel();
        lDeskripsi = new javax.swing.JLabel();
        bPesan = new javax.swing.JButton();
        bBack = new javax.swing.JButton();
        tfMerek = new javax.swing.JTextField();
        tfNamaMobil = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDeskripsi = new javax.swing.JTextArea();
        lPlatNo = new javax.swing.JLabel();
        tfPlatNoDpn = new javax.swing.JTextField();
        cbTahun = new javax.swing.JComboBox<>();
        tfPlatNoTgh = new javax.swing.JTextField();
        tfPlatNoBlkng = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(152, 102, 0));

        lPesan.setFont(new java.awt.Font("Hobo Std", 0, 36)); // NOI18N
        lPesan.setForeground(new java.awt.Color(150, 150, 150));
        lPesan.setText("PESAN");

        lMerk.setFont(new java.awt.Font("Hobo Std", 0, 13)); // NOI18N
        lMerk.setForeground(new java.awt.Color(153, 153, 153));
        lMerk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lMerk.setText("MEREK");

        lNama.setFont(new java.awt.Font("Hobo Std", 0, 13)); // NOI18N
        lNama.setForeground(new java.awt.Color(153, 153, 153));
        lNama.setText("NAMA MOBIL");

        lTahun.setFont(new java.awt.Font("Hobo Std", 0, 13)); // NOI18N
        lTahun.setForeground(new java.awt.Color(153, 153, 153));
        lTahun.setText("TAHUN");

        lDeskripsi.setFont(new java.awt.Font("Hobo Std", 0, 13)); // NOI18N
        lDeskripsi.setForeground(new java.awt.Color(153, 153, 153));
        lDeskripsi.setText("DESKRIPSI");

        bPesan.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
        bPesan.setText("PESAN");
        bPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesanActionPerformed(evt);
            }
        });

        bBack.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
        bBack.setText("BACK");
        bBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBackActionPerformed(evt);
            }
        });

        taDeskripsi.setColumns(20);
        taDeskripsi.setRows(5);
        jScrollPane1.setViewportView(taDeskripsi);

        lPlatNo.setFont(new java.awt.Font("Hobo Std", 0, 13)); // NOI18N
        lPlatNo.setForeground(new java.awt.Color(153, 153, 153));
        lPlatNo.setText("PELAT NOMOR");

        cbTahun.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
        cbTahun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        cbTahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTahunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(lPesan)))
                .addGap(0, 58, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(bBack))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(lDeskripsi))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(lTahun))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(lNama)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bPesan, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfPlatNoDpn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfPlatNoTgh, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPlatNoBlkng, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cbTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lMerk, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfMerek, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfNamaMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(95, 95, 95))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lPlatNo)
                .addGap(135, 135, 135))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lPesan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lPlatNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPlatNoDpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPlatNoBlkng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPlatNoTgh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lMerk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfMerek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNamaMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lDeskripsi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bPesan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bBack)
                .addGap(35, 35, 35))
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

    private void bPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesanActionPerformed
        String pelat_nomor = this.getTfPlatNoDpn()+" "+this.getTfPlatNoTgh()+" "+this.getTfPlatNoBlkng();
        String merek = this.getTfMerek();
        String nama_mobil = this.getTfNamaMobil();
        String tahun = this.getCbTahun();
        String deskripsi = this.getTaDeskripsi();
        if(pelat_nomor.isEmpty() || merek.isEmpty() || nama_mobil.isEmpty() || 
        tahun.isEmpty() || deskripsi.isEmpty()){
            this.showMessage("Data Belum Lengkap", "Error", 0);
       }else{
            vPilih vpi= new vPilih();
            this.loading();
            vpi.setVisible(true);
            this.dispose();}
    }//GEN-LAST:event_bPesanActionPerformed

    private void bBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBackActionPerformed
       vMenu men = new vMenu();
       men.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_bBackActionPerformed

    private void cbTahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTahunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTahunActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBack;
    private javax.swing.JButton bPesan;
    private javax.swing.JComboBox<String> cbTahun;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lDeskripsi;
    private javax.swing.JLabel lMerk;
    private javax.swing.JLabel lNama;
    private javax.swing.JLabel lPesan;
    private javax.swing.JLabel lPlatNo;
    private javax.swing.JLabel lTahun;
    private javax.swing.JTextArea taDeskripsi;
    private javax.swing.JTextField tfMerek;
    private javax.swing.JTextField tfNamaMobil;
    private javax.swing.JTextField tfPlatNoBlkng;
    private javax.swing.JTextField tfPlatNoDpn;
    private javax.swing.JTextField tfPlatNoTgh;
    // End of variables declaration//GEN-END:variables
}
