package bankaccountapp;

public abstract class account implements IRate{
	private String name;
	private String sSN;
	private double balance;
	protected String accountNumber;
	protected double rate;
	static int index = 1000;
	
	//list of properties for the checking account
	public account(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		this.balance = initDeposit;
//		System.out.println("NAME: " + name + " SSN: " + sSN + " BALANCE: $" + balance);
		
		index++;
		this.accountNumber = setAccountNumber();
		setRate();
//		System.out.println("Account Number: " + this.accountNumber);
	}
	
	public abstract void setRate();
	
	
	private String setAccountNumber(){
		String lastTwoofSsn = sSN.substring(sSN.length() - 2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() + Math.pow(10,3));
		return lastTwoofSsn + uniqueID + randomNumber; 
	}
	
	//Transaction method
	public void compound() {
		double accruedInterest = balance * (rate/100);
		System.out.println("Interest: " + accruedInterest);
		printBalance();
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void withraw(double amount) {
		balance = balance + amount;
		
	}
	
	public void transfer(String toWhere, double amount) {
		balance = balance + amount;
	}
	
	public void printBalance() {
		System.out.println("Balance is: " + "$" + balance );
	}
	
	public void showInfo() {
		System.out.println("Name: " + name
				+ "\nAccount number: " + accountNumber 
				+ "\nBalance: " + balance +"\nRate:  " + rate +"%");
	}
}