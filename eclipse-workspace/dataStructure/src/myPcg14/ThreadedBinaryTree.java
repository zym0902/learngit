package myPcg14;

public class ThreadedBinaryTree {
	
	//线索二叉树的根节点
	public ThreadNode rootNode;
	
	//无参构造函数
	public ThreadedBinaryTree() {
		rootNode = null;
	}
	
	/**
	 * 构造函数：建立线索二叉树，传入参数为一个数组
	 * 数组中的第一个数据用来建立线索二叉树的根节点
	 * @param data
	 */
	public ThreadedBinaryTree(int[] data) {
		for (int i = 0; i < data.length; i++) {
			addNodeToTree(data[i]);
		}
	}
	
	public void addNodeToTree(int value) {
		ThreadNode newNode = new ThreadNode(value);
		ThreadNode currentNode;
		ThreadNode parentNode;
		ThreadNode previousNode = new ThreadNode(value);
		int pos = 0;
		
		//设定线索二叉树的开头节点
		if(rootNode == null) {
			rootNode = newNode;
			rootNode.leftNode = rootNode;
			rootNode.rightNode = null;
			rootNode.leftThread = 0;
			rootNode.rightThread = 1;
			return;
		}
		
		//设定开头节点所指的节点
		currentNode = rootNode.rightNode;
		if(currentNode == null) {
			rootNode.rightNode = newNode;
			newNode.leftNode = rootNode;
			newNode.rightNode = rootNode;
			return;
		}
		
		parentNode = rootNode;//父节点是开头节点
		pos = 0;//设定二叉树中的行进方向
		while(currentNode != null) {
			if(currentNode.value > value) {
				if(pos != -1) {
					pos = -1;
					previousNode = parentNode;
				}
				parentNode = currentNode;
				if(currentNode.leftThread == 1) {
					currentNode = currentNode.leftNode;
				}else {
					currentNode = null;
				}
			}else {
				if(pos != -1) {
					pos = 1;
					previousNode = parentNode;
				}
				parentNode = currentNode;
				if(currentNode.rightThread == 1) {
					currentNode = currentNode.rightNode;
				}else {
					currentNode = null;
				}
			}
		}
		
		if(parentNode.value >value) {
			parentNode.leftThread = 1;
			parentNode.leftNode = newNode;
			newNode.leftNode = previousNode;
			newNode.leftNode.rightNode = parentNode;
		}else {
			parentNode.rightThread = 1;
			parentNode.rightNode = newNode;
			newNode.leftNode = parentNode;
			newNode.rightNode = previousNode;
		}
		return;
	}
	
	public void print() {
		ThreadNode tempNode = rootNode;
		do {
			if(tempNode.rightThread == 0) {
				tempNode = tempNode.rightNode;
			}else {
				tempNode = tempNode.rightNode;
				while(tempNode.leftThread != 0) {
					tempNode = tempNode.leftNode;
				}
			}
			if(tempNode != rootNode) {
				System.out.println("["+tempNode.value+"]");
			}
		}while(tempNode != rootNode);
	}

}
