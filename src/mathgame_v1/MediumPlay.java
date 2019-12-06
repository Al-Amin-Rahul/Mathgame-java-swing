/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathgame_v1;

import javax.swing.JOptionPane;

/**
 *
 * @author rahul
 */
public class MediumPlay extends javax.swing.JFrame {
  int actualAnswer,a,b,Answer,right,wrong;
  static int choice;
  long startTime,endTime,totalTime;
  String summary="";
    public MediumPlay() {
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

        MediumPlayBtn = new javax.swing.JButton();
        MediumBackBtn = new javax.swing.JButton();
        AnswerField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        QuesField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NextBtn = new javax.swing.JButton();
        SubmitBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MediumPlayBtn.setBackground(new java.awt.Color(51, 51, 51));
        MediumPlayBtn.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        MediumPlayBtn.setText("Play");
        MediumPlayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MediumPlayBtnActionPerformed(evt);
            }
        });
        getContentPane().add(MediumPlayBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 80, 30));

        MediumBackBtn.setBackground(new java.awt.Color(51, 51, 51));
        MediumBackBtn.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        MediumBackBtn.setText("Back");
        MediumBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MediumBackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(MediumBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, 30));

        AnswerField.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        getContentPane().add(AnswerField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 120, 40));

        jLabel1.setFont(new java.awt.Font("Tekton Pro Ext", 1, 24)); // NOI18N
        jLabel1.setText("What Is");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 100, 40));

        QuesField.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        getContentPane().add(QuesField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 120, 40));

        jLabel2.setFont(new java.awt.Font("Tekton Pro Ext", 1, 24)); // NOI18N
        jLabel2.setText("Answer");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 100, 40));

        jLabel3.setFont(new java.awt.Font("Tekton Pro Ext", 1, 24)); // NOI18N
        jLabel3.setText("??");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        NextBtn.setBackground(new java.awt.Color(51, 51, 51));
        NextBtn.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        NextBtn.setText("Question");
        NextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextBtnActionPerformed(evt);
            }
        });
        getContentPane().add(NextBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 120, 30));

        SubmitBtn.setBackground(new java.awt.Color(51, 51, 51));
        SubmitBtn.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SubmitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 110, 30));

        jLabel4.setFont(new java.awt.Font("Tekton Pro Ext", 2, 18)); // NOI18N
        jLabel4.setText("M");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 20));

        jLabel5.setFont(new java.awt.Font("Tekton Pro Ext", 1, 14)); // NOI18N
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 10, 60, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathgame_v1/profile.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MediumBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MediumBackBtnActionPerformed
    
             MathStart M=new MathStart();
             String s=jLabel5.getText();
             M.jLabel1.setText(s);
             M.setVisible(true);
             dispose();
         
    }//GEN-LAST:event_MediumBackBtnActionPerformed

    private void NextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextBtnActionPerformed
           AnswerField.setText("");
           a=(int)(Math.random()*20);
           b=(int)(Math.random()*20);
           
        if(a==0||b==0){
            a+=2;
            b+=2;
        }  
             QuesField.setText(" "+a+"+"+b);
             actualAnswer=a+b;
             
       
        
    }//GEN-LAST:event_NextBtnActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        Summery h=new Summery();
       Answer=Integer.parseInt(AnswerField.getText());
       summary = summary+"\n" +a+ " + " +b+ " = " +Answer+ " it was " +(Answer == actualAnswer);   
       if(Answer==actualAnswer){
           JOptionPane.showMessageDialog(null,"Correct");
           right++;
       }
       else if(Answer != actualAnswer){
           JOptionPane.showMessageDialog(null,"Wrong");
           wrong++;
       }
       if(choice== right+wrong){
            NextBtn.setVisible(false);
            QuesField.setText("");
            AnswerField.setText("");
            SubmitBtn.setVisible(false);
            //jButton1.setVisible(true);
            dispose();
            h.setVisible(true);
            endTime = System.currentTimeMillis();
            totalTime = endTime - startTime;
            String s=jLabel5.getText();
            h.jLabel1.setText(s);
            h.jTextField1.setText(""+right+"");
            h.jTextField2.setText(""+totalTime/1000+ " s");
            h.jTextArea1.append("Summary \n"+summary);
}
    
      
    }//GEN-LAST:event_SubmitBtnActionPerformed

    private void MediumPlayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MediumPlayBtnActionPerformed
        //MediumPlayBtn.setVisible(false);
      // QuesField.setText(" "+a+"*"+b);
        startTime=System.currentTimeMillis();
        MediumPlayBtn.setVisible(false);
        choice=Integer.parseInt(JOptionPane.showInputDialog("How Many Question Do You Want"));
    }//GEN-LAST:event_MediumPlayBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MediumPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MediumPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MediumPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MediumPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MediumPlay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnswerField;
    private javax.swing.JButton MediumBackBtn;
    private javax.swing.JButton MediumPlayBtn;
    private javax.swing.JButton NextBtn;
    private javax.swing.JTextField QuesField;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
