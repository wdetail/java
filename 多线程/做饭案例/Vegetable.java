package 做饭案例;

public class Vegetable extends Thread {

	public void run(){
		for (int i = 1; i < 3; i++) {
			System.out.println("小军开始炒第" + i + "道菜");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("第" + i + "道菜炒糊了");
		}
	}
	
}
