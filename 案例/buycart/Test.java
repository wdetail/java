package buycart;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		Product p1 = new Product(1, "Java从入门到精通", 100);
		Product p2 = new Product(2, "iphone 8", 10);
		Product p3 = new Product(3, "生活指南", 0);
		List<Product> products = new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		
		Customer c1 = new Customer();
		c1.setId(1);
		c1.setName("tom");
		
		@SuppressWarnings("unused")
		RecInfo rec1 = new RecInfo(1, "智慧公寓", "保安-jack", true);
		RecInfo rec2 = new RecInfo(2, "neusoft大厦", "保安队长-boss", false);

					
									
		Item item01 = new Item(p2 , 2 );
		Item item02 = new Item(p1 , 6 );
		Item item03 = new Item(p3 , 3);
		Item item04 = new Item(p1 , 1 );
						
		BuyCart cart = new BuyCart();
		
		cart.addItem(item01);
		cart.addItem(item02);
		cart.addItem(item03);
		cart.addItem(item04);
		
		System.out.println("下面是"+c1.getId()+"号"+c1.getName()+"的订单信息:-----------");
		long time = System.currentTimeMillis(); //获取当前时间的 long 值 , 注 : [ 时间是可以用 long 来描述的 ]
		Date nowTime = new Date();
		//String.valueOf(time)   代表  讲任意基本数据类转换为 字符串 , 此处是 将 long 转换为 String
		Orders order = new Orders( String.valueOf(time), nowTime, rec2, cart);
		System.out.println(order);
		
		//////////////////////
		//查看购物车
		cart.showBuyCart();
		
		////////////////////
		//生成订单   留给大家.....
		
		
	}
	

}
