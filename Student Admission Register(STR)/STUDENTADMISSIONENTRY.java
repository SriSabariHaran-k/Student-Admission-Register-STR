/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlstudentdatabase;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author k.Sri sabari Haran
 */
public class STUDENTADMISSIONENTRY extends javax.swing.JFrame {

    /**
     * Creates new form STUDENTADMISSIONENTRY
     */
    public STUDENTADMISSIONENTRY() {
        initComponents();
        ButtonGroup ob=new ButtonGroup();
        ob.add(jRadioButton1);
        ob.add(jRadioButton2);
        ob.add(jRadioButton3);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 1000));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setText("STUDENT ADMISSON ENTRY");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 510, 40);

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel2.setText("ADMISSION NO:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 70, 150, 40);

        jTextField1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(180, 70, 40, 40);

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setText("STUDENT NAME:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 130, 150, 40);

        jTextField2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(180, 140, 190, 30);

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel4.setText("COURSE:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 190, 80, 30);

        jComboBox1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ELEMENTARY", "PRIAMRY", "SSLC", "HSC" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(110, 190, 170, 30);

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel5.setText("SEX:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 240, 60, 30);

        jRadioButton1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jRadioButton1.setText("MALE");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(80, 240, 73, 33);

        jRadioButton2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jRadioButton2.setText("FEMALE");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(160, 240, 95, 33);

        jRadioButton3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jRadioButton3.setText("OTHERS");
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(260, 240, 95, 33);

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel6.setText("FATHER NAME:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 280, 140, 40);

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel7.setText("MOTHER NAME:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 340, 132, 25);

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel8.setText("ADDRESS:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 410, 100, 25);

        jTextField3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(170, 290, 210, 30);

        jTextField4.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(170, 340, 210, 30);

        jTextField5.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(100, 570, 190, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 400, 240, 130);

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel9.setText("PHONE:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 570, 70, 30);

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel10.setText("MAIL:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 610, 70, 30);

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel11.setText("DOB:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 650, 88, 25);

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel12.setText("DOJ:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 690, 44, 25);

        jTextField6.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(90, 610, 200, 30);

        jTextField7.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        getContentPane().add(jTextField7);
        jTextField7.setBounds(90, 650, 200, 30);

        jTextField8.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        getContentPane().add(jTextField8);
        jTextField8.setBounds(90, 690, 200, 30);

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jButton1.setText("S U B M I T");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(80, 770, 200, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
        String n=jTextField5.getText();
        char c[]=n.toCharArray();
        int num=0,alp=0,num1=0;
        for(int i=0;i<c.length;i++)
        {
            if(c[i]>='0' &&  c[i]<='9')
            {
                num++;
            }
            else
            {
                alp++;
            }
            if(num>0 && n.length()==10)
            {
                if(c[0]>='6' && c[0]<='9')
                {
                    num1++;
                }
            }
        }
        if(num1==0)
        {
            JOptionPane.showMessageDialog(this,"INVALID NUMBER");
        }
        else
        {
            jTextField6.requestFocus();
        }
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
        String s=jTextField6.getText();
        char c[]=s.toCharArray();
        int i,small=0,caps=0,num=0,at=0,dot=0,spcl=0;
        for(i=0;i<c.length;i++)
        {
            if(c[i]>='a' && c[i]<='z')
            {
                small++;
            }
            else if(c[i]>='A' && c[i]<='Z')
            {
                caps++;
            }
            else if(c[i]>='0' && c[i]<='9')
            {
                num++;
            }
            else if(c[i]!='@' && c[i]!='.')
            {
                spcl++;
            }
            if(c[i]=='@')
            {
                at++;
            }
            if(c[i]=='.')
            {
                dot++;
            }
        }
        int y=s.indexOf("@"),ok=0;
        String sub=s.substring(0,y);
        char g[]=sub.toCharArray();
        for(int k=0;k<g.length;k++)
        {
            if(g[k]>='a' && g[k]<='z')
            {
                ok++;
            }
        }
           if(small>0 && caps==0 && spcl==0 && at==1  && dot==1 && ok>0)
           {
               jTextField7.requestFocus();
           }
           else
           {
               JOptionPane.showMessageDialog(this,"INVALID EMAIL");
           }
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String ad=jTextField1.getText(),name=jTextField2.getText(),fname=jTextField3.getText();
        String mname=jTextField4.getText(),address=jTextArea1.getText(),ph=jTextField5.getText();
        String mail=jTextField6.getText(),dob=jTextField7.getText(),doj=jTextField8.getText();
        Object course=jComboBox1.getSelectedItem();
        String rb="";
        if(jRadioButton1.isSelected())
        {
            rb=rb+"MALE";
        }
        if(jRadioButton2.isSelected())
        {
            rb=rb+"FEMALE";
        }
        if(jRadioButton3.isSelected())
        {
            rb=rb+"OTHERS";
        }
        String rbs=rb;
        Connection con=null;
        Statement st=null;
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con=DriverManager.getConnection("jdbc:odbc:STD","","");
            st=con.createStatement();
            String ss="insert into STUDENTADISSION values('"+ad+"','"+name+"','"+course+"','"+rbs+"','"+fname+"','"+mname+"','"+address+"','"+ph+"','"+mail+"','"+dob+"','"+doj+"')";
            st.execute(ss);
            con.close();
            st.close();
            this.dispose();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(STUDENTADMISSIONENTRY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(STUDENTADMISSIONENTRY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(STUDENTADMISSIONENTRY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(STUDENTADMISSIONENTRY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new STUDENTADMISSIONENTRY().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
