package ÖÜÄ©;

public class Ye_4 {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				if(i==Math.abs(5-j)  || j==Math.abs(5-i)|| j+i==15)
					System.out.print("¡Á");
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}


	}

}
