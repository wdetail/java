package 卖票系统;

public class Test {

	public static void main(String[] args) {
		Ticket st = new Ticket();
		
		
		Thread t1 = new Thread(st);
		t1.setName("1号售票口");
		
		Thread t2 = new Thread(st);
		t2.setName("2号售票口");
		
		Thread t3 = new Thread(st);
		t3.setName("3号售票口");
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	
	
	
}
