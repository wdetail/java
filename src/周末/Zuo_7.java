package ��ĩ;

import java.util.Scanner;

public class Zuo_7 {
	public static void main(String[]args){
		
		System.out.println("����������һ����");
		int a;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		
		  if (a % 5 == 0 && a % 6 == 0) {
		         System.out.println("���������" + a + "�ܱ�5��6����");
		  }
		  else if (a % 5 == 0) {
		      System.out.println("���������" + a + "�ܱ�5����");
		  }
		  else if (a % 6 == 0) {
		      System.out.println("���������" + a + "�ܱ�6����");
		  }
		  else {			  
		      System.out.println("��������ֲ��ܱ�5����6����");
		  }

		

	}

}
