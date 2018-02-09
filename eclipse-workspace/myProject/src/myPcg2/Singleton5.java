package myPcg2;
public class Singleton5 {
	private static final Singleton5 singleton = new Singleton5();
	private Singleton5() {}
	public static Singleton5 getInstance() {
		return singleton;
	}
}
