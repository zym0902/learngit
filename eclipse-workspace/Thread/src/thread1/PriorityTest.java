package thread1;

public class PriorityTest {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.setName("AAA");
		
		MyThread t2 = new MyThread();
		t2.setPriority(Thread.MIN_PRIORITY);
		t2.setName("SSS");
		
		
		t2.start();t1.start();
		
		
	}
	
	
}
