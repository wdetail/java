package ����ϵͳ;

import java.util.Scanner;

//ȡ��
public class Draw extends PerInformation {
	
	Scanner input = new Scanner(System.in);
	PerInformation p = new PerInformation();
	Draw(double balance){
		p.setBalance(balance);
	}
	 public void Draw(){
		System.out.println("------ȡ��------\n"+"��ǰ���Ϊ:"+p.getBalance());
		System.out.println("������Ҫȡ����Ŀ:");
		String money=input.next();
		Double m=Double.parseDouble(money);
		if(m > p.getBalance()){
			System.out.println("������Ľ���.����������");
			String money1=input.next();
			Double m1=Double.parseDouble(money1);
			System.out.println("ȡ��ɹ�,��ǰ���Ϊ:"+(p.getBalance()-m1)); 
		}else
		System.out.println("ȡ��ɹ�,��ǰ���Ϊ:"+(p.getBalance()-m));
	    p.Function();
	 }
	
}
