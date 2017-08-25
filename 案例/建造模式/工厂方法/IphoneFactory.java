package 建造模式.工厂方法;

public class IphoneFactory implements Factory {

	@Override
	public Product factory() {
		System.out.println("海军想要买一部苹果手机");
		return new Iphone();
	}

}
