package 周末;

import java.util.Scanner;

public class Zuo_5 {
	public static void main(String[]args){
		
		System.out.print("请输入任意一个数：");
		int a ;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		if(a%2==0 && a!=0){
			System.out.println(a+"是偶数");
		}
		else if(a%2!=0 && a!=0){
			System.out.println(a+"是奇数");
		}
		else{
			System.out.println(a+"是零");
		}
			
		

	}

}
