package ����ϵͳ;

import java.util.Scanner;

//���
public class Deposit extends PerInformation {
	Scanner input = new Scanner(System.in);
	PerInformation p = new PerInformation();
	public Deposit(double balance){
		p.setBalance(balance);
	}	
	 public double Deposit(){
		System.out.println("------���------");
		System.out.println("������Ҫ�����Ŀ:");
		String money=input.next();
		Double m=Double.parseDouble(money);
		System.out.println("��ǰ���Ϊ:"+(p.getBalance() == (p.getBalance()+m)));
	    p.Function();
		return p.getBalance();
	 }

}
