package myPcg3;

public class Doubly {
	
	public Node first;
	public Node last;
	
	public boolean isEmpty() {
		return first==null;
	}
	
	public void print() {
		Node current = first;
		while(current != null) {
			System.out.println("["+current.data+"]");
			current = current.rnext;
		}
		System.out.println();
	}
	
	/**
	 * 插入节点
	 */
	public void insert(Node newN) {
		Node tmp;
		Node newNode;
		if(this.isEmpty()) {
			first = newN;
			first.rnext = last;
			last = newN;
			last.lnext = first;
		}else {
			if(newN.lnext == null) {
				first.lnext = newN;
				newN.rnext = first;
				first = newN;
			}else {
				if(newN.rnext == null) {
					last.rnext = newN;
					newN.lnext = last;
					last = newN;
				}else {
					newNode = first;
					tmp = first;
					while(newN.rnext != newNode.rnext) {
						tmp = newNode;
						newNode = newNode.rnext;
					}
					//tmp --> newN --> newNode
					tmp.rnext = newN;
					newN.rnext = newNode;
					newNode.lnext = newN;
					newN.lnext = tmp;
				}
			}
		}
	}
	
	public void delete(Node delNode) {
		Node newNode;
		Node tmp;
		if(first == null) {
			System.out.println("表空\n");
			return;
		}
		if(delNode == null) {
			System.err.println("错误：不是表中的节点");
			return;
		}
		if(first.data == delNode.data) {
			first = first.rnext;
			first.lnext = null;
		}else if(last.data == delNode.data) {
			newNode = first;
			while(newNode.rnext != last) {
				newNode = newNode.rnext;
			}
			newNode.rnext = null;
			last = newNode;
		}else {
			newNode = first;
			tmp = first;
			while(newNode.data!=delNode.data) {
				tmp = newNode;
				newNode = newNode.rnext;
			}
			tmp.rnext = delNode.rnext;
			newNode.lnext = delNode.lnext;
		}
	}

}
