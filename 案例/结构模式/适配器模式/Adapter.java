package �ṹģʽ.������ģʽ;

public class Adapter implements Target {
	
	private Adaptee adaptee;
	
	public Adapter( Adaptee adaptee ) {
		this.adaptee = adaptee;
	}

	@Override
	public void powerSupply() {
		adaptee.powerSupply();
	}

	@Override
	public void learn() {
		System.out.println("����eclipse ,  ���� ѧ���� Java ...   ");
	}
	
	

}
