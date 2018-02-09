package myPcg2;
public class Singleton6 {
	private static class SingletonHolder{
		private static final Singleton6 singleton = new Singleton6();
		private SingletonHolder() {}
	}
	private Singleton6() {}
	public synchronized static Singleton6 getInstance() {
		return SingletonHolder.singleton;
	}
}
