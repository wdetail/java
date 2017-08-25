package 银行系统;

import java.util.Scanner;

//贷款
public class Loans extends PerInformation {

	Scanner input = new Scanner(System.in);
	PerInformation p = new PerInformation();
	Loans(double balance){
		p.setBalance(balance);
	}
	
	public void Loans(){
		
		System.out.println("------贷款------");
		
	}
	
}
