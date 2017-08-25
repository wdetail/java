package ÖÜÄ©;

public class Ye_4_1 {

	public static void main(String[] args) {
		for(int m=0; m<=5; m++){			
			for(int n=1; n<= 5-m; n++){
				System.out.print(".");
			}
			for(int n=1; n<= 2*m-1; n++){
				System.out.print("x");
			}
			System.out.println();
		} 
		for(int m=4; m>=1; m--){			
			for(int n=1; n<= 5-m; n++){
				System.out.print(".");
			}
			for(int n=1; n<= 2*m-1; n++){
				System.out.print("x");
			}
			System.out.println();
		}
	}

}
