package myPcg13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ch06_06 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int i,value;
		int[] arr = {7,4,1,5,13,8,11,12,15,9,2};
		System.out.println("ԭʼ��������");
		for(i = 0 ; i < 11 ; i++) {
			System.out.print("["+arr[i]+"]");
		}
		System.out.println();
		
		BinarySearch tree = new BinarySearch();
		for (i = 0; i < 11; i++) {
			tree.addNodeToTree(arr[i]);
		}
		
		System.out.println("��������ֵ");
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		value = Integer.parseInt(keyin.readLine());
		
		if(tree.findTree(tree.rootNode, value)) {
			System.out.println("��Ҫ�ҵ�ֵ["+value+"]�Ѿ��ҵ�");
		}else {
			System.out.println("��Ǹû�ҵ�");
		}
		
		
	}

}
