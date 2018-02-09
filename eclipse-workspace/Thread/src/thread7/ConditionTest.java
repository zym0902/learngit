package thread7;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionTest {
	
	
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
		},"AAAAAA").start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true) {
					v.f2();
				}
			}
		},"BBBBBB").start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true) {
					v.f3();
				}
			}
		},"CCCCCC").start();
	}

}
class V{
	Lock lock = new ReentrantLock();
	Condition c1 = lock.newCondition();
	Condition c2 = lock.newCondition();
	Condition c3 = lock.newCondition();
	
	int tocken = 1;
	public void f1() throws Exception {
		lock.lock();
		try {
			while(tocken != 1) {
				c1.await();
			}
			System.out.println(Thread.currentThread().getName());
			tocken = 2;
			c2.signalAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	public void f2() {

		lock.lock();
		try {
			while(tocken != 2) {
				c2.await();
			}
			System.out.println(Thread.currentThread().getName());
			tocken = 3;
			c3.signalAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	
	}
	public void f3() {

		lock.lock();
		try {
			while(tocken != 3) {
				c3.await();
			}
			System.out.println(Thread.currentThread().getName());
			tocken = 1;
			c1.signalAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	
	}
}