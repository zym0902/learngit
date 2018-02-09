package thread1;

public class MyThread extends Thread{
	
	private int i;
	@Override
	public void run() {
		while(i++ < 1000) {
			System.out.println(this.getName()+":i="+i);
		}
	}
	

}
