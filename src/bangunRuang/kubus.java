package bangunRuang;

public class kubus extends javax.swing.JFrame {
    kubusLuasPermukaan pB1;
    kubusLuasPermukaanGambar pA1;
    kubusVolume pB2;
    kubusVolumeGambar pA2;
    kubusDiagonal pB3;
    kubusDiagonalGambar pA3;
    kubusLatihanSoal1 pBL1;
    kubusLatihanSoal2 pBL2;
    kubusLatihanSoal3 pBL3;
    kubusLatihanSoal4 pBL4;
    kubusLatihanSoal5 pBL5;
    kubusLatihanSoal6 pBL6;
    kubusDeskripsi pB0;
    kubusGambar pA0;
  
    public kubus() {
        initComponents();
        pB1 = new kubusLuasPermukaan();
        pA1 = new kubusLuasPermukaanGambar();
        pB2 = new kubusVolume();
        pA2 = new kubusVolumeGambar();
        pB3 = new kubusDiagonal();
        pA3 = new kubusDiagonalGambar();
        pBL1 = new kubusLatihanSoal1();
        pBL2 = new kubusLatihanSoal2();
        pBL3 = new kubusLatihanSoal3();
        pBL4 = new kubusLatihanSoal4();
        pBL5 = new kubusLatihanSoal5();
        pBL6 = new kubusLatihanSoal6();
        pB0 = new kubusDeskripsi();
        pA0 = new kubusGambar();
        
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
        
        panelGambar.add(pA0);
        panelGambar.add(pA1);
        panelGambar.add(pA2);
        panelGambar.add(pA3);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUtama = new javax.swing.JPanel();
        ButtonLatSoal5 = new javax.swing.JLabel();
        ButtonLatSoal4 = new javax.swing.JLabel();
        ButtonLatSoal6 = new javax.swing.JLabel();
        panelGambar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ButtonLatSoal3 = new javax.swing.JLabel();
        ButtonLatSoal2 = new javax.swing.JLabel();
        ButtonLatSoal1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panelUtama.setBackground(new java.awt.Color(24, 64, 105));
        panelUtama.setLayout(new java.awt.CardLayout());
        getContentPane().add(panelUtama);
        panelUtama.setBounds(300, 450, 990, 340);

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

        ButtonLatSoal6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/soal/latihan soal (12).png"))); // NOI18N
        ButtonLatSoal6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonLatSoal6MouseClicked(evt);
            }
        });
        getContentPane().add(ButtonLatSoal6);
        ButtonLatSoal6.setBounds(1160, 350, 130, 110);

        panelGambar.setBackground(new java.awt.Color(8, 80, 116));
        panelGambar.setLayout(new java.awt.CardLayout());
        getContentPane().add(panelGambar);
        panelGambar.setBounds(300, 60, 570, 380);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/soal/latihan soal.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(820, 60, 470, 170);

        ButtonLatSoal3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/soal/latihan soal (9).png"))); // NOI18N
        ButtonLatSoal3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonLatSoal3MouseClicked(evt);
            }
        });
        getContentPane().add(ButtonLatSoal3);
        ButtonLatSoal3.setBounds(1160, 220, 130, 120);

        ButtonLatSoal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/soal/latihan soal (8).png"))); // NOI18N
        ButtonLatSoal2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonLatSoal2MouseClicked(evt);
            }
        });
        getContentPane().add(ButtonLatSoal2);
        ButtonLatSoal2.setBounds(1020, 220, 130, 120);

        ButtonLatSoal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/soal/latihan soal (7).png"))); // NOI18N
        ButtonLatSoal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonLatSoal1MouseClicked(evt);
            }
        });
        getContentPane().add(ButtonLatSoal1);
        ButtonLatSoal1.setBounds(880, 220, 130, 120);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setText("X");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(1261, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1310, 50);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Kubus/Luas Permukaan (3) icon.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 60, 240, 240);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Kubus/volicon.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 310, 240, 240);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Kubus/dia icon.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 560, 240, 230);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/bgkecil.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1310, 820);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
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
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        pB0.setVisible(false);
        pB1.setVisible(false);
        pB2.setVisible(true);
        pB3.setVisible(false);
        pBL1.setVisible(false);
        pBL2.setVisible(false);
        pBL3.setVisible(false);
        pBL4.setVisible(false);
        pBL5.setVisible(false);
        pBL6.setVisible(false);

        pA0.setVisible(false);
        pA1.setVisible(false);
        pA2.setVisible(true);
        pA3.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        pB0.setVisible(false);
        pB1.setVisible(false);
        pB2.setVisible(false);
        pB3.setVisible(true);
        pBL1.setVisible(false);
        pBL2.setVisible(false);
        pBL3.setVisible(false);
        pBL4.setVisible(false);
        pBL5.setVisible(false);
        pBL6.setVisible(false);

        pA0.setVisible(false);
        pA1.setVisible(false);
        pA2.setVisible(false);
        pA3.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(kubus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kubus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kubus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kubus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kubus().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelGambar;
    private javax.swing.JPanel panelUtama;
    // End of variables declaration//GEN-END:variables
}
