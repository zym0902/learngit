package sort1;

//������ð������
public class Ch08_02 {
	/**
	 *ÿ��ɨ�趼����flag����ֵ
	 *���ĳһ����flagΪ0��˵���Ѿ��ź���
	 *�����ټ���ʣ���ѭ�����������˳� 
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
