package sort1;

//改良的冒泡排序
public class Ch08_02 {
	/**
	 *每趟扫描都计算flag的数值
	 *如果某一趟中flag为0，说明已经排好序
	 *无需再继续剩余的循环，即可以退出 
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] data = {6,5,9,7,2,8};
		int temp = 0;
		
		
		for(int i = 5 ; i > 0 ;i --) {
			int flag = 0;
			for(int j = 0 ; j < i ; j ++) {
				if(data[j] > data[j+1]) {
					temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
					flag++;
				}
			}
			if(flag == 0) {
				break;
			}
		}
		
		for (int i = 0; i < data.length; i++) {
			System.out.print("["+data[i]+"]");
		}
		
		
	}
	
	
	

}
