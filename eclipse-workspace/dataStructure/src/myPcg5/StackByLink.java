package myPcg5;

public class StackByLink {
	
	public Node front;//ָ���ջ�Ͷ˵�ָ��
	public Node rear;//ָ���ջ���˵�ָ��
	
	public boolean isEmpty() {
		return front == null;
	}
	
	public void output_of_Stack() {
		Node current = front;
		while(current != null) {
			System.out.print("["+current.data+"]");
			current = current.next;
		}
		System.out.println();
	}
	
	public void insert(int data) {
		Node newNode = new Node(data);
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
		}else {
			rear.next = newNode;
			rear = newNode;
		}
	}
	
	public void pop() {
		Node newNode;
		if(isEmpty()) {
			System.out.println("ĿǰΪ�ն�ջ\n");
			return;
		}
		newNode = front;
		if(newNode == rear) {
			front = null;
			rear = null;
			System.out.println("ĿǰΪ�ն�ջ");
		}else {
			while(newNode.next != rear) {
				newNode = newNode.next;
			}
			newNode.next = rear.next;
			rear = newNode;
		}
	}

}
