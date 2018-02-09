package myPcg5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CH04_03 {
	
	public static void main(String[] args) throws Exception{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		StackByLink stack_by_link = new StackByLink();
		int choice = 0;
		while(true) {
			System.out.println("(0)结束(1)在堆栈中加入数据(3)弹出堆栈数据");
			choice = Integer.parseInt(buf.readLine());
			if(choice == 2) {
				stack_by_link.pop();
				System.out.println("数据弹出后的堆栈内容：");
				stack_by_link.output_of_Stack();
			}else if(choice == 1) {
				System.out.println("请输入要加入堆栈的内容：");
				choice = Integer.parseInt(buf.readLine());
				stack_by_link.insert(choice);
				System.out.println("数据加入后的堆栈内容：");
				stack_by_link.output_of_Stack();
			}else if(choice == 0) {
				break;
			}else {
				System.out.println("输入错误！");
			}
		}
	}

}
