package �ṹģʽ.������ģʽ;

public class Client {
	
	public static void main(String[] args) {
		
		Adaptee adaptee110v = new Adaptee110V();
		Adaptee adaptee220v = new Adaptee220V();
		
		Target target = new Adapter(adaptee220v);
		
		target.powerSupply();
		target.learn();
		
	}

}
