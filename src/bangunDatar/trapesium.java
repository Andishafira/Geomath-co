package bangunDatar;//lili

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ui.app.pbo.TampilanUtama;
import ui.app.pbo.bangunDatarClass;
import ui.app.pbo.bangunRuangClass;

public class trapesium extends javax.swing.JFrame {
    trapesiumKeliling tKel;
    trapesiumKelilingGambar tKelGa;
    trapesiumLuas tLuas;
    trapesiumLuasGambar tLuasGa;
    trapesiumDiagonal tDi;
    trapesiumDiagonalGambar tDiGa;
    trapesiumLatsol1 tLS1;
    trapesiumLatsol2 tLS2;
    trapesiumLatsol3 tLS3;
    trapesiumLatsol4 tLS4;
    trapesiumLatsol5 tLS5;
    trapesiumLatsol6 tLS6;
    trapesiumDeskripsi pB0;
    trapesiumDeskripsiGambar pA0;
    
    
    public trapesium() {
        initComponents();
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
        tKel = new trapesiumKeliling();
        tKelGa = new trapesiumKelilingGambar();
        tLuas = new trapesiumLuas();
        tLuasGa = new trapesiumLuasGambar();
        tDi = new trapesiumDiagonal();
        tDiGa = new trapesiumDiagonalGambar();
        tLS1 = new trapesiumLatsol1();
        tLS2 = new trapesiumLatsol2();
        tLS3 = new trapesiumLatsol3();
        tLS4 = new trapesiumLatsol4();
        tLS5 = new trapesiumLatsol5();
        tLS6 = new trapesiumLatsol6();
        pB0 = new trapesiumDeskripsi();
        pA0 = new trapesiumDeskripsiGambar();
        
        panelUtama.add(pB0);
        panelUtama.add(tKel);
        panelUtama.add(tLuas);
        panelUtama.add(tDi);
        panelUtama.add(tLS1);
        panelUtama.add(tLS2);
        panelUtama.add(tLS3);
        panelUtama.add(tLS4);
        panelUtama.add(tLS5);
        panelUtama.add(tLS6);
        
        panelGambar.add(pA0);
        panelGambar.add(tKelGa);
        panelGambar.add(tLuasGa);
        panelGambar.add(tDiGa);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
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

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
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
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6)))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1310, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/abstract-blue-geometric-shapes-background-vector.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-220, 0, 1680, 810);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLatSoal1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLatSoal1MouseClicked
        pB0.setVisible(false);
        tKel.setVisible(false);
        tKelGa.setVisible(true);
        tLuas.setVisible(false);
        tLuasGa.setVisible(false);
        tDi.setVisible(false);
        tDiGa.setVisible(false);
        
        pA0.setVisible(false);
        tLS1.setVisible(true);
        tLS2.setVisible(false);
        tLS3.setVisible(false);
        tLS4.setVisible(false);
        tLS5.setVisible(false);
        tLS6.setVisible(false);
    }//GEN-LAST:event_buttonLatSoal1MouseClicked

    private void buttonLatSoal2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLatSoal2MouseClicked
        pB0.setVisible(false);
        tKel.setVisible(false);
        tKelGa.setVisible(true);
        tLuas.setVisible(false);
        tLuasGa.setVisible(false);
        tDi.setVisible(false);
        tDiGa.setVisible(false);
        
        pA0.setVisible(false);
        tLS1.setVisible(false);
        tLS2.setVisible(true);
        tLS3.setVisible(false);
        tLS4.setVisible(false);
        tLS5.setVisible(false);
        tLS6.setVisible(false);
    }//GEN-LAST:event_buttonLatSoal2MouseClicked

    private void buttonLatSoal3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLatSoal3MouseClicked
        pB0.setVisible(false);
        tKel.setVisible(false);
        tKelGa.setVisible(false);
        tLuas.setVisible(false);
        tLuasGa.setVisible(true);
        tDi.setVisible(false);
        tDiGa.setVisible(false);
        
        pA0.setVisible(false);
        tLS1.setVisible(false);
        tLS2.setVisible(false);
        tLS3.setVisible(true);
        tLS4.setVisible(false);
        tLS5.setVisible(false);
        tLS6.setVisible(false);
    }//GEN-LAST:event_buttonLatSoal3MouseClicked

    private void buttonLatSoal4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLatSoal4MouseClicked
        pB0.setVisible(false);
        tKel.setVisible(false);
        tKelGa.setVisible(true);
        tLuas.setVisible(false);
        tLuasGa.setVisible(false);
        tDi.setVisible(false);
        tDiGa.setVisible(false);
        
        pA0.setVisible(false);
        tLS1.setVisible(false);
        tLS2.setVisible(false);
        tLS3.setVisible(false);
        tLS4.setVisible(true);
        tLS5.setVisible(false);
        tLS6.setVisible(false);
    }//GEN-LAST:event_buttonLatSoal4MouseClicked

    private void buttonLatSoal5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLatSoal5MouseClicked
        pB0.setVisible(false);
        tKel.setVisible(false);
        tKelGa.setVisible(true);
        tLuas.setVisible(false);
        tLuasGa.setVisible(false);
        tDi.setVisible(false);
        tDiGa.setVisible(false);
        
        pA0.setVisible(false);
        tLS1.setVisible(false);
        tLS2.setVisible(false);
        tLS3.setVisible(false);
        tLS4.setVisible(false);
        tLS5.setVisible(true);
        tLS6.setVisible(false);
    }//GEN-LAST:event_buttonLatSoal5MouseClicked

    private void buttonLatSoal6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLatSoal6MouseClicked
        pB0.setVisible(false);
        tKel.setVisible(false);
        tKelGa.setVisible(false);
        tLuas.setVisible(false);
        tLuasGa.setVisible(true);
        tDi.setVisible(false);
        tDiGa.setVisible(false);
        
        pA0.setVisible(false);
        tLS1.setVisible(false);
        tLS2.setVisible(false);
        tLS3.setVisible(false);
        tLS4.setVisible(false);
        tLS5.setVisible(false);
        tLS6.setVisible(true);
    }//GEN-LAST:event_buttonLatSoal6MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        int pilih = JOptionPane.showConfirmDialog(null, "Selesai Belajar?", "AMOBA", JOptionPane.YES_NO_OPTION);

        if(pilih == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

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

    private void buttonKelilingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonKelilingMouseClicked
        pB0.setVisible(false);
        pA0.setVisible(false);
        tKel.setVisible(true);
        
        tKelGa.setVisible(true);
        tLuas.setVisible(false);
        tLuasGa.setVisible(false);
        tDi.setVisible(false);
        tDiGa.setVisible(false);
        
        
        tLS1.setVisible(false);
        tLS2.setVisible(false);
        tLS3.setVisible(false);
        tLS4.setVisible(false);
        tLS5.setVisible(false);
        tLS6.setVisible(false);
    }//GEN-LAST:event_buttonKelilingMouseClicked

    private void buttonLuasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLuasMouseClicked
        pB0.setVisible(false);
        tKel.setVisible(false);
        tKelGa.setVisible(false);
        tLuas.setVisible(true);
        tLuasGa.setVisible(true);
        tDi.setVisible(false);
        tDiGa.setVisible(false);
        
        pA0.setVisible(false);
        tLS1.setVisible(false);
        tLS2.setVisible(false);
        tLS3.setVisible(false);
        tLS4.setVisible(false);
        tLS5.setVisible(false);
        tLS6.setVisible(false);
    }//GEN-LAST:event_buttonLuasMouseClicked

    private void buttonDiagonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDiagonalMouseClicked
        pB0.setVisible(false);
        tKel.setVisible(false);
        tKelGa.setVisible(false);
        tLuas.setVisible(false);
        tLuasGa.setVisible(false);
        tDi.setVisible(true);
        tDiGa.setVisible(true);
        
        pA0.setVisible(false);
        tLS1.setVisible(false);
        tLS2.setVisible(false);
        tLS3.setVisible(false);
        tLS4.setVisible(false);
        tLS5.setVisible(false);
        tLS6.setVisible(false);
    }//GEN-LAST:event_buttonDiagonalMouseClicked

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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelGambar;
    private javax.swing.JPanel panelUtama;
    // End of variables declaration//GEN-END:variables
}
