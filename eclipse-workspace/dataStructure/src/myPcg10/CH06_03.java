package myPcg10;

public class CH06_03 {
	
	public static void main(String[] args) {
		
		int[] arr = {7,4,1,5,16,8,11,12,15,9,2};
		BinaryTree tree = new BinaryTree(arr);
		
		System.out.println("ǰ����������");
		tree.preOrder(tree.rootNode);
		System.out.println("������������");
		tree.inOrder(tree.rootNode);
		System.out.println("������������");
		tree.postOrder(tree.rootNode);
		
		
	}

}
