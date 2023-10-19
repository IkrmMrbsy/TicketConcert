/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ticketconcert;

import java.awt.Color;
import java.awt.Cursor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class Ticket extends javax.swing.JFrame {
    Koneksi k = new Koneksi();
    private PreparedStatement stat;
    private ResultSet rs;
    private String phoneNumbers, ticketClasses, passcode; 
    private DefaultTableModel model;
    
    public static String nickname, balance;

    /**
     * Creates new form Dashboard
     */
    public Ticket() {
        initComponents();
        
        k.connect();
        
        buyTicketLink.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        searchBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        ticketSearch.setBackground(Color.white);
        
        refreshTable("");
    }
    
    public void refreshTable(String ticketClass) {
        model = new DefaultTableModel();
        ticketTable.setModel(model);
        
        model.addColumn("Phone numbers");
        model.addColumn("Class");
        model.addColumn("Passcode");
        
        if(ticketClass.equals("")) {
            try {
                this.stat = k.getCon().prepareStatement("SELECT numbers_phone, class, "
                        + "passcode FROM transaction WHERE numbers_phone='"
                        + UpdateProfile.phoneNumbers + "';");
                this.rs = this.stat.executeQuery();
                while(rs.next()) {
                    Object[] data = {
                        phoneNumbers = rs.getString("numbers_phone"),
                        ticketClasses = rs.getString("class"),
                        passcode = rs.getString("passcode"),
                    };
                
                    model.addRow(data);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            try {
                this.stat = k.getCon().prepareStatement("SELECT numbers_phone, class, "
                        + "passcode FROM transaction WHERE numbers_phone='"
                        + UpdateProfile.phoneNumbers + "' AND class='"
                        + ticketClass + "';");
                this.rs = this.stat.executeQuery();
                while(rs.next()) {
                    Object[] data = {
                        phoneNumbers = rs.getString("numbers_phone"),
                        ticketClasses = rs.getString("class"),
                        passcode = rs.getString("passcode"),
                    };
                
                    model.addRow(data);
                }
                } catch (Exception e) {
                    System.out.println(e);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ticketLabel = new javax.swing.JLabel();
        regLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ticketTable = new javax.swing.JTable();
        ticketSearch = new javax.swing.JComboBox<>();
        buyTicketLink = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        ticketLabel.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        ticketLabel.setForeground(new java.awt.Color(0, 102, 153));
        ticketLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ticketLabel.setText("YOUR TICKET");

        regLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        regLabel1.setForeground(new java.awt.Color(0, 102, 153));
        regLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        ticketTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ticketTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Phone Numbers", "Class", "Passcode"
            }
        ));
        ticketTable.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(ticketTable);

        ticketSearch.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ticketSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VVIP", "VIP", "Reguler" }));

        buyTicketLink.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buyTicketLink.setForeground(new java.awt.Color(0, 102, 153));
        buyTicketLink.setText("<< Buy Ticket");
        buyTicketLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buyTicketLinkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buyTicketLinkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buyTicketLinkMouseExited(evt);
            }
        });

        searchBtn.setBackground(new java.awt.Color(0, 102, 153));
        searchBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Search");
        searchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(buyTicketLink, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(regLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ticketLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(ticketSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(buyTicketLink)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regLabel1)
                .addGap(26, 26, 26)
                .addComponent(ticketLabel)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ticketSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 400, 440);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buyTicketLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyTicketLinkMouseClicked
        // TODO add your handling code here:
        ChooseTicket choose = new ChooseTicket();
        
        choose.setNickname(nickname);
        choose.setBalance(Integer.parseInt(balance));
        choose.setVisible(true);
        choose.setLocationRelativeTo(null);

        this.setVisible(false);
    }//GEN-LAST:event_buyTicketLinkMouseClicked

    private void buyTicketLinkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyTicketLinkMouseEntered
        // TODO add your handling code here:
        buyTicketLink.setForeground(new Color(105, 105, 105));
    }//GEN-LAST:event_buyTicketLinkMouseEntered

    private void buyTicketLinkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyTicketLinkMouseExited
        // TODO add your handling code here:
        buyTicketLink.setForeground(new Color(0,102,153));
    }//GEN-LAST:event_buyTicketLinkMouseExited

    private void searchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseClicked
        // TODO add your handling code here:
        refreshTable(ticketSearch.getSelectedItem().toString());
    }//GEN-LAST:event_searchBtnMouseClicked

    private void searchBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBtnMouseEntered

    private void searchBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBtnMouseExited

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
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ticket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buyTicketLink;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel regLabel1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel ticketLabel;
    private javax.swing.JComboBox<String> ticketSearch;
    private javax.swing.JTable ticketTable;
    // End of variables declaration//GEN-END:variables
}
