package ����;

//import java.util.Scanner;

public class QuestionHandler {
	
	// ��ʾ��Ŀ..
	public void showQuestion(Question[] questions) {

		if (questions != null && questions.length > 0) { // ��Ϊ����ѭ�� , �Է� ��ָ���쳣  NullPointException
			for (int i = 0; i < 2; i++) {

				System.out.println("��Ŀ " + (i + 1) + ":" + questions[i].getText());
				for (Option option : questions[i].getOptions()) {
					System.out.println(option.getSelect() + " . " + option.getContent());
				}

				System.out.println("***************************");
				
				

			}
		}
		if (questions != null && questions.length > 0) { // ��Ϊ����ѭ�� , �Է� ��ָ���쳣  NullPointException
			for (int i = 2; i < questions.length; i++) {

				System.out.println("��Ŀ " + (i + 1) + ":" + questions[i].getText());
				
				System.out.println("***************************");

			}
		}

	}
	
	// ����...
		public void doCheck(Question[] questions, Answer[] answers) {

			System.out.println("�������Ϊ : ");

			String result = "";

			for (int i = 0; i < 2; i++) {

				if (questions[i].check(answers[i].getChoice())) { //���� Answer ��  , ������  �����������
					result = "��" + (i + 1) + " : �� ";			
				}								
					else {
					result = "��" + (i + 1) + " : �� ";
				}

				System.out.println(result);
			}
			
			for (int i = 2; i < questions.length; i++) {

				if (questions[i].check(answers[i].getKey())) { //���� Answer ��  , ������  �����������
					result = "��" + (i + 1) + " : �� ";			
				}								
					else {
					result = "��" + (i + 1) + " : �� ";
				}

				System.out.println(result);
			}

		}	

}
