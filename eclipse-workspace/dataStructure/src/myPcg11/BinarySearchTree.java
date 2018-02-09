package myPcg11;

public class BinarySearchTree {

	public TreeNode rootNode;
	public BinarySearchTree() {
		rootNode = null;
	}
	
	public BinarySearchTree(int[] data) {
		for (int i = 0; i < data.length; i++) {
			addToTree(data[i]);
		}
	}
	
	
	public void addToTree(int value) {
		TreeNode currentNode = rootNode;
		if(rootNode == null) {
			rootNode = new TreeNode(value);
			return;
		}
		
		while(true) {
			if(value < currentNode.value) {
				if(currentNode.leftNode == null) {
					currentNode.leftNode = new TreeNode(value);
					return;
				}else {
					currentNode = new TreeNode(value);
				}
			}else {
				if(currentNode.rightNode == null) {
					currentNode.rightNode = new TreeNode(value);
					return;
				}else {
					currentNode = new TreeNode(value);
				}
			}
		}
	}
	
	
	
}
