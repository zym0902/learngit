package myPcg9;

public class CH06_01 {
	
	public static void main(String[] args) {
		
		int i,level;
		int data[] = {6,3,5,9,7,8,4,2};
		int btree[] = new int[16];
		
		for(i = 0 ; i < 8 ; i ++) {
			for(level = 1 ; btree[level] != 0 ;) {
				
				if(data[i] > btree[level]) {
					level = level*2+1;
				}else {
					level = level*2;
				}
				
			}
			btree[level] = data[i];
		}
		
		
	}

}
