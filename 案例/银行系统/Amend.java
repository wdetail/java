package ����ϵͳ;

import java.util.Scanner;

//�޸�
public class Amend extends PerInformation {
	PerInformation p = new PerInformation();
	Login l = new Login();
	Scanner input = new Scanner(System.in);
	 public void Amend(){
		 System.out.println("------�޸���Ϣ------\n"+"���޸�����:");
		 String n=input.next();
		 System.out.println("�޸Ľ��Ϊ:"+p.getName()==n);
		 System.out.println("���޸���ϵ��ʽ:");
		 String t=input.next();
		 System.out.println("�޸Ľ��Ϊ:"+p.getTel()==t);
		 System.out.println("���޸�����:");
		 String c=input.next();
		 System.out.println("�޸Ľ��Ϊ:"+l.getCipher()==c);
		 System.out.println("------��Ϣ�޸ĳɹ�------");
	     p.Function();
		
	 }

}
