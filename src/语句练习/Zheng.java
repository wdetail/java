package Óï¾äÁ·Ï°;

public class Zheng {
	public static void main( String[] args){
		for(int i=1;i<=9;i++){
			if(i==1 || i==9){
				for(int j=1;j<=18;j++){
					System.out.print(".");
				}
			}
			else{
				for(int j=1;j<=18;j++){
					if(j==1 || j==18){
						System.out.print(".");
					}
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}