package ×ö·¹°¸Àý;

public class Test {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Rice());
		t1.start();
		
		Thread t2 = new Thread(new Vegetable());
		t2.start();
		
	}

}
