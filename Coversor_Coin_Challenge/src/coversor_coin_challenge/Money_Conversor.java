package coversor_coin_challenge;

import javax.swing.JOptionPane;

public class Money_Conversor extends javax.swing.JFrame {

    private float Quantity;
    
    public Money_Conversor() {
        setUndecorated(true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CoinOption = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CoinOption.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        CoinOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colones a Dolares", "Colones a Euros", "Colones a Libra Esterlinas", "Colones a Yen Japones", "Colones a Won sul-coreano" }));
        getContentPane().add(CoinOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 230, 30));

        jButton3.setBackground(new java.awt.Color(204, 204, 0));
        jButton3.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("< Return >");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 130, 30));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Coins System");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 130, -1));

        jButton5.setBackground(new java.awt.Color(102, 0, 0));
        jButton5.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Convert <-");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 130, 30));

        jButton4.setBackground(new java.awt.Color(51, 153, 0));
        jButton4.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Covert ->");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Principal_Image.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 260));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    OptionsPane op2 = new OptionsPane();
    op2.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String option_panel = (String)CoinOption.getSelectedItem();
        if (null != option_panel)switch (option_panel) {
            case "Colones a Dolares" -> {
                double colon_value_1 = 0.0019;
                double dolares = Quantity * colon_value_1;
                JOptionPane.showMessageDialog(null, "Eso equivale a aproximadamente a " + dolares + " Dolares.", "Security System", JOptionPane.INFORMATION_MESSAGE);
                }
            case "Colones a Euros" -> {
                double colon_value_1 = 0.0017;
                double euros = Quantity * colon_value_1;
                JOptionPane.showMessageDialog(null, "Eso equivale a aproximadamente a " + euros + " Euros.", "Security System", JOptionPane.INFORMATION_MESSAGE);
                }
            case "Colones a Libra Esterlinas" -> {
                double colon_value_1 = 0.0015;
                double LibraE = Quantity * colon_value_1;
                JOptionPane.showMessageDialog(null, "Eso equivale a aproximadamente a " + LibraE + " Libras Esterlinas.", "Security System", JOptionPane.INFORMATION_MESSAGE);
                }
            case "Colones a Yen Japones" -> {
                double colon_value_1 = 0.27;
                double Yen = Quantity * colon_value_1;
                JOptionPane.showMessageDialog(null, "Eso equivale a aproximadamente a " + Yen + " Yenes.", "Security System", JOptionPane.INFORMATION_MESSAGE);
                }
            case "Colones a Won sul-coreano" -> {
                double colon_value_1 = 2.49;
                double Won = Quantity * colon_value_1;
                JOptionPane.showMessageDialog(null, "Eso equivale a aproximadamente a " + Won + "Wones.", "Security System", JOptionPane.INFORMATION_MESSAGE);
                }
            default -> {
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    String option_panel = (String)CoinOption.getSelectedItem();
        if (null != option_panel)switch (option_panel) {
            case "Colones a Dolares" -> {
                double dolar_value_1 = 532.00;
                double colones = Quantity * dolar_value_1;
                JOptionPane.showMessageDialog(null, "Eso equivale a aproximadamente a " + colones + " Colones.", "Security System", JOptionPane.INFORMATION_MESSAGE);
                }
            case "Colones a Euros" -> {
                double euro_value = 588.24;
                double euros = Quantity * euro_value;
                JOptionPane.showMessageDialog(null, "Eso equivale a aproximadamente a " + euros + " Colones.", "Security System", JOptionPane.INFORMATION_MESSAGE);
                }
            case "Colones a Libra Esterlinas" -> {
                double Libra_value = 677.59;
                double LibraE = Quantity * Libra_value;
                JOptionPane.showMessageDialog(null, "Eso equivale a aproximadamente a " + LibraE + " Colones.", "Security System", JOptionPane.INFORMATION_MESSAGE);
                }
            case "Colones a Yen Japones" -> {
                double yen_value = 3.64;
                double Yen = Quantity * yen_value;
                JOptionPane.showMessageDialog(null, "Eso equivale a aproximadamente a " + Yen + " Colones.", "Security System", JOptionPane.INFORMATION_MESSAGE);
                }
            case "Colones a Won sul-coreano" -> {
                double won_value = 0.40;
                double Won = Quantity * won_value;
                JOptionPane.showMessageDialog(null, "Eso equivale a aproximadamente a " + Won + " Colones.", "Security System", JOptionPane.INFORMATION_MESSAGE);
                }
            default -> {
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    public void setQuantity(float quantity) {
        Quantity = quantity;
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
            java.util.logging.Logger.getLogger(Money_Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Money_Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Money_Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Money_Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Money_Conversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CoinOption;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    



}
