package 作;

public class TestConmary4 {
	
	public static void main(String[] args){
		
		ColaEmp4[] e = new ColaEmp4[3];
		e[0] = new SalariedEmp4("海军", 5, 5000);
		e[1] = new HourlyEmp4("小俊", 2, 200, 180);
		e[2] = new SalesEmp4("牛", 11, 9999, 1.1);
		
		for(ColaEmp4 c: e){
			Company4.getSalary(2, c);
		}

		
//		SalariedEmp4 e1 = new SalariedEmp4("海军", 5, 5000);
//		
//		HourlyEmp4 e2 = new HourlyEmp4("小俊", 2, 200, 170);
//		
//		SalesEmp4 e3 = new SalesEmp4("牛", 11, 9999, 1.5);
		
//		ColaEmp4[] ColaEmployees = {e1, e2, e3};
	}
	

}
