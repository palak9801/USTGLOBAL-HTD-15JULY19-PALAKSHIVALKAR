package com.dev.exceptions;

public class ExceptionHandling {

	public static void main(String[] args) throws CustomException {
		
		/*   1.-
		 * try { s()
		 * 
		 * }catch(Exception e){
		 * 
		 * System.out.println("Exception occured"); e.printStackTrace();
		 * 
		 * }finally { System.out.println("this is finally block"); }
		 * System.out.println("after finally block");
		 */
		
		/*2.
		 * s(); try { divide(10,0); }catch(Exception e){ throw new CustomException(1);
		 * 
		 * }
		 */
		
		try {
			s();
			System.out.println("no Exception for s()");
			int res = divide(10, 0);
			System.out.println("no Exception for divide()");
			System.out.println(res);
			 System.exit(0);          //this will halt the program here and then the after thhis the finally block is not executed
		}catch (NegativeArraySizeException e) {
			System.out.println("Exception in catch block of NegaativeArraySize parameter");
			System.err.println("getMessage(): "+e.getMessage());
			e.printStackTrace();
		}catch(ArithmeticException e){
			System.err.println("Exception in catch block of ArithmeticException parameter");
			System.err.println("getMessage(): "+e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("Finally block");
		}
	}
	
	
	  public static void s() { //2. it tells that it may or may not throw exception, can provide multiple exception at a time {
	 
	  StringBuffer sb = new StringBuffer(1);
	 
	}
	 
	
	
	

	public static int divide(int i, int j)
	{
	    int res = i/j;
	  
	    return res;
	}
}
