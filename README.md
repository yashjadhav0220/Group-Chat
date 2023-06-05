The project is a simple chat application consisting of a server and multiple clients. The server acts as a central hub where clients can connect and exchange messages with each other. The clients establish a connection to the server and can send and receive messages in a group chat setting.

The server is implemented using the Server class, which listens for incoming client connections on a specified port. Once a client connects, the server creates a ClientHandler instance to handle that client. Each ClientHandler runs in a separate thread, allowing multiple clients to interact with the server concurrently.

The ClientHandler class handles the individual clients. It maintains a list of all active client handlers and broadcasts messages received from one client to all other connected clients. It also manages the disconnection of clients and notifies the remaining clients when a client leaves the chat.

The client-side is represented by the Client class. It establishes a connection to the server and allows the user to send messages to the server. It also listens for incoming messages from the server and displays them on the client's console.

Overall, the project provides a basic foundation for a multi-client chat application. It demonstrates socket programming, multi-threading, and message broadcasting between clients connected to a central server.
