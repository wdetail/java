package �˵�;

import ����.Input;
import ����.Input.Type;
import �����.Service;

public class Menu {
	
	public static void MainMenu(){		
	    System.out.println("��ѡ����Ҫ���еĲ���:"+"1.�޸���Ϣ;"+"2.���;"+"3.ȡ��;"+"4.ת��;"+"5.����;"+"6.�����������˳�.");
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
