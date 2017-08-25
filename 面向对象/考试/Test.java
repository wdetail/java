package 考试;

//import java.util.Scanner;

public class Test {
	
	public static void main(String[] args){				
	
	String t1 = "(单选题)请问你的组长是谁？";
	Option so1 = new Option('A',"刘德华");
	Option so2 = new Option('B',"任小俊");
	Option so3 = new Option('C',"张学友");
	Option so4 = new Option('D',"周星驰");
	Option[] sOptions= {so1,so2,so3,so4};

	
	char singleAnswer = 'B' ;//代表  此题的正确答案是 B
	
	Question s1 = new Single(t1, sOptions , singleAnswer);//第一题  构造完成
	
	String t2 = "(多选题)关于集合,以下说法正确的是？";
	Option mo1 = new Option('A', "ArrayList比数组好用");
	Option mo2 = new Option('B', "comparable 接口提供了排序功能");
	Option mo3 = new Option('C', "iterator 是类");
	Option mo4 = new Option('D', "Map继承自 Collection ");
	Option[] mOptions = { mo1, mo2, mo3, mo4 };
	
	char[] multiAnswer = { 'A', 'B' };//正确答案的数组 
	
	Question m1 = new Multi(t2, mOptions , multiAnswer);//多选题构造完毕
	
	String t3 = "(单项填空题)类是(  )的模板。";
		
	String fillAnswer =  "对象" ;
	
	Question f1 = new Fill(t3, fillAnswer);
	
    String t4 = "(多项填空题)八种基本数据类型是( ),short,( ),long,( ),double,( )和boolean。";
		
	String[] fillsAnswer = { "byte","int","float","char" };
	
	Question f2 = new Fills(t4, fillsAnswer);
		
	Question[] questions = { s1, m1, f1, f2 };
	
	// 答案
	Answer answer1 = new Answer(new char[] {'b'});
	Answer answer2 = new Answer(new char[] {'A' , 'B'});
	Answer answer3 = new Answer(new String[] {"duixiang"});
	Answer answer4 = new Answer(new String[] {"byte","int","float","char"});
	Answer[] answers = {answer1, answer2, answer3, answer4 };
	
	Question q = new Question();
	QuestionHandler handler = new QuestionHandler();// 显示题目
	handler.showQuestion(questions);

	handler.doCheck(questions, answers);
	
	}

}
