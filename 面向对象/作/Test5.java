package ��;

import java.util.Scanner;

public class Test5 {
	
	public static void main(String[] args){
		
		System.out.println("������");
		Fruit5 f =null;
        Scanner input =new Scanner(System.in);
        String name = input.next();
        if(name.equals("ƻ��")){
            f = new Apple5();
       }
       else if(name.equals("�㽶")){
            f = new Banana5();
       }
       else if(name.equals("����")){
            f =new Putao5();
       }
       else{
           System.out.println("������");
       }
	}

}
