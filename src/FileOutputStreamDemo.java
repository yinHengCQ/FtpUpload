import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {		
		try {
			FileOutputStream out= new FileOutputStream("e:\\1.txt");
			StringBuffer sb=new StringBuffer();
			for (int i = 0; i < 1000000; i++) {
				sb.append("helloworld");
			}
			out.write(sb.toString().getBytes("utf-8"));
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
