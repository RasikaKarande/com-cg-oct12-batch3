package com.cg.oct12.batch3.day5.abc;

// abstract and concrete 

// interface 

// abstract method - 
// has the keyword abstract 
// has only method signature 
// does not have method body 
// can be defined in abstract class 
// can not be defined in concrete class 

// abstract class 
// has the keyword abstract 
// object can not be created 
// can contain zero or more abstract methods 
// can contain zero or more concrete methods 
// can also contain both 

interface FinanceMinistry {

	public abstract void payInterestOnDeposits();

}

interface StateGovt {

	public abstract void paySalaryToEmployees();

}

abstract class Rbi1 {

	public abstract void doKyc(); // Aadhaar, PAN, Passport, ...

	void openAccount() {
		System.out.println("Open account");
	}

	void payLoans() {
		System.out.println("pay loans");
	}
}

class HdfcBank1 extends Rbi1 implements FinanceMinistry, StateGovt {

	@Override
	public void doKyc() {
		System.out.println("Aadhaar");
	}

	@Override
	public void paySalaryToEmployees() {
		System.out.println("Saalry");
	}

	@Override
	public void payInterestOnDeposits() {
		System.out.println("Interest");
	}

}

class IciciBank1 extends Rbi {

	@Override
	public void doKyc() {
		System.out.println("PAN Card");
	}
}

public class App2 {

	public static void main(String[] args) {

		HdfcBank1 obj = new HdfcBank1();
		obj.doKyc();
		obj.openAccount();
		obj.payLoans();
		IciciBank1 obj2 = new IciciBank1();
		obj2.doKyc();

//		Rbi obj3 = new Rbi();
	}

}