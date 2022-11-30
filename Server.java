import java.io.IOException;
import java.net.*;
import java.util.Scanner;
public class Server{
    private ServerSocket serverSocket;
    public Server(ServerSocket serverSocket){
        this.serverSocket= serverSocket;
    }
    public void startServer(){
        try{
            while(!serverSocket.isClosed()){
                Socket socket = serverSocket.accept();
                System.out.println("A new client is online and connected");
                ClientHandler clienthandler= new ClientHandler(socket);

                Thread thread= new Thread(clienthandler);
                thread.start();

            }
        }catch(IOException e){
            
        }
    }
    public void closeServer(){
        try{
            if (serverSocket!=null){
                serverSocket.close();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args)throws IOException{
        ServerSocket serverSocket = new ServerSocket(1234);
        Server server= new Server(serverSocket);
        server.startServer();
    }
}