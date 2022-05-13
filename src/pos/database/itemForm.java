/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ronila
 */
public class itemForm extends javax.swing.JFrame {

    /**
     * Creates new form itemForm
     */
    DefaultTableModel dtm;
    public itemForm() {
        initComponents();
        dtm=(DefaultTableModel) tblItem.getModel();
        loadAllItems();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("Item Manager");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(40, 40, 40))
        );

        jLabel2.setText("Item Code");

        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });

        jLabel3.setText("Description");

        txtDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescActionPerformed(evt);
            }
        });

        jLabel4.setText("Quantity");

        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });

        jLabel5.setText("Unit Price");

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Description", "Quantity", "Unit Price"
            }
        ));
        tblItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblItem);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(txtCode)
                            .addComponent(txtDesc)
                            .addComponent(txtQty, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(txtPrice))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescActionPerformed
        // TODO add your handling code here:
            txtQty.requestFocus();

    }//GEN-LAST:event_txtDescActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
            btnAdd.requestFocus();

    }//GEN-LAST:event_txtPriceActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
         try {
        String code = txtCode.getText();
        String desc = txtDesc.getText();
        int qty = Integer.parseInt(txtQty.getText());
        double price =Double.parseDouble(txtPrice.getText()) ;
        
        
        
        Connection connection = DBConnection.getInstance().getConnection();
        
        String sql="update item set desc=?,qty=?,price=? where code=?";
        
        
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, desc);
        pstm.setObject(2, qty);
        pstm.setObject(3, price);
        pstm.setObject(4, code);
       
        
        int i = pstm.executeUpdate();
        
        
        if (i>0) {
            loadAllItems();
            JOptionPane.showMessageDialog(this, "Item is Updated ...!", "Done", JOptionPane.INFORMATION_MESSAGE);
            removeText();
        }else{
            JOptionPane.showMessageDialog(this, "Item is not Updated ...!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(customerForm.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(customerForm.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
         String code = txtCode.getText();
        txtDesc.requestFocus();
        removeText();
        txtCode.setText(code);
        try {
        Connection connection = DBConnection.getInstance().getConnection();
        
            String sql = "select * from item where code=?";
            
            PreparedStatement pstm = connection.prepareStatement(sql);
//            String custID = txtcustID.getText();
            pstm.setObject(1, code);
            ResultSet rst = pstm.executeQuery();
            
            while(rst.next()){
            txtCode.setText(rst.getString(1));
            txtDesc.setText(rst.getString(2));
            txtQty.setText(rst.getString(3));
            txtPrice.setText(rst.getString(4));
           
            }
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(customerForm.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(customerForm.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_txtCodeActionPerformed

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        // TODO add your handling code here:
        txtPrice.requestFocus();

    }//GEN-LAST:event_txtQtyActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            // TODO add your handling code here:
            Connection connection = DBConnection.getInstance().getConnection();
           
            String sql = "insert into item values(?,?,?,?)";
            
            
            PreparedStatement pstm = connection.prepareStatement(sql);
            
            pstm.setObject(1, txtCode.getText());
            pstm.setObject(2, txtDesc.getText());
            pstm.setObject(3, Integer.parseInt(txtQty.getText()));
            pstm.setObject(4, Double.parseDouble(txtPrice.getText()));
            
            int i = pstm.executeUpdate();
            
            if (i>0) {
                loadAllItems();
                JOptionPane.showMessageDialog(this, "Item is Added","Done",JOptionPane.INFORMATION_MESSAGE);
                removeText();
            }else{
                JOptionPane.showMessageDialog(this, "Item is not Added","Done",JOptionPane.ERROR_MESSAGE);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(itemForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Warning",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        try {
        // TODO add your handling code here:
        Connection connection = DBConnection.getInstance().getConnection();
        String code = txtCode.getText();
        String sql="delete from item where custID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, code);
        pstm.executeUpdate();
        
    
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(customerForm.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(customerForm.class.getName()).log(Level.SEVERE, null, ex);
    }
    loadAllItems();
  
    
    removeText();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void tblItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblItem.getSelectedRow();
     
    String code = dtm.getValueAt(selectedRow, 0).toString();
    String desc = dtm.getValueAt(selectedRow, 1).toString();
    String qty = dtm.getValueAt(selectedRow, 2).toString();
    String price = dtm.getValueAt(selectedRow, 3).toString();
   

    
    txtCode.setText(code);
    txtDesc.setText(desc);
    txtQty.setText(qty);
    txtPrice.setText(price);
    
    }//GEN-LAST:event_tblItemMouseClicked

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
            java.util.logging.Logger.getLogger(itemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(itemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(itemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(itemForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new itemForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblItem;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables

    private void loadAllItems() {
       try {
        // TODO add your handling code here:
        Connection connection = DBConnection.getInstance().getConnection();
        String sql="select * from item";
        PreparedStatement pstm = connection.prepareStatement(sql);
        ResultSet rst = pstm.executeQuery();
        dtm.setRowCount(0);
        while(rst.next()){
            
            
            Object [] row={rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4)};
            dtm.addRow(row);
        }
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(customerForm.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(customerForm.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }
    
    private void removeText() {
        
        txtCode.setText("");
        txtDesc.setText("");
        txtPrice.setText("");
        txtQty.setText("");
        
    }
}
