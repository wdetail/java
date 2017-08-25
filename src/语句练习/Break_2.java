package Óï¾äÁ·Ï°;

import java.util.Scanner;

public class Break_2 {
	public static void main(String [] args){
		outer:for(int x =0;x<10;x++){
			System.out.println("Outer loop");
			
			inner:while (true){
				Scanner sc = new Scanner(System.in);
				String s=sc.next();
				System.out.println("inner loop:"+s);
				if(s.equals("hello"))
					break inner;
				if(s.equals("kitty"))
					break outer;			
			}
		}
	}

}
