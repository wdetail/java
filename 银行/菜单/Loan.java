package �˵�;

import java.math.BigDecimal;

import ��Ϣ����.AccountCache;
import ����.Input;
import ����.Input.Type;

public class Loan {

	public static void Loans(){
		
		BigDecimal money = AccountCache.getInstance().getWrapData().getAccount().getBalance();
		System.out.println("���������ó����ɴ������ĿΪ(Ԫ):"+(money.multiply(BigDecimal.TEN)));
		System.out.println("--ʱ��-----------����--\n��������(������)----4.35\n����������(������)---4.75\n��������----------4.90");
		System.out.print("��������Ҫ�������Ŀ(Ԫ):");
		int money1 = Input.getInput(Type.INT).hashCode();
		BigDecimal money2 = new BigDecimal(money1);
		if(money2.compareTo(money.multiply(BigDecimal.TEN))==1){
			System.out.println("������Ľ�������������!!!");
			Loan.Loans();
		}else;
		System.out.print("��������Ҫ�����ʱ��(���[���10��]):");
		int y = Input.getInput(Type.INT).hashCode();
		if(y<=2){
			BigDecimal money3 = new BigDecimal(money1*4.35/y/12);
			System.out.println("��ÿ����Ӧ������ĿΪ(Ԫ):"+money3);
		}
		else if(y>2 && y<=5){
			BigDecimal money4 = new BigDecimal(money1*4.75/y/12);
			System.out.println("��ÿ����Ӧ������ĿΪ(Ԫ):"+money4);
		}
		else if(y>5 && y<=10){
			BigDecimal money5 = new BigDecimal(money1*4.35/y/12);
			System.out.println("��ÿ����Ӧ������ĿΪ(Ԫ):"+money5);
		}else{
			System.out.println("���������Ϣ����,����������!!!");
			Loan.Loans();
		}
		Menu.MainMenu();		
	}
	
}
