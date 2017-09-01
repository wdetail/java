package ÂôÆ±ÏµÍ³;

public class Ticket extends Thread{
	
	int tickets = 100;

	@Override
	public void run() {
		
		while(true){
			synchronized(this){
				if(tickets>0){
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"sell tickets:"+tickets);
					tickets--;
				}
				else{
					break;
				}
			}
		}
		
	}

}
