/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CustomerController;
import java.io.InputStream;
import pos.database.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Customer;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Ronila
 */
public class customerForm extends javax.swing.JFrame {

    DefaultTableModel dtm;

    /**
     * Creates new form customerForm
     */
    public customerForm() throws Exception {
        initComponents();
        dtm = (DefaultTableModel) tblcustomer.getModel();
        loadAllCustomers();
        txtcustID.requestFocus();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField7 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcustLastName = new javax.swing.JTextField();
        txtcustFirstName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcustID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtcustAddress = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcustomer = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btncustRegister = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtcustSalery = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jTextField7.setText("jTextField7");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(218, 255, 218));

        jPanel2.setBackground(new java.awt.Color(253, 253, 228));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ronila\\Downloads\\User Male_50px.png")); // NOI18N
        jLabel1.setText("Customer Management");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        txtcustLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcustLastNameActionPerformed(evt);
            }
        });

        txtcustFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcustFirstNameActionPerformed(evt);
            }
        });

        jLabel4.setText("Customer ID");

        txtcustID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcustIDActionPerformed(evt);
            }
        });

        jLabel8.setText("Address");

        txtcustAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcustAddressActionPerformed(evt);
            }
        });

        tblcustomer.setFont(new java.awt.Font("Tempus Sans ITC", 0, 13)); // NOI18N
        tblcustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "First Name", "Last Name", "Address", "Salery"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblcustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblcustomer);

        btncustRegister.setText("Regiser");
        btncustRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncustRegisterMouseClicked(evt);
            }
        });
        btncustRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncustRegisterActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btncustRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btncustRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnUpdate)
                .addGap(33, 33, 33)
                .addComponent(btnDelete)
                .addGap(36, 36, 36)
                .addComponent(jButton2)
                .addGap(27, 27, 27))
        );

        jLabel5.setText("Salery");

        txtcustSalery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcustSaleryActionPerformed(evt);
            }
        });

        jButton1.setText("-");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtcustLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcustFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcustID, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcustAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtcustSalery, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(413, 413, 413)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcustID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcustFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcustLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcustAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcustSalery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
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

    private void txtcustFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcustFirstNameActionPerformed
        txtcustLastName.requestFocus(); // TODO add your handling code here:
    }//GEN-LAST:event_txtcustFirstNameActionPerformed

    private void txtcustLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcustLastNameActionPerformed
        // TODO add your handling code here:
        txtcustAddress.requestFocus();
    }//GEN-LAST:event_txtcustLastNameActionPerformed

    private void txtcustIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcustIDActionPerformed
        String custID = txtcustID.getText();
        txtcustFirstName.requestFocus();
        removeText();
        txtcustID.setText(custID);
        try {
            Customer searchCustomer = CustomerController.searchCustomer(custID);

            txtcustID.setText(searchCustomer.getId());
            txtcustFirstName.setText(searchCustomer.getfName());
            txtcustLastName.setText(searchCustomer.getlNmae());
            txtcustAddress.setText(searchCustomer.getAddress());
            txtcustSalery.setText(searchCustomer.getSalary() + "");

            InputStream is = this.getClass().getResourceAsStream("/reports/Customer.jasper");
            Connection connection = DBConnection.getInstance().getConnection();
            HashMap map = new HashMap();
            map.put("CustomerID", txtcustID.getText());

            JasperPrint print = JasperFillManager.fillReport(is, map, connection);
            JasperViewer.viewReport(print, false);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(customerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(customerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {

        } catch (Exception ex) {
            Logger.getLogger(customerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtcustIDActionPerformed

    private void btncustRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncustRegisterActionPerformed
        try {
            String customerID = txtcustID.getText();

            if (Pattern.compile("^(c)[-]{1}[0-9]{3,}$").matcher(customerID).matches()) {
                String customerFirstName = txtcustFirstName.getText();
                if (Pattern.compile("^[A-z]{4,}$").matcher(customerFirstName).matches()) {
                    String customerLastName = txtcustLastName.getText();
                    if (Pattern.compile("^[A-z]{4,}$").matcher(customerLastName).matches()) {
                        String customerAddress = txtcustAddress.getText();
                        if (Pattern.compile("^[A-z]{2,10}$").matcher(customerAddress).matches()) {
                            double customerSalary = Double.parseDouble(txtcustSalery.getText());
                            if (Pattern.compile("^[0-9]{0,}[.]?[0-9]{1,2}$").matcher(Double.toString(customerSalary)).matches()) {
                                Customer temp = new Customer(customerID, customerFirstName, customerLastName, customerAddress, customerSalary);

                                boolean AddCustomer = CustomerController.addCustomer(temp);

                                if (AddCustomer) {
                                    loadAllCustomers();
                                    JOptionPane.showMessageDialog(rootPane, "Done", "Done", JOptionPane.INFORMATION_MESSAGE);
                                    removeText();
                                    txtcustID.requestFocus();

                                } else {
                                    JOptionPane.showMessageDialog(rootPane, "Not Done", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            } else {
                                txtcustSalery.requestFocus();
                                JOptionPane.showMessageDialog(this, "Invalid Salary Format", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            txtcustAddress.requestFocus();
                            JOptionPane.showMessageDialog(this, "Invalid Address Format", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        txtcustLastName.requestFocus();
                        JOptionPane.showMessageDialog(this, "Invalid UserName2 Format", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    txtcustFirstName.requestFocus();
                    JOptionPane.showMessageDialog(this, "Invalid UserName1 Format", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                txtcustID.requestFocus();
                JOptionPane.showMessageDialog(this, "Invalid ID Format", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage() + " to Salary", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(customerForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btncustRegisterActionPerformed

    private void txtcustAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcustAddressActionPerformed
        txtcustSalery.requestFocus();
    }//GEN-LAST:event_txtcustAddressActionPerformed

    private void txtcustSaleryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcustSaleryActionPerformed
        // TODO add your handling code here:
        btncustRegister.requestFocus();
    }//GEN-LAST:event_txtcustSaleryActionPerformed

    private void tblcustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcustomerMouseClicked
        // TODO add your handling code here

        int selectedRow = tblcustomer.getSelectedRow();

        String custID = dtm.getValueAt(selectedRow, 0).toString();
        String custFirstName = dtm.getValueAt(selectedRow, 1).toString();
        String custLastName = dtm.getValueAt(selectedRow, 2).toString();
        String custAddress = dtm.getValueAt(selectedRow, 3).toString();
        String custSalery = dtm.getValueAt(selectedRow, 4).toString();

        txtcustID.setText(custID);
        txtcustFirstName.setText(custFirstName);
        txtcustLastName.setText(custLastName);
        txtcustAddress.setText(custAddress);
        txtcustSalery.setText(custSalery);


    }//GEN-LAST:event_tblcustomerMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            int selectedRow = tblcustomer.getSelectedRow();
            dtm.removeRow(selectedRow);

        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "You cannot remove more");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btncustRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncustRegisterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btncustRegisterMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            // TODO add your handling code here:
            String custID = txtcustID.getText();

            boolean UpdateCustomer = CustomerController.removeCustomer(custID);

            if (UpdateCustomer) {
                loadAllCustomers();
                JOptionPane.showMessageDialog(rootPane, "Done", "Done", JOptionPane.INFORMATION_MESSAGE);
                removeText();
                txtcustID.requestFocus();

            } else {
                JOptionPane.showMessageDialog(rootPane, "Not Done", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(customerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(customerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(customerForm.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try {
            String customerID = txtcustID.getText();
            String customerFirstName = txtcustFirstName.getText();
            String customerLastName = txtcustLastName.getText();
            String customerAddress = txtcustAddress.getText();
            double customerSalery = Double.parseDouble(txtcustSalery.getText());

            Customer temp = new Customer(customerID, customerFirstName, customerLastName, customerAddress, customerSalery);
            boolean UpdateCustomer = CustomerController.updateCustomer(temp);

            if (UpdateCustomer) {
                loadAllCustomers();
                JOptionPane.showMessageDialog(this, "Customer is Updated ...!", "Done", JOptionPane.INFORMATION_MESSAGE);
                removeText();
                txtcustID.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "Customer is not Updated ...!", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(customerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(customerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(customerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            InputStream is = this.getClass().getResourceAsStream("/reports/Sql_Reports.jasper");
            Connection connection = DBConnection.getInstance().getConnection();
            JasperPrint print = JasperFillManager.fillReport(is, null, connection);
            JasperViewer.viewReport(print, false);

            InputStream is2 = this.getClass().getResourceAsStream("/reports/Salary_Chart.jasper");
            JasperPrint print2 = JasperFillManager.fillReport(is2, null, connection);
            JasperViewer.viewReport(print2, false);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(customerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(customerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(customerForm.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(customerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new customerForm().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(customerForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btncustRegister;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTable tblcustomer;
    private javax.swing.JTextField txtcustAddress;
    private javax.swing.JTextField txtcustFirstName;
    private javax.swing.JTextField txtcustID;
    private javax.swing.JTextField txtcustLastName;
    private javax.swing.JTextField txtcustSalery;
    // End of variables declaration//GEN-END:variables

    private void loadAllCustomers() throws Exception {

        try {
            // TODO add your handling code here:

            dtm.setRowCount(0);
            ArrayList<Customer> loadAll = CustomerController.loadAllCustomer();
            for (Customer customer : loadAll) {
                Object[] row = {customer.getId(), customer.getfName(), customer.getlNmae(), customer.getAddress(), customer.getSalary()};
                dtm.addRow(row);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(customerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(customerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void removeText() {
        txtcustID.setText("");
        txtcustFirstName.setText("");
        txtcustLastName.setText("");
        txtcustAddress.setText("");
        txtcustSalery.setText("");
    }

}
