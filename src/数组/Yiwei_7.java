package ����;

import java.util.Scanner;

public class Yiwei_7 {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		   int a[] = new int[20];
			System.out.print("��������������������-1��ʾ��������");
			   int i=0,j=0;
			   do{
			      a[i]=s.nextInt();
			      i++;
			   }
			   while (a[i-1]!=-1);
			   System.out.print("�����������Ϊ��");
			   for( j=0; j<i-1; j++) {
			    System.out.print(a[j]+"  ");
			}
			   System.out.println("\n�����������Ϊ��");
			   for( j=i-2; j>=0; j=j-1) {
			    System.out.print(a[j]+"  ");
			}

	}
}
