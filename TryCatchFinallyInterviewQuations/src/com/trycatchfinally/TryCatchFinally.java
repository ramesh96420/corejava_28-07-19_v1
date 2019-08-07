package com.trycatchfinally;

public class TryCatchFinally {

	public int doMethod() {
		try {

			System.out.println("Try Block");
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Catch Block");
			return 5;
		} finally {
			//finally block is showing worning message
			System.out.println("Finally Block");
			return 10;
		}
	}

	public static void main(String args[]) {

		TryCatchFinally tryCatchFinally = new TryCatchFinally();
		int returnValue = tryCatchFinally.doMethod();
		System.out.println("Return int values is :"+ returnValue);	//Out put is 10 here catch block return 5 but finally block is override the 5 value.
		
		/*Out put is
		Try Block
		Catch Block
		Finally Block
		Return int values is :10*/
	}
}
