package myPcg15;

public class CH07_02 {
	
	

	
	public static void main(String[] args) {
		
		//ͼ�θ��ߵ����ֵ���յ�ֵ
		int[][] data = {{1,2},{2,1},{2,3},{2,4},{4,3}};
		int[][] arr = new int[5][5];
		int i,j,k,tempi,tempj;
		//��������
		for(i=0;i<5;i++ ) {
			for(j=0;j<5;j++) {
				arr[i][j] = 0;
			}
		}
		
		//��ȡͼ������
		//�������
		for (i = 0;  i < 5; i++) {
			for(j = 0 ; j < 5 ;j++) {
					tempi = data[i][0];
					tempj = data[i][1];
					arr[tempi][tempj] = 1;
			}
		}
		
		System.out.println("����ͼ�Ծ���");
		for(i = 1 ; i < 5 ; i++) {
			for(j = 1 ; j < 5 ;j++) {
				System.out.print("["+arr[i][j]+"]");
			}
			System.out.println();
		}
	}



}
