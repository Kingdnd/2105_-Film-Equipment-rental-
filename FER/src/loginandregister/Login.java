/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginandregister;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
       initComponents();
       this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPassword = new javax.swing.JPanel();
        lblMotto = new javax.swing.JLabel();
        lblUname = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUname = new javax.swing.JTextField();
        pfPassword = new javax.swing.JPasswordField();
        jLabelClose = new javax.swing.JLabel();
        jLabel6Min = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        bsignup = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        lblPassword.setBackground(new java.awt.Color(153, 153, 153));
        lblPassword.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMotto.setFont(new java.awt.Font("Yu Gothic UI Semilight", 2, 14)); // NOI18N
        lblMotto.setText("Lights, Camera, Rent!");
        lblPassword.add(lblMotto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 140, -1));

        lblUname.setText("Username");
        lblPassword.add(lblUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 100, -1, 26));

        jLabel4.setText("Password");
        lblPassword.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 159, -1, -1));

        txtUname.setBackground(new java.awt.Color(204, 204, 204));
        txtUname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUname.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtUname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnameActionPerformed(evt);
            }
        });
        lblPassword.add(txtUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 99, 182, -1));

        pfPassword.setBackground(new java.awt.Color(204, 204, 204));
        pfPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pfPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfPasswordActionPerformed(evt);
            }
        });
        lblPassword.add(pfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 153, 182, -1));

        jLabelClose.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });
        lblPassword.add(jLabelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 29, -1));

        jLabel6Min.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6Min.setText("-");
        jLabel6Min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6Min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MinMouseClicked(evt);
            }
        });
        lblPassword.add(jLabel6Min, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 20, 20));

        Login.setBackground(new java.awt.Color(204, 204, 204));
        Login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Login.setText("Login");
        Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        lblPassword.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 192, -1, 21));

        bsignup.setBackground(new java.awt.Color(204, 204, 204));
        bsignup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bsignup.setText("signup");
        bsignup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsignupActionPerformed(evt);
            }
        });
        lblPassword.add(bsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 192, -1, 21));

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Film Equipment Rental");
        lblPassword.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 200, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void handleLogin() {
    String username = txtUname.getText().trim();
    String password = new String(pfPassword.getPassword()).trim();

    if (username.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter both username and password.", "Input Error", JOptionPane.ERROR_MESSAGE);
    } else {
        // Simulate login validation 
        if ("admin".equals(username) && "admin123".equals(password)) {
            JOptionPane.showMessageDialog(this, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            // Proceed to the next screen 
        } else {
            JOptionPane.showMessageDialog(this, "Invalid credentials. Please try again.", "Login Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
    private void txtUnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnameActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabel6MinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel6MinMouseClicked

    private void pfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfPasswordActionPerformed

    private void bsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsignupActionPerformed
    Register registerFrame = new Register();
    registerFrame.setVisible(true);
    registerFrame.pack();
    registerFrame.setLocationRelativeTo(null);
    this.dispose();
    
    }//GEN-LAST:event_bsignupActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
    handleLogin();
    
    }//GEN-LAST:event_LoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JButton bsignup;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6Min;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel lblMotto;
    private javax.swing.JPanel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUname;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField txtUname;
    // End of variables declaration//GEN-END:variables
}
