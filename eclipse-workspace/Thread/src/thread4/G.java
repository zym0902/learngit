package thread4;

public class G {
	
	private static Container c = new Container();
	private static int id = 0;
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					while(true) {
						Product p = new Product(id, "id"+id++);
						try {
							c.addProduct(p);
							Thread.sleep(1000);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}).start();
		}
		
		for (int i = 0; i < 3; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					while(true) {
						try {
							c.getProduct();
							Thread.sleep(1000);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}).start();
		}
		while(true) {
			try {
				Thread.sleep(1000);
				System.err.println(c.size());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	

}
