/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunDatar;

/**
 *
 * @author Asus
 */
public class belahKetupatLatihanSoal5 extends javax.swing.JPanel {

    /**
     * Creates new form belahKetupatLatihanSoal5
     */
    public belahKetupatLatihanSoal5() {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(24, 64, 105));
        setLayout(null);

        jLabel5.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        jLabel5.setText("Diketahui keliling sebuah belah ketupat ialah 32 cm,");
        add(jLabel5);
        jLabel5.setBounds(110, 40, 730, 70);

        jLabel4.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        jLabel4.setText("maka berapa panjang masing masing sisi belah ketupat tesebut? ");
        add(jLabel4);
        jLabel4.setBounds(40, 100, 900, 70);

        jLabel6.setFont(new java.awt.Font("DialogInput", 2, 24)); // NOI18N
        jLabel6.setText("Jawab : ");
        add(jLabel6);
        jLabel6.setBounds(40, 220, 130, 30);
        add(jTextField1);
        jTextField1.setBounds(180, 210, 290, 60);

        jButton1.setText("Cek");
        add(jButton1);
        jButton1.setBounds(510, 220, 77, 32);

        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        add(jTextField2);
        jTextField2.setBounds(630, 210, 280, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
