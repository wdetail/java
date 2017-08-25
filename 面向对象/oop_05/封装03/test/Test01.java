package oop_05.��װ03.test;

import oop_05.��װ03.Emp;
import oop_05.��װ03.Person;
import oop_05.��װ03.Salary;
import oop_05.��װ03.Site;
import oop_05.��װ03.Dept;


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
		boss2.setCity("�����");
		boss2.setCounty("�ո۾�����");
		boss2.setTown("�������");
					
		
		Emp empBoss = new Emp();
		empBoss.setPerson(boss); // ָ���������Ϣ
		empBoss.setSalary(boss1);
		empBoss.setSite(boss2);
		empBoss.setCompany("����");
//		empBoss.setDepartment("���»�");
//		empBoss.setPost("���³�");

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
		empScott.setCompany("����");
//		empScott.setDept("�����칫��");
//		empScott.setPost("����");

		
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
		jack2.setdName("�����");
		jack2.setMgr("empScott");
		
		Emp empJack = new Emp();
		empJack.setPerson(jack);
		empJack.setSalary(jack1);
		empJack.setCompany("����");
//		empJack.setDept("�����");
//		empJack.setPost("���");
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
		empTom.setCompany("����");
//		empTom.setDept("�����");
//		empTom.setPost("��Ա");

		////////////////////////////////////////////////////////
		// �����ϼ�
		empScott.setUp(empTom);
		// ��������
		Emp[] emps = { empTom, empTom };
		empScott.setDowns(emps);

		System.out.println("scott ���ϼ� ��  : " + empScott.getUp().getPerson().getName()+" ����ϵ��ʽ��:"+empScott.getUp().getPerson().getPhone());

		System.out.println("scott �ĵ�һ�� ���������� : " + empScott.getDowns()[0].getPerson().getName());

//		System.out.println("tom ��ְλ:"+ empTom.getCompany()+"��˾"+empTom.getDepartment()+"��"+empTom.getPost());
		
		System.out.println("jack �Ĺ���:"+ empJack.getSalary().sum() +" ���� : �̶�����:"+ empJack.getSalary().getFixed() +" ����:"+ empJack.getSalary().getSubsidy() +" ����:"+ empJack.getSalary().getBonus());
		
		System.out.println("boss�ĵ�ַ:"+ empBoss.getSite().getCity() +" "+ empBoss.getSite().getCounty() +" "+ empBoss.getSite().getTown());
		// scott ��ְ�� ������һλ jerry �滻����
		Person jerry = new Person();
		jerry.setName("jerry");
		Emp empJerry = new Emp();
		empJerry.setPerson(jerry);
		
		empTom.setUp(empJerry);
		
		System.out.println("jack������˾�� : " + empTom.getUp().getPerson().getName());

	}

}
