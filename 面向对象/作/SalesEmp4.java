package ��;

public class SalesEmp4 extends ColaEmp4 {
	
	private double monSell ;//�����۶�
	private double royaltyRate ;//�����
	
	SalesEmp4(){
		
	}
	
	SalesEmp4(String name, int birMonth, double monSell, double royaltyRate ){
		super(name, birMonth);
		this.monSell = monSell ;
		this.royaltyRate = royaltyRate ;
	}

	public double getMonSell() {
		return monSell;
	}

	public void setMonSell(double monSell) {
		this.monSell = monSell;
	}

	public double getRoyaltyRate() {
		return royaltyRate;
	}

	public void setRoyaltyRate(double royaltyRate) {
		this.royaltyRate = royaltyRate;
	}
	
	public double getSalary(int month) {
		double salary= monSell * royaltyRate;
		
		if(month == this.birMonth){
			salary +=100;
		}
		return salary;
	}


}
