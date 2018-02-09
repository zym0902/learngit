package thread8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RWLockTest {
	
	public static void main(String[] args) {
		
		File file = new File("./a.txt");
		final V v = new V();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true) {
					v.read(file);
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				int a = 0;
				while(true) {
					v.write(file, "my name is "+ a++);
				}
			}
		}).start();
	}
	
	

}
class V{
	ReadWriteLock rwlock = new ReentrantReadWriteLock();
	public void read(File file) {
		rwlock.readLock().lock();
		System.out.println("开始读。。。。。");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = null;
			while((line = br.readLine())!= null) {
				System.out.println("---->"+line);
			}
			System.out.println("结束读");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}finally {
			rwlock.readLock().unlock();
		}
	}
	public void write(File file,String msg) {
		rwlock.writeLock().lock();
		System.out.println("开始写。。。。");
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(file,true));
			bw.write(msg);
			bw.newLine();
			bw.flush();
			System.out.println("结束写。。。。");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			rwlock.writeLock().unlock();
		}
	}
}
