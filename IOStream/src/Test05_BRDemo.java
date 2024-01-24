import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test05_BRDemo {

	public static void main(String[] args) throws IOException {
				BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
				
//				String line1 = br.readLine();
//				String line2 = br.readLine();
//				String line3 = br.readLine();
//				String line4 = br.readLine();
				
//				System.out.println(line1);
//				System.out.println(line2);
//				System.out.println(line3);
//				System.out.println(line4);
				
//				String line;
//				while ((line = br.readLine()) != null) {
//					System.out.println(line);
//				}
				
				while(br.ready()) {
						String line = br.readLine();
						System.out.println(line);
				}
	}

}
