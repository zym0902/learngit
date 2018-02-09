package thread9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
	
	public static void main(String[] args) {
		
		ExecutorService es = Executors.newFixedThreadPool(10);
		//ExecutorService es = Executors.newCachedThreadPool();
		//ExecutorService es = Executors.newSingleThreadExecutor();
		
		for (int i = 0; i < 30 ; i++) {
			es.execute(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println(Thread.currentThread().getName());
				}
			});
		}
		es.shutdown();
		
	}

}
