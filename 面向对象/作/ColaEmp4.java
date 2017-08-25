package ×÷;

public abstract class ColaEmp4 {
	
	public String name ;
	public int birMonth ;
	
	ColaEmp4() {
		
	}
	
	ColaEmp4(String name, int birMonth ) {
		this.name = name ;
		this.birMonth = birMonth ;
	}
	
	public abstract double getSalary(int month);	


}
