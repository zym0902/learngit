package myPkg3;

import java.util.Random;

public class LinkList {
	
	LinkList list = null;
	Node first = null;
	Node last = null;
	
	public Node getElement(int i) {
		Node newNode = first;
		int temp = 0;
		while(newNode != null ) {
			if(temp == i) {
				break;
			}
			temp++;
			newNode = newNode.next;
		}
		return newNode;
	}
	
	public void listInsert(int i ,Node node) {
		Node currentNode = first;
		Node newNode = first;
		int temp = 0;
		while(temp != i) {
			newNode = currentNode;
			currentNode = currentNode.next;
			temp++;
		}
		node.next = currentNode;
		newNode.next = node;
	}
	
	public void listDelete(int i) {
		Node newNode = first;
		Node currentNode = first;
		int temp = 0;
		while(temp+1 != i) {
			newNode = currentNode;
			currentNode = currentNode.next;
			temp++;
		}
		newNode.next = currentNode.next;
	}
	
	public void createListTail(int n) {
		for (int i = 0; i < n ; i++) {
			Random r = new Random(47);
			Node node = new Node(r.nextInt());
			if(i == 0) {
				first = node;
			}else {
				last.next = node;
				last = node;
			}
		}
	}
	
	public void clearList() {
		Node node = first;
		Node tempNode = null;
		while(node != null) {
			tempNode = node.next;
			node = null;
			node = tempNode;
		}
	}

}
