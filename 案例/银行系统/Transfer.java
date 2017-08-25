package 银行系统;

import java.util.Scanner;

//转账
public class Transfer extends PerInformation {
	Scanner input = new Scanner(System.in);
	PerInformation p = new PerInformation();
	Transfer(double balance){
			p.setBalance(balance);
		}
	public void Transfer(){
		System.out.println("------转账------\n"+"当前余额为:"+p.getBalance());
		System.out.println("请输入要转入的账户:");
		String account=input.next();
		int a=Integer.parseInt(account);
		if(a == 123456){
			System.out.println("您输入的账户错误,请重新输入");
			String account1=input.next();
			Double a1=Double.parseDouble(account1);
			System.out.println("请输入要转入的数目:");
			String money=input.next();
			Double m=Double.parseDouble(money);
			if(m > p.getBalance()){
				System.out.println("您输入的金额超限.请重新输入");
				String money1=input.next();
				Double m1=Double.parseDouble(money1);
				System.out.println("转账成功,当前余额为:"+(p.getBalance()-m1)); 
				p.Function();
			}else
			System.out.println("转账成功,当前余额为:"+(p.getBalance()-m));
			p.Function();
		}else{			
			System.out.println("请输入要转入的数目:");
			String money=input.next();
			Double m=Double.parseDouble(money);
			if(m > p.getBalance()){
				System.out.println("您输入的金额超限.请重新输入");
				String money1=input.next();
				Double m1=Double.parseDouble(money1);
				System.out.println("转账成功,当前余额为:"+(p.getBalance()-m1));
				p.Function();
			}else				
				System.out.println("转账成功,当前余额为:"+(p.getBalance()-m)); 
		    p.Function();
		 }
	 }

}
