package �˵�;

import java.math.BigDecimal;

import ��Ϣ����.AccountCache;
import ����.Input;
import ����.Input.Type;

public class Transfer {//ת��
				
	public static void Tran(){
		
		BigDecimal money = AccountCache.getInstance().getWrapData().getAccount().getBalance();
		String card = AccountCache.getInstance().getWrapData().getAccount().getCard();
		String cipher = AccountCache.getInstance().getWrapData().getAccount().getCipher();
		System.out.println("���Ͻ��Ϊ(Ԫ):"+money);
		System.out.print("��������Ҫת����˻�:");
	    String card1 = Input.getInput(Type.STRING).toString();
	    while(true){
	    if(card1.equals(card)){
	    	System.out.println("�������˻�����ȷ,����������!!!");
	    }
	    else{
	    	while(true){
	    	System.out.print("������Ҫת�����Ŀ(Ԫ):");
	    	BigDecimal money1 = (BigDecimal) Input.getInput(Type.BIGDECIMAL);
	    	if(money1.compareTo(money)==-1){
	    		while(true){
	    		System.out.print("����������:");
	    		String c = Input.getInput(Type.STRING).toString();
	    		if(c.equals(cipher)){
	    			System.out.println("�ɹ���"+card1+"��ת��"+money1+",���Ϊ:"+(money.subtract(money1))+"Ԫ");
	    		    
	    			AccountCache.getInstance().getWrapData().getAccount().setBalance(money); 			
	    			Menu.MainMenu();
	    		}
	    		else{
	    		System.out.println("��������������,����������!!!");
	    		}
	    		}
	    	}
	    	else{
	    	System.out.println("������Ľ���,����������!!!");
	    	}
	    	}
	    }
	    Transfer.Tran();
	    }
	}

}
