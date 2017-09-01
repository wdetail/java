package 结构模式.适配器模式;

public class Client {
	
	public static void main(String[] args) {
		
		Adaptee adaptee110v = new Adaptee110V();
		Adaptee adaptee220v = new Adaptee220V();
		
		Target target = new Adapter(adaptee220v);
		Target target1 = new Adapter(adaptee110v);
		
		target.powerSupply();
		target.learn();
		
		target1.powerSupply();
		target1.play();
	}

}
