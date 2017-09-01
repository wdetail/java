package ¾ü¿¡°¸Àý;

public class Test {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Eat());
		t1.start();
		
		Thread t2 = new Thread(new Pick());
		t2.start();
		
		
	}

}
