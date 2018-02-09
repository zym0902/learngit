package myPcg2;
public class Singleton4 {
	private static volatile Singleton4 singleton = null;
	private Singleton4() {}
	public static Singleton4 getInstance() {
		if(singleton == null) {
			synchronized(String.class) {
				if(singleton == null) {
					singleton = new Singleton4();
				}
			}
		}
		return singleton;
	}
}
