package buycart;

import java.util.ArrayList;
import java.util.List;

public class BuyCart {

	private List<Item> items = new ArrayList<Item>();

	public List<Item> getItems() {
		return items;
	}
	
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	public void addItem(Item item) {
		
		if(items.contains(item)) {  // contains  默认调用被比较类型的 equals 方法 , 如果不重写就毫无意义 . 
			for (Item i : items) {
				if(i.equals(item)) {
					i.setAmount(i.getAmount() + item.getAmount() );
				}
			}
		} else {
			items.add(item);
		}
		
	}
	
	public void showBuyCart() {
		System.out.println("查看购物车-----------↓");
		for (Item item : items) {
			System.out.println(item);
		}

	}

	

}
