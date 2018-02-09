package myPcg1;

public class LinkedList {
	
	public Node first;
	public Node last;	

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
	

}
