package practics;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;

public class QA32 {
	private String[] strings = { "ABCDEFGHIJKLMNOPQRSTUVWXYZ", "abcdefghijklmnopqrstuvwxyz", "0123456789" };

	public void write(String filename)throws Exception {
		
		FileChannel fileChannel = new FileOutputStream(filename).getChannel();
		for (String str : strings) {
			ByteBuffer buffer = ByteBuffer.wrap(str.getBytes());

		}
	}

}
