package ����;

//import java.util.Scanner;

public class Test {
	
	public static void main(String[] args){				
	
	String t1 = "(��ѡ��)��������鳤��˭��";
	Option so1 = new Option('A',"���»�");
	Option so2 = new Option('B',"��С��");
	Option so3 = new Option('C',"��ѧ��");
	Option so4 = new Option('D',"���ǳ�");
	Option[] sOptions= {so1,so2,so3,so4};

	
	char singleAnswer = 'B' ;//����  �������ȷ���� B
	
	Question s1 = new Single(t1, sOptions , singleAnswer);//��һ��  �������
	
	String t2 = "(��ѡ��)���ڼ���,����˵����ȷ���ǣ�";
	Option mo1 = new Option('A', "ArrayList���������");
	Option mo2 = new Option('B', "comparable �ӿ��ṩ��������");
	Option mo3 = new Option('C', "iterator ����");
	Option mo4 = new Option('D', "Map�̳��� Collection ");
	Option[] mOptions = { mo1, mo2, mo3, mo4 };
	
	char[] multiAnswer = { 'A', 'B' };//��ȷ�𰸵����� 
	
	Question m1 = new Multi(t2, mOptions , multiAnswer);//��ѡ�⹹�����
	
	String t3 = "(���������)����(  )��ģ�塣";
		
	String fillAnswer =  "����" ;
	
	Question f1 = new Fill(t3, fillAnswer);
	
    String t4 = "(���������)���ֻ�������������( ),short,( ),long,( ),double,( )��boolean��";
		
	String[] fillsAnswer = { "byte","int","float","char" };
	
	Question f2 = new Fills(t4, fillsAnswer);
		
	Question[] questions = { s1, m1, f1, f2 };
	
	// ��
	Answer answer1 = new Answer(new char[] {'b'});
	Answer answer2 = new Answer(new char[] {'A' , 'B'});
	Answer answer3 = new Answer(new String[] {"duixiang"});
	Answer answer4 = new Answer(new String[] {"byte","int","float","char"});
	Answer[] answers = {answer1, answer2, answer3, answer4 };
	
	Question q = new Question();
	QuestionHandler handler = new QuestionHandler();// ��ʾ��Ŀ
	handler.showQuestion(questions);

	handler.doCheck(questions, answers);
	
	}

}
