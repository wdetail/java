package ¼Ì³Ð;

public class Test {
	
	public static void main(String[] args) {
		
		Apple a1 = new Apple();
		a1.setName("Apple");
		a1.setPrice(3.5);
		a1.setColor("red");
		a1.setSize(5);
		
        Bananer b1 = new Bananer();
        b1.setColor("yellow");
		
        System.out.println("ÎÒÊÇ"+a1.getColor()+"µÄ"+a1.getName()+","+a1.getPrice()+"/½ï");
	}

}
