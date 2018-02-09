package myPcg4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CH04_01 {
	
	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int value = 0;
		StackByArray stack = new StackByArray(10);
		System.out.println("请依次输入10个数据");
		for (int i = 0; i < 10; i++) {
			value = Integer.parseInt(buf.readLine());
			stack.push(value);
		}
		
		System.out.println("============");
		while(!stack.isEmpty()) {
			System.out.println("堆栈弹出的顺序为"+stack.pop());
		}
	}

}
