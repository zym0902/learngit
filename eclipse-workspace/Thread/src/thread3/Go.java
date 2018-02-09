package thread3;

public class Go {
	
	public static int id = 0;
	public static Container c = new Container();
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					while(true) {
						Product p = new Product(id, "product"+id++);
						
						try {
							Thread.sleep(1000);
							c.addProduct(p);
							System.out.println("成产好了一个产品");
						} catch (InterruptedException e) {
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
						Product p;
						try {
							p = c.getProduct();
							System.out.println("消费产品"+p);
							Thread.sleep(1000);
						} catch (InterruptedException e) {
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
				System.err.println("产品数量"+c.size());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
