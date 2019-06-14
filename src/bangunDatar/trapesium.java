package bangunDatar;

import javax.swing.JOptionPane;

public class trapesium extends javax.swing.JFrame {
    trapesiumKeliling traKel;
    trapesiumKelilingGambar traKelGa;
    trapesiumLuas traLu;
    trapesiumLuasGambar traLuGa;
    trapesiumDiagonal traDi;
    trapesiumDiagonalGambar traDiGa;
    trapesiumLatihanSoal1 traLat1;
    trapesiumLatihanSoal2 traLat2;
    trapesiumLatihanSoal3 traLat3;
    trapesiumLatihanSoal4 traLat4;
    trapesiumLatihanSoal5 traLat5;
    trapesiumLatihanSoal6 traLat6;
    
   
    public trapesium() {
        initComponents();
        traKel = new trapesiumKeliling();
        traLu = new trapesiumLuas();
        traDi = new trapesiumDiagonal();
        traKelGa = new trapesiumKelilingGambar();
        traLuGa = new trapesiumLuasGambar();
        traDiGa = new trapesiumDiagonalGambar();
        traLat1 = new trapesiumLatihanSoal1();
        traLat2 = new trapesiumLatihanSoal2();
        traLat3 = new trapesiumLatihanSoal3();
        traLat4 = new trapesiumLatihanSoal4();
        traLat5 = new trapesiumLatihanSoal5();
        traLat6 = new trapesiumLatihanSoal6();
        
        panelUtama.add(traKel);
        panelUtama.add(traLu);
        panelUtama.add(traDi);
        panelGambar.add(traKelGa);
        panelGambar.add(traLuGa);
        panelGambar.add(traDiGa);
        panelUtama.add(traLat1);
        panelUtama.add(traLat2);
        panelUtama.add(traLat3);
        panelUtama.add(traLat4);
        panelUtama.add(traLat5);
        panelUtama.add(traLat6);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tombolKeluar = new javax.swing.JLabel();
        panelGambar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        panelUtama = new javax.swing.JPanel();
        buttonLatSoal1 = new javax.swing.JLabel();
        buttonLatSoal2 = new javax.swing.JLabel();
        buttonLatSoal3 = new javax.swing.JLabel();
        buttonLatSoal4 = new javax.swing.JLabel();
        buttonLatSoal5 = new javax.swing.JLabel();
        buttonLatSoal6 = new javax.swing.JLabel();
        buttonKeliling = new javax.swing.JLabel();
        buttonLuas = new javax.swing.JLabel();
        buttonDiagonal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        tombolKeluar.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
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

        javax.swing.GroupLayout panelGambarLayout = new javax.swing.GroupLayout(panelGambar);
        panelGambar.setLayout(panelGambarLayout);
        panelGambarLayout.setHorizontalGroup(
            panelGambarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        panelGambarLayout.setVerticalGroup(
            panelGambarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        getContentPane().add(panelGambar);
        panelGambar.setBounds(300, 60, 570, 380);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/latihan soal.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(820, 60, 470, 170);

        panelUtama.setBackground(new java.awt.Color(24, 64, 105));

        javax.swing.GroupLayout panelUtamaLayout = new javax.swing.GroupLayout(panelUtama);
        panelUtama.setLayout(panelUtamaLayout);
        panelUtamaLayout.setHorizontalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        panelUtamaLayout.setVerticalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        getContentPane().add(panelUtama);
        panelUtama.setBounds(300, 450, 990, 340);

        buttonLatSoal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/latihan soal (7).png"))); // NOI18N
        buttonLatSoal1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLatSoal1MouseClicked(evt);
            }
        });
        getContentPane().add(buttonLatSoal1);
        buttonLatSoal1.setBounds(880, 220, 130, 120);

        buttonLatSoal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/latihan soal (8).png"))); // NOI18N
        buttonLatSoal2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLatSoal2MouseClicked(evt);
            }
        });
        getContentPane().add(buttonLatSoal2);
        buttonLatSoal2.setBounds(1020, 220, 130, 120);

        buttonLatSoal3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/latihan soal (9).png"))); // NOI18N
        buttonLatSoal3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLatSoal3MouseClicked(evt);
            }
        });
        getContentPane().add(buttonLatSoal3);
        buttonLatSoal3.setBounds(1160, 220, 130, 120);

        buttonLatSoal4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/latihan soal (10).png"))); // NOI18N
        buttonLatSoal4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLatSoal4MouseClicked(evt);
            }
        });
        getContentPane().add(buttonLatSoal4);
        buttonLatSoal4.setBounds(880, 350, 130, 110);

        buttonLatSoal5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/latihan soal (11).png"))); // NOI18N
        buttonLatSoal5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLatSoal5MouseClicked(evt);
            }
        });
        getContentPane().add(buttonLatSoal5);
        buttonLatSoal5.setBounds(1020, 350, 130, 110);

        buttonLatSoal6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/latihan soal (12).png"))); // NOI18N
        buttonLatSoal6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLatSoal6MouseClicked(evt);
            }
        });
        getContentPane().add(buttonLatSoal6);
        buttonLatSoal6.setBounds(1160, 350, 130, 110);

        buttonKeliling.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambarTrapesium/Keliling Trapesium.png"))); // NOI18N
        buttonKeliling.setText("jLabel5");
        buttonKeliling.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonKelilingMouseClicked(evt);
            }
        });
        getContentPane().add(buttonKeliling);
        buttonKeliling.setBounds(20, 60, 240, 240);

        buttonLuas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambarTrapesium/Luas Trapesium.png"))); // NOI18N
        buttonLuas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLuasMouseClicked(evt);
            }
        });
        getContentPane().add(buttonLuas);
        buttonLuas.setBounds(20, 310, 240, 240);

        buttonDiagonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambarTrapesium/Diagonal Trapesium.png"))); // NOI18N
        buttonDiagonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDiagonalMouseClicked(evt);
            }
        });
        getContentPane().add(buttonDiagonal);
        buttonDiagonal.setBounds(20, 560, 240, 240);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/abstract-blue-geometric-shapes-background-vector.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-220, 0, 1680, 810);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonKelilingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonKelilingMouseClicked
     traKel.setVisible(true);
     traLu.setVisible(false);
     traDi.setVisible(false);
     traLat1.setVisible(false);
     traLat2.setVisible(false);
     traLat3.setVisible(false);
     traLat4.setVisible(false);
     traLat5.setVisible(false);
     traLat6.setVisible(false);
     
     traKelGa.setVisible(true);
     traLuGa.setVisible(false);
     traDiGa.setVisible(false);
    }//GEN-LAST:event_buttonKelilingMouseClicked

    private void buttonLuasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLuasMouseClicked
     traKel.setVisible(false);
     traLu.setVisible(true);
     traDi.setVisible(false);
     traLat1.setVisible(false);
     traLat2.setVisible(false);
     traLat3.setVisible(false);
     traLat4.setVisible(false);
     traLat5.setVisible(false);
     traLat6.setVisible(false);
     
     traKelGa.setVisible(false);
     traLuGa.setVisible(true);
     traDiGa.setVisible(false);
    }//GEN-LAST:event_buttonLuasMouseClicked

    private void buttonDiagonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDiagonalMouseClicked
    traKel.setVisible(false);
     traLu.setVisible(false);
     traDi.setVisible(true);
     traLat1.setVisible(false);
     traLat2.setVisible(false);
     traLat3.setVisible(false);
     traLat4.setVisible(false);
     traLat5.setVisible(false);
     traLat6.setVisible(false);
     
     traKelGa.setVisible(false);
     traLuGa.setVisible(false);
     traDiGa.setVisible(true);
    }//GEN-LAST:event_buttonDiagonalMouseClicked

    private void buttonLatSoal1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLatSoal1MouseClicked
       traKel.setVisible(false);
       traKelGa.setVisible(true);
       traLu.setVisible(false);
       traLuGa.setVisible(false);
       traDi.setVisible(false);
       traDiGa.setVisible(false);
       traLat1.setVisible(true);
       traLat2.setVisible(false);
       traLat3.setVisible(false);
       traLat4.setVisible(false);
       traLat5.setVisible(false);
       traLat6.setVisible(false);
    }//GEN-LAST:event_buttonLatSoal1MouseClicked

    private void buttonLatSoal2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLatSoal2MouseClicked
       traKel.setVisible(false);
       traKelGa.setVisible(true);
       traLu.setVisible(false);
       traLuGa.setVisible(false);
       traDi.setVisible(false);
       traDiGa.setVisible(false);
       traLat1.setVisible(false);
       traLat2.setVisible(true);
       traLat3.setVisible(false);
       traLat4.setVisible(false);
       traLat5.setVisible(false);
       traLat6.setVisible(false);
    }//GEN-LAST:event_buttonLatSoal2MouseClicked

    private void buttonLatSoal3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLatSoal3MouseClicked
       traKel.setVisible(false);
       traKelGa.setVisible(false);
       traLu.setVisible(false);
       traLuGa.setVisible(true);
       traDi.setVisible(false);
       traDiGa.setVisible(false);
       traLat1.setVisible(false);
       traLat2.setVisible(false);
       traLat3.setVisible(true);
       traLat4.setVisible(false);
       traLat5.setVisible(false);
       traLat6.setVisible(false);
    }//GEN-LAST:event_buttonLatSoal3MouseClicked

    private void buttonLatSoal4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLatSoal4MouseClicked
        traKel.setVisible(false);
       traKelGa.setVisible(false);
       traLu.setVisible(false);
       traLuGa.setVisible(true);
       traDi.setVisible(false);
       traDiGa.setVisible(false);
       traLat1.setVisible(false);
       traLat2.setVisible(false);
       traLat3.setVisible(false);
       traLat4.setVisible(true);
       traLat5.setVisible(false);
       traLat6.setVisible(false);
    }//GEN-LAST:event_buttonLatSoal4MouseClicked

    private void buttonLatSoal5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLatSoal5MouseClicked
       traKel.setVisible(false);
       traKelGa.setVisible(false);
       traLu.setVisible(false);
       traLuGa.setVisible(false);
       traDi.setVisible(false);
       traDiGa.setVisible(true);
       traLat1.setVisible(false);
       traLat2.setVisible(false);
       traLat3.setVisible(false);
       traLat4.setVisible(false);
       traLat5.setVisible(true);
       traLat6.setVisible(false);
    }//GEN-LAST:event_buttonLatSoal5MouseClicked

    private void buttonLatSoal6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLatSoal6MouseClicked
       traKel.setVisible(false);
       traKelGa.setVisible(false);
       traLu.setVisible(false);
       traLuGa.setVisible(false);
       traDi.setVisible(false);
       traDiGa.setVisible(true);
       traLat1.setVisible(false);
       traLat2.setVisible(false);
       traLat3.setVisible(false);
       traLat4.setVisible(false);
       traLat5.setVisible(false);
       traLat6.setVisible(true);
    }//GEN-LAST:event_buttonLatSoal6MouseClicked

    private void tombolKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolKeluarMouseClicked
        int option = JOptionPane.showConfirmDialog(null, "Selesai Belajar?", "AMOBA", JOptionPane.YES_NO_OPTION);
        
        if(option == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_tombolKeluarMouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new trapesium().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buttonDiagonal;
    private javax.swing.JLabel buttonKeliling;
    private javax.swing.JLabel buttonLatSoal1;
    private javax.swing.JLabel buttonLatSoal2;
    private javax.swing.JLabel buttonLatSoal3;
    private javax.swing.JLabel buttonLatSoal4;
    private javax.swing.JLabel buttonLatSoal5;
    private javax.swing.JLabel buttonLatSoal6;
    private javax.swing.JLabel buttonLuas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelGambar;
    private javax.swing.JPanel panelUtama;
    private javax.swing.JLabel tombolKeluar;
    // End of variables declaration//GEN-END:variables
}
