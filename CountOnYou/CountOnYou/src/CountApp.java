
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CountApp.java
 *
 * Created on Mar 22, 2012, 8:32:17 PM
 */
/**
 *
 * @author WIN-7
 */
public class CountApp extends javax.swing.JFrame {
  CountLogic control;

  /** Creates new form CountApp */
  public CountApp() {
    initComponents();
    control = new CountLogic();
    lookAndFeel(1);
  }

  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    btn_htg1 = new javax.swing.JButton();
    jLabel3 = new javax.swing.JLabel();
    tex_tinggi = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    combo_kelamin = new javax.swing.JComboBox();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    tex_panjang = new javax.swing.JTextField();
    jLabel11 = new javax.swing.JLabel();
    btn_htg2 = new javax.swing.JButton();
    combo_lutut = new javax.swing.JComboBox();
    jPanel3 = new javax.swing.JPanel();
    lbl_normal = new javax.swing.JLabel();
    jLabel15 = new javax.swing.JLabel();
    label1 = new javax.swing.JLabel();
    jPanel4 = new javax.swing.JPanel();
    jLabel13 = new javax.swing.JLabel();
    tex_berat = new javax.swing.JTextField();
    jLabel14 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    tex_umur = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Berdasarkan Umur dan Tinggi Badan"));

    btn_htg1.setText("Hitung");
    btn_htg1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_htg1ActionPerformed(evt);
      }
    });

    jLabel3.setText("Tinggi");

    jLabel4.setText("Cm");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel3)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(tex_tinggi, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel4)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btn_htg1)
        .addContainerGap(104, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(tex_tinggi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel4)
          .addComponent(btn_htg1))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Berdasarkan Tinggi Lutut dan Rentang Lengan"));

    combo_kelamin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pria", "Wanita" }));
    combo_kelamin.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        combo_kelaminActionPerformed(evt);
      }
    });

    jLabel7.setText("J. Kelamin");

    jLabel8.setText("berdasarkan");

    jLabel9.setText("panjang");

    jLabel11.setText("Cm");

    btn_htg2.setText("Hitung");
    btn_htg2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btn_htg2ActionPerformed(evt);
      }
    });

    combo_lutut.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "lutut", "lengan" }));

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel9)
            .addGap(115, 115, 115))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel7)
              .addComponent(jLabel8))
            .addGap(46, 46, 46)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(combo_kelamin, 0, 165, Short.MAX_VALUE)
              .addComponent(combo_lutut, 0, 165, Short.MAX_VALUE)
              .addComponent(tex_panjang, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
              .addComponent(btn_htg2))))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel11))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap(26, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(combo_kelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel7))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel8)
          .addComponent(combo_lutut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel9)
          .addComponent(tex_panjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel11))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btn_htg2))
    );

    jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

    lbl_normal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    lbl_normal.setText("Normalkah Berat Anda ?");

    jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel15.setText("Berat Badan Ideal : ");

    label1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    label1.setText("0 Kg");

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(jLabel15)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(label1))
          .addComponent(lbl_normal))
        .addContainerGap(78, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel15)
          .addComponent(label1))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(lbl_normal)
        .addContainerGap())
    );

    jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jLabel13.setText("Berat Badan anda saat ini : ");

    jLabel14.setText("Kg");

    jLabel1.setText("Umur anda                         :");

    tex_umur.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        tex_umurActionPerformed(evt);
      }
    });

    jLabel2.setText("Tahun");

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel13)
          .addComponent(jLabel1))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(tex_umur, javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(tex_berat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel14)
          .addComponent(jLabel2))
        .addGap(151, 151, 151))
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel13)
          .addComponent(tex_berat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel14))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jLabel1)
          .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(tex_umur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel2)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
          .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  public void lookAndFeel(int no) {
    UIManager.LookAndFeelInfo[] kelasLAF = UIManager.getInstalledLookAndFeels();
    try {
      UIManager.setLookAndFeel(kelasLAF[no].getClassName());
      SwingUtilities.updateComponentTreeUI(this);
    } catch (Exception ex) {
      JOptionPane.showMessageDialog(null, "kesalahan lookAndfeel " + ex);
    }

  }
  
  
  
  private void tex_umurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tex_umurActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_tex_umurActionPerformed

  private void combo_kelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_kelaminActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_combo_kelaminActionPerformed

  private void btn_htg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_htg1ActionPerformed
    if (!tex_umur.getText().equals("") && !tex_tinggi.getText().equals("")&& !tex_berat.getText().equals("")) {
      int umur = Integer.parseInt(tex_umur.getText());
      double tinggi = Double.parseDouble(tex_tinggi.getText());
      double berat = Double.parseDouble(tex_berat.getText());
      double beratIdeal = control.hitungDrUmur(umur, tinggi);
      label1.setText(beratIdeal + " Kg");
      String isnormal = control.isNormal(berat, beratIdeal) ;
      lbl_normal.setText("berat badan anda : "+isnormal);
    }
  }//GEN-LAST:event_btn_htg1ActionPerformed

  private void btn_htg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_htg2ActionPerformed
    if (!tex_panjang.getText().equals("")&& !tex_umur.getText().equals("")&& !tex_berat.getText().equals("")) {
      double beratIdeal;
      double berat = Double.parseDouble(tex_berat.getText());
      String kel = (String) (String) combo_kelamin.getSelectedItem();
      String dasar = (String) combo_lutut.getSelectedItem();
      int umur = Integer.parseInt(tex_umur.getText());
      int panjang = Integer.parseInt(tex_panjang.getText());
      //System.out.println(umur+" "+panjang);
      beratIdeal = control.dariKakiLengan(kel, dasar, umur, panjang);
      label1.setText(beratIdeal+" Kg");
      String isnormal = control.isNormal(berat, beratIdeal) ;
      lbl_normal.setText("berat badan anda : "+isnormal);

    }
  }//GEN-LAST:event_btn_htg2ActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {

      public void run() {
        new CountApp().setVisible(true);
      }
    });
  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btn_htg1;
  private javax.swing.JButton btn_htg2;
  private javax.swing.JComboBox combo_kelamin;
  private javax.swing.JComboBox combo_lutut;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel13;
  private javax.swing.JLabel jLabel14;
  private javax.swing.JLabel jLabel15;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JLabel label1;
  private javax.swing.JLabel lbl_normal;
  private javax.swing.JTextField tex_berat;
  private javax.swing.JTextField tex_panjang;
  private javax.swing.JTextField tex_tinggi;
  private javax.swing.JTextField tex_umur;
  // End of variables declaration//GEN-END:variables
}
