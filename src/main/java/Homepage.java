/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Ashish
 */
public class Homepage extends javax.swing.JFrame {

    /**
     * Creates new form Homepage
     */
    public Homepage() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        newBook_button = new javax.swing.JButton();
        history_button = new javax.swing.JButton();
        issue_button = new javax.swing.JButton();
        return_button = new javax.swing.JButton();
        logout_button = new javax.swing.JButton();
        label2 = new java.awt.Label();
        newEntry_button3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newBook_button.setBackground(new java.awt.Color(102, 204, 255));
        newBook_button.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        newBook_button.setText("New Book");
        newBook_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBook_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(newBook_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 190, 30));

        history_button.setBackground(new java.awt.Color(51, 153, 255));
        history_button.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        history_button.setText("Pending Returns");
        history_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                history_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(history_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 190, -1));

        issue_button.setBackground(new java.awt.Color(102, 204, 255));
        issue_button.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        issue_button.setText("Issue Book");
        issue_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issue_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(issue_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 190, -1));

        return_button.setBackground(new java.awt.Color(0, 153, 255));
        return_button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        return_button.setText("Return Book");
        return_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(return_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 190, -1));

        logout_button.setBackground(new java.awt.Color(102, 204, 255));
        logout_button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        logout_button.setText("Logout");
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(logout_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 190, -1));

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label2.setText("LIBRARY MANAGEMENT SYSTEM");
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 20, 460, 60));

        newEntry_button3.setBackground(new java.awt.Color(51, 153, 255));
        newEntry_button3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        newEntry_button3.setText("New Student Entry");
        newEntry_button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEntry_button3ActionPerformed(evt);
            }
        });
        getContentPane().add(newEntry_button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/bg1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1366, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Login().setVisible(true);
        
    }//GEN-LAST:event_logout_buttonActionPerformed

    private void newBook_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBook_buttonActionPerformed
        // TODO add your handling code here:
        new NewBook().setVisible(true);
    }//GEN-LAST:event_newBook_buttonActionPerformed

    private void issue_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issue_buttonActionPerformed
        // TODO add your handling code here:
        new IssueBook().setVisible(true);
    }//GEN-LAST:event_issue_buttonActionPerformed

    private void return_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_buttonActionPerformed
        // TODO add your handling code here:
        new ReturnBook().setVisible(true);
    }//GEN-LAST:event_return_buttonActionPerformed

    private void history_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_history_buttonActionPerformed
        // TODO add your handling code here:
        new History().setVisible(true);
    }//GEN-LAST:event_history_buttonActionPerformed

    private void newEntry_button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEntry_button3ActionPerformed
        new NewStudent().setVisible(true);
    }//GEN-LAST:event_newEntry_button3ActionPerformed

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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton history_button;
    private javax.swing.JButton issue_button;
    private javax.swing.JLabel jLabel2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JButton logout_button;
    private javax.swing.JButton newBook_button;
    private javax.swing.JButton newEntry_button3;
    private javax.swing.JButton return_button;
    // End of variables declaration//GEN-END:variables
}
