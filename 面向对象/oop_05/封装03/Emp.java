package oop_05.封装03;

public class Emp {

	private Person person;
			
	private Salary salary;
	
	private Site site;
	
	private String company;//公司
	
	private Dept dept;//部门
	
//	private String post;//岗位
			

	private Emp up;
	private Emp[] downs;

	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	public Site getSite() {
		return site;
	}
	public void setSite(Site site) {
		this.site = site;
	}
	public Emp getUp() {
		return up;
	}
	public void setUp(Emp up) {
		this.up = up;
	}
	public Emp[] getDowns() {
		return downs;
	}
	public void setDowns(Emp[] downs) {
		this.downs = downs;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
//	public String getPost() {
//		return post;
//	}
//	public void setPost(String post) {
//		this.post = post;
//	}
	
}
