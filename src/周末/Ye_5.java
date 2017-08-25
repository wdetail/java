package 周末;

import java.util.Scanner;

public class Ye_5 {

	public static void main(String[] args) {
		System.out.print("请输入任意一个数：");
		int a;
		Scanner s = new Scanner(System.in);
		a=s.nextInt();
		int sum =1;
		for(int b=1;a>=b;b++){
			sum = sum*b;
		}
		System.out.println("该数的阶乘="+sum);		
	}

}
