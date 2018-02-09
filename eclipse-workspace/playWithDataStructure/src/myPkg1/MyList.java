package myPkg1;

public interface MyList {

	public void initList();
	public boolean listEmpty();
	public void clearList();
	public Node getElement(int location);
	public boolean locateElement(Node element);
	public void listInsert(int location,Node element);
	public Node listDelete(int location);
	public int listLength();
	public boolean insert(Node node);
	public void unionList(MyList listA,MyList listB);
	
}
