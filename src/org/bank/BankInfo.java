package org.bank;

public class BankInfo extends AxisBank {
	private void savings() {
		System.out.println("Account is 'savings account'");
		// TODO Auto-generated method stub

	}
private void fixed() {
	System.out.println("Fixed deposit amount is rs 2,00,000");
	// TODO Auto-generated method stub

}
public static void main(String[] args) {
	BankInfo bi=new BankInfo();
	bi.deposit();
	bi.savings();
	bi.fixed();
}
}
