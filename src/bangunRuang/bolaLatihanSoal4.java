/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunRuang;

import javax.swing.JOptionPane;

/**
 *
 * @author SONY
 */
public class bolaLatihanSoal4 extends javax.swing.JPanel {

    /**
     * Creates new form bolaLatihanSoal4
     */
    public bolaLatihanSoal4() {
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

        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        buttonCek = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);
        add(jTextField2);
        jTextField2.setBounds(590, 240, 240, 30);
        add(jTextField1);
        jTextField1.setBounds(190, 240, 160, 30);

        buttonCek.setText("CEK KUNCI");
        buttonCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCekActionPerformed(evt);
            }
        });
        add(buttonCek);
        buttonCek.setBounds(420, 240, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Bola/Latsol Bola 4.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 990, 376);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCekActionPerformed
        // TODO add your handling code here:
        String jawaban = jTextField1.getText();
        
        if(jawaban.equals("20")){
            jTextField2.setText("Jawaban Benar : 20 cm");
        } else {
            JOptionPane.showMessageDialog(this, "Jawabanmu belum tepat!");
        }
    }//GEN-LAST:event_buttonCekActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
