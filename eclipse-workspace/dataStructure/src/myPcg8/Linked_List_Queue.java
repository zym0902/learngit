package myPcg8;

public class Linked_List_Queue {

	
	public QueueNode front;
	public QueueNode rear;
	
	public Linked_List_Queue() {
		front = null;
		rear = null;
	}
	
	public boolean enqueue(int value) {
		QueueNode node = new QueueNode(value);
		if(rear == null) {
			rear = node;
		}else {
			rear.next = node;
		}
		rear = node;
		return true;
	}
	
	public int dequeue(int action) {
		int value;
		QueueNode tmpNode,startNode;
		
		if(!(front == null) && (action == 1)) {
			if(front == rear) {
				rear = null;
			}
			value = front.data;
			front = front.next;
			return value;
		}else if(!(rear == null) && (action == 2)){
			startNode = front;
			value = rear.data;
			tmpNode = front;
			
			while(front.next != rear && front.next != null) {
				front = front.next;
				tmpNode = front;
			}
			
			front = startNode;
			rear = tmpNode;
			
			if((front.next==null) || (rear.next == null) ) {
				front = null;
				rear = null;
			}
			
			return value;
		}else {
			return -1;
		}
	}
	
}
