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

    String turn = "O";
    char fields[][] = new char[3][3];

    public Vista() {
        initComponents();
        this.setLocationRelativeTo(null);
<<<<<<< HEAD
=======
        /*char i;
        i = (txt00.getText()).charAt(0);
        fields[0][0] = i;
        i = (txt01.getText()).charAt(0);
        fields[0][1] = i;
        i = (txt02.getText()).charAt(0);
        fields[0][2] = i;
        
        i = (txt10.getText()).charAt(0);
        fields[1][0] = i;
        i = (txt11.getText()).charAt(0);
        fields[1][1] = i;
        i = (txt12.getText()).charAt(0);
        fields[1][2] = i;
        
        i = (txt20.getText()).charAt(0);
        fields[2][0] = i;
        i = (txt21.getText()).charAt(0);
        fields[2][1] = i;
        i = (txt22.getText()).charAt(0);
        fields[2][2] = i;*/
>>>>>>> c100661d2639e6b1c7ee03bf622c543def0e5acd
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
        txt00 = new javax.swing.JTextField();
        lblTurnoYGanador = new javax.swing.JLabel();
        txt01 = new javax.swing.JTextField();
        txt02 = new javax.swing.JTextField();
        txt10 = new javax.swing.JTextField();
        txt11 = new javax.swing.JTextField();
        txt12 = new javax.swing.JTextField();
        txt22 = new javax.swing.JTextField();
        txt21 = new javax.swing.JTextField();
        txt20 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Cute Bubble", 1, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("TIC TAC TOE");
        jScrollPane1.setViewportView(lblTitulo);

        lblCountO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCountO.setText("0");

        lblPlayerO.setFont(new java.awt.Font("Cute Bubble", 0, 24)); // NOI18N
        lblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayerO.setText("PLAYER O");

        lblPlayerX.setFont(new java.awt.Font("Cute Bubble", 0, 24)); // NOI18N
        lblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayerX.setText("PLAYER X");

        lblCountX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCountX.setText("0");

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

        txt00.setEditable(false);
        txt00.setFont(new java.awt.Font("Cute Bubble", 1, 70)); // NOI18N
        txt00.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt00MouseClicked(evt);
            }
        });

        lblTurnoYGanador.setFont(new java.awt.Font("Cute Bubble", 3, 18)); // NOI18N
        lblTurnoYGanador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTurnoYGanador.setText("O's turn");

        txt01.setEditable(false);
        txt01.setFont(new java.awt.Font("Cute Bubble", 1, 70)); // NOI18N
        txt01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt01MouseClicked(evt);
            }
        });

        txt02.setEditable(false);
        txt02.setFont(new java.awt.Font("Cute Bubble", 1, 70)); // NOI18N
        txt02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt02MouseClicked(evt);
            }
        });

        txt10.setEditable(false);
        txt10.setFont(new java.awt.Font("Cute Bubble", 1, 70)); // NOI18N
        txt10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt10MouseClicked(evt);
            }
        });

        txt11.setEditable(false);
        txt11.setFont(new java.awt.Font("Cute Bubble", 1, 70)); // NOI18N
        txt11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt11MouseClicked(evt);
            }
        });

        txt12.setEditable(false);
        txt12.setFont(new java.awt.Font("Cute Bubble", 1, 70)); // NOI18N
        txt12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt12MouseClicked(evt);
            }
        });

        txt22.setEditable(false);
        txt22.setFont(new java.awt.Font("Cute Bubble", 1, 70)); // NOI18N
        txt22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt22MouseClicked(evt);
            }
        });

        txt21.setEditable(false);
        txt21.setFont(new java.awt.Font("Cute Bubble", 1, 70)); // NOI18N
        txt21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt21MouseClicked(evt);
            }
        });

        txt20.setEditable(false);
        txt20.setFont(new java.awt.Font("Cute Bubble", 1, 70)); // NOI18N
        txt20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt20MouseClicked(evt);
            }
        });

        jDesktopPane2.setLayer(lblCountO, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(lblPlayerO, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(lblPlayerX, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(lblCountX, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cmdAgain, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(cmdExit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(txt00, javax.swing.JLayeredPane.MODAL_LAYER);
        jDesktopPane2.setLayer(lblTurnoYGanador, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(txt01, javax.swing.JLayeredPane.MODAL_LAYER);
        jDesktopPane2.setLayer(txt02, javax.swing.JLayeredPane.MODAL_LAYER);
        jDesktopPane2.setLayer(txt10, javax.swing.JLayeredPane.MODAL_LAYER);
        jDesktopPane2.setLayer(txt11, javax.swing.JLayeredPane.MODAL_LAYER);
        jDesktopPane2.setLayer(txt12, javax.swing.JLayeredPane.MODAL_LAYER);
        jDesktopPane2.setLayer(txt22, javax.swing.JLayeredPane.MODAL_LAYER);
        jDesktopPane2.setLayer(txt21, javax.swing.JLayeredPane.MODAL_LAYER);
        jDesktopPane2.setLayer(txt20, javax.swing.JLayeredPane.MODAL_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(lblTurnoYGanador, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt21, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt22, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(txt00, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt01, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt02, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(109, 109, 109)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPlayerO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(cmdAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmdExit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCountX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPlayerX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCountO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(61, 61, 61))))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTurnoYGanador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt00, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt01, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt02, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdAgain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblPlayerO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCountO)
                        .addGap(51, 51, 51)
                        .addComponent(lblPlayerX)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCountX)))
                .addGap(20, 20, 20))
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
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt20MouseClicked
        String aux = txt20.getText();
              
        if (aux.equals("X") || aux.equals("O")) {
            JOptionPane.showMessageDialog(rootPane, "\uD83D\uDE44" + " Don't be silly!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            txt20.setText(turn);
            move();
<<<<<<< HEAD
            winner();
=======
>>>>>>> c100661d2639e6b1c7ee03bf622c543def0e5acd
        }
    }//GEN-LAST:event_txt20MouseClicked

    private void txt21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt21MouseClicked
        String aux = txt21.getText();
              
        if (aux.equals("X") || aux.equals("O")) {
            JOptionPane.showMessageDialog(rootPane, "\uD83D\uDE44" + " Don't be silly!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            txt21.setText(turn);
            move();
<<<<<<< HEAD
            winner();
=======
>>>>>>> c100661d2639e6b1c7ee03bf622c543def0e5acd
        }
    }//GEN-LAST:event_txt21MouseClicked

    private void txt22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt22MouseClicked
        String aux = txt22.getText();
              
        if (aux.equals("X") || aux.equals("O")) {
            JOptionPane.showMessageDialog(rootPane, "\uD83D\uDE44" + " Don't be silly!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            txt22.setText(turn);
            move();
<<<<<<< HEAD
            winner();
=======
>>>>>>> c100661d2639e6b1c7ee03bf622c543def0e5acd
        }
    }//GEN-LAST:event_txt22MouseClicked

    private void txt12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt12MouseClicked
        String aux = txt12.getText();
              
        if (aux.equals("X") || aux.equals("O")) {
            JOptionPane.showMessageDialog(rootPane, "\uD83D\uDE44" + " Don't be silly!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            txt12.setText(turn);
            move();
<<<<<<< HEAD
            winner();
=======
>>>>>>> c100661d2639e6b1c7ee03bf622c543def0e5acd
        }
    }//GEN-LAST:event_txt12MouseClicked

    private void txt11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt11MouseClicked
        String aux = txt11.getText();
              
        if (aux.equals("X") || aux.equals("O")) {
            JOptionPane.showMessageDialog(rootPane, "\uD83D\uDE44" + " Don't be silly!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            txt11.setText(turn);
            move();
<<<<<<< HEAD
            winner();
=======
>>>>>>> c100661d2639e6b1c7ee03bf622c543def0e5acd
        }
    }//GEN-LAST:event_txt11MouseClicked

    private void txt10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt10MouseClicked
        String aux = txt10.getText();
              
        if (aux.equals("X") || aux.equals("O")) {
            JOptionPane.showMessageDialog(rootPane, "\uD83D\uDE44" + " Don't be silly!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            txt10.setText(turn);
            move();
<<<<<<< HEAD
            winner();
=======
>>>>>>> c100661d2639e6b1c7ee03bf622c543def0e5acd
        }
    }//GEN-LAST:event_txt10MouseClicked

    private void txt02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt02MouseClicked
        String aux = txt02.getText();
              
        if (aux.equals("X") || aux.equals("O")) {
            JOptionPane.showMessageDialog(rootPane, "\uD83D\uDE44" + " Don't be silly!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            txt02.setText(turn);
            move();
<<<<<<< HEAD
            winner();
=======
>>>>>>> c100661d2639e6b1c7ee03bf622c543def0e5acd
        }
    }//GEN-LAST:event_txt02MouseClicked

    private void txt01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt01MouseClicked
        String aux = txt01.getText();
              
        if (aux.equals("X") || aux.equals("O")) {
            JOptionPane.showMessageDialog(rootPane, "\uD83D\uDE44" + " Don't be silly!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            txt01.setText(turn);
            move();
<<<<<<< HEAD
            winner();
=======
>>>>>>> c100661d2639e6b1c7ee03bf622c543def0e5acd
        }
    }//GEN-LAST:event_txt01MouseClicked

    private void txt00MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt00MouseClicked
        String aux = txt00.getText();
<<<<<<< HEAD
        
=======
              
>>>>>>> c100661d2639e6b1c7ee03bf622c543def0e5acd
        if (aux.equals("X") || aux.equals("O")) {
            JOptionPane.showMessageDialog(rootPane, "\uD83D\uDE44" + " Don't be silly!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            txt00.setText(turn);
            move();
<<<<<<< HEAD
            winner();
=======
>>>>>>> c100661d2639e6b1c7ee03bf622c543def0e5acd
        }
    }//GEN-LAST:event_txt00MouseClicked

    private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExitActionPerformed
        JFrame frame = new JFrame("Exit");
        int i = JOptionPane.showConfirmDialog(frame, "Do you really wanna exit?", "Exit game", JOptionPane.YES_OPTION);
        if (i == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_cmdExitActionPerformed

    private void cmdAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAgainActionPerformed
        int i = JOptionPane.showConfirmDialog(rootPane, "Are you gonna play again?", "Play again", JOptionPane.YES_NO_OPTION);
        if (i == 0) {
            txt00.setText(null);
            txt01.setText(null);
            txt02.setText(null);
            txt10.setText(null);
            txt11.setText(null);
            txt12.setText(null);
            txt20.setText(null);
            txt21.setText(null);
            txt22.setText(null);
<<<<<<< HEAD
=======

            lblCountO.setText("0");
            lblCountX.setText("0");
>>>>>>> c100661d2639e6b1c7ee03bf622c543def0e5acd
        }
    }//GEN-LAST:event_cmdAgainActionPerformed

    private void move() {
<<<<<<< HEAD
        if (turn.equals("O")) {
            lblTurnoYGanador.setText("X's turn");
            turn = "X";
        } else {
            lblTurnoYGanador.setText("O's turn");
            turn = "O";
        }
    }
    
    private void winner(){
        
    }
=======
        int aux1;
        String aux2;

        if (turn.equals("O")) {
            lblTurnoYGanador.setText("X's turn");
            turn = "X";
            aux1 = Integer.parseInt(lblCountX.getText()) + 1;
            aux2 = String.valueOf(aux1);
            lblCountX.setText(aux2);
        } else {
            lblTurnoYGanador.setText("O's turn");
            turn = "O";
            aux1 = Integer.parseInt(lblCountO.getText()) + 1;
            aux2 = String.valueOf(aux1);
            lblCountO.setText(aux2);
        }
    }
>>>>>>> c100661d2639e6b1c7ee03bf622c543def0e5acd

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
    private javax.swing.JLabel lblTurnoYGanador;
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
