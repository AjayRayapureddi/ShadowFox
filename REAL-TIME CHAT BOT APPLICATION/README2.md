REAL-TIME CHAT APPLICATION WITH JAVA SOCKET PROGRAMMING :
----------------------------------------------------------------------------------------------------------------
This project is a real-time chat application developed in Java using socket programming. It allows multiple users to join chat rooms, send messages, and receive instant updates. The application is designed for learning purposes, covering networking fundamentals, Java socket programming, and real-time communication techniques.

Project Overview:
-------------------------
This real-time chat application allows users to connect to a server and communicate with each other in a chatroom environment. The server manages client connections and broadcasts messages sent by each user to all other connected users.

Key Learning Areas:
----------------------------
	* Java Socket Programming
	* Networking Fundamentals
	* Real-Time Communication
	* Multithreading in Java

Features:
------------
	-> Multiple User Support: Multiple clients can join and leave the chat.
	-> Broadcast Messaging: Messages from one client are instantly broadcast to all other 						 clients.
	-> Instant Updates: Messages are sent and received in real-time.

Technologies Used:
---------------------------
	* Java
	* Java Socket Programming (ServerSocket and Socket classes)
	* Multithreading (Thread class for handling multiple clients)

Requirements:
--------------------
	* Java Development Kit (JDK) 11 or higher
	* Visual Studio Code with Java extensions (recommended)
	* Basic knowledge of Java programming and networking fundamentals

Setup and Installation: 
------------------------------
1. Clone the repository or download the source code to your local machine.
2. Open the project folder in Visual Studio Code.

Directory Structure:
---------------------------
The project contains the following files:

1. Server.java: Main server file that handles client connections and broadcasts messages.
2. Client.java: Main client file allowing a user to connect to the server and send messages.
3. ChatMessage.java: Helper class that defines the message format and allows for structured 				    communication between the server and clients.

Running the Application:
----------------------------------
1. Compile the Server, Client, and ChatMessage Files:

	* In VSCode, open "Server.java", Client.java, and ChatMessage.java, by running the 		    command:
				javac Server.java Client.java ChatMessage.java

2. Start the Server:
	* In the terminal, navigate to the project directory and start the server using: java Server
	* The server will start and listen on the specified port for client connections.

3. Start the Client(s):
	* Open another terminal, navigate to the same project directory, and start a client using: 				java Client
	* You can open multiple clients to simulate a multi-user environment.

4. Start Chatting:
	* Once connected, type messages in the client terminals. Messages will be broadcast to all 	   other clients in real-time.

Project Structure:
------------------------
│
├── Server.java         # Server file to handle multiple client connections
├── Client.java         # Client file to connect to the server
├── ChatMessage.java    # Message format class for structured communication
└── README.md           # Project documentation

Conclusion:
----------------
This Real-Time Chat Application is a foundational project demonstrating how to set up real-time communication in Java. It introduces socket programming, client-server communication, and multithreading concepts—essential for many real-world applications.
