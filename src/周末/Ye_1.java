package ��ĩ;

import java.util.Scanner;

public class Ye_1 {

	public static void main(String[] args) {
		/**
		 *     ******   4�ո�   5*   1* 
		 *    ****** *  3�ո�   5*   1*  1��  1*
		 *   ******   * 2�ո�   5*   1*  3��   1*
		 *  ******     *              5��
		 * ******       *
		 *   ��14��  5��
		 */
			System.out.print("��ӡһ������,�����뷿�Ӵ�С");
			Scanner s =new Scanner(System.in);
			int m = 4;
			int col =0; //ȡ�����һ��  ������ ��Ϊÿ��ѭ��col����Ϊ0
			for(int  i =0 ; i<m;i++){
				col=0;
				for(int j=0;j<m-i-1;j++){//��ӡǰ���ո�
					System.out.print(".");
					col++;
				}
				for(int n=0;n<m;n++){//��ӡ��ͬӵ�е�*
					System.out.print("@");
					col++;
				}
				if(i==0){//��ӡ��һ��*  ����
					System.out.print("@");
					col++;
				}else{
					System.out.print("@");
					col++;
					for(int x= 0;x<2*i-1;x++){
						System.out.print(".");
						col++;
					}
					System.out.print("@");
					col++;
				}
				System.out.println();//����
			}
			for(int j =0; j<m;j++){//����ͬ������
				if(j==0||j==m-1){//�ų���һ�к����һ��
				    for(int i=0;i<col;i++){
				      System.out.print("@");
			        }
				}else{//�м���
				   System.out.print("@");
				   for(int g =0; g<col-2;g++){//��ӡ��ͷβ��������пո�
					   System.out.print(".");
				   }
				   System.out.println("@");
				}
				System.out.println();//����
			}
	}			
	

}
