package �˵�;

import ��Ϣ����.AccountCache;
import ����.User;
import ����.Input;
import ����.Input.Type;

public class Modify {//�޸�

	public static void Reform(){		
		String card = AccountCache.getInstance().getWrapData().getAccount().getCard();
		User user = AccountCache.getInstance().getWrapData().getAccount().getUser();
		System.out.println("������Ϣ:"+card+"\t"+user.toString());		
		System.out.print("------�޸���Ϣ------\n���޸���ϵ��ʽ:");
		String tel1=Input.getInput(Type.STRING).toString();
		System.out.println("�޸Ľ��Ϊ:"+tel1);
		System.out.print("���޸�����:");
		String cipher1=Input.getInput(Type.STRING).toString();
		System.out.println("�޸Ľ��Ϊ:"+cipher1);
		System.out.println("------��Ϣ�޸ĳɹ�------");
		
		AccountCache.getInstance().getWrapData().getAccount().setCipher(cipher1);
		AccountCache.getInstance().getWrapData().getAccount().getUser().setTel(tel1);
	    Menu.MainMenu();
	}
	
}
