package ����ģʽ.��������;

public class IphoneFactory implements Factory {

	@Override
	public Product factory() {
		System.out.println("������Ҫ��һ��ƻ���ֻ�");
		return new Iphone();
	}

}
