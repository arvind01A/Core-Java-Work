import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test04_FileCopy_FR_FW {

	public static void main(String[] args) throws IOException {
				
				FileReader fr = new FileReader("abc.txt");
				FileWriter fw = new FileWriter("cbc.txt");
				
				int data;
				while ( (data = fr.read()) != -1) {
						fw.write(data);
				}
				//fw.flush();
				
				System.out.println("data is saved");
				
				fr.close();
				fw.close();
	}

}
