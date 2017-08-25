package 银行系统;

public class Test {

	public static void main(String[] args) {
										
		Login l = new Login(123456, 112233);
//		Login l1 = new Login(123123, 123123);
		
		PerInformation p = new PerInformation("小俊", 111, 9999);
//		PerInformation p1 = new PerInformation("小军", 222, 999);
		
		
		l.In();
		p.Function();

	}

}
