package 周末;

public class Ye_8 {

	public static void main(String[] args) {
        int x =0;
        int even=0;
        int odd=0;
        while(x<100){
        if(x%2==0){
        	even+=x; 
        	
        }
        else{
        	odd+=x;        	
        }
        x++;
        }
        System.out.println("奇数之和even=："+even);
        System.out.println("奇数之和odd=："+odd);
	}

}
