package myPcg5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CH04_03 {
	
	public static void main(String[] args) throws Exception{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		StackByLink stack_by_link = new StackByLink();
		int choice = 0;
		while(true) {
			System.out.println("(0)����(1)�ڶ�ջ�м�������(3)������ջ����");
			choice = Integer.parseInt(buf.readLine());
			if(choice == 2) {
				stack_by_link.pop();
				System.out.println("���ݵ�����Ķ�ջ���ݣ�");
				stack_by_link.output_of_Stack();
			}else if(choice == 1) {
				System.out.println("������Ҫ�����ջ�����ݣ�");
				choice = Integer.parseInt(buf.readLine());
				stack_by_link.insert(choice);
				System.out.println("���ݼ����Ķ�ջ���ݣ�");
				stack_by_link.output_of_Stack();
			}else if(choice == 0) {
				break;
			}else {
				System.out.println("�������");
			}
		}
	}

}
