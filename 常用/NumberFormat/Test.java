package NumberFormat;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Test {

	public static void main(String[] args) {
		
		Double myNumber = 23323.3323232323;
		Double test = 0.3434;

		//1,000.00
		String myString = NumberFormat.getInstance().format(myNumber);
		System.out.println(myString);
	
		//$1,000.00
		NumberFormat ins = NumberFormat.getCurrencyInstance();
		ins.setCurrency(Currency.getInstance(Locale.CHINA));
		myString = ins.format(myNumber);
		System.out.println(myString);
		
		
	
		myString = NumberFormat.getNumberInstance().format(myNumber);
		System.out.println(myString);

		//%
		myString = NumberFormat.getPercentInstance().format(test);
		System.out.println(myString);

		// setMaximumFractionDigits(int) ������ֵ��С��������������λ����
		// setMaximumIntegerDigits(int) ������ֵ������������������λ����
		// setMinimumFractionDigits(int) ������ֵ��С�������������Сλ����
		// setMinimumIntegerDigits(int) ������ֵ�����������������Сλ��.
		NumberFormat format = NumberFormat.getInstance();
		format.setMinimumFractionDigits(3);
		format.setMaximumFractionDigits(5);
		format.setMaximumIntegerDigits(10);
		format.setMinimumIntegerDigits(0);
		System.out.println(format.format(2132323213.23266666666));

	}

}
