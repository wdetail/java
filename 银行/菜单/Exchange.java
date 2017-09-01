package 菜单;

import java.math.BigDecimal;

import 信息缓存.AccountCache;
import 工具.Input;
import 工具.Input.Type;

public class Exchange {//存取款
		
	public static void Deposit() {
				
		BigDecimal money = AccountCache.getInstance().getWrapData().getAccount().getBalance();
		System.out.println("卡上金额为(元):"+money);			
		System.out.print("请输入要存款的金额(元):");
		BigDecimal money1 = (BigDecimal) Input.getInput(Type.BIGDECIMAL);
		if(money1.compareTo(BigDecimal.ZERO)==-1){//如果存款小于等于0 提示错误		
		    System.out.println("存款失败,请重新输入,，请至少存1元!!!");
		    Exchange.Deposit();
		} 
		else{//否则提示成功				
		    System.out.println("存款" +money1+ "元成功，您的卡里现在有"+(money.add(money1))+"元");
		    
		    AccountCache.getInstance().getWrapData().getAccount().setBalance(money.add(money1)); 
		    Menu.MainMenu();
		}
		
   }
	
	public static void Draw(){	
		
		BigDecimal money = AccountCache.getInstance().getWrapData().getAccount().getBalance();
		System.out.println("卡上金额为(元):"+money);
		System.out.print("请输入要取款的金额(元):");
		BigDecimal money1 = (BigDecimal) Input.getInput(Type.BIGDECIMAL);
		if ((money1.compareTo(money))==1 ){//取款的钱超过卡里的钱 		
		    System.out.println("对不起余额不足!!!");
		    Exchange.Draw();
		}		        
	    else{//取款成功 
	        System.out.println("取款"+money1+"元成功，您的卡里现在有"+(money.subtract(money1))+"元");
	        
	        AccountCache.getInstance().getWrapData().getAccount().setBalance(money.subtract(money1)); 		
	        Menu.MainMenu();
		}
		
	}

}
