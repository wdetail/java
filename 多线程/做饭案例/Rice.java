package 做饭案例;

public class Rice implements Runnable{

	@Override
	public void run() {
		System.out.println("小俊开始蒸大米");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		System.out.println("大米焦了");
	}
	
	

}
