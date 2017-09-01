package 菜单;

import java.math.BigDecimal;

import 信息缓存.AccountCache;
import 工具.Input;
import 工具.Input.Type;

public class Transfer {//转账
				
	public static void Tran(){
		
		BigDecimal money = AccountCache.getInstance().getWrapData().getAccount().getBalance();
		String card = AccountCache.getInstance().getWrapData().getAccount().getCard();
		String cipher = AccountCache.getInstance().getWrapData().getAccount().getCipher();
		System.out.println("卡上金额为(元):"+money);
		System.out.print("请输入您要转入的账户:");
	    String card1 = Input.getInput(Type.STRING).toString();
	    while(true){
	    if(card1.equals(card)){
	    	System.out.println("您输入账户不正确,请重新输入!!!");
	    }
	    else{
	    	while(true){
	    	System.out.print("请输入要转入的数目(元):");
	    	BigDecimal money1 = (BigDecimal) Input.getInput(Type.BIGDECIMAL);
	    	if(money1.compareTo(money)==-1){
	    		while(true){
	    		System.out.print("请输入密码:");
	    		String c = Input.getInput(Type.STRING).toString();
	    		if(c.equals(cipher)){
	    			System.out.println("成功往"+card1+"中转入"+money1+",余额为:"+(money.subtract(money1))+"元");
	    		    
	    			AccountCache.getInstance().getWrapData().getAccount().setBalance(money); 			
	    			Menu.MainMenu();
	    		}
	    		else{
	    		System.out.println("您输入的密码错误,请重新输入!!!");
	    		}
	    		}
	    	}
	    	else{
	    	System.out.println("您输入的金额超限,请重新输入!!!");
	    	}
	    	}
	    }
	    Transfer.Tran();
	    }
	}

}
