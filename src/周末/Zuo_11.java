package ��ĩ;

import java.util.Scanner;

public class Zuo_11 {
	public static void main(String[]args){
		
       System.out.println("����������һ��������5λ����������:");
       int x =input();
       String y =  String.valueOf(x);
       System.out.println(y+"��λ����:"+ y.length());
		
       for(int i = 0;i<y.length();i++){
    	   
       }
      
       System.out.println(x+"�ĸ�λ���ֱ���:");

	}

	private static int input() {
		 Scanner scanner = new Scanner(System.in);
	        int x = scanner.nextInt();
	        return x;
	}

}
