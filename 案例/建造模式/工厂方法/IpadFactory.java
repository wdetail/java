package ����ģʽ.��������;

public class IpadFactory implements Factory {

	public Product factory() {
		System.out.println("������Ҫ��һ��ƻ��ƽ��");
		return new Ipad();
	}

}
