package ��������;

public class Vegetable extends Thread {

	public void run(){
		for (int i = 1; i < 3; i++) {
			System.out.println("С����ʼ����" + i + "����");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("��" + i + "���˳�����");
		}
	}
	
}
