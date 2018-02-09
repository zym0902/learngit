package thread9;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTest {
	
	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		
		FutureTask<Integer> callable = new FutureTask<>(t);
		
		new Thread(callable,"有返回值的线程").start();
		
		try {
			System.out.println(callable.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
class MyThread implements Callable<Integer>{
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return 1;
	}
}
