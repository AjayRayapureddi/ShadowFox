#AjayRayapureddi
INVENTORY MANAGEMENT SYATEM
----------------------------
This project is a simple Java-based Inventory Management System application with a graphical user interface (GUI) created using Swing. The system allows users to manage an inventory of items by adding, updating, and deleting entries.

Project Structure:
------------------
The project contains two main Java files:

  1. InventoryManagementSystem.java: Manages the main GUI and inventory operations.
  2. Item.java: Defines the Item class, representing each inventory item with properties such as name, quantity, and price.
     
Features and Functionality :
----------------------------
1. InventoryManagementSystem.java

This class creates a windowed application for managing inventory items. The main features include:

  -> Add Item:     Allows the user to add a new item by specifying its name, 
                   quantity, and price.
  -> Update Item:   Enables the user to modify details of a selected item.
  -> Delete Item:   Allows the user to delete a selected item from the 
                    inventory.
  -> Table Display: Displays a list of items in a table format, with columns 
                    for item name, quantity, and price.
Key Components:
---------------
-> Table: Displays all items in the inventory, using JTable and DefaultTableModel.
-> Input Fields: Text fields for entering item name, quantity, and price.
-> Buttons:
    *Add button to add a new item.
    *Update button to save changes to an existing item.
    *Delete button to remove an item.
    
2. Item.java
This class defines the Item class, which models individual items in the inventory. It includes properties for:

  -> Name: Name of the item.
  -> Quantity: Quantity of the item.
  -> Price: Price of the item.
Each property has getter and setter methods, which use PropertyChangeSupport to notify listeners of any changes, allowing for future expandability of the system if tracking changes becomes necessary.

How to Run the Project:
-----------------------
1. Compile both Item.java and InventoryManagementSystem.java.
2. Run the InventoryManagementSystem to launch the GUI.
