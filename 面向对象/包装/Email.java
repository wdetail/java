package 包装;

import java.util.Scanner;

public class Email {
	
	public static void main(String[] args){
		
		System.out.println("请输入您的QQ号:(请输入6位到11位的数字)");
		Scanner s = new Scanner(System.in);
		String email = s.next().toString();


		System.out.println("email:"+email);
		System.out.println("请继续输入你的密码:");					

	    
		String passWord = s.next().toString();
		
		char[] chars = passWord.toCharArray();
		Pack check = new Pack();
		
		for (char c : chars) {
			if(Character.isDigit(c)) check.setHasDigit(true);
			else if(Character.isLowerCase(c)) check.setHasLower(true);
			else if(Character.isUpperCase(c)) check.setHasUpper(true);
			else if(Character.isSpaceChar(c)) check.setHasSpace(true);
			
		}		
		
		System.out.println("你输入的密码等级为:"+check.getlevel());
		
	}

}
