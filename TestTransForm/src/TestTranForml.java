import java.io.*;
public class TestTranForml {
	public static void main(String [] args) {
		try{
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Tomi:\\User\\jiangjun\\test.txt"));
		osw.write("jiang FileOutputStream");
		System.out.println(osw.getEncoding());
		osw.close();
		
		osw = new OutputStreamWriter(new FileOutputStream("Tomi:\\User\\jiangjun\\test.txt",true),"ISO8859_1");
		osw.write("Tomi:\\User\\jiangjun\\test.txt");
		System.out.println(osw.getEncoding());
		osw.flush();
		osw.close();
		
		}catch(IOException ae){
			ae.printStackTrace();
			System.out.println("The file not exist");
		}
		
		try{
		InputStreamReader isr = new InputStreamReader(new FileInputStream("Tomi:\\User\\jiangjun\\test.txt"));
		BufferedReader br = new BufferedReader(isr);
		System.out.println(br.readLine());
		br.close();
		}catch(IOException ae){
			ae.printStackTrace();
			System.out.println("can not find the file");
		}
	}
}
 