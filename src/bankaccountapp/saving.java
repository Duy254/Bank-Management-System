package bankaccountapp;

public class saving extends account{
	//create a constructor
	int safetyID;
	int safetyKey;
	int debitCardNumber;
	int debitPIN;
	
	public saving(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyBox();
	}
	
	@Override
	public void setRate() {
		// TODO Auto-generated method stub
//		System.out.println("Implement Rate for savings");
		rate = getBaseRate() - .25;
	}
	
	private void setSafetyBox() {
		safetyID = (int) (Math.random() * Math.pow(10, 3));
		safetyKey = (int)(Math.random() * Math.pow(10, 4));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Your saving account features: " +
		"\n Safety Deposit Box ID: " + safetyID 
		+ "\n Safety Deposit Box Key: " + safetyKey);
	}

	
}
