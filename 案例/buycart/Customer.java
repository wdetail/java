package buycart;

import java.util.ArrayList;

import java.util.List;

public class Customer {
	
	private int id;
	private String name;
	
	private List<RecInfo> recInfos = new ArrayList<RecInfo>();
	

	public Customer() {
		
	}

	public Customer(int id, String name, List<RecInfo> recInfos) {
		
		this.id = id;
		this.name = name;
		this.recInfos = recInfos;// ’ªıµÿ÷∑
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<RecInfo> getRecInfos() {
		return recInfos;
	}

	public void setRecInfos(List<RecInfo> recInfos) {
		this.recInfos = recInfos;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", recInfos=" + recInfos + "]";
	}

				

}
