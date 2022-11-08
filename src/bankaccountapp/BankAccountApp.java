package bankaccountapp;

public abstract class BankAccountApp{
	public static void main(String[] args) {
		saving save1 = new saving("Reed Richard", "359948219", 2000);
		checking check1 = new checking("Duy Nguyen", "32343441", 1500);

		
		save1.showInfo();
		System.out.println("**********");
		check1.showInfo();
		
		save1.deposit(5000);
		save1.withraw(200);
		save1.transfer("Brokerage", 3000);
		
		save1.compound();
		//Acquire data from csv file
	}
}