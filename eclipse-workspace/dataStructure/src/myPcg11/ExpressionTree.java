package myPcg11;

public class ExpressionTree extends BinarySearchTree{

	public ExpressionTree(char[] information,int index) {
		rootNode = create(information,index);
	}

	private TreeNode create(char[] sequence, int index) {
		
		TreeNode tempNode;
		if(index >= sequence.length) {
			return null;
		}else {
			tempNode = new TreeNode((int)sequence[index]);
			tempNode.leftNode = create(sequence, 2*index);
			tempNode.rightNode = create(sequence, 2*index+1);
			return tempNode;
		}
	}
	
	/**
	 * �������
	 * @param node
	 */
	public void inOrder(TreeNode node) {
		if(node != null) {
			System.out.println(node.value);
			inOrder(node.leftNode);
			inOrder(node.rightNode);
		}
	}
	/**
	 * ǰ�����
	 * @param node
	 */
	public void preOrder(TreeNode node) {
		if(node != null) {
			System.out.println(node.value);
			preOrder(node.leftNode);
			preOrder(node.rightNode);
		}
	}
	
	/**
	 * �������
	 * @param node
	 */
	public void postOrder(TreeNode node) {
		if(node != null) {
			postOrder(node.leftNode);
			postOrder(node.rightNode);
			System.out.println(node.value);
		}
	}
	
	/**
	 * �жϱ��ʽ�������ķ�������
	 */
	public int condition(char oprator,int num1,int num2) {
		switch(oprator) {
		case '*':
			return (num1*num2);
		case '/':
			return (num1/num2);
		case '+':
			return (num1+num2);
		case '-':
			return (num1-num2);
		}
		return -1;
	}
	
	/**
	 * ������ڵ㣬��������˶�����������ֵ
	 * @param node
	 * @return
	 */
	public int answer(TreeNode node) {
		int firstNumber = 0;
		int secondNumber = 0;
		if(node.leftNode == null && node.rightNode == null) {
			return Character.getNumericValue((char)node.value);
		}else {
			firstNumber = answer(node.leftNode);
			secondNumber = answer(node.rightNode);
			return condition((char)node.value,firstNumber,secondNumber);
		}
	}
	
}
