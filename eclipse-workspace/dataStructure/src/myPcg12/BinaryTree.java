package myPcg12;

public class BinaryTree {
	
	public TreeNode rootNode;
	
	public void addNodeToTree(int value) {
		if(rootNode == null) {
			rootNode = new TreeNode(value);
			return;
		}
		TreeNode currentNode = rootNode;
		while(true) {
			if(value < currentNode.value) {
				if(currentNode.leftNode == null) {
					currentNode.leftNode = new TreeNode(value);
					return;
				}else {
					currentNode = currentNode.leftNode;
				}
			}else {
				if(currentNode.rightNode == null) {
					currentNode.rightNode = new TreeNode(value);
					return;
				}else {
					currentNode = currentNode.rightNode;
				}
			}
		}
	}
	
	public void inOrder(TreeNode node) {
		if(node != null) {
			inOrder(node.leftNode);
			System.out.print("["+node.value+"]");
			inOrder(node.rightNode);
		}
	}
	
	public void preOrder(TreeNode node) {
		if(node != null) {
			System.out.println(node.value);
			preOrder(node.leftNode);
			preOrder(node.rightNode);
		}
	}
	
	public void postOrder(TreeNode node) {
		if(node != null) {
			postOrder(node.leftNode);
			postOrder(node.leftNode);
			System.out.println(node.value);
		}
	}

}
