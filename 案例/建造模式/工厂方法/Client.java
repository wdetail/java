package 建造模式.工厂方法;

public class Client {

	public static void main(String[] args) {

//		Product iphone8;
//		Product ipad8;
		Factory factory = new IphoneFactory();
		Factory factory1 = new IpadFactory();
		
		Product iphone8 = factory.factory();
		Product ipad8 = factory1.factory();
		
		

	}

}
