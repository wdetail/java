package 银行系统;

import java.util.Scanner;

//修改
public class Amend extends PerInformation {
	PerInformation p = new PerInformation();
	Login l = new Login();
	Scanner input = new Scanner(System.in);
	 public void Amend(){
		 System.out.println("------修改信息------\n"+"请修改姓名:");
		 String n=input.next();
		 System.out.println("修改结果为:"+p.getName()==n);
		 System.out.println("请修改联系方式:");
		 String t=input.next();
		 System.out.println("修改结果为:"+p.getTel()==t);
		 System.out.println("请修改密码:");
		 String c=input.next();
		 System.out.println("修改结果为:"+l.getCipher()==c);
		 System.out.println("------信息修改成功------");
	     p.Function();
		
	 }

}
