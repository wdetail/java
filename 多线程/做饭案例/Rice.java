package ��������;

public class Rice implements Runnable{

	@Override
	public void run() {
		System.out.println("С����ʼ������");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		System.out.println("���׽���");
	}
	
	

}
