package ¹¤¾ß;

import java.util.Scanner;

public class Input {
	
	public enum Type{
		STRING, INT, DOUBLE, BIGDECIMAL
	}
	
	public static Object getInput(Type type){
		
		Scanner input = new Scanner(System.in);
		
		Object result = null;
		
		switch (type.toString()) {
		
		case "STRING":
			result = input.next();
			break;
		case "INT":
			result = input.nextInt();
			break;
		case "BIGDECIMAL":
			result = input.nextBigDecimal();
			break;
		case "DOUBLE":
			result = input.nextDouble();
			break;
			
		default:
			break;
		}
		
		return result;
		
	}

}
