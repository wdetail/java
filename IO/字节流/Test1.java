package �ֽ���;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.commons.lang3.ArrayUtils;

public class Test1 {
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("io.txt");
		
		InputStream in = new FileInputStream(file);
		
//		int first = in.read();
//		System.out.println("first Element : " + first );
		
		System.out.println("in.available() : " + in.available());
		
//		System.out.println("������ȡ--------------------------");
//		
//		for (int i = 0; i <= in.available() + 5 ; i++) {
//			System.out.println(in.read() );
//		}
		
		
		//����ȡ��� ���� byte[]
//		byte[] datas = new byte[in.available()];
//		in.read(datas);
//		
//		System.out.println(ArrayUtils.toString(datas));
//		
//		
//		String str = new String(datas , "utf-8");
//		System.out.println(str);
		
		
		//��������  �ڶ�ȡ
		in.skip(1);
		System.out.println(in.read());
		
	}

}
