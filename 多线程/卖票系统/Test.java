package ��Ʊϵͳ;

public class Test {

	public static void main(String[] args) {
		Ticket st = new Ticket();
		
		
		Thread t1 = new Thread(st);
		t1.setName("1����Ʊ��");
		
		Thread t2 = new Thread(st);
		t2.setName("2����Ʊ��");
		
		Thread t3 = new Thread(st);
		t3.setName("3����Ʊ��");
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	
	
	
}
