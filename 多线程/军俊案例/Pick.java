package 军俊案例;

public class Pick implements Runnable{

	@Override
	public void run() {
		
		System.out.println("小军开始摘水果");
		try {
			Thread.sleep(1800);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("小军累的趴下了");
	}

}
