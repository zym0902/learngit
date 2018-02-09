package myPcg13;

public class BinarySearch {

	public TreeNode rootNode;
	public static int count = 1;
	
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
	
	public boolean findTree(TreeNode node,int value) {
		if(node == null) {
			return false;
		}else if(node.value == value) {
			System.out.println("¹²ËÑË÷"+count+"´Î");
			return true;
		}else if(value < node.value) {
			count+=1;
			return findTree(node.leftNode, value);
		}else {
			count+=1;
			return findTree(node.rightNode,value);
		}
	}
	
}
