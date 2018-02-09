package thread5;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileTest {
	private AtomicInteger i = new AtomicInteger(0);
	public void increase() {
		i.getAndIncrement();
	}
	public void go() {
		for (int i = 0; i < 30; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					for (int j = 0; j < 1000; j++) {
						increase();
					}
				}
			}).start();
		}
		while(Thread.activeCount()!=1) {}
		System.out.println(i);
	}
	public static void main(String[] args) {
		new VolatileTest().go();
	}
}
