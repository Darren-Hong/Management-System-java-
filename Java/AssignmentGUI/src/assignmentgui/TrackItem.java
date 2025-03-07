package assignmentgui;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author HONG
 */
public class TrackItem extends javax.swing.JFrame {

    private String userType;

    /**
     * Creates new form TrackItem
     */
    public TrackItem() {
        initComponents();
        showitem("Itemstore.txt");
        jComboBox1.setEnabled(false);
        jComboBox2.setEnabled(false);
        jComboBox3.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ttable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 0));

        Ttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item Code", "Quantity", "Data "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Ttable);

        jButton1.setText("Quantity < 25");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ascending Order");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Track Item :");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Track by Item Code");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Track by date");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "HC", "FS", "MS", "GL", "GW", "SC" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "start-Date", "2024-9-15", "2024-9-21", "2024-9-26", "2024-10-01" , "2024-10-06", "2024-10-11"}));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "end-Date", "2024-9-20", "2024-9-25", "2024-9-30", "2024-10-05", "2024-10-10","2024-10-15" }));

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(271, 100));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Track Item");
        jLabel6.setPreferredSize(new java.awt.Dimension(124, 32));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Select Item Code :");

        jLabel3.setText("Start Date :");

        jLabel4.setText("End Date :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jRadioButton1)
                                                    .addComponent(jRadioButton2)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton1)))))
                                .addGap(62, 62, 62))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(jButton3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jRadioButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(54, 54, 54))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if (jRadioButton2.isSelected()) {
            jComboBox2.setEnabled(true);
            jComboBox1.setEnabled(false);
            jComboBox3.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            // Create a list to store item data
            List<Item> itemList = new ArrayList<>();

            // Read the file
            BufferedReader reader = new BufferedReader(new FileReader("Itemstore.txt"));
            String line;

            String itemCode = "", quantity = "", date = "";
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Item Code: ")) {
                    itemCode = line.substring(11).trim();
                } else if (line.startsWith("Quantity: ")) {
                    quantity = line.substring(10).trim();
                } else if (line.startsWith("Date: ")) {
                    date = line.substring(6).trim();
                }

                // When a complete item entry is read, add it to the list
                if (!itemCode.isEmpty() && !quantity.isEmpty() && !date.isEmpty()) {
                    itemList.add(new Item(itemCode, Integer.parseInt(quantity), date));
                    itemCode = "";
                    quantity = "";
                    date = "";
                }
            }
            reader.close();

            // Sort the items by item code in ascending order
            Collections.sort(itemList, Comparator.comparing(Item::getItemCode));

            // Clear the table before updating
            DefaultTableModel model = (DefaultTableModel) Ttable.getModel();
            model.setRowCount(0);

            // Add sorted items to the table
            for (Item item : itemList) {
                model.addRow(new Object[]{item.getItemCode(), item.getQuantity(), item.getDate()});
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

// Class to represent each item
    class Item {

        private String itemCode;
        private int quantity;
        private String date;

        public Item(String itemCode, int quantity, String date) {
            this.itemCode = itemCode;
            this.quantity = quantity;
            this.date = date;
        }

        public String getItemCode() {
            return itemCode;
        }

        public int getQuantity() {
            return quantity;
        }

        public String getDate() {
            return date;
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) Ttable.getModel();
            BufferedReader reader = new BufferedReader(new FileReader("Itemstore.txt"));
            model.setRowCount(0);
            boolean itemfound = false;
            String line;
            String code = "", quantity = "", date = "";
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Item Code:")) {
                    code = line.substring(11).trim();
                } else if (line.startsWith("Quantity: ")) {
                    quantity = line.substring(10).trim();
                } else if (line.startsWith("Date: ")) {
                    date = line.substring(6).trim();
                }
                if (!code.isEmpty() && !quantity.isEmpty() && !date.isEmpty()) {
                    int Quantity = Integer.parseInt(quantity);
                    if (Quantity < 25) {
                        model.addRow(new Object[]{code, Quantity, date});
                        itemfound = true;
                    }
                    code = "";
                    quantity = "";
                    date = "";

                }
            }
            reader.close();

            if (itemfound = false) {
                JOptionPane.showMessageDialog(null, "There are no items with quantity less than 25.");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading to file");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        Tracking item code
        DefaultTableModel model = (DefaultTableModel) Ttable.getModel();
        String itemcode = jComboBox1.getSelectedItem().toString();

        if (jRadioButton1.isSelected()) {
            ItemCodeReadFile(itemcode);

            if (jComboBox1.getSelectedItem().equals("None")) {
                JOptionPane.showMessageDialog(null, "Please select item code");
            }
        } else if (jComboBox1.getSelectedItem().equals("start-Date") && jComboBox2.getSelectedItem().equals("end-Date")) {
            JOptionPane.showMessageDialog(null, "Please select your date(Start date & End date)");
        } else if (jRadioButton2.isSelected()) {
            TrackDate();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if (jRadioButton1.isSelected()) {
            jComboBox1.setEnabled(true);
            jComboBox2.setEnabled(false);
            jComboBox3.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        Homepage home = new Homepage(userType);
        home.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * y;'
     *
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
            java.util.logging.Logger.getLogger(TrackItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrackItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrackItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrackItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrackItem().setVisible(true);
            }
        });
    }

    public void ItemCodeReadFile(String itemcode) {
        DefaultTableModel model = (DefaultTableModel) Ttable.getModel();
        try {
            BufferedReader br = new BufferedReader(new FileReader("Itemstore.txt"));
            String line;
            model.setRowCount(0);

            String code = "", quantity = "", date = "";

            while ((line = br.readLine()) != null) {
                if (line.startsWith("Item Code:")) {
                    code = line.substring(11).trim();
                } else if (line.startsWith("Quantity:")) {
                    quantity = line.substring(10).trim();
                } else if (line.startsWith("Date:")) {
                    date = line.substring(6).trim();
                }
                if (!code.isEmpty() && !quantity.isEmpty() && !date.isEmpty()) {
                    if (code.equals(itemcode)) {
                        model.addRow(new Object[]{code, quantity, date});
                        code = "";
                        quantity = "";
                        date = "";
                    }
                }

            }
            br.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading to file");

        }
    }

    public void showitem(String filename) {
        DefaultTableModel model = (DefaultTableModel) Ttable.getModel();
        try {
            BufferedReader br = new BufferedReader(new FileReader("Itemstore.txt"));
            String line;
            model.setRowCount(0);

            String code = "", quantity = "", date = "";

            while ((line = br.readLine()) != null) {
                if (line.startsWith("Item Code:")) {
                    code = line.substring(11).trim();
                } else if (line.startsWith("Quantity:")) {
                    quantity = line.substring(10).trim();
                } else if (line.startsWith("Date:")) {
                    date = line.substring(6).trim();
                }
                if (!code.isEmpty() && !quantity.isEmpty() && !date.isEmpty()) {
                    model.addRow(new Object[]{code, quantity, date});
                    code = "";
                    quantity = "";
                    date = "";
                }
            }

            br.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error reading to file");

        }
    }

    public void TrackDate() {
        DefaultTableModel model = (DefaultTableModel) Ttable.getModel();
        String startDate = jComboBox2.getSelectedItem().toString();  // Start date selected by the user
        String endDate = jComboBox3.getSelectedItem().toString();  // End date selected by the user

        if (jRadioButton2.isSelected()) {  // Check if "Track by date" is selected
            if (startDate.equals("Start Date") || endDate.equals("End Date")) {
                JOptionPane.showMessageDialog(null, "Please select both start and end dates.");
            } else {
                try {
                    BufferedReader br = new BufferedReader(new FileReader("transaction.txt"));
                    String line;
                    model.setRowCount(0);  // Clear the table before adding new rows

                    String itemCode = "", quantity = "", action = "", date = "";

                    while ((line = br.readLine()) != null) {
                        if (line.startsWith("Item Code :")) {
                            itemCode = line.substring(11).trim();
                        } else if (line.startsWith("Quantity :")) {
                            quantity = line.substring(10).trim();
                        } else if (line.startsWith("Action :")) {
                            action = line.substring(8).trim();  // Extract the action (Receive/Distribute)
                        } else if (line.startsWith("Date & Time:")) {
                            date = line.substring(12).trim();  // Extract only the date part (YYYY-MM-DD)

                            // Check if the action is "Receive" and the date is within the start and end date range
                            if (action.equals("Receive") && date.compareTo(startDate) >= 0 && date.compareTo(endDate) <= 0) {
                                // Add the matching row to the table
                                model.addRow(new Object[]{itemCode, quantity, date});
                            }

                            // Reset variables for the next entry
                            itemCode = "";
                            quantity = "";
                            action = "";
                            date = "";
                        }
                    }
                    br.close();

                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Error reading the file.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select 'Track by date'.");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Ttable;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
