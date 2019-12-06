/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathgame_v1;

import java.sql.*;
import javax.swing.*;
public class SQl extends javax.swing.JFrame {

   Connection conn=null;
   ResultSet rs=null;
   PreparedStatement pst=null;
    public SQl() {
        initComponents();
        conn=SQlite.ConnecrDB();
    }

    /**
     * Username=rahul,password=12345.
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        UsetxtField = new javax.swing.JTextField();
        LoginBtn = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathgame_v1/pnggradHDrgba.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UsetxtField.setBackground(new java.awt.Color(102, 102, 255));
        UsetxtField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UsetxtField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UsetxtField.setBorder(null);
        UsetxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsetxtFieldActionPerformed(evt);
            }
        });
        getContentPane().add(UsetxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 230, 40));

        LoginBtn.setBackground(new java.awt.Color(102, 102, 255));
        LoginBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LoginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathgame_v1/login.png"))); // NOI18N
        LoginBtn.setText("LogIn");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        jTextField2.setBackground(new java.awt.Color(102, 102, 255));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(null);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 230, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathgame_v1/user.png"))); // NOI18N
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathgame_v1/gmail.png"))); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, 40));

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton1.setText("Create account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 120, 20));

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 353, 60, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathgame_v1/pnggradHDrgba.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
      
        try{
           String query="select * from Info where Username=? and Email=?";
           pst=conn.prepareStatement(query);
           pst.setString(1,UsetxtField.getText());
           pst.setString(2,jTextField2.getText());
           rs=pst.executeQuery();
            
           if(rs.next()){
               JOptionPane.showMessageDialog(null, "Log in Successful");
               //SQlite s=new SQlite();
               MathPlay M = new MathPlay();
               String s=UsetxtField.getText();
               M.jLabel3.setText(s);
               M.setVisible(true);
               dispose();
               
           }
          
           
           else{
               JOptionPane.showMessageDialog(null, "Username and Email is not correct");
           }
           rs.close();
           pst.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }
                                            

    }//GEN-LAST:event_LoginBtnActionPerformed

    private void UsetxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsetxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsetxtFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Insert i=new Insert();
        i.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       MathPlay m=new MathPlay();
       m.setVisible(true);
       dispose();
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
            java.util.logging.Logger.getLogger(SQl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SQl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SQl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SQl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SQl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBtn;
    public javax.swing.JTextField UsetxtField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}