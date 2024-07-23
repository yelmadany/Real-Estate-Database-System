/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cmp320project;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Yo200
 */
public class ChangeOwner extends javax.swing.JFrame {
    JDBCConnection con = new JDBCConnection();
    ResultSet rs;
    ResultSet rsowner;

    int owner_id;
    /**
     * Creates new form ChangeOwner
     */
    public ChangeOwner() {
        initComponents();
        
        lblDateError.setVisible(false);
                 this.setLocationRelativeTo(null);
        try
        {
        rs = con.executeStatement("SELECT property_id, p_name, DATE_OWNERSHIP, owner_id FROM property p, OWNED_BY o,owner where p.property_id = o.property_property_id and owner_id = Owner_owner_id and owner_id != 300000001");    
        rsowner = con.executeStatement("SELECT OWNER_ID FROM OWNER");
               owner_id_combobox.removeAllItems();
            while (rsowner.next()) {
                owner_id_combobox.addItem(rsowner.getString("OWNER_ID"));                
            }
        rs.first();
        populateFields();
        }
        catch (SQLException ex) {
            Logger.getLogger(EditOwner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPrevious = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        owner_id_combobox = new javax.swing.JComboBox<>();
        lblName1 = new javax.swing.JLabel();
        lblDateError = new javax.swing.JLabel();
        property_id_1 = new javax.swing.JLabel();
        lblEditAgent = new javax.swing.JLabel();
        p_name_1 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblSalary = new javax.swing.JLabel();
        p_DO = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnPrevious.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPrevious.setText("<< Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNext.setText("Next >>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        owner_id_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        owner_id_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                owner_id_comboboxActionPerformed(evt);
            }
        });

        lblName1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblName1.setText("Property Name: ");

        lblDateError.setForeground(new java.awt.Color(255, 0, 0));
        lblDateError.setText("Incorrect Date!");

        property_id_1.setText("jLabel1");

        lblEditAgent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEditAgent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEditAgent.setText("Change Owner");
        lblEditAgent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        p_name_1.setText("jLabel2");

        lblID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblID.setText("Property ID: ");

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblName.setText("Property Date Ownership: ");

        lblSalary.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSalary.setText("Owner ID:");

        p_DO.setEditable(false);
        p_DO.setText("jTextField1");
        p_DO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_DOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(owner_id_combobox, 0, 205, Short.MAX_VALUE)
                                    .addComponent(property_id_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(p_name_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(p_DO, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnPrevious)
                        .addGap(82, 82, 82)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnNext))
                    .addComponent(lblDateError, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEditAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblEditAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(property_id_1))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p_name_1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p_DO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblDateError))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSalary)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(owner_id_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnPrevious)
                                    .addComponent(btnNext))
                                .addGap(39, 39, 39))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUpdate)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        MovePrevious();
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        int n = JOptionPane.showOptionDialog(new JFrame(), "Are you sure you would like to continue?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Yes", "No"}, JOptionPane.YES_OPTION);
        if(n==JOptionPane.YES_OPTION)
        {
            try {
                // make the result set scrolable forward/backward updatable
                //            statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

                if (isValidData()) {
                    String prepSQL = "UPDATE OWNED_BY SET OWNER_OWNER_ID = " + owner_id_combobox.getSelectedItem() +" WHERE property_property_id = " + property_id_1.getText().trim();

                    int result = con.executePrepared(prepSQL);
                    if (result > 0) {

                        javax.swing.JLabel label = new javax.swing.JLabel("Change owner updated successfully.");
                        label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                        JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                       
                        rs = con.executeStatement("SELECT property_id, p_name, DATE_OWNERSHIP, owner_id FROM property p, OWNED_BY o,owner where p.property_id = o.property_property_id and owner_id = Owner_owner_id and owner_id != 300000001");
                        rs.first();
                        populateFields();

                    } else {
                        javax.swing.JLabel label = new javax.swing.JLabel("Please fix validation errors...");
                        label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                        JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);

                    }
                }

                else
                {
                    System.out.print("");  // to do nothing and close the JOptionPane
                }

            }

            catch (SQLException e2) {
            javax.swing.JLabel label = new javax.swing.JLabel("SQL Error - " + e2.getMessage());
            label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
            JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);

            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        MoveNext();
    }//GEN-LAST:event_btnNextActionPerformed

    private void owner_id_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_owner_id_comboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_owner_id_comboboxActionPerformed

    private void p_DOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_DOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_DOActionPerformed
    boolean isValidData()
    {
              
        return true;
        //boolean result = true;

       
        
    }
    
    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
    
    
    private void populateFields() {
        try {
            
            property_id_1.setText(rs.getString("property_id"));
            p_name_1.setText(rs.getString("p_name"));
            p_DO.setText(rs.getString("DATE_OWNERSHIP"));
            owner_id_combobox.setSelectedItem(rs.getString("OWNER_ID"));
            
            EnableDisableButtons();
        } catch (SQLException ex) {
            Logger.getLogger(EditOwner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void MovePrevious() {
        try {
            // TODO add your handling code here:
            if (!rs.isFirst()) {
                rs.previous();
                populateFields();
            }
        } catch (SQLException ex) {
            Logger.getLogger(EditOwner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void MoveNext() {
        try {
            // TODO add your handling code here:
            if (!rs.isLast()) {
                rs.next();
                populateFields();
            }
        } catch (SQLException ex) {
            Logger.getLogger(EditOwner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void EnableDisableButtons() {
        try {
            if (rs.isFirst()) {
                btnPrevious.setEnabled(false);
            } else {
                btnPrevious.setEnabled(true);
            }
            if (rs.isLast()) {
                btnNext.setEnabled(false);
            } else {
                btnNext.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EditOwner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblDateError;
    private javax.swing.JLabel lblEditAgent;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JComboBox<String> owner_id_combobox;
    private javax.swing.JTextField p_DO;
    private javax.swing.JLabel p_name_1;
    private javax.swing.JLabel property_id_1;
    // End of variables declaration//GEN-END:variables
}
