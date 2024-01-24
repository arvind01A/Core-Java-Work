import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test02_FISDemo {

	public static void main(String[] args) throws IOException {
				FileInputStream fis = new FileInputStream("abc.txt");
				
//				int data;
//				while( (data = fis.read() )!= -1) {
//						System.out.println(data + "   "+ (char)data);
//				}
				
				byte[] byteArray = new byte[fis.available()];
				fis.read(byteArray);
				
				System.out.println(byteArray);
				
				System.out.println(Arrays.toString(byteArray));
				
				for (int i = 0; i < byteArray.length; i++) {
						byte value = byteArray[i];
						System.out.println(value + "   " + (char)value);
				}
				
				System.out.println();
				
				for(byte value : byteArray) {
						System.out.println(value + "    " + (char)value);
				}
				
				System.out.println();
	}

}
