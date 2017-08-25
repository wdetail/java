package 银行系统;

import java.util.Scanner;

//取款
public class Draw extends PerInformation {
	
	Scanner input = new Scanner(System.in);
	PerInformation p = new PerInformation();
	Draw(double balance){
		p.setBalance(balance);
	}
	 public void Draw(){
		System.out.println("------取款------\n"+"当前余额为:"+p.getBalance());
		System.out.println("请输入要取的数目:");
		String money=input.next();
		Double m=Double.parseDouble(money);
		if(m > p.getBalance()){
			System.out.println("您输入的金额超限.请重新输入");
			String money1=input.next();
			Double m1=Double.parseDouble(money1);
			System.out.println("取款成功,当前余额为:"+(p.getBalance()-m1)); 
		}else
		System.out.println("取款成功,当前余额为:"+(p.getBalance()-m));
	    p.Function();
	 }
	
}
