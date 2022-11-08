package bankaccountapp;

public interface IRate{
	//method that returns the base rate
	default double getBaseRate() {
		return 3.0;
	}
}