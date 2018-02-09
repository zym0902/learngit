package thread3;

import java.util.LinkedList;

public class Container {
	
	private LinkedList<Product> list = new LinkedList<>();
	private final int max = 10;
	
	public synchronized void addProduct(Product p) throws InterruptedException {
		while(size()>=max) {
			wait();
		}
		list.addLast(p);
		notifyAll();
	}
	
	public synchronized Product getProduct() throws InterruptedException {
		while(size()<=0) {
			wait();
		}
		Product p = list.removeFirst();
		notifyAll();
		return p;
	}
	
	public int size(){
		return list.size();
	}

}
