package myPcg12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CH06_05 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int value;
		BinaryTree tree = new BinaryTree();
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���������ݣ�����ʱ������-1");
		while(true) {
			value = Integer.parseInt(keyin.readLine());
			if(value == -1) {
				break;
			}
			tree.addNodeToTree(value);
		}
		System.out.println("========");
		System.out.println("������ɽ��");
		tree.inOrder(tree.rootNode);
		
		
		
	}
	
	
}
