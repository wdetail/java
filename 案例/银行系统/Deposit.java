package 银行系统;

import java.util.Scanner;

//存款
public class Deposit extends PerInformation {
	Scanner input = new Scanner(System.in);
	PerInformation p = new PerInformation();
	public Deposit(double balance){
		p.setBalance(balance);
	}	
	 public double Deposit(){
		System.out.println("------存款------");
		System.out.println("请输入要存的数目:");
		String money=input.next();
		Double m=Double.parseDouble(money);
		System.out.println("当前余额为:"+(p.getBalance() == (p.getBalance()+m)));
	    p.Function();
		return p.getBalance();
	 }

}
