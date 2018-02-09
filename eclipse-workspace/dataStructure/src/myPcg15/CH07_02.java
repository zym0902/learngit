package myPcg15;

public class CH07_02 {
	
	

	
	public static void main(String[] args) {
		
		//图形各边的起点值及终点值
		int[][] data = {{1,2},{2,1},{2,3},{2,4},{4,3}};
		int[][] arr = new int[5][5];
		int i,j,k,tempi,tempj;
		//矩阵清零
		for(i=0;i<5;i++ ) {
			for(j=0;j<5;j++) {
				arr[i][j] = 0;
			}
		}
		
		//读取图形数据
		//填入矩阵
		for (i = 0;  i < 5; i++) {
			for(j = 0 ; j < 5 ;j++) {
					tempi = data[i][0];
					tempj = data[i][1];
					arr[tempi][tempj] = 1;
			}
		}
		
		System.out.println("无向图性矩阵");
		for(i = 1 ; i < 5 ; i++) {
			for(j = 1 ; j < 5 ;j++) {
				System.out.print("["+arr[i][j]+"]");
			}
			System.out.println();
		}
	}



}
