package thread4;

import java.util.LinkedList;

public class Container {
	
	private LinkedList<Product> list = new LinkedList<>();
	private final int max = 10;
	private final int min = 0;
	
	public synchronized void addProduct(Product p) throws Exception {
		while(list.size()>=max) {
			wait();
		}
		list.addLast(p);
		System.out.println(">>>>>>生产好了一个产品"+p);
		notifyAll();
	}
	
	public synchronized void getProduct() throws Exception {
		while(list.size()<=min){
			wait();
		}
		Product p = list.removeFirst();
		System.out.println("<<<<<<消费了一个产品"+p);
		notifyAll();
	}
	
	public int size() {
		return list.size();
	}

}
