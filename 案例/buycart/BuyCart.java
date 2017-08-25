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
		
		if(items.contains(item)) {  // contains  Ĭ�ϵ��ñ��Ƚ����͵� equals ���� , �������д�ͺ������� . 
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
		System.out.println("�鿴���ﳵ-----------��");
		for (Item item : items) {
			System.out.println(item);
		}

	}

	

}
