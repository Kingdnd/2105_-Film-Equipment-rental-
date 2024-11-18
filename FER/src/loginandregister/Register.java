/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginandregister;

import java.awt.event.ActionEvent;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Mark Jay
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        getRootPane().setDefaultButton(bsignup);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JPanel();
        lblMotto = new javax.swing.JLabel();
        lblFname = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        pfPassword = new javax.swing.JPasswordField();
        lblClose = new javax.swing.JLabel();
        lblmin = new javax.swing.JLabel();
        lblTtitle = new javax.swing.JLabel();
        lblUname = new javax.swing.JLabel();
        lblLname = new javax.swing.JLabel();
        txtLname = new javax.swing.JTextField();
        txtFname = new javax.swing.JTextField();
        cbShowpassword = new javax.swing.JCheckBox();
        bsignup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        exit.setBackground(new java.awt.Color(153, 153, 153));
        exit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMotto.setFont(new java.awt.Font("Yu Gothic UI Semilight", 2, 14)); // NOI18N
        lblMotto.setText("Lights, Camera, Rent!");
        exit.add(lblMotto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 140, -1));

        lblFname.setText("Firstname");
        exit.add(lblFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, 26));

        lblPassword.setText("Password");
        exit.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        txtUsername.setBackground(new java.awt.Color(204, 204, 204));
        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        exit.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 182, -1));

        pfPassword.setBackground(new java.awt.Color(204, 204, 204));
        pfPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pfPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfPasswordActionPerformed(evt);
            }
        });
        exit.add(pfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 182, -1));

        lblClose.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblClose.setText("X");
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        exit.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 29, -1));

        lblmin.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblmin.setText("-");
        lblmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminMouseClicked(evt);
            }
        });
        exit.add(lblmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 20, 20));

        lblTtitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTtitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTtitle.setText("Film Equipment Rental");
        exit.add(lblTtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 200, 50));

        lblUname.setText("Username");
        exit.add(lblUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, 26));

        lblLname.setText("Lastname");
        exit.add(lblLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, 26));

        txtLname.setBackground(new java.awt.Color(204, 204, 204));
        txtLname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLname.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLnameActionPerformed(evt);
            }
        });
        exit.add(txtLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 182, -1));

        txtFname.setBackground(new java.awt.Color(204, 204, 204));
        txtFname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFname.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFnameActionPerformed(evt);
            }
        });
        exit.add(txtFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 182, -1));

        cbShowpassword.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        cbShowpassword.setText("Show password");
        cbShowpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbShowpasswordActionPerformed(evt);
            }
        });
        exit.add(cbShowpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 100, 20));

        bsignup.setText("signup");
        bsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsignupActionPerformed(evt);
            }
        });
        exit.add(bsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 305, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 985, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     private void handleSignupAction(ActionEvent evt) {
        // Basic validation
        String firstName = txtFname.getText().trim();
        String lastName = txtLname.getText().trim();
        String username = txtUsername.getText().trim();
        String password = new String(pfPassword.getPassword()).trim();

        if (firstName.isEmpty() || lastName.isEmpty() || username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields", "Input Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Proceed with registration (e.g., save to database)
            JOptionPane.showMessageDialog(this, "Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            // Here you can transition to the login screen or another view
        }
    }

    /**
     * Toggles password visibility.
     */
    private void togglePasswordVisibility(ActionEvent evt) {
    if (cbShowpassword.isSelected()) {
        pfPassword.setEchoChar((char) 0); // Show password
    } else {
        pfPassword.setEchoChar('*'); // Hide password
    }
}
    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void pfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfPasswordActionPerformed

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblminMouseClicked

    private void txtLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLnameActionPerformed

    private void txtFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFnameActionPerformed
    }//GEN-LAST:event_txtFnameActionPerformed

    private void cbShowpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbShowpasswordActionPerformed
    if (cbShowpassword.isSelected()) {
        pfPassword.setEchoChar((char) 0); // Show password
    } else {
        pfPassword.setEchoChar('*'); // Hide password
    }
    }//GEN-LAST:event_cbShowpasswordActionPerformed

    private void bsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsignupActionPerformed
    String firstName = txtFname.getText().trim();
    String lastName = txtLname.getText().trim();
    String username = txtUsername.getText().trim();
    String password = new String(pfPassword.getPassword()).trim();

    if (firstName.isEmpty() || lastName.isEmpty() || username.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill all fields", "Input Error", JOptionPane.ERROR_MESSAGE);
    } else {
        // Proceed with registration (e.g., save to database)
        JOptionPane.showMessageDialog(this, "Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
        // Here you can transition to the login screen or another view
        this.dispose();
        Login lg = new Login();
        lg.setVisible(true);
        
    }
    
    }//GEN-LAST:event_bsignupActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bsignup;
    private javax.swing.JCheckBox cbShowpassword;
    private javax.swing.JPanel exit;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblFname;
    private javax.swing.JLabel lblLname;
    private javax.swing.JLabel lblMotto;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTtitle;
    private javax.swing.JLabel lblUname;
    private javax.swing.JLabel lblmin;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
