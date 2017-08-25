package 类;

public class Fang {

	public static void main(String[] args) {
		
		int[] array ={1,3,5,7,9};		
		int[] array1 ={2,4,6,8};
		
//		int[] result = addElement(array, 3);
		
//		int[] result = removeElementFromIndex(array, 2);
		
//		int[] result = subArray(array, 1, 3);
		
//		int[] result = removeElementByIndex(array, 3);
		
//		int[] result = sort(array);	
//		
//		int[] result = addAll(array, array1);
		
		printArr(array);
		
		System.out.println();
		
//		printArr(result);
	}

		//数组输出
	public static void printArr(int[] array) {
		for (int i : array) {
			System.out.print(i+"\t");
		}		
	}
	    // 元素追加
		public static int[] addElement(int[] array, int data) {

			int[] result = new int[array.length + 1];

			for (int i = 0; i < array.length; i++) {
				result[i] = array[i];
			}

			result[result.length-1] = data;

			return result;
		}
		
		// 数组删除
		public static int[] removeElementFromIndex(int[] array, int index) {

			int[] result;

			result = new int[index];
			for (int i = 0; i < index; i++) {
				result[i] = array[i];

			}

			return result;
		}
		
		//数组截取
		public static int[] subArray(int[] array , int from , int to){
			int length = to - from +1 ;
			int[] result = new int[length];
			System.arraycopy(array, from, result, 0, length);
			
			return result;
		}
		
		//根据下标 删除元素
		public static int[] removeElementByIndex( int[] array , int index){
			int length = array.length - 1;
			int[] result = new int[ length ];
			
			for(int i = 0 ; i < index ; i ++ ) {
				result[i] = array[i];
			}

			for( int i = index ; i < length ; i++ ) {
				result[i] = array[i+1];
			}
			
			return result;
		}
		
		//数组排序
		public static int[] sort(int[] array){
			int length = array.length;
			int[]result = new int[length];
			for(int i=0;i<length;i++){
				for(int j=0;j<length-i-1;j++){
					if(array[j]<array[j+1]){
						int t = array[j];
						array[j] = array[j+1];
						array[j+1] = t;
						
					}
				}
			}					
		    return result;
		}
		
		//数组+数组
		public static int[] addAll(int[] array , int[]array1){
		    int length = (array.length + array1.length);
		    int[] result = new int[length];
		    
		    for(int i = 0 ; i < array.length ; i ++ ) {
				result[i] = array[i];
			}
			for( int i = 0 ; i < array1.length ; i++ ) {
				result[i+array.length] = array1[i];
			}
			return result;	
		}
			
}
