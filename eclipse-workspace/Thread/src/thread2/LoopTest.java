package thread2;

public class LoopTest {
	
	public static void main(String[] args) {
		V v = new V();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true) {
					try {
						v.f1();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true) {
					try {
						v.f2();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
	
	

}

class V{
	boolean flag = false;
	
	public synchronized void f1() throws Exception {
		while(!flag) {
			wait();
		}
		System.out.println(Thread.currentThread().getName());
		flag = false;
		notifyAll();
	}
	
	public synchronized void f2() throws Exception {
		while(flag) {
			wait();
		}
		System.out.println(Thread.currentThread().getName());
		flag = true;
		notifyAll();
	}
	
}
