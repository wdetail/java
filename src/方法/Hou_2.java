package ����;

public class Hou_2 {

		public static void main(String[] args) {
			Hou_2.method(2022);
		}
		
		public static void method(int year) {
			
	        if(year%4==0&&year%100!=0||year%400==0){
	        	System.out.println("����"); 
	        }else{
	        	System.out.println("��������");
	        } 

		}


}
