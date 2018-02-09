package myPcg2;
public class Singleton3 {
	private static  Singleton3 singleton = null;
	private Singleton3() {}
	public static Singleton3 getInstance(){
		if(singleton == null) {
			synchronized(String.class) {
				if(singleton == null) {
					singleton = new Singleton3();
				}
			}
		}
		return singleton;
	}
}
