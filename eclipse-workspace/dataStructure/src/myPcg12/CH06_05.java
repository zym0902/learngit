package myPcg12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CH06_05 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int value;
		BinaryTree tree = new BinaryTree();
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入数据，结束时请输入-1");
		while(true) {
			value = Integer.parseInt(keyin.readLine());
			if(value == -1) {
				break;
			}
			tree.addNodeToTree(value);
		}
		System.out.println("========");
		System.out.println("排序完成结果");
		tree.inOrder(tree.rootNode);
		
		
		
	}
	
	
}
