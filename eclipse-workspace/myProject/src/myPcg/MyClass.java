package myPcg;

public class MyClass {
	
	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true) {
					System.out.println("AAA");
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true) {
					System.out.println("BBBBBBBBBBB");
				}
			}
			
		}).start();
		
		
	}

}
