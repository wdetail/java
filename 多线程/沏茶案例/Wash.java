package ��谸��;

public class Wash extends Thread {
	
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("��ʼϴ��" + i + "�����豭");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			System.out.println("��" + i + "�����豭 ϴ����");
		}
	}

}
