package myPcg16;

public class CH07_03 {

	public static void main(String[] args) {
		
		int[][] data = {
				{1,2},{2,1},
				{1,5},{5,1},
				{2,3},{3,2},
				{2,4},{4,2},
				{3,4},{4,3},
				{3,5},{5,3},
				{4,5},{5,4}
		};
		
		int dataNum;
		System.out.println("图形（a）的邻接表内容");
		GraphLink head[] = new GraphLink[6];
		for (int i = 0; i < 6; i++) {
			head[i] = new GraphLink();
			System.out.print("顶点"+i+"=>");
			for (int j = 0; j < 14; j++) {
				if(data[j][0] == i) {
					dataNum = data[j][1];
					head[i].insert(dataNum);
				}
			}
			head[i].print();
		}
		
		
		
		
	}
	
}
