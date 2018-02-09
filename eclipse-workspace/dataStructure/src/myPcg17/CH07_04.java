package myPcg17;

public class CH07_04 {
	
	public static int[] run = new int[9];
	public static GraphLink head[] = new GraphLink[9];
	
	//深度优先遍历
	public static void dfs(int current) {
		run[current] = 1;
		System.out.print("["+current+"]");
		
		while(head[current].first != null) {
			if(run[head[current].first.x] == 0) {
				dfs(head[current].first.x);
			}
			head[current].first = head[current].first.next;
		}
	}

}
