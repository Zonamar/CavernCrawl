/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caverncrawl;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author zonam_000
 */
public class StartMenuGui extends javax.swing.JFrame {
    
    MapTile testTile;
    
    /**
     * Creates new form StartMenuGui
     */
    public StartMenuGui() {
        initComponents();
        
         testTile = new MapTile();
         
         jPanel1 = testTile;
         
         jPanel1.setVisible(true);
         
         
         
        
        
    }
    
    public void AddCharacter(String newCharacter)
    {
        jComboBox1.addItem(newCharacter);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameType = new javax.swing.ButtonGroup();
        fgTileImg = new javax.swing.ButtonGroup();
        bgTileImg = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        tileFormat1 = new javax.swing.JCheckBox();
        tileFormat2 = new javax.swing.JCheckBox();
        tileFormat3 = new javax.swing.JCheckBox();
        tileFormat4 = new javax.swing.JCheckBox();
        tileFormat5 = new javax.swing.JCheckBox();
        tileFormat6 = new javax.swing.JCheckBox();
        tileFormat7 = new javax.swing.JCheckBox();
        tileFormat8 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Start Game");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Single Player or Multi Player?");

        gameType.add(jRadioButton1);
        jRadioButton1.setText("Single Player");

        gameType.add(jRadioButton2);
        jRadioButton2.setText("Multi Player");

        jLabel2.setText("Which character would you like to play?");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "New Character" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        tileFormat1.setSelected(true);
        tileFormat1.setText("1");
        tileFormat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tileFormat1ActionPerformed(evt);
            }
        });

        tileFormat2.setSelected(true);
        tileFormat2.setText("2");
        tileFormat2.setActionCommand("2");
        tileFormat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tileFormat2ActionPerformed(evt);
            }
        });

        tileFormat3.setSelected(true);
        tileFormat3.setText("3");
        tileFormat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tileFormat3ActionPerformed(evt);
            }
        });

        tileFormat4.setSelected(true);
        tileFormat4.setText("4");
        tileFormat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tileFormat4ActionPerformed(evt);
            }
        });

        tileFormat5.setSelected(true);
        tileFormat5.setText("5");
        tileFormat5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tileFormat5ActionPerformed(evt);
            }
        });

        tileFormat6.setSelected(true);
        tileFormat6.setText("6");
        tileFormat6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tileFormat6ActionPerformed(evt);
            }
        });

        tileFormat7.setSelected(true);
        tileFormat7.setText("7");
        tileFormat7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tileFormat7ActionPerformed(evt);
            }
        });

        tileFormat8.setSelected(true);
        tileFormat8.setText("8");
        tileFormat8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tileFormat8ActionPerformed(evt);
            }
        });

        jLabel3.setText("11111111000000010000000000000000");

        jButton2.setText("Update Tile");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        fgTileImg.add(jRadioButton3);
        jRadioButton3.setText("Black");

        fgTileImg.add(jRadioButton4);
        jRadioButton4.setText("Grass");

        fgTileImg.add(jRadioButton5);
        jRadioButton5.setText("Stone");

        jLabel4.setText("Foreground");

        bgTileImg.add(jRadioButton6);
        jRadioButton6.setSelected(true);
        jRadioButton6.setText("Black");

        bgTileImg.add(jRadioButton7);
        jRadioButton7.setText("Grass");

        bgTileImg.add(jRadioButton8);
        jRadioButton8.setText("Stone");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton2)
                                        .addComponent(jRadioButton1))))
                            .addGap(138, 138, 138))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jButton2)
                            .addGap(18, 18, 18)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(199, 199, 199)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(tileFormat1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tileFormat2))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(tileFormat7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tileFormat6))
                                        .addComponent(jLabel4))
                                    .addComponent(tileFormat8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tileFormat3)
                                    .addComponent(tileFormat4)
                                    .addComponent(tileFormat5))
                                .addGap(35, 35, 35)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton7)
                            .addComponent(jRadioButton8))
                        .addGap(74, 74, 74))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jRadioButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jButton2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tileFormat1)
                                            .addComponent(tileFormat2)
                                            .addComponent(tileFormat3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tileFormat4)
                                            .addComponent(tileFormat8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tileFormat5)
                                            .addComponent(tileFormat6)
                                            .addComponent(tileFormat7))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4))
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton5)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        this.setVisible(false);
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tileFormat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tileFormat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tileFormat1ActionPerformed

    private void tileFormat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tileFormat2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tileFormat2ActionPerformed

    private void tileFormat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tileFormat3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tileFormat3ActionPerformed

    private void tileFormat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tileFormat4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tileFormat4ActionPerformed

    private void tileFormat5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tileFormat5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tileFormat5ActionPerformed

    private void tileFormat6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tileFormat6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tileFormat6ActionPerformed

    private void tileFormat7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tileFormat7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tileFormat7ActionPerformed

    private void tileFormat8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tileFormat8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tileFormat8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String newValue = new String();
        
        if (tileFormat1.isSelected())
            newValue = "1";
        else 
            newValue = "0";
        
        if (tileFormat2.isSelected())
            newValue = newValue + "1";
        else 
            newValue = newValue + "0";
        
        if (tileFormat3.isSelected())
            newValue = newValue + "1";
        else 
            newValue = newValue + "0";
        
        if (tileFormat4.isSelected())
            newValue = newValue + "1";
        else 
            newValue = newValue + "0";
        
        
        
        
        if (tileFormat5.isSelected())
            newValue = newValue + "1";
        else 
            newValue = newValue + "0";
        
        
        if (tileFormat6.isSelected())
            newValue = newValue + "1";
        else 
            newValue = newValue + "0";
        
        if (tileFormat7.isSelected())
            newValue = newValue + "1";
        else 
            newValue = newValue + "0";
       
        if (tileFormat8.isSelected())
            newValue = newValue + "1";
        else 
            newValue = newValue + "0";
        
        newValue += "0000";
        
        if (jRadioButton3.isSelected())
            newValue += "00000000";
        if (jRadioButton4.isSelected())
            newValue += "00010000";
        if (jRadioButton5.isSelected())
            newValue += "00100000";
        
        
        if (jRadioButton6.isSelected())
            newValue += "000000000000";
        if (jRadioButton7.isSelected())
            newValue += "000100000000";
        if (jRadioButton8.isSelected())
            newValue += "001000000000";
        
        
        
        
                
        
        jLabel3.setText(newValue);
        
       
        testTile.updateTileInfo(Integer.parseInt(newValue,2));
        jPanel1= testTile;        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
   


    
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
            java.util.logging.Logger.getLogger(StartMenuGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartMenuGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartMenuGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartMenuGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartMenuGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTileImg;
    private javax.swing.ButtonGroup fgTileImg;
    private javax.swing.ButtonGroup gameType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JCheckBox tileFormat1;
    private javax.swing.JCheckBox tileFormat2;
    private javax.swing.JCheckBox tileFormat3;
    private javax.swing.JCheckBox tileFormat4;
    private javax.swing.JCheckBox tileFormat5;
    private javax.swing.JCheckBox tileFormat6;
    private javax.swing.JCheckBox tileFormat7;
    private javax.swing.JCheckBox tileFormat8;
    // End of variables declaration//GEN-END:variables
}
