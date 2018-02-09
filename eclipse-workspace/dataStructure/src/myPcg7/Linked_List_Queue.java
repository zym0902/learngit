package myPcg7;

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
			front = node;
		}else {
			rear.next = node;
		}
		rear = node;
		return true;
	}
	
	public int dequeue() {
		int value;
		if(!(front == null)) {
			if(rear == front) {
				rear = null;
			}
			value = front.data;
			front = front.next;
			return value;
		}else {
			return -1;
		}
	}

}
