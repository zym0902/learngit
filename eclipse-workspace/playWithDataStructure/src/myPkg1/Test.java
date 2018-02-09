package myPkg1;

public class Test {
	
	public static void main(String[] args) {
		
		LinkListImpl list = new LinkListImpl();
		for (int i = 0; i < 10; i++) {
			list.insert(new Node(i));
		}
		

	System.out.println(list.locateElement(new Node(11)));
		
	}

}
