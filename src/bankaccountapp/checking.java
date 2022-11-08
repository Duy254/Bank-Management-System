package bankaccountapp;

public class checking extends account{
	int debitCardNumber;
	int debitPIN;
	//Constructor for checking account
	public checking(String name, String sSN, double initDeposit){
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
    setDebitCard();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
	}
	
	
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random()* Math.pow(10,12));
		debitPIN  = (int)(Math.random() * Math.pow(10, 4));
		System.out.println(("Number: " + this.debitCardNumber));
		System.out.println(("PIN: " + this.debitPIN));

	}
	public void showInfo() {
		super.showInfo();
		System.out.println("Your checking account features " + " \nDebit Card Number: "  + debitCardNumber 
				    + "\nDebit card PIN: " + debitPIN);
	}
}
