/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form.musteri;

import database.DB;
import database.MusteriCrud;
import static form.personel.FrmRezervasyonCreateUpdate.TEL_REGEX;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import property.Musteri;

/**
 *
 * @author aylin
 */
public class FrmMusteriHesapAyarlari extends javax.swing.JFrame {

    private Musteri musteri = new Musteri();

    public FrmMusteriHesapAyarlari(Musteri musteri) {
        initComponents();
        setLocationRelativeTo(this);
        this.musteri = musteri;

        if (musteri != null) {
            txt_Adi.setText(musteri.getIsim());
            txt_Soyadi.setText(musteri.getSoyisim());
            txt_EMail.setText(musteri.geteMail());
            txt_Telefon.setText(musteri.getTelefon());
            txt_Sifre.setText(musteri.getSifre());
        }
    }

    public FrmMusteriHesapAyarlari() {
        initComponents();
        setLocationRelativeTo(this);
    }

    ArrayList<String> kls = new ArrayList<>();

    public void DataGetir() {
        try {
            String q = "select *from category";
            ResultSet rs = new DB().baglan().executeQuery(q);

        } catch (Exception e) {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_Adi = new javax.swing.JTextField();
        txt_Soyadi = new javax.swing.JTextField();
        txt_EMail = new javax.swing.JTextField();
        txt_Telefon = new javax.swing.JTextField();
        txt_Sifre = new javax.swing.JTextField();
        btn_KullanıcıGüncelle = new javax.swing.JButton();
        btn_KullanıcıSil = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kullanıcı İşlemleri");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kullanıcı Islemleri", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Microsoft JhengHei UI", 1, 14), new java.awt.Color(102, 0, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(102, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Adı :");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Soyadı :");

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("e-mail :");

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Telefon :");

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sifre :");

        btn_KullanıcıGüncelle.setBackground(new java.awt.Color(102, 102, 255));
        btn_KullanıcıGüncelle.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        btn_KullanıcıGüncelle.setForeground(new java.awt.Color(102, 0, 0));
        btn_KullanıcıGüncelle.setText("Güncelle");
        btn_KullanıcıGüncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KullanıcıGüncelleActionPerformed(evt);
            }
        });

        btn_KullanıcıSil.setBackground(new java.awt.Color(102, 102, 255));
        btn_KullanıcıSil.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        btn_KullanıcıSil.setForeground(new java.awt.Color(102, 0, 0));
        btn_KullanıcıSil.setText("Hesabı Sil");

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 0));
        jButton1.setText("Alanları Temizle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/kalem.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Adi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Soyadi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_EMail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Telefon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Sifre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_KullanıcıGüncelle)
                                .addGap(18, 18, 18)
                                .addComponent(btn_KullanıcıSil, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel1)
                                                    .addComponent(txt_Adi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(txt_Soyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_EMail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addComponent(txt_Telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_Sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_KullanıcıGüncelle)
                    .addComponent(btn_KullanıcıSil))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txt_Adi.setText("");
        txt_Soyadi.setText("");
        txt_EMail.setText("");
        txt_Sifre.setText("");
        txt_Telefon.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_KullanıcıGüncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KullanıcıGüncelleActionPerformed
        if (validation()) {
            musteri.setIsim(txt_Adi.getText().trim());
            musteri.setSoyisim(txt_Soyadi.getText().trim());
            musteri.seteMail(txt_EMail.getText().trim());
            musteri.setTelefon(txt_Telefon.getText().trim());
            musteri.setSifre(txt_Sifre.getText().trim());
            
            if(new MusteriCrud().update(musteri)){
                JOptionPane.showMessageDialog(this, "Güncelleme başarılı...");
                dispose();
            }
        }

    }//GEN-LAST:event_btn_KullanıcıGüncelleActionPerformed

    boolean validation() {

        if (txt_Adi.getText().equals("")) {
            System.out.println("isim hatası");
            JOptionPane.showMessageDialog(this, "Lütfen bir isim giriniz!!!");
            txt_Adi.requestFocus();//ilgili texte odaklar
            txt_Adi.selectAll();
            return false;
        } else if (txt_Soyadi.getText().equals("")) {
            System.out.println("soyisim hatası");
            JOptionPane.showMessageDialog(this, "Lütfen bir soyisim giriniz!!!");
            txt_Soyadi.requestFocus();//ilgili texte odaklar
            txt_Soyadi.selectAll();
            return false;
        } else if (!isNumeric(txt_Telefon.getText().trim()) || !txt_Telefon.getText().trim().matches(TEL_REGEX)) {
            JOptionPane.showMessageDialog(this, "Geçersiz telefon numarası!!!");
            txt_Telefon.requestFocus();//ilgili texte odaklar
            txt_Telefon.selectAll();
            return false;
        } else if (txt_EMail.getText().equals("")) {
            System.out.println("e-mail hatası");
            JOptionPane.showMessageDialog(this, "Lütfen bir soyisim giriniz!!!");
            txt_EMail.requestFocus();//ilgili texte odaklar
            txt_EMail.selectAll();
            return false;
        } else if (txt_Sifre.getText().equals("") || txt_Sifre.getText().length() < 6) {
            JOptionPane.showMessageDialog(this, "Lütfen en az 6 karakterli geçerli bir şifre giriniz!!!");
            txt_Sifre.requestFocus();//ilgili texte odaklar
            txt_Sifre.selectAll();
            return false;
        }
        return true;
    }

    public boolean isNumeric(String data) {
        boolean durum = false;
        char[] dizi = data.toCharArray();
        for (int i = 0; i < dizi.length; i++) {
            if (Character.isDigit(dizi[i])) {
                durum = true;
            } else {
                durum = false;
                break;
            }
        }
        return durum;
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
            java.util.logging.Logger.getLogger(FrmMusteriHesapAyarlari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMusteriHesapAyarlari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMusteriHesapAyarlari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMusteriHesapAyarlari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMusteriHesapAyarlari().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_KullanıcıGüncelle;
    private javax.swing.JButton btn_KullanıcıSil;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_Adi;
    private javax.swing.JTextField txt_EMail;
    private javax.swing.JTextField txt_Sifre;
    private javax.swing.JTextField txt_Soyadi;
    private javax.swing.JTextField txt_Telefon;
    // End of variables declaration//GEN-END:variables
}
