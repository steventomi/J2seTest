import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String [] args){
		File f1 = new File("‎⁨Macintosh HD⁩ : ⁨Users⁩ \\ ⁨jiangjun⁩ \\ ⁨Desktop⁩\\test.docx");
		File f2 = new File("Macintosh HD⁩ : ⁨Users⁩ \\ ⁨jiangjun⁩ \\ ⁨Desktop⁩","test.txt");
		File f3 = new File("‎⁨Macintosh HD" + File.separator + "abc");
		//上面三种是 文件类的构造方法 下面会写他的一些内部实现方法
		//separator是file的一个属性 
		try{
		System.out.println(f1.createNewFile());
		//public boolean createNewFile(); 指定文件不存在并且成功创建了 返回true 指定文件存在 返回 false
		System.out.print(f3.mkdir());
		System.out.println(f2.getAbsoluteFile());
		//获取这个文件的绝对路径 public File getAbsoluteFile(){}; same as  new File(this.getAbsolutePath());
		System.out.println(f2.getName());
		//获取该文件名称
		System.out.println( f2.getParent());
		//放回磁路精明父目录的路径名字符串，要是此路径名没有指定父目录则返回null
		System.out.println("The length of this file is : " +f1.length());
		
		//下面的这些方法 是判断文件状态 那么文件有哪些状态呢 
		/*是否为空  是不是个文件 是不是个路径  是不是隐藏的 
		 * 能不能读  能不能写 是都存在
		 * 
		 */
		System.out.println(f3.canExecute());
		System.out.println("Is this file existed? " + f1.exists());
		//
		System.out.println("Is this a directory include of this path: "+ f1.isDirectory());
		//测试次抽象路径是否表示一个目录 要求该路径存在且 表示一个目录 是就true 否就是false
		
		//删除文件
		Boolean b = f1.delete();
		//public boolean delete();删除抽象路径表示的目录或者文件 如果是一个目录 则该目录必须为空才能删 成功删除 返回true
		System.out.println(b);
		
		f1.deleteOnExit();
		System.out.println(f1.toString());
		System.out.println(f1);//调用了上面方法
		//https://blog.csdn.net/QuinnNorris/article/details/71521793 参考
		
		File.listRoots();
		
		}catch(IOException ae){
			ae.printStackTrace();
		}
	}
}
