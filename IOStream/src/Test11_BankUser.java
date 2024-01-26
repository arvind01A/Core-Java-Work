import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test11_BankUser {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
				
			//creating OIS object
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("account_info.txt"));
			
			
			//casting returned object to Bank type
			Test09_Bank accDetails = (Test09_Bank)ois.readObject();
			
			//printing bank object data
			System.out.println(accDetails.getAccName() + " details");
			System.out.println(accDetails);
	}

}
