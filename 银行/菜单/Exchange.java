package �˵�;

import java.math.BigDecimal;

import ��Ϣ����.AccountCache;
import ����.Input;
import ����.Input.Type;

public class Exchange {//��ȡ��
		
	public static void Deposit() {
				
		BigDecimal money = AccountCache.getInstance().getWrapData().getAccount().getBalance();
		System.out.println("���Ͻ��Ϊ(Ԫ):"+money);			
		System.out.print("������Ҫ���Ľ��(Ԫ):");
		BigDecimal money1 = (BigDecimal) Input.getInput(Type.BIGDECIMAL);
		if(money1.compareTo(BigDecimal.ZERO)==-1){//������С�ڵ���0 ��ʾ����		
		    System.out.println("���ʧ��,����������,�������ٴ�1Ԫ!!!");
		    Exchange.Deposit();
		} 
		else{//������ʾ�ɹ�				
		    System.out.println("���" +money1+ "Ԫ�ɹ������Ŀ���������"+(money.add(money1))+"Ԫ");
		    
		    AccountCache.getInstance().getWrapData().getAccount().setBalance(money.add(money1)); 
		    Menu.MainMenu();
		}
		
   }
	
	public static void Draw(){	
		
		BigDecimal money = AccountCache.getInstance().getWrapData().getAccount().getBalance();
		System.out.println("���Ͻ��Ϊ(Ԫ):"+money);
		System.out.print("������Ҫȡ��Ľ��(Ԫ):");
		BigDecimal money1 = (BigDecimal) Input.getInput(Type.BIGDECIMAL);
		if ((money1.compareTo(money))==1 ){//ȡ���Ǯ���������Ǯ 		
		    System.out.println("�Բ�������!!!");
		    Exchange.Draw();
		}		        
	    else{//ȡ��ɹ� 
	        System.out.println("ȡ��"+money1+"Ԫ�ɹ������Ŀ���������"+(money.subtract(money1))+"Ԫ");
	        
	        AccountCache.getInstance().getWrapData().getAccount().setBalance(money.subtract(money1)); 		
	        Menu.MainMenu();
		}
		
	}

}
