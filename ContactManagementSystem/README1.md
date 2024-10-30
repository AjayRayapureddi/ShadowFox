SIMPLE CONTACT MANAGEMENT SYSTEM
--------------------------------------------------------------------

A simple command-line Contact Management System in Java that allows users to perform CRUD operations: Add, View, Update, and Delete contacts. This application uses basic data validation to ensure correct formatting of phone numbers and email addresses.


 Features:
-------------
	* Add, View, Update, and Delete contacts directly from the command line.
	* Validates that:
  		- Phone numbers contain exactly 10 digits.
 		- Email addresses end with `@gmail.com` for format consistency.
	* Store contacts in-memory using an ArrayList, with no need for a database.

Setup Instructions: Requirements:
---------------------------------------------
	1. Java JDK: Ensure Java Development Kit (JDK) is installed. You can download it from [Oracle’s official website](https://www.oracle.com/java/technologies/javase-downloads.html).
	2. Visual Studio Code: Download and install VS Code from [here](https://code.visualstudio.com/).
	3. Java Extension Pack: Install the Java Extension Pack in VS Code for easier Java development.

 Steps to Run the Project:
-----------------------------------
1. Open VS Code and navigate to the folder containing the files.
2. In VS Code, open the terminal and compile the Java file:
   ```bash
   	javac ContactManagementSystem.java
3. After compilation, run the program with:
	java ContactManagementSystem

Usage:
---------
Once the program is running, you’ll see a menu with the following options:

	*Add Contact - Add a new contact with name, phone number, and email.
	*View Contacts - Display all stored contacts.
	*Update Contact - Modify an existing contact's details.
	*Delete Contact - Remove a contact by its list index.
	*Exit - Close the application.

Examples:
--------------
-> Adding a Contact
	Choose 1. Add Contact from the menu.
			#Enter the contact’s name, phone number (10 digits only), and email (ending 			with @gmail.com).
-> Viewing Contacts
	Choose 2. View Contacts from the menu.
			#The program displays all current contacts, each with a name, phone number, 			and email.
-> Updating a Contact:
	Choose 3. Update Contact.
			 #Select the contact number to update.
			 #You can modify any field, or leave it blank to retain the original information.
-> Deleting a Contact
	Choose 4. Delete Contact.
			#Enter the contact number to remove it permanently from the list.

Code Structure:
---------------------
-> Main Components:
	*Contact Class: Defines the structure of a contact, including name, phone number, and 				  email.
	*ContactManagementSystem Class: Contains the main program loop, user input handling,  								   and CRUD operations.
	*Validation Methods:
			->  isValidPhoneNumber(String phoneNumber): Ensures a phone number 				     contains exactly 10 digits.
			->  isValidEmail(String email): Ensures email addresses end with @gmail.com.

Key Methods:
-------------------
	-> addContact(): Adds a new contact with validation.
	-> viewContacts(): Displays all contacts.
	-> updateContact(): Updates an existing contact's details, with the option to skip 	>					 unchanged fields.
	-> deleteContact(): Deletes a contact by index.

Future Enhancements:
-------------------------------
	* Save contacts to a file for persistence across sessions.
	* Additional email and phone number formats.
	* Enhanced search functionality to locate contacts quickly.
	* More flexible email domain validation.

License:
------------
This project is open-source and free to use for educational purpose
