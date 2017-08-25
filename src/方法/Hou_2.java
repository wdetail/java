package 方法;

public class Hou_2 {

		public static void main(String[] args) {
			Hou_2.method(2022);
		}
		
		public static void method(int year) {
			
	        if(year%4==0&&year%100!=0||year%400==0){
	        	System.out.println("闰年"); 
	        }else{
	        	System.out.println("不是闰年");
	        } 

		}


}
