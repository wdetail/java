package ��ĩ;

import java.util.Scanner;

public class Zuo_5 {
	public static void main(String[]args){
		
		System.out.print("����������һ������");
		int a ;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		if(a%2==0 && a!=0){
			System.out.println(a+"��ż��");
		}
		else if(a%2!=0 && a!=0){
			System.out.println(a+"������");
		}
		else{
			System.out.println(a+"����");
		}
			
		

	}

}
