package myPcg3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class NIOTest {
	
	public static void main(String[] args) throws Exception {
		File file = new File("./a.txt");
		FileChannel inChannel = new FileInputStream(file).getChannel();
		FileChannel outChannel = new FileOutputStream("./b.txt").getChannel();
		
		MappedByteBuffer buffer = inChannel.map(FileChannel.MapMode.READ_ONLY,0,file.length());
		System.out.println(buffer);
		
		outChannel.write(buffer);
		buffer.clear();
	}

}
