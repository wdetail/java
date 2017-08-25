package µ¥Àý;

public class Test {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		Singleton1 singleton1 = Singleton1.getInstance();
		Singleton1 singleton3 = Singleton1.getInstance();
		System.out.println(singleton == singleton2);
		System.out.println(singleton1 == singleton3);

	}

}
