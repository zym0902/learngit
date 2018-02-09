package myPcg14;

public class ThreadedBinaryTree {
	
	//�����������ĸ��ڵ�
	public ThreadNode rootNode;
	
	//�޲ι��캯��
	public ThreadedBinaryTree() {
		rootNode = null;
	}
	
	/**
	 * ���캯���������������������������Ϊһ������
	 * �����еĵ�һ�������������������������ĸ��ڵ�
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
		
		//�趨�����������Ŀ�ͷ�ڵ�
		if(rootNode == null) {
			rootNode = newNode;
			rootNode.leftNode = rootNode;
			rootNode.rightNode = null;
			rootNode.leftThread = 0;
			rootNode.rightThread = 1;
			return;
		}
		
		//�趨��ͷ�ڵ���ָ�Ľڵ�
		currentNode = rootNode.rightNode;
		if(currentNode == null) {
			rootNode.rightNode = newNode;
			newNode.leftNode = rootNode;
			newNode.rightNode = rootNode;
			return;
		}
		
		parentNode = rootNode;//���ڵ��ǿ�ͷ�ڵ�
		pos = 0;//�趨�������е��н�����
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
