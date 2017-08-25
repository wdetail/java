package ÖÜÄ©;

public class Ye_1_1 {

	public static void main(String[] args) {
		
		for(int a=1;a<=5;a++){			
			for(int b=1;b<=5-a;b++){
				System.out.print(".");				
			}
			for(int b=5;b>=1;b--){
				System.out.print("@");
			}
			for(int b=3;b<=2*a;b++){
				System.out.print(".");
			}
			for(int b=1;b<=1;b++){
				System.out.print("@");
			}
		System.out.println();
		}
		for(int a=1;a<=7;a++){
			System.out.print("@");
			for(int b=1;b<=13;b++){
				if(a==1 || a==7 || b ==13)
					System.out.print("@");
				else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}			
}
