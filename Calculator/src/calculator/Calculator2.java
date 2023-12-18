package calculator;

public class Calculator2 extends javax.swing.JFrame {
    double firstnum;    double secondnum;   double result;    String Operations;
    public Calculator2() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbtn1 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtnzero = new javax.swing.JButton();
        jbtndot = new javax.swing.JButton();
        jbtnequal = new javax.swing.JButton();
        jbtnplus = new javax.swing.JButton();
        jbtnminus = new javax.swing.JButton();
        jbtnmultiply = new javax.swing.JButton();
        jtxt = new javax.swing.JTextField();
        jbtnpcnt = new javax.swing.JButton();
        jbtnc = new javax.swing.JButton();
        jbtnac = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setToolTipText("jpanel1tooltip");
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(425, 350));
        jPanel1.setLayout(null);

        jbtn1.setFont(jbtn1.getFont().deriveFont((jbtn1.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD));
        jbtn1.setText("1");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn1);
        jbtn1.setBounds(10, 110, 41, 26);

        jbtn2.setFont(jbtn2.getFont().deriveFont((jbtn2.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD));
        jbtn2.setText("2");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn2);
        jbtn2.setBounds(100, 110, 41, 26);

        jbtn3.setFont(jbtn3.getFont().deriveFont((jbtn3.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD));
        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn3);
        jbtn3.setBounds(190, 110, 41, 26);

        jbtn4.setFont(jbtn4.getFont().deriveFont((jbtn4.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD));
        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn4);
        jbtn4.setBounds(10, 150, 41, 26);

        jbtn5.setFont(jbtn5.getFont().deriveFont((jbtn5.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD));
        jbtn5.setText("5");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn5);
        jbtn5.setBounds(100, 150, 41, 26);

        jbtn6.setFont(jbtn6.getFont().deriveFont((jbtn6.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD));
        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn6);
        jbtn6.setBounds(190, 150, 41, 26);

        jbtn7.setFont(jbtn7.getFont().deriveFont((jbtn7.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD));
        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn7);
        jbtn7.setBounds(10, 190, 41, 26);

        jbtn8.setFont(jbtn8.getFont().deriveFont((jbtn8.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD));
        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn8);
        jbtn8.setBounds(100, 190, 41, 26);

        jbtn9.setFont(jbtn9.getFont().deriveFont((jbtn9.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD));
        jbtn9.setText("9");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtn9);
        jbtn9.setBounds(190, 190, 41, 26);

        jbtnzero.setFont(jbtnzero.getFont().deriveFont((jbtnzero.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD));
        jbtnzero.setText("0");
        jbtnzero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnzeroActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnzero);
        jbtnzero.setBounds(100, 230, 41, 26);

        jbtndot.setFont(jbtndot.getFont().deriveFont((jbtndot.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD));
        jbtndot.setText(".");
        jbtndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndotActionPerformed(evt);
            }
        });
        jPanel1.add(jbtndot);
        jbtndot.setBounds(10, 230, 50, 26);

        jbtnequal.setFont(jbtnequal.getFont().deriveFont((jbtnequal.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD));
        jbtnequal.setText("=");
        jbtnequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnequalActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnequal);
        jbtnequal.setBounds(190, 230, 41, 26);

        jbtnplus.setFont(jbtnplus.getFont().deriveFont((jbtnplus.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD));
        jbtnplus.setText("+");
        jbtnplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnplusActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnplus);
        jbtnplus.setBounds(260, 110, 50, 26);

        jbtnminus.setFont(jbtnminus.getFont().deriveFont((jbtnminus.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD));
        jbtnminus.setText("-");
        jPanel1.add(jbtnminus);
        jbtnminus.setBounds(260, 150, 50, 26);

        jbtnmultiply.setFont(jbtnmultiply.getFont().deriveFont((jbtnmultiply.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD));
        jbtnmultiply.setText("*");
        jPanel1.add(jbtnmultiply);
        jbtnmultiply.setBounds(260, 190, 50, 26);

        jtxt.setFont(jtxt.getFont().deriveFont((jtxt.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD));
        jPanel1.add(jtxt);
        jtxt.setBounds(10, 20, 360, 50);

        jbtnpcnt.setFont(jbtnpcnt.getFont().deriveFont((jbtnpcnt.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD));
        jbtnpcnt.setText("%");
        jbtnpcnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnpcntActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnpcnt);
        jbtnpcnt.setBounds(260, 230, 50, 26);

        jbtnc.setFont(jbtnc.getFont().deriveFont((jbtnc.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD));
        jbtnc.setText("C");
        jbtnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnc);
        jbtnc.setBounds(320, 110, 70, 30);

        jbtnac.setFont(jbtnac.getFont().deriveFont((jbtnac.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD));
        jbtnac.setText("AC");
        jbtnac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnacActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnac);
        jbtnac.setBounds(320, 160, 70, 26);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
        if ("0".equals(jtxt.getText())) {
            jtxt.setText("1");            
        } else {
            jtxt.setText(jtxt.getText() + "1");
        }
    }//GEN-LAST:event_jbtn1ActionPerformed
    private void jbtnpcntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnpcntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnpcntActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
        if ("0".equals(jtxt.getText())) {
            jtxt.setText("2");            
        } else {
            jtxt.setText(jtxt.getText() + "2");
        }
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
        if ("0".equals(jtxt.getText())) {
            jtxt.setText("3");            
        } else {
            jtxt.setText(jtxt.getText() + "3");
        }

    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
        if ("0".equals(jtxt.getText())) {
            jtxt.setText("4");            
        } else {
            jtxt.setText(jtxt.getText() + "4");
        }
    }//GEN-LAST:event_jbtn4ActionPerformed
    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
        if ("0".equals(jtxt.getText())) {
            jtxt.setText("5");            
        } else {
            jtxt.setText(jtxt.getText() + "5");
        }
        
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
        if ("0".equals(jtxt.getText())) {
            jtxt.setText("6");            
        } else {
            jtxt.setText(jtxt.getText() + "6");
        }

    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
        if ("0".equals(jtxt.getText())) {
            jtxt.setText("7");            
        } else {
            jtxt.setText(jtxt.getText() + "7");
        }
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
        if ("0".equals(jtxt.getText())) {
            jtxt.setText("8");            
        } else {
            jtxt.setText(jtxt.getText() + "8");
        }

    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
        if ("0".equals(jtxt.getText())) {
            jtxt.setText("9");            
        } else {
            jtxt.setText(jtxt.getText() + "9");
        }

    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtnzeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnzeroActionPerformed
        if ("0".equals(jtxt.getText())) {
            jtxt.setText("0");            
    }//GEN-LAST:event_jbtnzeroActionPerformed
else {
            jtxt.setText(jtxt.getText() + "0");
        }
    }

    private void jbtndotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndotActionPerformed
        
       if(jtxt.getText().contains("."))
       {
       jtxt.setText(jtxt.getText());
          //  jtxt.setBackground( Color.LIGHT_GRAY );
       } else

       { 
           jtxt.setText(jtxt.getText()+ ("."));
       }
       
        // */
        // */
        //jtxt.setText(jtxt.getText() + "." );  
        /*
        if(!jtxt.contains( "." )){
        jtxt.setText(jtxt.getText() + "." );
        jtxt.setBackground( Color.LIGHT_GRAY );
         */
        //}
        /*
else 
{
   jtxt.setText(jtxt.getText() + "." );
    }//GEN-LAST:event_jbtndotActionPerformed

   */
   
    }     
        
    private void jbtncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncActionPerformed
        // TODO add your handling code here:
        jtxt.setText("0");
        
    }//GEN-LAST:event_jbtncActionPerformed

    private void jbtnacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnacActionPerformed
        // TODO add your handling code here:
        jtxt.setText("0");
        
    }//GEN-LAST:event_jbtnacActionPerformed

    private void jbtnplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnplusActionPerformed
        firstnum = Double.parseDouble(jtxt.getText());
        Operations = "+";
        //jtxt.setText(firstnum);
          jtxt.setText("0");
       // jtxt.setText(if Operations= "+" ,jtxt.getText());
        
     
        
        
        
    }//GEN-LAST:event_jbtnplusActionPerformed

    private void jbtnequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnequalActionPerformed
      secondnum =Double.parseDouble(jtxt.getText());
      
    }//GEN-LAST:event_jbtnequalActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnac;
    private javax.swing.JButton jbtnc;
    private javax.swing.JButton jbtndot;
    private javax.swing.JButton jbtnequal;
    private javax.swing.JButton jbtnminus;
    private javax.swing.JButton jbtnmultiply;
    private javax.swing.JButton jbtnpcnt;
    private javax.swing.JButton jbtnplus;
    private javax.swing.JButton jbtnzero;
    private javax.swing.JTextField jtxt;
    // End of variables declaration//GEN-END:variables
}
