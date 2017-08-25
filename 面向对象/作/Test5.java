package 作;

import java.util.Scanner;

public class Test5 {
	
	public static void main(String[] args){
		
		System.out.println("请输入");
		Fruit5 f =null;
        Scanner input =new Scanner(System.in);
        String name = input.next();
        if(name.equals("苹果")){
            f = new Apple5();
       }
       else if(name.equals("香蕉")){
            f = new Banana5();
       }
       else if(name.equals("葡萄")){
            f =new Putao5();
       }
       else{
           System.out.println("不会种");
       }
	}

}
