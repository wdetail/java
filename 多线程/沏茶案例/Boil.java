package ��谸��;

public class Boil implements Runnable {

	@Override
	public void run() {

		System.out.println("��ʼ��ˮ");

		try {
			Thread.sleep(10 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("ˮ����");

	}

}
