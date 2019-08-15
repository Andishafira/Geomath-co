/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunDatar;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ui.app.pbo.TampilanUtama;
import ui.app.pbo.bangunDatarClass;
import ui.app.pbo.bangunRuangClass;


/**
 *
 * @author Asus
 */
public class persegiPanjang extends javax.swing.JFrame {

    /**
     * Creates new form persegiPanjang
     */
    psgPanjangKeliling pKel;
    psgPanjangKelilingGambar gbr1;
    psgPanjangLuas pLuas;
    psgPanjangLuasGambar gbr2;
    psgPanjangDiagonal pDiagonal;
    psgPanjangDiagonalGambar gbr3;
    psgPanjangLatsol1 pL1;
    psgPanjangLatsol2 pL2;
    psgPanjangLatsol3 pL3;
    psgPanjangLatsol4 pL4;
    psgPanjangLatsol5 pL5;
    psgPanjangLatsol6 pL6;
    
    public persegiPanjang() {
        initComponents();
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
        pKel = new psgPanjangKeliling();
        gbr1 = new psgPanjangKelilingGambar();
        pLuas = new psgPanjangLuas();
        gbr2 = new psgPanjangLuasGambar();
        pDiagonal = new psgPanjangDiagonal();
        gbr3 = new psgPanjangDiagonalGambar();
        pL1 = new psgPanjangLatsol1();
        pL2 = new psgPanjangLatsol2();
        pL3 = new psgPanjangLatsol3();
        pL4 = new psgPanjangLatsol4();
        pL5 = new psgPanjangLatsol5();
        pL6 = new psgPanjangLatsol6();

        panelGambar.add(gbr1);
        panelUtama.add(pKel);
        panelGambar.add(gbr2);
        panelUtama.add(pLuas);
        panelGambar.add(gbr3);
        panelUtama.add(pDiagonal);
        panelUtama.add(pL1);
        panelUtama.add(pL2);
        panelUtama.add(pL3);
        panelUtama.add(pL4);
        panelUtama.add(pL5);
        panelUtama.add(pL6);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGambar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        panelUtama = new javax.swing.JPanel();
        Latsol1 = new javax.swing.JLabel();
        Latsol2 = new javax.swing.JLabel();
        Latsol3 = new javax.swing.JLabel();
        Latsol4 = new javax.swing.JLabel();
        Latsol5 = new javax.swing.JLabel();
        Latsol6 = new javax.swing.JLabel();
        diagonPers = new javax.swing.JLabel();
        pKeliling = new javax.swing.JLabel();
        lsPers = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1304, 816));
        setUndecorated(true);
        getContentPane().setLayout(null);

        panelGambar.setBackground(new java.awt.Color(8, 80, 116));
        panelGambar.setLayout(new java.awt.CardLayout());
        getContentPane().add(panelGambar);
        panelGambar.setBounds(300, 60, 570, 380);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/latihan soal.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(820, 60, 470, 170);

        panelUtama.setBackground(new java.awt.Color(24, 64, 105));
        panelUtama.setLayout(new java.awt.CardLayout());
        getContentPane().add(panelUtama);
        panelUtama.setBounds(300, 450, 990, 340);

        Latsol1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/latihan soal (7).png"))); // NOI18N
        Latsol1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Latsol1MouseClicked(evt);
            }
        });
        getContentPane().add(Latsol1);
        Latsol1.setBounds(880, 220, 130, 120);

        Latsol2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/latihan soal (8).png"))); // NOI18N
        Latsol2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Latsol2MouseClicked(evt);
            }
        });
        getContentPane().add(Latsol2);
        Latsol2.setBounds(1020, 220, 130, 120);

        Latsol3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/latihan soal (9).png"))); // NOI18N
        Latsol3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Latsol3MouseClicked(evt);
            }
        });
        getContentPane().add(Latsol3);
        Latsol3.setBounds(1160, 220, 130, 120);

        Latsol4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/latihan soal (10).png"))); // NOI18N
        Latsol4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Latsol4MouseClicked(evt);
            }
        });
        getContentPane().add(Latsol4);
        Latsol4.setBounds(880, 350, 130, 110);

        Latsol5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/latihan soal (11).png"))); // NOI18N
        Latsol5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Latsol5MouseClicked(evt);
            }
        });
        getContentPane().add(Latsol5);
        Latsol5.setBounds(1020, 350, 130, 110);

        Latsol6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/latihan soal (12).png"))); // NOI18N
        Latsol6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Latsol6MouseClicked(evt);
            }
        });
        getContentPane().add(Latsol6);
        Latsol6.setBounds(1160, 350, 130, 110);

        diagonPers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/PsgPanjang/diagonal persegi pjg.png"))); // NOI18N
        diagonPers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diagonPersMouseClicked(evt);
            }
        });
        getContentPane().add(diagonPers);
        diagonPers.setBounds(20, 540, 240, 250);

        pKeliling.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/PsgPanjang/kell persegi pjg.png"))); // NOI18N
        pKeliling.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pKelilingMouseClicked(evt);
            }
        });
        getContentPane().add(pKeliling);
        pKeliling.setBounds(20, 60, 240, 230);

        lsPers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/PsgPanjang/ls persegi pjg.png"))); // NOI18N
        lsPers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lsPersMouseClicked(evt);
            }
        });
        getContentPane().add(lsPers);
        lsPers.setBounds(20, 300, 240, 230);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("X");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("O");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/home icon kecil.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1171, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6)))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1310, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/abstract-blue-geometric-shapes-background-vector.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-220, 0, 1530, 850);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pKelilingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pKelilingMouseClicked
        // TODO add your handling code here:
        pKel.setVisible(true);
        gbr1.setVisible(true);
        pLuas.setVisible(false);
        gbr2.setVisible(false);
        pDiagonal.setVisible(false);
        gbr3.setVisible(false);
        pL1.setVisible(false);
        pL2.setVisible(false);
        pL3.setVisible(false);
        pL4.setVisible(false);
        pL5.setVisible(false);
        pL6.setVisible(false);
    }//GEN-LAST:event_pKelilingMouseClicked

    private void lsPersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lsPersMouseClicked
        // TODO add your handling code here:
        pKel.setVisible(false);
        gbr1.setVisible(false);
        pLuas.setVisible(true);
        gbr2.setVisible(true);
        pDiagonal.setVisible(false);
        gbr3.setVisible(false);
        pL1.setVisible(false);
        pL2.setVisible(false);
        pL3.setVisible(false);
        pL4.setVisible(false);
        pL5.setVisible(false);
        pL6.setVisible(false);
    }//GEN-LAST:event_lsPersMouseClicked

    private void diagonPersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diagonPersMouseClicked
        // TODO add your handling code here:
        pKel.setVisible(false);
        gbr1.setVisible(false);
        pLuas.setVisible(false);
        gbr2.setVisible(false);
        pDiagonal.setVisible(true);
        gbr3.setVisible(true);
        pL1.setVisible(false);
        pL2.setVisible(false);
        pL3.setVisible(false);
        pL4.setVisible(false);
        pL5.setVisible(false);
        pL6.setVisible(false);
    }//GEN-LAST:event_diagonPersMouseClicked

    private void Latsol1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Latsol1MouseClicked
        // TODO add your handling code here:
        pKel.setVisible(false);
        gbr1.setVisible(false);
        pLuas.setVisible(false);
        gbr2.setVisible(false);
        pDiagonal.setVisible(false);
        gbr3.setVisible(false);
        pL1.setVisible(true);
        pL2.setVisible(false);
        pL3.setVisible(false);
        pL4.setVisible(false);
        pL5.setVisible(false);
        pL6.setVisible(false);
    }//GEN-LAST:event_Latsol1MouseClicked

    private void Latsol2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Latsol2MouseClicked
        // TODO add your handling code here:
        pKel.setVisible(false);
        gbr1.setVisible(false);
        pLuas.setVisible(false);
        gbr2.setVisible(false);
        pDiagonal.setVisible(false);
        gbr3.setVisible(false);
        pL1.setVisible(false);
        pL2.setVisible(true);
        pL3.setVisible(false);
        pL4.setVisible(false);
        pL5.setVisible(false);
        pL6.setVisible(false);
    }//GEN-LAST:event_Latsol2MouseClicked

    private void Latsol3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Latsol3MouseClicked
        // TODO add your handling code here:
        pKel.setVisible(false);
        gbr1.setVisible(false);
        pLuas.setVisible(false);
        gbr2.setVisible(false);
        pDiagonal.setVisible(false);
        gbr3.setVisible(false);
        pL1.setVisible(false);
        pL2.setVisible(false);
        pL3.setVisible(true);
        pL4.setVisible(false);
        pL5.setVisible(false);
        pL6.setVisible(false);
    }//GEN-LAST:event_Latsol3MouseClicked

    private void Latsol4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Latsol4MouseClicked
        // TODO add your handling code here:
        pKel.setVisible(false);
        gbr1.setVisible(false);
        pLuas.setVisible(false);
        gbr2.setVisible(false);
        pDiagonal.setVisible(false);
        gbr3.setVisible(false);
        pL1.setVisible(false);
        pL2.setVisible(false);
        pL3.setVisible(false);
        pL4.setVisible(true);
        pL5.setVisible(false);
        pL6.setVisible(false);
    }//GEN-LAST:event_Latsol4MouseClicked

    private void Latsol5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Latsol5MouseClicked
        // TODO add your handling code here:
        pKel.setVisible(false);
        gbr1.setVisible(false);
        pLuas.setVisible(false);
        gbr2.setVisible(false);
        pDiagonal.setVisible(false);
        gbr3.setVisible(false);
        pL1.setVisible(false);
        pL2.setVisible(false);
        pL3.setVisible(false);
        pL4.setVisible(false);
        pL5.setVisible(true);
        pL6.setVisible(false);
    }//GEN-LAST:event_Latsol5MouseClicked

    private void Latsol6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Latsol6MouseClicked
        // TODO add your handling code here:
        pKel.setVisible(false);
        gbr1.setVisible(false);
        pLuas.setVisible(false);
        gbr2.setVisible(false);
        pDiagonal.setVisible(false);
        gbr3.setVisible(false);
        pL1.setVisible(false);
        pL2.setVisible(false);
        pL3.setVisible(false);
        pL4.setVisible(false);
        pL5.setVisible(false);
        pL6.setVisible(true);
    }//GEN-LAST:event_Latsol6MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        int pilih = JOptionPane.showConfirmDialog(null, "Selesai Belajar?", "AMOBA", JOptionPane.YES_NO_OPTION);

        if(pilih == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        bangunDatarClass Datar = new bangunDatarClass();
        new bangunDatarClass().setVisible(true);
        Datar.pack();
        Datar.setLocationRelativeTo(null);
        Datar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        TampilanUtama utama = new TampilanUtama();
        new TampilanUtama().setVisible(true);
        utama.pack();
        utama.setLocationRelativeTo(null);
        utama.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

    }//GEN-LAST:event_jPanel1MouseClicked

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
            java.util.logging.Logger.getLogger(persegiPanjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(persegiPanjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(persegiPanjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(persegiPanjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new persegiPanjang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Latsol1;
    private javax.swing.JLabel Latsol2;
    private javax.swing.JLabel Latsol3;
    private javax.swing.JLabel Latsol4;
    private javax.swing.JLabel Latsol5;
    private javax.swing.JLabel Latsol6;
    private javax.swing.JLabel diagonPers;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lsPers;
    private javax.swing.JLabel pKeliling;
    private javax.swing.JPanel panelGambar;
    private javax.swing.JPanel panelUtama;
    // End of variables declaration//GEN-END:variables
}
