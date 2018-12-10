import java.net.*;
import java.io.*;
public class TestTCPClient  {
	public static void main(String [] args) throws Exception{
		Socket s = new Socket("127.0.0.1",666);
		//OutputStream os = s.getOutputStream();
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		dos.writeUTF("thhis message is from my client ");
		DataInputStream dis = new DataInputStream(s.getInputStream());
		System.out.println(dis.readUTF());
		
		dos.flush();
		s.close();
		
	}

}
