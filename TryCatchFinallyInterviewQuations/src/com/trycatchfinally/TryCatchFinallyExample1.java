package com.trycatchfinally;

public class TryCatchFinallyExample1 {

	public int getIntVlaue(){
		int intValue = 0;
		try{
			intValue = 5;
			return intValue;
		}catch(Exception e){
			return 10;
		}
		finally{
			return intValue = 15;
		}
	}
	public static void main(String args[]){
		TryCatchFinallyExample1 tryCatchFinally = new TryCatchFinallyExample1();
		int returnIntValue = tryCatchFinally.getIntVlaue();
		System.out.println("Final Int value = "+returnIntValue); //Out put is 15 why because here try and catch block return values finally block is override the 15 value.
		
		/* Output is : Final Int value = 15 */
	}
}
