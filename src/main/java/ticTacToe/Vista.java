/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ticTacToe;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Ggaby.sg
 */
public class Vista extends javax.swing.JFrame {

    public Vista() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lblTitulo = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        lblCountO = new javax.swing.JLabel();
        lblPlayerO = new javax.swing.JLabel();
        lblPlayerX = new javax.swing.JLabel();
        lblCountX = new javax.swing.JLabel();
        cmdAgain = new javax.swing.JButton();
        cmdExit = new javax.swing.JButton();
        txt11 = new javax.swing.JTextField();
        txt02 = new javax.swing.JTextField();
        txt12 = new javax.swing.JTextField();
        txt01 = new javax.swing.JTextField();
        txt00 = new javax.swing.JTextField();
        txt10 = new javax.swing.JTextField();
        txt20 = new javax.swing.JTextField();
        txt21 = new javax.swing.JTextField();
        txt22 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Cute Bubble", 1, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("TIC TAC TOE");
        jScrollPane1.setViewportView(lblTitulo);

        lblCountO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCountO.setText("COUNT1");

        lblPlayerO.setFont(new java.awt.Font("Cute Bubble", 0, 24)); // NOI18N
        lblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayerO.setText("PLAYER O");

        lblPlayerX.setFont(new java.awt.Font("Cute Bubble", 0, 24)); // NOI18N
        lblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayerX.setText("PLAYER X");

        lblCountX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCountX.setText("COUNT2");

        cmdAgain.setFont(new java.awt.Font("Cute Bubble", 0, 24)); // NOI18N
        cmdAgain.setText("AGAIN");
        cmdAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAgainActionPerformed(evt);
            }
        });

        cmdExit.setFont(new java.awt.Font("Cute Bubble", 0, 24)); // NOI18N
        cmdExit.setText("EXIT");
        cmdExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExitActionPerformed(evt);
            }
        });

        txt11.setFont(new java.awt.Font("Cute Bubble", 1, 70)); // NOI18N
        txt11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt02.setFont(new java.awt.Font("Cute Bubble", 1, 70)); // NOI18N
        txt02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt02ActionPerformed(evt);
            }
        });

        txt12.setFont(new java.awt.Font("Cute Bubble", 1, 70)); // NOI18N
        txt12.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt01.setFont(new java.awt.Font("Cute Bubble", 1, 70)); // NOI18N
        txt01.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt00.setFont(new java.awt.Font("Cute Bubble", 1, 70)); // NOI18N
        txt00.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt10.setFont(new java.awt.Font("Cute Bubble", 1, 70)); // NOI18N
        txt10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt20.setFont(new java.awt.Font("Cute Bubble", 1, 70)); // NOI18N
        txt20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt20ActionPerformed(evt);
            }
        });

        txt21.setFont(new java.awt.Font("Cute Bubble", 1, 70)); // NOI18N
        txt21.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt22.setFont(new java.awt.Font("Cute Bubble", 1, 70)); // NOI18N
        txt22.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jDesktopPane2.setLayer(lblCountO, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(lblPlayerO, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(lblPlayerX, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(lblCountX, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cmdAgain, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cmdExit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(txt11, javax.swing.JLayeredPane.MODAL_LAYER);
        jDesktopPane2.setLayer(txt02, javax.swing.JLayeredPane.MODAL_LAYER);
        jDesktopPane2.setLayer(txt12, javax.swing.JLayeredPane.MODAL_LAYER);
        jDesktopPane2.setLayer(txt01, javax.swing.JLayeredPane.MODAL_LAYER);
        jDesktopPane2.setLayer(txt00, javax.swing.JLayeredPane.MODAL_LAYER);
        jDesktopPane2.setLayer(txt10, javax.swing.JLayeredPane.MODAL_LAYER);
        jDesktopPane2.setLayer(txt20, javax.swing.JLayeredPane.MODAL_LAYER);
        jDesktopPane2.setLayer(txt21, javax.swing.JLayeredPane.MODAL_LAYER);
        jDesktopPane2.setLayer(txt22, javax.swing.JLayeredPane.MODAL_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(txt00, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt01, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt02, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt21, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt22, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(120, 120, 120)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(cmdAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdExit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCountX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPlayerX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPlayerO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCountO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(lblPlayerO)
                        .addGap(18, 18, 18)
                        .addComponent(lblCountO)
                        .addGap(34, 34, 34)
                        .addComponent(lblPlayerX)
                        .addGap(18, 18, 18)
                        .addComponent(lblCountX)
                        .addGap(37, 37, 37)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdAgain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt02, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt01, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt00, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAgainActionPerformed
        txt00.setText(null);
        txt01.setText(null);
        txt02.setText(null);
        txt10.setText(null);
        txt11.setText(null);
        txt12.setText(null);
        txt20.setText(null);
        txt21.setText(null);
        txt22.setText(null);
    }//GEN-LAST:event_cmdAgainActionPerformed

    private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExitActionPerformed
        JFrame frame = new JFrame("Exit");
        int i = JOptionPane.showConfirmDialog(frame, "Do you really wanna exit?", "Exit game", JOptionPane.YES_OPTION);
        if(i == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_cmdExitActionPerformed

    private void txt20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt20ActionPerformed

    private void txt02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt02ActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAgain;
    private javax.swing.JButton cmdExit;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCountO;
    private javax.swing.JLabel lblCountX;
    private javax.swing.JLabel lblPlayerO;
    private javax.swing.JLabel lblPlayerX;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txt00;
    private javax.swing.JTextField txt01;
    private javax.swing.JTextField txt02;
    private javax.swing.JTextField txt10;
    private javax.swing.JTextField txt11;
    private javax.swing.JTextField txt12;
    private javax.swing.JTextField txt20;
    private javax.swing.JTextField txt21;
    private javax.swing.JTextField txt22;
    // End of variables declaration//GEN-END:variables
}
