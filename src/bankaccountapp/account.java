package bankaccountapp;

public abstract class account implements IRate{
	String name;
	String sSN;
	double balance;
	String accountNumber;
	double rate;
	static int index = 1000;
	
	//list of properties for the checking account
	public account(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		System.out.println("NAME: " + name + "SSN: " + sSN + " BALANCE: $" + balance);
		
		index++;
		this.accountNumber = setAccountNumber();
//		System.out.println("Account Number: " + this.accountNumber);
	}
	
	private String setAccountNumber(){
		String lastTwoofSsn = sSN.substring(sSN.length() - 2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() + Math.pow(10,3));
		return lastTwoofSsn + uniqueID + randomNumber; 
	}
}