package ����ϵͳ;

import java.util.Scanner;

//ת��
public class Transfer extends PerInformation {
	Scanner input = new Scanner(System.in);
	PerInformation p = new PerInformation();
	Transfer(double balance){
			p.setBalance(balance);
		}
	public void Transfer(){
		System.out.println("------ת��------\n"+"��ǰ���Ϊ:"+p.getBalance());
		System.out.println("������Ҫת����˻�:");
		String account=input.next();
		int a=Integer.parseInt(account);
		if(a == 123456){
			System.out.println("��������˻�����,����������");
			String account1=input.next();
			Double a1=Double.parseDouble(account1);
			System.out.println("������Ҫת�����Ŀ:");
			String money=input.next();
			Double m=Double.parseDouble(money);
			if(m > p.getBalance()){
				System.out.println("������Ľ���.����������");
				String money1=input.next();
				Double m1=Double.parseDouble(money1);
				System.out.println("ת�˳ɹ�,��ǰ���Ϊ:"+(p.getBalance()-m1)); 
				p.Function();
			}else
			System.out.println("ת�˳ɹ�,��ǰ���Ϊ:"+(p.getBalance()-m));
			p.Function();
		}else{			
			System.out.println("������Ҫת�����Ŀ:");
			String money=input.next();
			Double m=Double.parseDouble(money);
			if(m > p.getBalance()){
				System.out.println("������Ľ���.����������");
				String money1=input.next();
				Double m1=Double.parseDouble(money1);
				System.out.println("ת�˳ɹ�,��ǰ���Ϊ:"+(p.getBalance()-m1));
				p.Function();
			}else				
				System.out.println("ת�˳ɹ�,��ǰ���Ϊ:"+(p.getBalance()-m)); 
		    p.Function();
		 }
	 }

}
