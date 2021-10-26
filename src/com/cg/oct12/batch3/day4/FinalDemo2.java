package com.cg.oct12.batch3.day4;

public class FinalDemo2 {
	

	/*
	 * final keyword - specifier 
	 * final field / variable - value can not be changed 
	 * final method - can not be overridden 
	 * final class - can not be extended 
	 */

	

//		final static int numberOfOvers = 20;
		final static int NUMBER_OF_OVERS = 20;

		private static final int num = 10;
		private static int num2 = 20;

		public static void main(String[] args) {

			final int num3 = 30;
//			num3 = 35; // CE 

			System.out.println(FinalDemo2.num);
			System.out.println(FinalDemo2.num2);
//			FinalDemo2.num = 15; // CE
			FinalDemo2.num2 = 25;

			System.out.println(FinalDemo2.num);
			System.out.println(FinalDemo2.num2);
		
	}
}
