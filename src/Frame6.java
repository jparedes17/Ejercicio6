
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pared
 */
public class Frame6 extends javax.swing.JFrame {

    /**
     * Creates new form Frame6
     */
    public Frame6() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTamañoLet = new javax.swing.JTextField();
        txtNumCol = new javax.swing.JTextField();
        txtTotalPag = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtNumPalabras = new javax.swing.JTextField();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel2KeyTyped(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Periodico AL DIA.");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("*Numero de Palabras:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("*Tamaño de la Letra:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Numero de Colores:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Total a Pagar:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        txtTamañoLet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTamañoLetActionPerformed(evt);
            }
        });
        txtTamañoLet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTamañoLetKeyTyped(evt);
            }
        });
        jPanel2.add(txtTamañoLet, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 140, -1));

        txtNumCol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumColKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumCol, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 140, -1));

        txtTotalPag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalPagKeyTyped(evt);
            }
        });
        jPanel2.add(txtTotalPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 140, -1));

        jButton1.setText("Ejecutar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, -1));

        jButton2.setText("Borrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        txtNumPalabras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumPalabrasActionPerformed(evt);
            }
        });
        txtNumPalabras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumPalabrasKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumPalabras, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 140, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 590, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel2KeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel2KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here
        long numpalabras, tamtext, numcolor, totalpag;
        long op1, op2, op3, acum1= 0;
        long y;
        String resultado, x;
        
        if (txtNumCol.getText().trim().isEmpty())
                {
                    JOptionPane.showMessageDialog(this, "Ingrese Cantidad de Colores", "Error", JOptionPane.ERROR_MESSAGE);
                    txtNumCol.requestFocusInWindow();
                }
        if (txtNumPalabras.getText().trim().isEmpty())
                {
                    JOptionPane.showMessageDialog(this, "Ingrese el Numero de Palabras", "Error", JOptionPane.ERROR_MESSAGE);
                    txtNumPalabras.requestFocusInWindow();
                }
        if (txtTamañoLet.getText().trim().isEmpty())
                {
                    JOptionPane.showMessageDialog(this, "Ingrese Tamaño de Letra", "Error", JOptionPane.ERROR_MESSAGE);
                    txtTamañoLet.requestFocusInWindow();
                }
        else {
        numpalabras= Long.parseLong(txtNumPalabras.getText());
        tamtext= Long.parseLong(txtTamañoLet.getText());
        numcolor= Long.parseLong(txtNumCol.getText());
        
        op1= numpalabras*20000;
        acum1= acum1+op1;
        
        op2 = numcolor*25000;
        acum1= acum1 + op2;
        
        op3 = tamtext*15000;
        acum1 = acum1 + op3;

        resultado= String.valueOf(acum1);
        txtTotalPag.setText(""+acum1);
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNumPalabrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumPalabrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumPalabrasActionPerformed

    private void txtNumPalabrasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumPalabrasKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) 
          { 
              getToolkit().beep(); 
              evt.consume();      
          }
        
    }//GEN-LAST:event_txtNumPalabrasKeyTyped

    private void txtTamañoLetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTamañoLetKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) 
          { 
              getToolkit().beep(); 
              evt.consume();      
          }
         
    }//GEN-LAST:event_txtTamañoLetKeyTyped

    private void txtTamañoLetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTamañoLetActionPerformed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_txtTamañoLetActionPerformed

    private void txtNumColKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumColKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) 
          { 
              getToolkit().beep(); 
              evt.consume();      
          }
         
    }//GEN-LAST:event_txtNumColKeyTyped

    private void txtTotalPagKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalPagKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) 
          { 
              getToolkit().beep(); 
              evt.consume();      
          }
         
          if(!Character.isLetter(c)) 
          { 
              getToolkit().beep(); 
              evt.consume(); 
          }
    }//GEN-LAST:event_txtTotalPagKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txtNumCol.setText("");
        txtNumPalabras.setText("");
        txtTamañoLet.setText("");
        txtTotalPag.setText("");
        
        txtNumPalabras.requestFocusInWindow();
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
            java.util.logging.Logger.getLogger(Frame6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtNumCol;
    private javax.swing.JTextField txtNumPalabras;
    private javax.swing.JTextField txtTamañoLet;
    private javax.swing.JTextField txtTotalPag;
    // End of variables declaration//GEN-END:variables
}
