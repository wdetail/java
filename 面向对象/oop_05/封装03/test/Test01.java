package oop_05.封装03.test;

import oop_05.封装03.Emp;
import oop_05.封装03.Person;
import oop_05.封装03.Salary;
import oop_05.封装03.Site;
import oop_05.封装03.Dept;


public class Test01 {

	public static void main(String[] args) {

		Person boss = new Person();
		boss.setAge(50);
		boss.setEmail("boss@neusoft.com");
		boss.setName("boss");
		boss.setPhone(123456);
				
		Salary boss1 = new Salary();
		boss1.setFixed(80000);
		boss1.setSubsidy(5000);
		boss1.setBonus(15000);
		boss1.sum();
		
		Site boss2 = new Site();
		boss2.setCity("天津市");
		boss2.setCounty("空港经济区");
		boss2.setTown("东软大厦");
					
		
		Emp empBoss = new Emp();
		empBoss.setPerson(boss); // 指定其个人信息
		empBoss.setSalary(boss1);
		empBoss.setSite(boss2);
		empBoss.setCompany("朝阳");
//		empBoss.setDepartment("董事会");
//		empBoss.setPost("董事长");

		Person scott = new Person();
		scott.setAge(40);
		scott.setEmail("111@11.com");
		scott.setName("scott");
		scott.setPhone(123123);
		Salary scott1 = new Salary();
		scott1.setFixed(6000);
		scott1.setSubsidy(2000);
		scott1.setBonus(2000);
		scott1.sum();
		
		Emp empScott = new Emp();
		empScott.setPerson(scott);
		empScott.setSalary(scott1);
		empScott.setCompany("朝阳");
//		empScott.setDept("行政办公室");
//		empScott.setPost("主管");

		
		Person jack = new Person();
		jack.setAge(20);
		jack.setEmail("jack@123.com");
		jack.setName("jack");
		jack.setPhone(123000);
		Salary jack1 = new Salary();
		jack1.setFixed(2500);
		jack1.setSubsidy(1000);
		jack1.setBonus(500);
		jack1.sum();
		
		Dept jack2  = new Dept();		
		jack2.setId("AR-1-1");
		jack2.setdName("财务科");
		jack2.setMgr("empScott");
		
		Emp empJack = new Emp();
		empJack.setPerson(jack);
		empJack.setSalary(jack1);
		empJack.setCompany("朝阳");
//		empJack.setDept("财务科");
//		empJack.setPost("会计");
		empJack.setDept(jack2);		
		
		Person tom = new Person();
		tom.setAge(25);
		tom.setEmail("tom@123.com");
		tom.setName("tom");
		tom.setPhone(123111);
		Salary tom1 = new Salary();
		tom1.setFixed(2000);
		tom1.setSubsidy(1000);
		tom1.setBonus(800);
		tom1.sum();
		
		Emp empTom = new Emp();
		empTom.setPerson(tom);
		empTom.setSalary(tom1);
		empTom.setCompany("朝阳");
//		empTom.setDept("财务科");
//		empTom.setPost("文员");

		////////////////////////////////////////////////////////
		// 构造上级
		empScott.setUp(empTom);
		// 构造下属
		Emp[] emps = { empTom, empTom };
		empScott.setDowns(emps);

		System.out.println("scott 的上级 是  : " + empScott.getUp().getPerson().getName()+" 其联系方式是:"+empScott.getUp().getPerson().getPhone());

		System.out.println("scott 的第一个 下属的姓名 : " + empScott.getDowns()[0].getPerson().getName());

//		System.out.println("tom 的职位:"+ empTom.getCompany()+"公司"+empTom.getDepartment()+"的"+empTom.getPost());
		
		System.out.println("jack 的工资:"+ empJack.getSalary().sum() +" 包括 : 固定工资:"+ empJack.getSalary().getFixed() +" 补贴:"+ empJack.getSalary().getSubsidy() +" 奖金:"+ empJack.getSalary().getBonus());
		
		System.out.println("boss的地址:"+ empBoss.getSite().getCity() +" "+ empBoss.getSite().getCounty() +" "+ empBoss.getSite().getTown());
		// scott 离职了 新来了一位 jerry 替换工作
		Person jerry = new Person();
		jerry.setName("jerry");
		Emp empJerry = new Emp();
		empJerry.setPerson(jerry);
		
		empTom.setUp(empJerry);
		
		System.out.println("jack的新上司是 : " + empTom.getUp().getPerson().getName());

	}

}
