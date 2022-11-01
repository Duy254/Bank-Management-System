package bankaccountapp;

public class saving extends account{
	//create a constructor
	int safetyID;
	int safetyKey;
	public saving(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
		System.out.println("New saving account");
		
	}
}