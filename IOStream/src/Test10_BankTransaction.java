import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test10_BankTransaction  {

	public static void main(String[] args) throws FileNotFoundException, IOException {
				//creating bank object
				Test09_Bank acc1 = new Test09_Bank();
				
				//setting bank object state
				acc1.setAccNo(1);
				acc1.setAccName("Hari");
				acc1.setUsername("Hari Krishna");
				acc1.setPassword("NiT");
				acc1.setBalance(9999999);
				
				//printing bank object state
				System.out.println(acc1);
				System.out.println();
				
				//create OOS object
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("account_info.txt"));
				
				//writing bank object state to file
				oos.writeObject(acc1);
				
				System.out.println("Details saved in file");
	}

}
