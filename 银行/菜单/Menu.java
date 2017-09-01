package 菜单;

import 工具.Input;
import 工具.Input.Type;
import 服务层.Service;

public class Menu {
	
	public static void MainMenu(){		
	    System.out.println("请选择您要进行的操作:"+"1.修改信息;"+"2.存款;"+"3.取款;"+"4.转账;"+"5.贷款;"+"6.其他任意数退出.");
	    int number = Input.getInput(Type.INT).hashCode();
	    switch (number) {
		case 1:
			Modify.Reform();
			break;
			
        case 2:
			Exchange.Deposit();
			break;
			
        case 3:
        	Exchange.Draw();
			break;       	

        case 4:
        	Transfer.Tran();
			break;       		
			
        case 5:
        	Loan.Loans();
			break; 	
			
		default:
			Service.doLogin();
			break;
		}
	}
}
