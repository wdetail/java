package 周末;

public class Zuo_8 {
	public static void main(String[]args){
		int year=2012;
        if(year%4==0&&year%100!=0||year%400==0){
        	System.out.println("闰年"); 
        }else{
        	System.out.println("不是闰年");
        } 

	}

}
