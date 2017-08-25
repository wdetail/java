package 周末;

import java.util.Scanner;

public class Zuo_11 {
	public static void main(String[]args){
		
       System.out.println("请输入任意一个不多于5位数的正整数:");
       int x =input();
       String y =  String.valueOf(x);
       System.out.println(y+"的位数是:"+ y.length());
		
       for(int i = 0;i<y.length();i++){
    	   
       }
      
       System.out.println(x+"的各位数分别是:");

	}

	private static int input() {
		 Scanner scanner = new Scanner(System.in);
	        int x = scanner.nextInt();
	        return x;
	}

}
