/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reports;

import java.io.IOException;
import java.util.Scanner;                       
import java.io.FileNotFoundException;           
import java.lang.SecurityException;             
import java.nio.file.Paths;                     
import java.io.IOException;                     
import javax.swing.*; 
import java.util.InputMismatchException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Elvin
 */
public class PurchasesReport extends javax.swing.JDialog {
private static Formatter PurchasesSummarizedReport, PurchasesDetailedReport;
    /**
     * Creates new form PurchasesReport
     */
    public PurchasesReport(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Purchase Report");
        setResizable(false);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("It is suggested that you create either a Summarized Report or Detailed Report before selecting any of the views. If you don't create a Summarized Report or Detailed Report, the view will only show outdated information from the last time it was updated.");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("~Create~");

        jLabel2.setText("~View~");

        jButton1.setText("Summarized");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Detailed");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Both");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Summarized");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Detailed");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Close");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel1)
                        .addGap(177, 177, 177)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int row =1;
        String[] dob;
        try
        {            
           PurchasesSummarizedReport = new Formatter("PurchasesSummarizedReport.txt");
           PurchasesSummarizedReport.format("******Summarized Report*****%n%n");
           
           try(Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Market", "Marte", "Marte13");
                Statement sqlStatement = con.createStatement();
                ResultSet sqlResult = sqlStatement.executeQuery("SELECT COUNT(Id) AS Total FROM Market.Sales"))
                {

                    while(sqlResult.next())
                        PurchasesSummarizedReport.format("Total number of sales: "+sqlResult.getString(1));


                }
                catch(SQLException sqlEx)
                {
                    JOptionPane.showMessageDialog(null, sqlEx.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                }    
           
           PurchasesSummarizedReport.format("%nID:%n");
            try(Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Market", "Marte", "Marte13");
                Statement sqlStatement = con.createStatement();
                ResultSet sqlResult = sqlStatement.executeQuery("SELECT Id, Purchase_Date FROM Market.Sales ORDER BY Id"))
                {

                    while(sqlResult.next())
                    {
                        PurchasesSummarizedReport.format(row + ") "+sqlResult.getString(1) + "    ");
                        dob = sqlResult.getString(2).split("-");
                        PurchasesSummarizedReport.format(dob[1]+"-"+dob[2]+"-"+dob[0]+ "%n");
                        row++;
                    }


                }
                catch(SQLException sqlEx)
                {
                    JOptionPane.showMessageDialog(null, sqlEx.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                }    
                
           PurchasesSummarizedReport.flush();
           PurchasesSummarizedReport.close();
           jTextArea1.setText("Summarized report has been created.");
        }
        catch(FileNotFoundException fileEx)
        {
            JOptionPane.showMessageDialog(null, "Error opening file.", "Error", JOptionPane.ERROR_MESSAGE);
            this.dispose();
        }
        catch(SecurityException securityEX)
        {
            JOptionPane.showMessageDialog(null, "Writing permission denied", "Error", JOptionPane.ERROR_MESSAGE);
            this.dispose();
        }
        catch(FormatterClosedException formatterEx)
        {
            JOptionPane.showMessageDialog(null, "Error writing to file.", "Error", JOptionPane.ERROR_MESSAGE);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton1.doClick();
        jButton2.doClick();
        jTextArea1.setText("Both Summarized and Detailed Reports have been created.");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
        Runtime rt=Runtime.getRuntime();
        String path = Paths.get(".").toAbsolutePath().normalize().toString();
        String file=path+"\\PurchasesSummarizedReport.txt";
        Process p=rt.exec("Notepad " + file);
        }
        catch(IOException ex)
        {
            jTextArea1.setText("There was an error opening the file.");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         try{
        Runtime rt=Runtime.getRuntime();
        String path = Paths.get(".").toAbsolutePath().normalize().toString();
        String file=path+"\\PurchasesDetailedReport.txt";
        Process p=rt.exec("Notepad " + file);
        }
        catch(IOException ex)
        {
            jTextArea1.setText("There was an error opening the file.");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int row =1;
        String[] dob;
        try
        {            
           PurchasesSummarizedReport = new Formatter("PurchasesDetailedReport.txt");
           PurchasesSummarizedReport.format("******Detailed Report*****%n%n");
           
           try(Connection con = DriverManager.getConnection(Database.Database.databaseInfo, Database.Database.databaseUsername, Database.Database.databasePassword);
                Statement sqlStatement = con.createStatement();
                ResultSet sqlResult = sqlStatement.executeQuery("SELECT * FROM Market.Sales ORDER BY Id"))
                {

                    while(sqlResult.next())
                    {
                        PurchasesSummarizedReport.format(row+")"+sqlResult.getString(1)+ "%n");
                        PurchasesSummarizedReport.format("Store ID: "+sqlResult.getString(2)+ "%n");
                        PurchasesSummarizedReport.format("Member ID: "+sqlResult.getString(3)+ "%n");
                        PurchasesSummarizedReport.format("Part Number: "+sqlResult.getString(4)+ "%n");
                        dob = sqlResult.getString(5).split("-");
                        PurchasesSummarizedReport.format("Purchase Date: "+dob[1]+"-"+dob[2]+"-"+dob[0]+ "%n");
                        PurchasesSummarizedReport.format("Quantity: "+sqlResult.getString(6)+ "%n");
                        PurchasesSummarizedReport.format("Price: $"+sqlResult.getString(7)+ "%n%n");
                        row++;
                    }


                }
                catch(SQLException sqlEx)
                {
                    JOptionPane.showMessageDialog(null, sqlEx.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                }    
           
             
                
           PurchasesSummarizedReport.flush();
           PurchasesSummarizedReport.close();
           jTextArea1.setText("Summarized report has been created.");
        }
        catch(FileNotFoundException fileEx)
        {
            JOptionPane.showMessageDialog(null, "Error opening file.", "Error", JOptionPane.ERROR_MESSAGE);
            this.dispose();
        }
        catch(SecurityException securityEX)
        {
            JOptionPane.showMessageDialog(null, "Writing permission denied", "Error", JOptionPane.ERROR_MESSAGE);
            this.dispose();
        }
        catch(FormatterClosedException formatterEx)
        {
            JOptionPane.showMessageDialog(null, "Error writing to file.", "Error", JOptionPane.ERROR_MESSAGE);
            this.dispose();
        }
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
            java.util.logging.Logger.getLogger(PurchasesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchasesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchasesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchasesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PurchasesReport dialog = new PurchasesReport(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
