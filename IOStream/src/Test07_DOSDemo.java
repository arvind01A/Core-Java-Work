import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test07_DOSDemo {

	public static void main(String[] args) throws IOException {
		
				FileOutputStream fos = new FileOutputStream("xyz.txt");
				DataOutputStream dos = new DataOutputStream(fos);
				
				dos.writeInt(97);
				dos.writeFloat(3.14f);
				dos.writeChar('a');
				dos.writeBoolean(true);
				dos.writeUTF("Hari");
				
				System.out.println("Data written to file");
	}

}
