package sort1;

//选择排序
public class CH08_03 {

	/**
	 * 每次都选出最大或者最小值与前方未排序的数值进行交换
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		int[] data = {9,7,5,3,4,6};
		int temp = 0;
		for(int i = 0 ; i < 5 ;i ++) {
			for(int j = i+1 ;j < 6 ; j++) {
				if(data[i]>data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < data.length; i++) {
			System.out.print("["+data[i]+"]");
		}
		
		
	}
}
