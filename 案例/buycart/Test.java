package buycart;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		Product p1 = new Product(1, "Java�����ŵ���ͨ", 100);
		Product p2 = new Product(2, "iphone 8", 10);
		Product p3 = new Product(3, "����ָ��", 0);
		List<Product> products = new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		
		Customer c1 = new Customer();
		c1.setId(1);
		c1.setName("tom");
		
		@SuppressWarnings("unused")
		RecInfo rec1 = new RecInfo(1, "�ǻ۹�Ԣ", "����-jack", true);
		RecInfo rec2 = new RecInfo(2, "neusoft����", "�����ӳ�-boss", false);

					
									
		Item item01 = new Item(p2 , 2 );
		Item item02 = new Item(p1 , 6 );
		Item item03 = new Item(p3 , 3);
		Item item04 = new Item(p1 , 1 );
						
		BuyCart cart = new BuyCart();
		
		cart.addItem(item01);
		cart.addItem(item02);
		cart.addItem(item03);
		cart.addItem(item04);
		
		System.out.println("������"+c1.getId()+"��"+c1.getName()+"�Ķ�����Ϣ:-----------");
		long time = System.currentTimeMillis(); //��ȡ��ǰʱ��� long ֵ , ע : [ ʱ���ǿ����� long �������� ]
		Date nowTime = new Date();
		//String.valueOf(time)   ����  ���������������ת��Ϊ �ַ��� , �˴��� �� long ת��Ϊ String
		Orders order = new Orders( String.valueOf(time), nowTime, rec2, cart);
		System.out.println(order);
		
		//////////////////////
		//�鿴���ﳵ
		cart.showBuyCart();
		
		////////////////////
		//���ɶ���   �������.....
		
		
	}
	

}
