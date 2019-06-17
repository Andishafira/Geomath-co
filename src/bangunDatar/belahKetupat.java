package bangunDatar;

import javax.swing.JOptionPane;

public class belahKetupat extends javax.swing.JFrame {
    belahKetupatKeliling pB1;
    belahKetupatKelilingGambar pA1;
    belahKetupatLuas pB2;
    belahKetupatLuasGambar pA2;
    belahKetupatDiagonal pB3;
    belahKetupatDiagonalGambar pA3;
    belahKetupatLatihanSoal1 pBL1;
    belahKetupatLatihanSoal2 pBL2;
    belahKetupatLatihanSoal3 pBL3;
    belahKetupatLatihanSoal4 pBL4;
    belahKetupatLatihanSoal5 pBL5;
    belahKetupatLatihanSoal6 pBL6;
    belahKetupatDeskripsi pB0;
    belahKetupatGambar pA0;
    
    public belahKetupat() {
        initComponents();
        pB0 = new belahKetupatDeskripsi();
        pA0 = new belahKetupatGambar();
        pB1 = new belahKetupatKeliling();
        pA1 = new belahKetupatKelilingGambar();
        pB2 = new belahKetupatLuas();
        pA2 = new belahKetupatLuasGambar();
        pB3 = new belahKetupatDiagonal();
        pA3 = new belahKetupatDiagonalGambar();
        pBL1 = new belahKetupatLatihanSoal1();
        pBL2 = new belahKetupatLatihanSoal2();
        pBL3 = new belahKetupatLatihanSoal3();
        pBL4 = new belahKetupatLatihanSoal4();
        pBL5 = new belahKetupatLatihanSoal5();
        pBL6 = new belahKetupatLatihanSoal6();
        
        panelUtama.add(pB0);
        panelUtama.add(pB1);
        panelUtama.add(pB2);
        panelUtama.add(pB3);
        panelUtama.add(pBL1);
        panelUtama.add(pBL2);
        panelUtama.add(pBL3);
        panelUtama.add(pBL4);
        panelUtama.add(pBL5);
        panelUtama.add(pBL6);
        
        panelGambar.add(pA1);
        panelUtama.add(pA0);
        panelGambar.add(pA2);
        panelGambar.add(pA3);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tombolKeluar = new javax.swing.JLabel();
        panelGambar = new javax.swing.JPanel();
        panelUtama = new javax.swing.JPanel();
        buttonKeliling = new javax.swing.JLabel();
        buttonLuas = new javax.swing.JLabel();
        buttonDiagonal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ButtonLatSoal1 = new javax.swing.JLabel();
        ButtonLatSoal2 = new javax.swing.JLabel();
        ButtonLatSoal3 = new javax.swing.JLabel();
        ButtonLatSoal6 = new javax.swing.JLabel();
        ButtonLatSoal5 = new javax.swing.JLabel();
        ButtonLatSoal4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        tombolKeluar.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        tombolKeluar.setForeground(new java.awt.Color(255, 255, 255));
        tombolKeluar.setText("X");
        tombolKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolKeluarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(1261, Short.MAX_VALUE)
                .addComponent(tombolKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tombolKeluar)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1310, 50);

        panelGambar.setBackground(new java.awt.Color(8, 80, 116));
        panelGambar.setLayout(new java.awt.CardLayout());
        getContentPane().add(panelGambar);
        panelGambar.setBounds(300, 60, 570, 380);

        panelUtama.setBackground(new java.awt.Color(24, 64, 105));
        panelUtama.setLayout(new java.awt.CardLayout());
        getContentPane().add(panelUtama);
        panelUtama.setBounds(300, 450, 990, 340);

        buttonKeliling.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Great Ideas Co. (3).png"))); // NOI18N
        buttonKeliling.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonKelilingMouseClicked(evt);
            }
        });
        getContentPane().add(buttonKeliling);
        buttonKeliling.setBounds(10, 60, 240, 240);

        buttonLuas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Great Ideas Co. (2).png"))); // NOI18N
        buttonLuas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLuasMouseClicked(evt);
            }
        });
        getContentPane().add(buttonLuas);
        buttonLuas.setBounds(10, 310, 240, 240);

        buttonDiagonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/diagonal (1).png"))); // NOI18N
        buttonDiagonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDiagonalMouseClicked(evt);
            }
        });
        getContentPane().add(buttonDiagonal);
        buttonDiagonal.setBounds(10, 560, 240, 230);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/soal/latihan soal.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(820, 60, 470, 170);

        ButtonLatSoal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/soal/latihan soal (7).png"))); // NOI18N
        ButtonLatSoal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonLatSoal1MouseClicked(evt);
            }
        });
        getContentPane().add(ButtonLatSoal1);
        ButtonLatSoal1.setBounds(880, 220, 130, 120);

        ButtonLatSoal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/soal/latihan soal (8).png"))); // NOI18N
        ButtonLatSoal2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonLatSoal2MouseClicked(evt);
            }
        });
        getContentPane().add(ButtonLatSoal2);
        ButtonLatSoal2.setBounds(1020, 220, 130, 120);

        ButtonLatSoal3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/soal/latihan soal (9).png"))); // NOI18N
        ButtonLatSoal3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonLatSoal3MouseClicked(evt);
            }
        });
        getContentPane().add(ButtonLatSoal3);
        ButtonLatSoal3.setBounds(1160, 220, 130, 120);

        ButtonLatSoal6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/soal/latihan soal (12).png"))); // NOI18N
        ButtonLatSoal6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonLatSoal6MouseClicked(evt);
            }
        });
        getContentPane().add(ButtonLatSoal6);
        ButtonLatSoal6.setBounds(1160, 350, 130, 110);

        ButtonLatSoal5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/soal/latihan soal (11).png"))); // NOI18N
        ButtonLatSoal5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonLatSoal5MouseClicked(evt);
            }
        });
        getContentPane().add(ButtonLatSoal5);
        ButtonLatSoal5.setBounds(1020, 350, 130, 110);

        ButtonLatSoal4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/soal/latihan soal (10).png"))); // NOI18N
        ButtonLatSoal4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonLatSoal4MouseClicked(evt);
            }
        });
        getContentPane().add(ButtonLatSoal4);
        ButtonLatSoal4.setBounds(880, 350, 130, 110);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/bgkecil.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 1530, 850);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonKelilingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonKelilingMouseClicked
        pB0.setVisible(false);
        pB1.setVisible(true);
        pB2.setVisible(false);
        pB3.setVisible(false);
        pBL1.setVisible(false);
        pBL2.setVisible(false);
        pBL3.setVisible(false);
        pBL4.setVisible(false);
        pBL5.setVisible(false);
        pBL6.setVisible(false);
        
        pA0.setVisible(false);
        pA1.setVisible(true);
        pA2.setVisible(false);
        pA3.setVisible(false);
    }//GEN-LAST:event_buttonKelilingMouseClicked

    private void buttonLuasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLuasMouseClicked
        pB1.setVisible(false);
        pB2.setVisible(true);
        pB3.setVisible(false);
        pBL1.setVisible(false);
        pBL2.setVisible(false);
        pBL3.setVisible(false);
        pBL4.setVisible(false);
        pBL5.setVisible(false);
        pBL6.setVisible(false);
        
        pA1.setVisible(false);
        pA2.setVisible(true);
        pA3.setVisible(false);
    }//GEN-LAST:event_buttonLuasMouseClicked

    private void buttonDiagonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDiagonalMouseClicked
        pB1.setVisible(false);
        pB2.setVisible(false);
        pB3.setVisible(true);
        pBL1.setVisible(false);
        pBL2.setVisible(false);
        pBL3.setVisible(false);
        pBL4.setVisible(false);
        pBL5.setVisible(false);
        pBL6.setVisible(false);
        
        pA1.setVisible(false);
        pA2.setVisible(false);
        pA3.setVisible(true);
    }//GEN-LAST:event_buttonDiagonalMouseClicked

    private void tombolKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolKeluarMouseClicked
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(null, "Selesai Belajar?", "AMOBA", JOptionPane.YES_NO_OPTION);
        
        if(option == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_tombolKeluarMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void ButtonLatSoal1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLatSoal1MouseClicked
        pB0.setVisible(false);
        pB1.setVisible(false);
        pB2.setVisible(false);
        pB3.setVisible(false);
        pBL1.setVisible(true);
        pBL2.setVisible(false);
        pBL3.setVisible(false);
        pBL4.setVisible(false);
        pBL5.setVisible(false);
        pBL6.setVisible(false);

        pA0.setVisible(false);
        pA1.setVisible(false);
        pA2.setVisible(false);
        pA3.setVisible(false);
    }//GEN-LAST:event_ButtonLatSoal1MouseClicked

    private void ButtonLatSoal2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLatSoal2MouseClicked
        pB0.setVisible(false);
        pB1.setVisible(false);
        pB2.setVisible(false);
        pB3.setVisible(false);
        pBL1.setVisible(false);
        pBL2.setVisible(true);
        pBL3.setVisible(false);
        pBL4.setVisible(false);
        pBL5.setVisible(false);
        pBL6.setVisible(false);

        pA0.setVisible(false);
        pA1.setVisible(false);
        pA2.setVisible(false);
        pA3.setVisible(false);
    }//GEN-LAST:event_ButtonLatSoal2MouseClicked

    private void ButtonLatSoal3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLatSoal3MouseClicked
        pB0.setVisible(false);
        pB1.setVisible(false);
        pB2.setVisible(false);
        pB3.setVisible(false);
        pBL1.setVisible(false);
        pBL2.setVisible(false);
        pBL3.setVisible(true);
        pBL4.setVisible(false);
        pBL5.setVisible(false);
        pBL6.setVisible(false);

        pA0.setVisible(false);
        pA1.setVisible(false);
        pA2.setVisible(false);
        pA3.setVisible(false);
    }//GEN-LAST:event_ButtonLatSoal3MouseClicked

    private void ButtonLatSoal6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLatSoal6MouseClicked
        pB0.setVisible(false);
        pB1.setVisible(false);
        pB2.setVisible(false);
        pB3.setVisible(false);
        pBL1.setVisible(false);
        pBL2.setVisible(false);
        pBL3.setVisible(false);
        pBL4.setVisible(false);
        pBL5.setVisible(false);
        pBL6.setVisible(true);

        pA0.setVisible(false);
        pA1.setVisible(false);
        pA2.setVisible(false);
        pA3.setVisible(false);
    }//GEN-LAST:event_ButtonLatSoal6MouseClicked

    private void ButtonLatSoal5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLatSoal5MouseClicked
        pB0.setVisible(false);
        pB1.setVisible(false);
        pB2.setVisible(false);
        pB3.setVisible(false);
        pBL1.setVisible(false);
        pBL2.setVisible(false);
        pBL3.setVisible(false);
        pBL4.setVisible(false);
        pBL5.setVisible(true);
        pBL6.setVisible(false);

        pA0.setVisible(false);
        pA1.setVisible(false);
        pA2.setVisible(false);
        pA3.setVisible(false);
    }//GEN-LAST:event_ButtonLatSoal5MouseClicked

    private void ButtonLatSoal4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLatSoal4MouseClicked
        pB0.setVisible(false);
        pB1.setVisible(false);
        pB2.setVisible(false);
        pB3.setVisible(false);
        pBL1.setVisible(false);
        pBL2.setVisible(false);
        pBL3.setVisible(false);
        pBL4.setVisible(true);
        pBL5.setVisible(false);
        pBL6.setVisible(false);

        pA0.setVisible(false);
        pA1.setVisible(false);
        pA2.setVisible(false);
        pA3.setVisible(false);
    }//GEN-LAST:event_ButtonLatSoal4MouseClicked

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
            java.util.logging.Logger.getLogger(belahKetupat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(belahKetupat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(belahKetupat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(belahKetupat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new belahKetupat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ButtonLatSoal1;
    private javax.swing.JLabel ButtonLatSoal2;
    private javax.swing.JLabel ButtonLatSoal3;
    private javax.swing.JLabel ButtonLatSoal4;
    private javax.swing.JLabel ButtonLatSoal5;
    private javax.swing.JLabel ButtonLatSoal6;
    private javax.swing.JLabel buttonDiagonal;
    private javax.swing.JLabel buttonKeliling;
    private javax.swing.JLabel buttonLuas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelGambar;
    private javax.swing.JPanel panelUtama;
    private javax.swing.JLabel tombolKeluar;
    // End of variables declaration//GEN-END:variables
}
