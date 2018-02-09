package thread6;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
	V v = new V();
	public static void main(String[] args) {
		new LockTest().go();
	}
	private void go() {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true) {
					v.printS("AAA");
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true) {
					v.printS("SSS");
				}
			}
		}).start();
	}
}
class V{
	Lock lock = new ReentrantLock(true);
	public void printS(String s) {
		lock.lock();
		
		try {
			for (int i = 0; i < s.length(); i++) {
				System.out.print(s.charAt(i));
			}
			System.out.println();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
		
	}
}