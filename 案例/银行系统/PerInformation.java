package ����ϵͳ;

import java.util.Scanner;

public class PerInformation {
	
	private String name ;//����
	private int tel ;//��ϵ��ʽ 
	private double balance ;//���
	
	PerInformation(){
		
	}
	
	PerInformation(String name, int tel, double balance) {
		this.name = name;
		this.tel = tel;
		this.balance = balance;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "PerInformation [name=" + name + ", tel=" + tel + ", balance=" + balance + "]";
	}
	
	public void Function(){

		Scanner input = new Scanner(System.in);				
		System.out.println("��ѡ����Ҫ���еĲ���:\n"+"1.��ѯ "+"2.�޸���Ϣ "+"3.��� "+"4.ȡ�� "+"5.ת�� "+"6.�˳�");
		String number=input.next();
		int i=Integer.parseInt(number);
		System.out.println("���ѡ����:"+i);
		if(i==1){
			Demand d1 = new Demand(name, tel, balance);
			d1.Demand();
		}
		else if(i==2){
			Amend a = new Amend();
			a.Amend();
		}
		else if(i==3){
			Deposit d2 = new Deposit(balance);
			d2.Deposit();
		}
		else if(i==4){
			Draw d3 = new Draw(balance);
			d3.Draw();
		}
		else if(i==5){
			Transfer t = new Transfer(balance);
			t.Transfer();
		}
		else if(i==6){
			Test.main(null);
		}
//		else
//			System.out.println("------�������,�����µ�¼------");
//		    Login l = new Login();
//		    l.In();
	
	} 
	 

}
