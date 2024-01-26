import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Test08_DISDemo {

	public static void main(String[] args) throws IOException {
				
				FileInputStream fis = new FileInputStream("xyz.txt");
				DataInputStream dis = new DataInputStream(fis);
				
				int i1 = dis.readInt();
				float f1 = dis.readFloat();
				char ch1 = dis.readChar();
				boolean b1 = dis.readBoolean();
				String s1 = dis.readUTF();
				
				System.out.println(i1);
				System.out.println(f1);
				System.out.println(ch1);
				System.out.println(b1);
				System.out.println(s1);
	}

}
