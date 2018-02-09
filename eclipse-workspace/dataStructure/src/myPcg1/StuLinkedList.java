package myPcg1;

public class StuLinkedList {
	
	private Node first;
	private Node last;
	
	public boolean isEmpty() {
		return first==null;
	}
	
	public void print() {
		Node current = first;
		while(current != null) {
			System.out.println("["+current.data+","+current.name+","+current.np+"]");
			current = current.next;
		}
		System.out.println();
	}
	
	public void insert(int data,String name,int np) {
		Node newNode = new Node(data,name,np);
		if(isEmpty()) {
			first = newNode;
			last = newNode;
		}else {
			last.next = newNode;
			last = newNode;
		}
	}
	
	public void insert(Node ptr) {
		Node tmp;
		Node newNode;
		if(isEmpty()) {
			first = ptr;
			last = ptr;
		}else {
			if(ptr.next == first) {
				ptr.next = first;
				first = ptr;
			}else {
				if(ptr.next == null) {
					last.next = ptr;
					last = ptr;
				}else {
					newNode = first;
					tmp = first;
					while(ptr.next != newNode.next) {
						tmp = newNode;
						newNode = newNode.next;
					}
					tmp.next = ptr;
					ptr.next = newNode;
				}
			}
		}
		
	}
	
	public void delete(Node delNode){
		Node newNode;
		Node tmp;
		if(first.data == delNode.data) {
			first = first.next;
		}else if(last.data == delNode.data) {
			newNode = first;
			while(newNode.next != last) {
				newNode = newNode.next;
			}
			newNode.next = last.next;
			last = newNode;
		}else {
			newNode = first;
			tmp = first;
			while(newNode.data != delNode.data) {
				tmp = newNode;
				newNode = newNode.next;
			}
			tmp.next = newNode.next;
		}
		
	}

	public LinkedList concatenate(LinkedList head1,LinkedList head2) {
		LinkedList ptr = head1;
		while(ptr.last.next != null) {
			ptr.last = ptr.last.next;
		}
		ptr.last.next = head2.first;
		return head1;
	}


}
