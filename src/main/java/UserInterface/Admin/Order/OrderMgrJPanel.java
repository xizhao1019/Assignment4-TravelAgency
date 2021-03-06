/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Admin.Order;

import Business.Order.Order;
import Business.User.Account;
import Business.User.Admin;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zhaoxi
 */
public class OrderMgrJPanel extends javax.swing.JPanel {
    private JPanel rightJPanel;
    private Admin admin;
    /**
     * Creates new form OrderMgrJPanel
     */
    public OrderMgrJPanel(JPanel rightJPanel, Admin admin) {
        initComponents();
        this.rightJPanel = rightJPanel;
        this.admin = admin;
        
        populateTable();
    }
    
    public void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel)orderTable.getModel();
        model.setRowCount(0);
        for (Account account : admin.getAccountDir().getAccountDir()) {
            for (Order order : account.getOrderList().getOrderList()) {
            Object row[] = new Object[13];
            row[0] = order;
            row[1] = order.getAccount().getUserName();
            row[2] = order.getPassenger().getFirstName();
            row[3] = order.getPassenger().getLastName();
            row[4] = order.getPassenger().getId();
            row[5] = order.getFlight().getAirliner().getAirlinerName();
            row[6] = order.getFlight().getFrom();           
            row[7] = order.getFlight().getTo();
            row[8] = order.getFlight().getDepartureDate();
            row[9] = order.getFlight().getDepartureTime();
            row[10] = order.getPassenger().getSeat().getSeat();
            row[11] = order.getFlight().getPrice();
            row[12] = order.getOrderDate();        
                    
            model.addRow(row);
            }
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

        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        btnViewDetail = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order No.", "User Name", "First Name", "Last Name", "ID Number", "Airliner", "From", "To", "Date", "Departure", "Seat", "Price", "Order Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderTable);
        if (orderTable.getColumnModel().getColumnCount() > 0) {
            orderTable.getColumnModel().getColumn(0).setResizable(false);
            orderTable.getColumnModel().getColumn(0).setPreferredWidth(70);
            orderTable.getColumnModel().getColumn(1).setResizable(false);
            orderTable.getColumnModel().getColumn(1).setPreferredWidth(70);
            orderTable.getColumnModel().getColumn(2).setResizable(false);
            orderTable.getColumnModel().getColumn(2).setPreferredWidth(70);
            orderTable.getColumnModel().getColumn(3).setResizable(false);
            orderTable.getColumnModel().getColumn(3).setPreferredWidth(70);
            orderTable.getColumnModel().getColumn(4).setResizable(false);
            orderTable.getColumnModel().getColumn(4).setPreferredWidth(70);
            orderTable.getColumnModel().getColumn(5).setResizable(false);
            orderTable.getColumnModel().getColumn(5).setPreferredWidth(50);
            orderTable.getColumnModel().getColumn(6).setResizable(false);
            orderTable.getColumnModel().getColumn(6).setPreferredWidth(70);
            orderTable.getColumnModel().getColumn(7).setResizable(false);
            orderTable.getColumnModel().getColumn(7).setPreferredWidth(70);
            orderTable.getColumnModel().getColumn(8).setResizable(false);
            orderTable.getColumnModel().getColumn(8).setPreferredWidth(100);
            orderTable.getColumnModel().getColumn(9).setResizable(false);
            orderTable.getColumnModel().getColumn(9).setPreferredWidth(70);
            orderTable.getColumnModel().getColumn(10).setResizable(false);
            orderTable.getColumnModel().getColumn(10).setPreferredWidth(50);
            orderTable.getColumnModel().getColumn(11).setResizable(false);
            orderTable.getColumnModel().getColumn(11).setPreferredWidth(70);
            orderTable.getColumnModel().getColumn(12).setResizable(false);
            orderTable.getColumnModel().getColumn(12).setPreferredWidth(130);
        }

        btnViewDetail.setText("View Detail");
        btnViewDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Customer Orders");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(457, 457, 457)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(500, 500, 500)
                        .addComponent(btnViewDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewDetail)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        rightJPanel.remove(this);
        layout.previous(rightJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailActionPerformed
        // TODO add your handling code here:
        int row = orderTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Order order = (Order)orderTable.getValueAt(row, 0);
        
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        rightJPanel.add(new AdminOrderdetailJPanel(rightJPanel, order));
        layout.next(rightJPanel);
    }//GEN-LAST:event_btnViewDetailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewDetail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderTable;
    // End of variables declaration//GEN-END:variables
}
