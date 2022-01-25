import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class RightPanel extends JPanel{
    public static DefaultTableModel model;
    RightPanel(){
        // Set panel characteristics
        this.setBackground(Color.red);
        this.setBounds(400,0,500,400);

        // Delete button
        JButton deleteButton = new JButton("Deletar");
        deleteButton.setBounds(10,400,100,20);
        this.add(deleteButton);

        // Table
        model = new DefaultTableModel();
        JTable orderTable = new JTable(model);
        model.addColumn("Sabor1");
        model.addColumn("Sabor2");
        model.addColumn("Sabor3");
        model.addColumn("Sabor4");
        model.addColumn("Borda");
        model.addColumn("Refri");

        // Delete button action
        deleteButton.addActionListener(e -> {
            model.removeRow(orderTable.getSelectedRow());
        });

        // Create and set scroll pane
        JScrollPane orderScroll = new JScrollPane(orderTable);
        this.add(orderScroll);
    }

    // Add row to table
    public static void addRowInTable(Object[] obj){
        model.addRow(obj);
    }

    // Remove row from table
    public static void removeRowInTable(int ind){
        model.removeRow(ind);
    }

    // Get row count in table
    public static int getRowCountt(){
        int count = model.getRowCount();
        return count;
    }

    // Resets table
    public static void setN(){
        model.setRowCount(0);
    }

    // Get single row
    public static Object getSingleRow(int row, int col){
        Object cell = model.getValueAt(row, col);
        return cell;
    }
}