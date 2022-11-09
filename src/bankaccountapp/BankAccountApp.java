package bankaccountapp;
import java.util.LinkedList;
import java.util.List;

public class BankAccountApp{
	public static void main(String[] args) {
		List<account> accounts = new LinkedList<account>();
		
		String file = "/Users/duynguyen/Desktop/Bank-Management-System/src/NewBankAccounts.csv";

//		saving save1 = new saving("Reed Richard", "359948219", 2000);
//		checking check1 = new checking("Duy Nguyen", "32343441", 1500);
//		save1.showInfo();
//		System.out.println("**********");
//		check1.showInfo();
//		save1.deposit(5000);
//		save1.withraw(200);
//		save1.transfer("Brokerage", 3000);
//		save1.compound()
		
		//Acquire data from csv file
		List<String[]> newCustomer = utilities.CSV.read(file);
		for(String[] customer: newCustomer) {
			String name = customer[0];
			String sSN = customer[1];
			String accountType = customer[2];
			double initDeposit = Double.parseDouble(customer[3]);
			System.out.println(name + " " + sSN + " " + accountType + " " + initDeposit);
			if(accountType.equals("Savings"))
				{
				System.out.println("Open a Saving account");
				}
			else if(accountType.equals("Checking"))
			{
				System.out.println("Open a Checking account");
			}
			else {
				System.out.println("Error reading account type");
			}
		}
		
//		accounts.get(5).showInfo();
		
		for(account acc: accounts) {
			System.out.println("*******");
			acc.showInfo();
		}
		
	}
}