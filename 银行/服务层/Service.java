package �����;

import ��Ϣ����.AccountCache;
import ����.Account;
import ʵ�ֲ�.Handler;
import ����.Input;
import ����.Input.Type;
import ����.Dispatch;

public class Service {

	private static Handler handler = new Handler();
	
	static int time = 0; //������ 3
	
	public static void doLogin() {
		System.out.println("�绶ӭ��¼������С�");
		Account temp = new Account();
		System.out.print("���������Ŀ���:");
		temp.setCard(Input.getInput(Type.STRING).toString());
		System.out.print("��������������:");
		temp.setCipher(Input.getInput(Type.STRING).toString());
		int result = (int)(Math.random() * 10000+1000 );
		String r = String.valueOf(result);
		System.out.print("��������֤��:("+result+")");		
		String number = Input.getInput(Type.STRING).toString();
		
		temp = handler.CheckAccount(temp);   // ��ʱ�� temp �Ѿ��ǿ���� ĳλ�û���ȫ����Ϣ��
		
		if(temp!=null && number.equals(r)) { 
			//�����¼�ɹ�����¼�ɹ����û�  ���������.
			AccountCache.getInstance().getWrapData().setAccount(temp);
	
			Dispatch.dispatch("������");
			
		}else {
			if(time<2) {
				System.out.println("---�� "+ ++time +" �ε�¼ʧ�� , �����µ�¼---");
				doLogin();
			} else {
				System.out.println("---�Բ���,�������½��������,����������!!!---");
				System.exit(0);
			}
		}
	}
	
}
