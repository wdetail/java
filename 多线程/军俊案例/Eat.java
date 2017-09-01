package 军俊案例;

public class Eat implements Runnable{

	@Override
	public void run() {
		
		System.out.println("小俊开始吃水果");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("小俊撑得躺下了");
	}

}
