import java.io.Serializable;

public class Test09_Bank implements Serializable {

		//static double balance = 5000;
	
		private long accNo;
		private String accName;
		private String username;
		private transient String password;
		private transient double balance;
		
		public long getAccNo() {
			return accNo;
		}
		public void setAccNo(long accNo) {
			this.accNo = accNo;
		}
		public String getAccName() {
			return accName;
		}
		public void setAccName(String accName) {
			this.accName = accName;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = this.balance + balance;
		}
		@Override
		public String toString() {
			return "accNo=" + accNo + "\naccHName=" + accName + "\nusername=" + username + "\npassword="
					+ password + "\nbalance=" + balance ;
		}
		
}
