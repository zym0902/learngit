package myPcg2;

public class CricleLink {
	
	public Node first;
	public Node last;
	
	public boolean isEmpty() {
		return first==null;
	}
	
	public void print() {
		Node current = first;
		while(current != last) {
			System.out.println("["+current.data+"]");
			current = current.next;
		}
		System.out.println("["+current.data+"]");
		System.out.println();
	}
	
	public void insert(Node trp) {
		Node tmp;
		Node newNode;
		if(isEmpty()) {
			first = trp;
			last = trp;
			last.next = first;
		}else if(trp.next == null) {
			last.next = trp;
			last = trp;
			last.next = first;
		}
		{
			newNode = first;
			tmp = first;
			while(newNode.next != trp.next) {
				if(tmp.next == first) {
					break;
				}
				tmp = newNode;
				newNode = newNode.next;
			}
			tmp.next = trp;
			trp.next = newNode;
		}
	}
	
	public void delete(Node delNode) {
		Node newNode;
		Node tmp;
		if(isEmpty()) {
			System.out.println("环形列表已经为空\n");
			return;
		}
		if(first.data == delNode.data) {
			first = first.next;
			if(first == null) {
				System.out.println("环形列表已经为空\n");
			}
			return;
		}else if(last.data == delNode.data) {
			newNode = first;
			while(newNode.next!=last) {
				newNode = newNode.next;
			}
			newNode.next = last.next;
			last = newNode;
			last.next = first;
		}else {
			newNode = first;
			tmp = first;
			while(newNode.data != delNode.data) {
				tmp = newNode;
				newNode = newNode.next;
			}
			tmp.next = delNode.next;;
		}
	}
	
	public CricleLink concat(CricleLink link) {
		this.last.next = link.first;
		this.last = link.last;
		return this;
	}

}
