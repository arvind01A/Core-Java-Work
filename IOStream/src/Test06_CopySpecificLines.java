import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test06_CopySpecificLines {

	public static void main(String[] args) throws IOException {
				
				BufferedReader br = new BufferedReader( new FileReader("abc.txt"));
				
				FileWriter fw = new FileWriter("dbc.txt");
				
				while(br.ready()) {
						String line = br.readLine();
						
						if(line.contains("sh")) {
									fw.write(line);
									fw.write("\n");
						}
				}
				fw.flush();
				System.out.println("file is copied");
				
				br.close();
				fw.close();
	}

}
