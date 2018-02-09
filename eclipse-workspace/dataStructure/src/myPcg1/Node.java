package myPcg1;

public class Node {
	
	int data;
	int np;
	String name;
	Node next;
	
	public Node(int data,String name,int np) {
		this.np=np;
		this.name=name;
		this.data=data;
		this.next=null;
	}

}
