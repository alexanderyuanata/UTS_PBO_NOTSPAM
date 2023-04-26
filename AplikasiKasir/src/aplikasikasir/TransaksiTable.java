/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasikasir;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author nicho
 */
public class TransaksiTable {
    public static void main(String[] args) {
        // Establish database connection
        String url = "jdbc:mysql://localhost:3306/transaksi";
        String user = "root";
        String password = "";
        String query = "SELECT * FROM transaksi";
        
        try ( Connection conn = DriverManager.getConnection(url, user, password);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query)) {
            // Create table model with data from ResultSet
            JTable table = new JTable(new ResultSetTableModel(rs));
            // Add table to scroll pane for scrolling
            JScrollPane scrollPane = new JScrollPane(table);
            // Show the scroll pane in a JOptionPane
            JOptionPane.showMessageDialog(null, scrollPane, "Database Table", JOptionPane.PLAIN_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
