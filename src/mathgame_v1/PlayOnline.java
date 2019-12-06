
package mathgame_v1;

import java.util.Random;
import javax.swing.JOptionPane;



/**
 *
 * @author rahul
 */
public class PlayOnline extends javax.swing.JFrame {
    int actualAnswer,a,b,a2,b2,right,wrong,rand;
    double actualAnswer2,g1,g;
    long startTime,endTime,totalTime;
    String summary,r;
      
       
    public PlayOnline() {
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

        OnlinePlayBtn = new javax.swing.JButton();
        OnlineBackBtn = new javax.swing.JButton();
        AnswerField = new javax.swing.JTextField();
        OnlineSubmitBtn = new javax.swing.JButton();
        QuestionField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NextBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OnlinePlayBtn.setBackground(new java.awt.Color(0, 0, 0));
        OnlinePlayBtn.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        OnlinePlayBtn.setText("Play");
        OnlinePlayBtn.setBorder(null);
        OnlinePlayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnlinePlayBtnActionPerformed(evt);
            }
        });
        getContentPane().add(OnlinePlayBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 80, 30));

        OnlineBackBtn.setBackground(new java.awt.Color(0, 0, 0));
        OnlineBackBtn.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        OnlineBackBtn.setText("Back");
        OnlineBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnlineBackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(OnlineBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 80, 30));

        AnswerField.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        AnswerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerFieldActionPerformed(evt);
            }
        });
        getContentPane().add(AnswerField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 140, 40));

        OnlineSubmitBtn.setBackground(new java.awt.Color(51, 51, 51));
        OnlineSubmitBtn.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        OnlineSubmitBtn.setText("Submit");
        OnlineSubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnlineSubmitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(OnlineSubmitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, 30));

        QuestionField.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        QuestionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuestionFieldActionPerformed(evt);
            }
        });
        getContentPane().add(QuestionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 140, 40));

        jLabel1.setFont(new java.awt.Font("Tekton Pro Ext", 1, 24)); // NOI18N
        jLabel1.setText("What Is");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 40));

        jLabel2.setFont(new java.awt.Font("Tekton Pro Ext", 1, 24)); // NOI18N
        jLabel2.setText("??");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 40, 30));

        NextBtn.setBackground(new java.awt.Color(51, 51, 51));
        NextBtn.setFont(new java.awt.Font("Tekton Pro Ext", 1, 18)); // NOI18N
        NextBtn.setText("Question");
        NextBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        NextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextBtnActionPerformed(evt);
            }
        });
        getContentPane().add(NextBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 100, 30));

        jLabel3.setFont(new java.awt.Font("Tekton Pro Ext", 1, 24)); // NOI18N
        jLabel3.setText("Answer");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mathgame_v1/profile.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OnlineBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnlineBackBtnActionPerformed
         int c=JOptionPane.showConfirmDialog(null,"Are You Sure","Warning",JOptionPane.YES_NO_OPTION);
         if(c==JOptionPane.YES_OPTION){
             MathPlay M=new MathPlay();
             M.setVisible(true);
             dispose();
         }
         else{
             return;
         } 
    }//GEN-LAST:event_OnlineBackBtnActionPerformed

    private void AnswerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnswerFieldActionPerformed

    private void OnlinePlayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnlinePlayBtnActionPerformed
          startTime=System.currentTimeMillis();
          OnlinePlayBtn.setVisible(false);
         
    }//GEN-LAST:event_OnlinePlayBtnActionPerformed

    private void OnlineSubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnlineSubmitBtnActionPerformed
         g=Double.parseDouble(AnswerField.getText());
         g1=Double.parseDouble(AnswerField.getText());
         
          switch(rand){
            case 0:
              summary = summary +"\n" +a+ " *+ " +b+ " = " +g+ " it was " +(g == actualAnswer);
             
                break;
            case 1:
            summary = summary +"\n" +a+ " + " +b+ " = " +g+ " it was " +(g== actualAnswer);
            
                break;
            case 2:
            summary = summary +"\n" +a+ " - " +b+ " = " +g+ " it was " +(g == actualAnswer);
             
                break;
            
            case 3:
                 summary = summary +"\n" +a2+ " / " +b2+ " = " +g1+ " it was " +(g1 ==actualAnswer2);
                break;
               }
            
    
       if(g==actualAnswer||g1==actualAnswer2){
           JOptionPane.showMessageDialog(null,"Correct");
           right++;
       }
       else if(g!=actualAnswer||g1==actualAnswer2){
           JOptionPane.showMessageDialog(null,"Wrong");
           wrong++;
           endTime = System.currentTimeMillis();
           totalTime = endTime - startTime;
           Summery h=new Summery();
           h.setVisible(true);
          
           h.jTextField1.setText(""+right);
           h.jTextField3.setText(""+wrong);
           //String r=Integer.toString(right);
           h.jTextField2.setText(""+totalTime/1000);
           h.jTextArea1.append("Summary\n"+summary);
           dispose();
       }
                        
    }//GEN-LAST:event_OnlineSubmitBtnActionPerformed

    private void NextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextBtnActionPerformed
        AnswerField.setText("");
           a=(int)(Math.random()*35);
           b=(int)(Math.random()*35);
        //Scanner input=new Scanner(System.in);
        if(a==0||a==1||b==0||b==1){
            a+=2;
            b+=2;
        }  
             rand=(int)(Math.random()*4);
          switch(rand){
            case 0:
             QuestionField.setText(" "+a+"*"+b);
             actualAnswer=a*b;
             
                break;
            case 1:
             QuestionField.setText(" "+a+"+"+b);
             actualAnswer=a+b;
            
                break;
            case 2:
            QuestionField.setText(" "+a+"-"+b);
             
             actualAnswer=a-b;
             
                break;
            
            case 3:
                 if(b>a){
                      int temp=a;
                     a=b;
                      b=temp;
               
                 }
                  QuestionField.setText(" "+a+"/"+b);
                  actualAnswer2=(double)a/b;
                  
                 actualAnswer2=Math.floor(actualAnswer2 *100)/100;
                break;
               
            
        }
      
           
    
        
    }//GEN-LAST:event_NextBtnActionPerformed

    private void QuestionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuestionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuestionFieldActionPerformed

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
            java.util.logging.Logger.getLogger(PlayOnline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayOnline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayOnline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayOnline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayOnline().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnswerField;
    private javax.swing.JButton NextBtn;
    private javax.swing.JButton OnlineBackBtn;
    private javax.swing.JButton OnlinePlayBtn;
    private javax.swing.JButton OnlineSubmitBtn;
    private javax.swing.JTextField QuestionField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
