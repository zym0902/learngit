package myPcg6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CH05_01 {
	
	public static int front = -1,rear = -1 , max = 20;
	public static int val;
	public static char ch;
	public static int queue[] = new int[max];
	public static void main(String[] args) throws Exception {
		String strM;
		int M = 0;
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		while(rear<max-1 && M!= 3) {
			System.out.println("[1]����һ����ֵ[2]ȡ��һ����ֵ[3]����");
			strM = keyin.readLine();
			M = Integer.parseInt(strM);
			switch(M) {
			case 1:
				System.out.println("\n[��������ֵ]");
				strM = keyin.readLine();
				val = Integer.parseInt(strM);
				rear++;
				queue[rear] = val;
				break;
			case 2:
				if(rear > front) {
					front++;
					System.out.println("\n[ȡ����ֵΪ]:["+queue[front]+"]"+"\n");
					queue[front] = 0;
				}else {
					System.out.println("\n[�����ѿ�]\n");
					break;
				}
				break;
				default:
					System.out.println("\n");
					break;
			}
		}
		if(rear == max-1) {
			System.out.println("��������");
		}
		System.out.println("Ŀǰ�����е�����");
		if(front >= rear) {
			System.out.println("û��\n");
			System.out.println("�����Ѿ���");
		}else {
			while(rear > front) {
				front++;
				System.out.print("["+queue[front]+"]");
			}
			System.out.println(  );
		}
	}
	

}
