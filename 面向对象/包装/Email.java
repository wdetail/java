package ��װ;

import java.util.Scanner;

public class Email {
	
	public static void main(String[] args){
		
		System.out.println("����������QQ��:(������6λ��11λ������)");
		Scanner s = new Scanner(System.in);
		String email = s.next().toString();


		System.out.println("email:"+email);
		System.out.println("����������������:");					

	    
		String passWord = s.next().toString();
		
		char[] chars = passWord.toCharArray();
		Pack check = new Pack();
		
		for (char c : chars) {
			if(Character.isDigit(c)) check.setHasDigit(true);
			else if(Character.isLowerCase(c)) check.setHasLower(true);
			else if(Character.isUpperCase(c)) check.setHasUpper(true);
			else if(Character.isSpaceChar(c)) check.setHasSpace(true);
			
		}		
		
		System.out.println("�����������ȼ�Ϊ:"+check.getlevel());
		
	}

}
