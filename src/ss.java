
public class ss {

//	public static void main(String[] args) {
//		FileInputStream in;
//		try {
//			in = new FileInputStream(new File("e:\\1.txt"));
//			boolean flag = uploadFile.uploadFile("101.201.235.99", 21, "yinheng", "198708", "/root", "22.txt", in);
//			System.out.println(flag);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	public static void main(String[] args) {
		boolean flag = uploadFile.downFile("101.201.235.99", 21, "yinheng", "198708", "/home/yinheng", "22.txt", "e:\\");
		System.out.println(flag);
	}
}
