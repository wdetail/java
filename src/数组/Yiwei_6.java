package 数组;


public class Yiwei_6 {
		public static  void main(String[]args){
			int a[]={18,25,7,36,23,2,89,63};
			int max =a[0];
			int dex =0;
			for(int i=0;i<a.length;i++){
				if(a[i]>max){
					max =a[i];
					dex =i;
				}
			}
			System.out.print("最大值为"+max+"下标为 "+dex);
	}
}
