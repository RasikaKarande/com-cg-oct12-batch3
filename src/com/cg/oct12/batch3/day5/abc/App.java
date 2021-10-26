package com.cg.oct12.batch3.day5.abc;

// abstract and concrete 

// interface 

abstract class Rbi {

	abstract void doKyc(); // Aadhaar, PAN, Passport, ...

	void openAccount() {
	System.out.println("Please follow the procedure");
		
	}

	void payLoans() {
		System.out.println("Installement");
	}
}

class HdfcBank extends Rbi {

	@Override
	void doKyc() {
		System.out.println("Aadhaar");
	}

}

class IciciBank extends Rbi {

	@Override
	void doKyc() {
		System.out.println("PAN Card");
	}
}


public class App {

	public static void main(String[] args) {

		HdfcBank obj = new HdfcBank();
		obj.doKyc();
		obj.payLoans();
		obj.openAccount();
		IciciBank obj2 = new IciciBank();
		obj2.doKyc();
	}

}