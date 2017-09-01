package 菜单;

import java.math.BigDecimal;

import 信息缓存.AccountCache;
import 工具.Input;
import 工具.Input.Type;

public class Loan {

	public static void Loans(){
		
		BigDecimal money = AccountCache.getInstance().getWrapData().getAccount().getBalance();
		System.out.println("根据您存款得出您可贷款的数目为(元):"+(money.multiply(BigDecimal.TEN)));
		System.out.println("--时长-----------利率--\n两年以内(含两年)----4.35\n两年至五年(含五年)---4.75\n五年以上----------4.90");
		System.out.print("请输入您要贷款的数目(元):");
		int money1 = Input.getInput(Type.INT).hashCode();
		BigDecimal money2 = new BigDecimal(money1);
		if(money2.compareTo(money.multiply(BigDecimal.TEN))==1){
			System.out.println("您输入的金额超限请重新输入!!!");
			Loan.Loans();
		}else;
		System.out.print("请输入您要贷款的时长(年份[最高10年]):");
		int y = Input.getInput(Type.INT).hashCode();
		if(y<=2){
			BigDecimal money3 = new BigDecimal(money1*4.35/y/12);
			System.out.println("您每个月应还的数目为(元):"+money3);
		}
		else if(y>2 && y<=5){
			BigDecimal money4 = new BigDecimal(money1*4.75/y/12);
			System.out.println("您每个月应还的数目为(元):"+money4);
		}
		else if(y>5 && y<=10){
			BigDecimal money5 = new BigDecimal(money1*4.35/y/12);
			System.out.println("您每个月应还的数目为(元):"+money5);
		}else{
			System.out.println("您输入的信息有误,请重新输入!!!");
			Loan.Loans();
		}
		Menu.MainMenu();		
	}
	
}
