package 周末;

import java.util.Scanner;

public class Zuo_7 {
	public static void main(String[]args){
		
		System.out.println("请输入任意一个数");
		int a;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		
		  if (a % 5 == 0 && a % 6 == 0) {
		         System.out.println("输入的数字" + a + "能被5和6整除");
		  }
		  else if (a % 5 == 0) {
		      System.out.println("输入的数字" + a + "能被5整除");
		  }
		  else if (a % 6 == 0) {
		      System.out.println("输入的数字" + a + "能被6整除");
		  }
		  else {			  
		      System.out.println("输入的数字不能被5或者6整除");
		  }

		

	}

}
