package com;

public class SetterInjection {
	public static void main(String[] args) {
		UserPayment ram = new UserPayment();
		ram.cod();

		//
		UserPayment sita = new UserPayment();
		CreditCard sitaCreditCard = new CreditCard();
		sita.setCc(sitaCreditCard);
		sita.chargeCreditCard();
	}
}

class UserPayment {

	private CreditCard cc; // 233232323232
	private UPI upi; // tejas@sbi

	public CreditCard getCc() {
		return cc;
	}

	public void setCc(CreditCard cc) {
		this.cc = cc;
	}

	public UPI getUpi() {
		return upi;
	}

	public void setUpi(UPI upi) {
		this.upi = upi;
	}

	void chargeCreditCard() {
		// cc
		cc.deductAmount();
		System.out.println("order placed");
	}

	void chargeUpi() {
		// upi
		upi.deductAmount();
	}

	void cod() {
		System.out.println("order placed");
	}

}

class CreditCard {

	void deductAmount() {

	}
}

class UPI {
	void deductAmount() {

	}
}
