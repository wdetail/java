package 银行系统;

import java.util.Scanner;

public class Bank {
		
	private Bank(){
		
	}
	
	private static Scanner input = new Scanner(System.in);
	
	public static Scanner getInstance(){
		return input;
		
	}

}
