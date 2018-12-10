import java.net.*;
import java.io.*;
public class TestTCPServer {
	public static void main(String [] arg){
		try{
			ServerSocket ss  = new ServerSocket(666);
			while(true){
			Socket socket = ss.accept();
		    DataInputStream dis = new DataInputStream(socket.getInputStream());
		    DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		    dos.writeUTF("hello, this message is for servece " + socket.getInetAddress());
			System.out.println(dis.readUTF());
		    socket.close();
			}
		
		}catch(Exception ae){
			ae.printStackTrace();
			
		}
	}
}
