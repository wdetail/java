package ����ϵͳ;

//��ѯ
public class Demand extends PerInformation{
	
	PerInformation p = new PerInformation();
    Demand(String name, int tel, double balance){
    	super();
		p.setName(name);
		p.setTel(tel);
		p.setBalance(balance);
	}	
	 public void Demand(){ 
		 System.out.println("------������Ϣ------\n"+p.toString());
	     p.Function();
	 }	

}
