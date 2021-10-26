package com.cg.oct12.batch3.day4;

public class ThisDemo2 {
	
	//access static member in static context - class reference 
	//access static member in non-static context - class reference 
	//access non-static member in static context - object reference 
	//access non-static member in non-static context - this reference 

	

		static int num1;
		int num2;

		static void staticMethod() {
			System.out.println("staticMethod " + ThisDemo2.num1);
			ThisDemo2 obj = new ThisDemo2();
			System.out.println("staticMethod " + obj.num2);
		}

		void nonStaticMethod() {
			System.out.println("nonStaticMethod " + ThisDemo2.num1);
			System.out.println("nonStaticMethod " + this.num2);
		}

		public static void main(String[] args) {

			ThisDemo2.staticMethod();
			ThisDemo2 obj2 = new ThisDemo2();
			obj2.num2 = 10;
			obj2.nonStaticMethod();

		}

	
}
