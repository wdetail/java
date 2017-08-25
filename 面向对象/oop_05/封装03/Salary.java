package oop_05.·â×°03;

public class Salary {
	
	private int fixed;//¹Ì¶¨
	private double subsidy;//²¹Ìù
	private int bonus;//½±½ð
	
	
	public double sum(){
		double sum = fixed + subsidy + bonus;
		return sum;
	}
	
	public int getFixed() {
		return fixed;
	}
	public void setFixed(int fixed) {
		this.fixed = fixed;
	}
	public double getSubsidy() {
		return subsidy;
	}
	public void setSubsidy(double subsidy) {
		this.subsidy = subsidy;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}	

}
