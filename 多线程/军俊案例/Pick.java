package ��������;

public class Pick implements Runnable{

	@Override
	public void run() {
		
		System.out.println("С����ʼժˮ��");
		try {
			Thread.sleep(1800);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("С���۵�ſ����");
	}

}
