import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_FOSDemo {

	public static void main(String[] args) throws IOException {
		
				//connecting to the file abc.txt
				FileOutputStream fos = new FileOutputStream("abc.txt");
				
				//Writing data
				fos.write(97);
				fos.write('a');
				fos.write(245);
				fos.write(500);
				//fos.write("abc".getBytes());
				System.out.println("Data is saved");
				
				//closing the connection
				fos.close();
	}

}
