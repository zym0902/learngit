package sort1;

//ѡ������
public class CH08_03 {

	/**
	 * ÿ�ζ�ѡ����������Сֵ��ǰ��δ�������ֵ���н���
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
