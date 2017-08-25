package 周末;

import java.util.Scanner;

public class Zuo_6 {
	public static void main(String[]args){
	
        System.out.println("请输入任意一个数:");
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        
        switch(x)
        {
            case 1:
            {
                System.out.println("x=1");
                break;
            }
            case 5:
            {
                System.out.println("x=5");
                break;
            }
            case 10:
            {
                System.out.println("x=10");
                break;
            }
            default:
            {
                System.out.println("none");
                break;
            }
        }

		
	}

}
