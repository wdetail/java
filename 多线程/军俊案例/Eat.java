package ��������;

public class Eat implements Runnable{

	@Override
	public void run() {
		
		System.out.println("С����ʼ��ˮ��");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("С���ŵ�������");
	}

}
