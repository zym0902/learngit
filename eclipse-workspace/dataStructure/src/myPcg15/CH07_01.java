package myPcg15;

public class CH07_01 {
	
	public static void main(String[] args) {
		
		//ͼ�θ��ߵ����ֵ���յ�ֵ
		int[][] data = {{1,2},{2,1},{1,5},{5,1},{2,3},{3,2},{2,4},{4,2},{3,4},{4,3},{3,5},{5,3},{4,5},{5,4}};
		int[][] arr = new int[6][6];
		int i,j,k,tempi,tempj;
		//��������
		for(i=0;i<6;i++ ) {
			for(j=0;j<6;j++) {
				arr[i][j] = 0;
			}
		}
		
		//��ȡͼ������
		//�������
		for (i = 0;  i < 14; i++) {
			for(j = 0 ; j < 6 ;j++) {
					tempi = data[i][0];
					tempj = data[i][1];
					arr[tempi][tempj] = 1;
			}
		}
		
		System.out.println("����ͼ�Ծ���");
		for(i = 1 ; i < 6 ; i++) {
			for(j = 1 ; j < 6 ;j++) {
				System.out.print("["+arr[i][j]+"]");
			}
			System.out.println();
		}
	}

}
