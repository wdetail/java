package 周末;

import java.util.Scanner;

public class Ye_1 {

	public static void main(String[] args) {
		/**
		 *     ******   4空格   5*   1* 
		 *    ****** *  3空格   5*   1*  1空  1*
		 *   ******   * 2空格   5*   1*  3空   1*
		 *  ******     *              5空
		 * ******       *
		 *   共14列  5行
		 */
			System.out.print("打印一个房子,请输入房子大小");
			Scanner s =new Scanner(System.in);
			int m = 4;
			int col =0; //取得最后一次  的列数 因为每次循环col重置为0
			for(int  i =0 ; i<m;i++){
				col=0;
				for(int j=0;j<m-i-1;j++){//打印前方空格
					System.out.print(".");
					col++;
				}
				for(int n=0;n<m;n++){//打印共同拥有的*
					System.out.print("@");
					col++;
				}
				if(i==0){//打印第一行*  特例
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
				System.out.println();//换行
			}
			for(int j =0; j<m;j++){//上下同等行数
				if(j==0||j==m-1){//排除第一行和最后一行
				    for(int i=0;i<col;i++){
				      System.out.print("@");
			        }
				}else{//中间行
				   System.out.print("@");
				   for(int g =0; g<col-2;g++){//打印除头尾以外的所有空格
					   System.out.print(".");
				   }
				   System.out.println("@");
				}
				System.out.println();//换行
			}
	}			
	

}
