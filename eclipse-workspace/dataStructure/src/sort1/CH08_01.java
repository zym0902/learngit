package sort1;


//ð������
public class CH08_01 {

	/**
	 * ð������ÿ���������Ԫ���ú�
	 * Ȼ�����μ�С�Ƚ϶���
	 * ��Ϊ���Ԫ���Ѿ��ú������ٽ��бȽ�
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
