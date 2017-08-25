package Buffered;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test1 {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream in = new FileInputStream("Tulips.jpg");
		
//		FileOutputStream out = new FileOutputStream("Tulips1.jpg");
		
		int data ;
		long start = System.nanoTime();
		while(( data = in.read()) != - 1) {
//			System.out.println(data);
		}
		long end = System.nanoTime();
		long time = ( end - start ) / 1000000 ;
		
		System.out.println( time );
	}

}
