package myPcg1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CH03_01 {
	
	public static void main(String[] args) throws IOException{
		
		
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		int num;
		String name;
		int score;
		
		LinkedList list = new LinkedList();
		for(int i = 1 ; i < 6 ; i++) {
			num = Integer.parseInt(buf.readLine());
			
			name = buf.readLine();
			
			score = Integer.parseInt(buf.readLine());
			
			list.insert(num, name, score);
		}
		
		list.print();
	}

}
