import java.io.*;
public class FileInputerStream {
	private static FileInputStream fileInputStream;

	public static void main(String [] args) throws IOException{
		    String s1 = "‎⁨Macintosh HD⁩ : ⁨Users⁩ \\ ⁨jiangjun⁩ \\ ⁨Desktop⁩\\test.txt";
		    //String s2 = "test2.txt";
		    
		    File f0 = new File(s1);
		    File f = new File("‎⁨Macintosh HD⁩ : ⁨Users⁩ \\ ⁨jiangjun⁩ \\ ⁨Desktop⁩\\test.txt");
		
			f.createNewFile();
			//f0.createNewFile();
			
			fileInputStream = new FileInputStream(f0);
			System.out.println(fileInputStream.read());
			
			System.out.print("\n");
			
		
			FileOutputStream fos = new FileOutputStream(f);
			fos.write(12);
			fos.flush();
			fos.close();
			
			FileReader fr = new FileReader(new File("‎⁨Macintosh HD⁩ : ⁨Users⁩ \\ ⁨jiangjun⁩ \\ ⁨Desktop⁩\\test.txt"));
		    for(int i = 0 ; i <=5000; i++){
		    	System.out.println(fr.read());
		    	
		    }
		    fr.close();
		    
			FileInputStream fis = new FileInputStream(f);
			System.out.print(fis.read());
			fis.close();
			
			FileWriter fw = new FileWriter(new File("‎⁨Macintosh HD⁩ : ⁨Users⁩ \\ ⁨jiangjun⁩ \\ ⁨Desktop⁩\\test.txt"));
			for(int i = 0 ; i <= 5000; i++){
				fw.write(i);
			}
			fw.flush();
		    fw.close();
		    
		    
	}
}
