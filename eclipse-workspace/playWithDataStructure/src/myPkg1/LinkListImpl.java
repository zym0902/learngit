package myPkg1;

public class LinkListImpl implements MyList{

	Node first = null;
	Node last = null;
	
	@Override
	public void initList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean listEmpty() {
		// TODO Auto-generated method stub
		return first == null;
		//return listLength==0;
	}

	@Override
	public void clearList() {
		// TODO Auto-generated method stub
		first = null;
		first.value = 0;
	}

	@Override
	public Node getElement(int location) {
		// TODO Auto-generated method stub
		Node currentNode  = first;
		int tmp = 0;
		while(tmp != location) {
			++tmp;
			currentNode = currentNode.next;
		}
		return currentNode;
	}

	@Override
	public boolean locateElement(Node element) {
		// TODO Auto-generated method stub
		Node newNode  = first;
		boolean flag = true;
		while(newNode.value != element.value) {
			if(newNode.next == last && last != element) {
				flag = false;
				break;
			}
			newNode = newNode.next;
		}
		return flag;
	}

	@Override
	public void listInsert(int location, Node element) {
		// TODO Auto-generated method stub
		Node newNode = first;
		Node currentNode = first;
		int temp = 0;
		while(temp != location) {
			temp++;
			newNode = currentNode;
			currentNode = currentNode.next;
		}
		element.next = currentNode;
		newNode.next = element;
	}

	@Override
	public Node listDelete(int location) {
		// TODO Auto-generated method stub
		Node newNode = first;
		Node currentNode = first;
		int temp = 0;
		while(temp != location) {
			newNode = currentNode;
			currentNode = currentNode.next;
		}
		newNode.next = currentNode.next;
		return currentNode;
	}

	@Override
	public int listLength() {
		// TODO Auto-generated method stub
		Node currentNode = first;
		int tmp = 1;
		while(currentNode != last) {
			++tmp;
			currentNode = currentNode.next;
		}
		return tmp;
	}

	@Override
	public boolean insert(Node node) {
		// TODO Auto-generated method stub
		if(listEmpty()) {
			first = node;
			last = node;
		}else {
			last.next = node;
			last = node;
		}
		return true;
	}

	@Override
	public void unionList(MyList listA, MyList listB) {
		// TODO Auto-generated method stub
		int list_A_length = listA.listLength();
		Node node = null;
		for (int i = 0; i < list_A_length; i++) {
			node = getElement(i);
			if(!locateElement(node)) {
				listB.insert(node);
			}
		}
	}
	
}
