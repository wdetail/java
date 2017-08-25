package ×÷;

public class HourlyEmp4 extends ColaEmp4 {
	
	private double salary;
	private double monHour;
	
	
	HourlyEmp4(){
		
	}
	
    HourlyEmp4(String name, int birMonth, double salary, double monHour ){
    	super(name, birMonth);
		this.salary = salary;
		this.monHour = monHour;
	}

    
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getMonHour() {
		return monHour;
	}

	public void setMonHour(double monHour) {
		this.monHour = monHour;
	}
    
	public double getSalary(int month){
//		double salary =0;
		if(monHour <=160){
			salary = monHour * salary;
		}else{
			salary = 160 * salary + (monHour - 160 )* salary * 1.5;
		}
		
		if(month == this.birMonth){
			salary +=100;

		}	
		return salary;
	}            

}
