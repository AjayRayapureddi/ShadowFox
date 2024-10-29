import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class InventoryManagementSystem extends JFrame {
    private JTable table;
    private DefaultTableModel model;
    private JTextField nameInput, quantityInput, priceInput;
    private int selectedRow = -1; // Track the selected row for updating

    public InventoryManagementSystem() {
        setTitle("Inventory Management System");
        setSize(750, 500); // Set the size of the window to 750x500 pixels
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window on the screen

        // Table setup
        model = new DefaultTableModel(new String[]{"Item Name", "Quantity", "Price"}, 0);
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        // Input fields
        nameInput = new JTextField(10);
        quantityInput = new JTextField(5);
        priceInput = new JTextField(5);

        // Buttons
        JButton addButton = new JButton("Add");
        JButton updateButton = new JButton("Update");
        JButton deleteButton = new JButton("Delete");

        // Button actions
        addButton.addActionListener(e -> addItem());
        updateButton.addActionListener(e -> prepareForUpdate());
        deleteButton.addActionListener(e -> deleteItem());

        // Layout setup
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Item Name:"));
        inputPanel.add(nameInput);
        inputPanel.add(new JLabel("Quantity:"));
        inputPanel.add(quantityInput);
        inputPanel.add(new JLabel("Price:"));
        inputPanel.add(priceInput);
        inputPanel.add(addButton);
        inputPanel.add(updateButton);
        inputPanel.add(deleteButton);

        // Add components to the frame
        add(scrollPane, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.SOUTH);

        // Event to populate input fields when row is selected
        table.getSelectionModel().addListSelectionListener(e -> populateFieldsForUpdate());
    }

    // Methods for adding, preparing for updating, and deleting items
    private void addItem() {
        String name = nameInput.getText();
        String quantity = quantityInput.getText();
        String price = priceInput.getText();
        if (!name.isEmpty() && !quantity.isEmpty() && !price.isEmpty()) {
            model.addRow(new Object[]{name, Integer.parseInt(quantity), Double.parseDouble(price)});
            clearInputs();
        } else {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.");
        }
    }

    private void prepareForUpdate() {
        if (selectedRow != -1) {
            String name = nameInput.getText();
            String quantity = quantityInput.getText();
            String price = priceInput.getText();
            if (!name.isEmpty() && !quantity.isEmpty() && !price.isEmpty()) {
                // Update the selected row with new values
                model.setValueAt(name, selectedRow, 0);
                model.setValueAt(Integer.parseInt(quantity), selectedRow, 1);
                model.setValueAt(Double.parseDouble(price), selectedRow, 2);
                clearInputs();
                JOptionPane.showMessageDialog(this, "Item updated successfully.");
                selectedRow = -1; // Reset the selected row after update
            } else {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select an item to update.");
        }
    }

    private void deleteItem() {
        int rowToDelete = table.getSelectedRow();
        if (rowToDelete != -1) {
            model.removeRow(rowToDelete);
            clearInputs();
            selectedRow = -1; // Reset selected row after deletion
        } else {
            JOptionPane.showMessageDialog(this, "Please select an item to delete.");
        }
    }

    private void populateFieldsForUpdate() {
        selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            nameInput.setText(model.getValueAt(selectedRow, 0).toString());
            quantityInput.setText(model.getValueAt(selectedRow, 1).toString());
            priceInput.setText(model.getValueAt(selectedRow, 2).toString());
        }
    }

    private void clearInputs() {
        nameInput.setText("");
        quantityInput.setText("");
        priceInput.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InventoryManagementSystem ims = new InventoryManagementSystem();
            ims.setVisible(true);
        });
    }
}
