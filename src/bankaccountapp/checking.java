package bankaccountapp;

public class checking extends account{
	int debitCardNumber;
	int debitPIN;
	//Constructor for checking account
	checking(String name, String sSN, double initDeposit){
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
		System.out.println("New checking account");
	}
}