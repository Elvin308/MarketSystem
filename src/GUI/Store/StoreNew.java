/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Store;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Elvin
 */
public class StoreNew extends javax.swing.JInternalFrame {
int count =0;
int number = 0;
    /**
     * Creates new form StoreNew
     */
    public StoreNew() {
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

        jLabel1 = new javax.swing.JLabel();
        NewStoreID = new javax.swing.JTextField();
        NewStoreAdd = new javax.swing.JButton();
        NewStoreCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Store Addition");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Store ID:");

        NewStoreID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NewStoreIDKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NewStoreIDKeyTyped(evt);
            }
        });

        NewStoreAdd.setText("Add");
        NewStoreAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewStoreAddActionPerformed(evt);
            }
        });

        NewStoreCancel.setText("Cancel");
        NewStoreCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewStoreCancelActionPerformed(evt);
            }
        });

        jLabel2.setText(count + " Added");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addComponent(NewStoreID, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(NewStoreAdd)
                        .addGap(82, 82, 82)
                        .addComponent(NewStoreCancel)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NewStoreID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewStoreAdd)
                    .addComponent(NewStoreCancel)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewStoreCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewStoreCancelActionPerformed
        // TODO add your handling code here:
        NewStoreID.setText("");
        this.dispose();
        count = 0;
    }//GEN-LAST:event_NewStoreCancelActionPerformed

    private void NewStoreAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewStoreAddActionPerformed
        // TODO add your handling code here:
       
       try
       {
        number = Integer.parseInt(NewStoreID.getText());
        Connection con = DriverManager.getConnection(Database.Database.databaseInfo, Database.Database.databaseUsername, Database.Database.databasePassword);
        Statement sqlStatement = con.createStatement();
        sqlStatement.executeUpdate("INSERT INTO Market.Store (Id) VALUES (" + NewStoreID.getText()+")");
        sqlStatement.close();
        count++;
        }
       catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Needs to be an Integer", "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException sqlEx)
        {
            JOptionPane.showMessageDialog(null, sqlEx.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
       NewStoreID.setText("");
       jLabel2.setText(count + " Added");
    }//GEN-LAST:event_NewStoreAddActionPerformed

    private void NewStoreIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NewStoreIDKeyPressed
    }//GEN-LAST:event_NewStoreIDKeyPressed

    private void NewStoreIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NewStoreIDKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_NewStoreIDKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NewStoreAdd;
    private javax.swing.JButton NewStoreCancel;
    private javax.swing.JTextField NewStoreID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
