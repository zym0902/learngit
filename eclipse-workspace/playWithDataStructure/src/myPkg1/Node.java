package myPkg1;

public class Node {
	
	public int value;
	public Node next;
	public Node first;
	public Node last;
	
	public Node(int value) {
		this.value = value;
		this.next = null;
		this.first = null;
		this.last = null;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+value+"]";
	}
}
