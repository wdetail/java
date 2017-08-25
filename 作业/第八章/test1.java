package µÚ°ËÕÂ;

import java.util.Scanner;

public class test1 {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String x = input.next(); 
		int x1 = Integer.parseInt(x); 
		String y = input.next();
		int y1 = Integer.parseInt(y);
		int z = x1+y1;   
		System.out.println(+x1+"+"+y1+"="+z);
	}

}
