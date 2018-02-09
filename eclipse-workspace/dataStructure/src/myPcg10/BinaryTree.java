package myPcg10;

public class BinaryTree {

	TreeNode rootNode;
	
	public BinaryTree(int[] data) {
		for (int i = 0; i < data.length; i++) {
			Add_Node_To_Tree(data[i]);
		}
	}
	
	public void Add_Node_To_Tree(int value) {
		TreeNode currentNode = rootNode;
		if(rootNode == null) {
			rootNode = new TreeNode(value);
			return;
		}
		
		while(true) {
			
			if(value < currentNode.value) {
				if(currentNode.left_node == null) {
					currentNode.left_node = new TreeNode(value);
					return;
				}else {
					currentNode = currentNode.left_node;
				}
			}else {
				if(currentNode.right_node == null) {
					currentNode.right_node = new TreeNode(value);
					return;
				}else {
					currentNode = currentNode.right_node;
				}
			}
		}
	}
	
	public void inOrder(TreeNode node) {
		if(node != null) {
			inOrder(node.left_node);
			System.out.println("["+node.value+"]");
			inOrder(node.right_node);
		}
	}
	
	public void preOrder(TreeNode node) {
		if(node != null) {
			System.out.println("["+node.value+"]");
			preOrder(node.left_node);
			preOrder(node.right_node);
		}
	}
	
	public void postOrder(TreeNode node) {
		if(node != null) {
			postOrder(node.left_node);
			postOrder(node.right_node);
			System.out.println("["+node.value+"]");
		}
	}
	
	
	
}
