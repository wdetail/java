package 建造模式.工厂方法;

public class IpadFactory implements Factory {

	public Product factory() {
		System.out.println("海俊想要买一部苹果平板");
		return new Ipad();
	}

}
