package thread2;

public class SafeThread {

	
	public static void main(String[] args) {
		
		SafeThread st = new SafeThread();
		st.test();
		
	}
	
	V v = new V();
	public void test() {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true) {
					v.printString("AAAAAAAAAA");
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true) {
					v.printString("DDDDDDDDDD");
				}
			}
		}).start();
	}
	
	
	
	class V{
		Object obj = new Object();
		public void printString(String str) {
			for (int i = 0; i < str.length(); i++) {
				System.out.print(str.charAt(i));
			}
			System.out.println();
		}
	}
	
}
