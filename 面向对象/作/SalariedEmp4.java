package ×÷;

public class SalariedEmp4 extends ColaEmp4 {
	
	private double salary ;
	
	
	SalariedEmp4() {
		
	}
	
    SalariedEmp4(String name, int birMonth, double salary) {
		super(name, birMonth);
		this.salary = salary;
	}
    

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary(int month){
		
		if(month == this.birMonth){
			salary += 100;	
		}	
		return salary;
	}            

}
