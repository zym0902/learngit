package sort1;


//冒泡排序
public class CH08_01 {

	/**
	 * 冒泡排序即每趟排序将最大元素置后
	 * 然后依次减小比较队列
	 * 因为最大元素已经置后，无需再进行比较
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] data = {6,5,9,7,2,8};
		int temp = 0;
		
		for(int i = 5 ; i > 0 ;i --) {
			for(int j = 0 ; j < i ; j ++) {
				if(data[j] > data[j+1]) {
					temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
		
		for (int i = 0; i < data.length; i++) {
			System.out.print("["+data[i]+"]");
		}
		
		
	}
	
	
	
}
